package gui.mainframes;

import gui.dialogs.MensajesDeDialogo;
import gui.utils.Definiciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BoxLayout;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.SpringLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;
import java.awt.Toolkit;
import logica.*;

public class MainApp extends JFrame {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inOutDisplay;
	private JTextField display;

	
	public void validarEntrada(String btn){
		if(inOutDisplay.getText().length() < 16){
			escribirNum(btn);
		}
	}
	
	public void escribirNum(String btn){
		if(inOutDisplay.getText().equals("0") || Definiciones.operador){
			inOutDisplay.setText(btn);
			Definiciones.operador = false;
			Definiciones.nuevoNum = true;
			Definiciones.cantPuntoFlotante = 0;
		}else{
			inOutDisplay.setText(inOutDisplay.getText()+ btn);
		}
	}
	
	/**
	 * Create the frame.
	 */
	public MainApp() {
		setTitle("Calculadora");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 333);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mainPanel.setBounds(10, 11, 278, 50);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		display = new JTextField();
		display.setForeground(SystemColor.textInactiveText);
		display.setEditable(false);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setFont(new Font("SansSerif", Font.PLAIN, 20));
		display.setColumns(10);
		display.setBackground(new Color(230, 230, 250));
		display.setBounds(0, 0, 278, 24);
		mainPanel.add(display);
		
		inOutDisplay = new JTextField();
		inOutDisplay.setEditable(false);
		inOutDisplay.setBounds(0, 22, 278, 29);
		mainPanel.add(inOutDisplay);
		inOutDisplay.setFont(new Font("SansSerif", Font.PLAIN, 25));
		inOutDisplay.setBackground(new Color(230, 230, 250));
		inOutDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		inOutDisplay.setColumns(10);
		inOutDisplay.setText("0");
		
		JPanel controlPanel = new JPanel();
		controlPanel.setBackground(new Color(230, 230, 250));
		controlPanel.setBounds(10, 72, 278, 221);
		contentPane.add(controlPanel);
		SpringLayout sl_controlPanel = new SpringLayout();
		controlPanel.setLayout(sl_controlPanel);
		
		final JButton sieteBtn = new JButton("7");
		sieteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarEntrada(sieteBtn.getText());
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, sieteBtn, 83, SpringLayout.NORTH, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.EAST, sieteBtn, 55, SpringLayout.WEST, controlPanel);
		sieteBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		sl_controlPanel.putConstraint(SpringLayout.NORTH, sieteBtn, 49, SpringLayout.NORTH, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.WEST, sieteBtn, 10, SpringLayout.WEST, controlPanel);
		controlPanel.add(sieteBtn);
		
		final JButton ochoBtn = new JButton("8");
		ochoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarEntrada(ochoBtn.getText());
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.NORTH, ochoBtn, 0, SpringLayout.NORTH, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, ochoBtn, 6, SpringLayout.EAST, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, ochoBtn, -138, SpringLayout.SOUTH, controlPanel);
		ochoBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		controlPanel.add(ochoBtn);
		
		final JButton nueveBtn = new JButton("9");
		nueveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarEntrada(nueveBtn.getText());	
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.WEST, nueveBtn, 112, SpringLayout.WEST, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.EAST, ochoBtn, -6, SpringLayout.WEST, nueveBtn);
		sl_controlPanel.putConstraint(SpringLayout.NORTH, nueveBtn, 0, SpringLayout.NORTH, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, nueveBtn, 0, SpringLayout.SOUTH, sieteBtn);
		nueveBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		controlPanel.add(nueveBtn);
		
		final JButton cuatroBtn = new JButton("4");
		cuatroBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarEntrada(cuatroBtn.getText());
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.NORTH, cuatroBtn, 2, SpringLayout.SOUTH, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, cuatroBtn, 10, SpringLayout.WEST, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, cuatroBtn, -102, SpringLayout.SOUTH, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.EAST, cuatroBtn, 0, SpringLayout.EAST, sieteBtn);
		cuatroBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		controlPanel.add(cuatroBtn);
		
		final JButton cincoBtn = new JButton("5");
		cincoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarEntrada(cincoBtn.getText());
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.NORTH, cincoBtn, 2, SpringLayout.SOUTH, ochoBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, cincoBtn, -102, SpringLayout.SOUTH, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.EAST, cincoBtn, 0, SpringLayout.EAST, ochoBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, cincoBtn, 0, SpringLayout.WEST, ochoBtn);
		cincoBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		controlPanel.add(cincoBtn);
		
		final JButton seisBtn = new JButton("6");
		seisBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarEntrada(seisBtn.getText());
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.NORTH, seisBtn, 2, SpringLayout.SOUTH, nueveBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, seisBtn, 0, SpringLayout.WEST, nueveBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, seisBtn, 0, SpringLayout.EAST, nueveBtn);
		seisBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		controlPanel.add(seisBtn);
		
		final JButton unoBtn = new JButton("1");
		unoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarEntrada(unoBtn.getText());	
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.NORTH, unoBtn, 2, SpringLayout.SOUTH, cuatroBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, unoBtn, 0, SpringLayout.WEST, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, unoBtn, 45, SpringLayout.WEST, sieteBtn);
		unoBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		controlPanel.add(unoBtn);
		
		final JButton dosBtn = new JButton("2");
		dosBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarEntrada(dosBtn.getText());
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.NORTH, dosBtn, 121, SpringLayout.NORTH, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, dosBtn, 0, SpringLayout.SOUTH, unoBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, dosBtn, 0, SpringLayout.EAST, ochoBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, dosBtn, 0, SpringLayout.WEST, ochoBtn);
		dosBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		controlPanel.add(dosBtn);
		
		final JButton tresBtn = new JButton("3");
		tresBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarEntrada(tresBtn.getText());
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, seisBtn, -2, SpringLayout.NORTH, tresBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, tresBtn, 0, SpringLayout.SOUTH, unoBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, tresBtn, 0, SpringLayout.EAST, nueveBtn);
		sl_controlPanel.putConstraint(SpringLayout.NORTH, tresBtn, 0, SpringLayout.NORTH, unoBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, tresBtn, 0, SpringLayout.WEST, nueveBtn);
		tresBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		controlPanel.add(tresBtn);
		
		final JButton ceroBtn = new JButton("0");
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, unoBtn, -2, SpringLayout.NORTH, ceroBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, ceroBtn, 0, SpringLayout.EAST, ochoBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, ceroBtn, 0, SpringLayout.WEST, sieteBtn);
		ceroBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarEntrada(ceroBtn.getText());
			}
		});
		ceroBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		controlPanel.add(ceroBtn);
		
		JButton sumarBtn = new JButton("+");
		sumarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Definiciones.operador){
					display.setText(inOutDisplay.getText() + "+");
					Definiciones.operador = true;				
				}else{
					MensajesDeDialogo.masDeUnaOperacion();
				}
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.WEST, sumarBtn, 163, SpringLayout.WEST, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.EAST, nueveBtn, -6, SpringLayout.WEST, sumarBtn);
		sl_controlPanel.putConstraint(SpringLayout.NORTH, sumarBtn, 49, SpringLayout.NORTH, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, sumarBtn, 0, SpringLayout.SOUTH, sieteBtn);
		sumarBtn.setFont(new Font("SansSerif", Font.PLAIN, 17));
		sumarBtn.setAlignmentX(Component.RIGHT_ALIGNMENT);
		controlPanel.add(sumarBtn);
		
		JButton restarBtn = new JButton("-");
		restarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Definiciones.operador){
					display.setText(inOutDisplay.getText() + "-");
					Definiciones.operador = true;
					Definiciones.cantPuntoFlotante = 0;
				}else{
					MensajesDeDialogo.masDeUnaOperacion();
				}
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.NORTH, restarBtn, 85, SpringLayout.NORTH, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.WEST, restarBtn, 6, SpringLayout.EAST, seisBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, restarBtn, 0, SpringLayout.SOUTH, cuatroBtn);
		restarBtn.setFont(new Font("SansSerif", Font.PLAIN, 18));
		restarBtn.setAlignmentX(1.0f);
		controlPanel.add(restarBtn);
		
		JButton multiplicarBtn = new JButton("*");
		multiplicarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Definiciones.operador){
					display.setText(inOutDisplay.getText() + "*");
					Definiciones.operador = true;
					Definiciones.cantPuntoFlotante = 0;
				}else{
					MensajesDeDialogo.masDeUnaOperacion();
				}
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.WEST, multiplicarBtn, 6, SpringLayout.EAST, tresBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, multiplicarBtn, 0, SpringLayout.SOUTH, unoBtn);
		sl_controlPanel.putConstraint(SpringLayout.NORTH, multiplicarBtn, 121, SpringLayout.NORTH, controlPanel);
		multiplicarBtn.setFont(new Font("SansSerif", Font.PLAIN, 19));
		multiplicarBtn.setAlignmentX(1.0f);
		controlPanel.add(multiplicarBtn);
		
		JButton dividirBtn = new JButton("/");
		dividirBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Definiciones.operador){
					display.setText(inOutDisplay.getText() + "/");
					Definiciones.operador = true;
					Definiciones.cantPuntoFlotante = 0;
				}else{
					MensajesDeDialogo.masDeUnaOperacion();
				}
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.WEST, dividirBtn, 57, SpringLayout.EAST, ceroBtn);
		sl_controlPanel.putConstraint(SpringLayout.NORTH, ceroBtn, 0, SpringLayout.NORTH, dividirBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, ceroBtn, 0, SpringLayout.SOUTH, dividirBtn);
		sl_controlPanel.putConstraint(SpringLayout.NORTH, dividirBtn, 157, SpringLayout.NORTH, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, dividirBtn, -30, SpringLayout.SOUTH, controlPanel);
		dividirBtn.setFont(new Font("SansSerif", Font.PLAIN, 18));
		dividirBtn.setAlignmentX(1.0f);
		controlPanel.add(dividirBtn);
		
		JButton igualBtn = new JButton("=");
		igualBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux = display.getText().concat(inOutDisplay.getText());
				Entrada entrada = new Entrada(aux); 			
				//Mostrar resultado de la logica
				if(entrada.getPosicion()== -1){
					inOutDisplay.setText("Error!!! División por cero");
				}
				//display.setText(aux+"=");
				//inOutDisplay.setText("(Resultado)");
				Definiciones.operador = false;
				
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.EAST, dividirBtn, -6, SpringLayout.WEST, igualBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, multiplicarBtn, -6, SpringLayout.WEST, igualBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, restarBtn, -6, SpringLayout.WEST, igualBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, sumarBtn, -6, SpringLayout.WEST, igualBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, igualBtn, 0, SpringLayout.SOUTH, ceroBtn);
		sl_controlPanel.putConstraint(SpringLayout.NORTH, igualBtn, 49, SpringLayout.NORTH, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.WEST, igualBtn, 220, SpringLayout.WEST, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.EAST, igualBtn, -7, SpringLayout.EAST, controlPanel);
		igualBtn.setFont(new Font("SansSerif", Font.PLAIN, 10));
		controlPanel.add(igualBtn);
		
		JButton borrarBtn = new JButton("");
		sl_controlPanel.putConstraint(SpringLayout.NORTH, borrarBtn, 9, SpringLayout.NORTH, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.WEST, borrarBtn, 0, SpringLayout.WEST, nueveBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, borrarBtn, -6, SpringLayout.NORTH, ochoBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, borrarBtn, 0, SpringLayout.EAST, nueveBtn);
		borrarBtn.setIcon(new ImageIcon(MainApp.class.getResource("/gui/utils/Copia flecha1.png")));
		borrarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!inOutDisplay.getText().isEmpty() && inOutDisplay.getText().length() != 1){
					if(inOutDisplay.getText().charAt(inOutDisplay.getText().length()-1) == '.'){
						Definiciones.cantPuntoFlotante = 0;
					}					
					String aux = inOutDisplay.getText().substring(0, inOutDisplay.getText().length()-1);
					inOutDisplay.setText(aux);
				}else{
					inOutDisplay.setText("0");
					Definiciones.cantPuntoFlotante = 0;
				}
			}
		});
		controlPanel.add(borrarBtn);
		
		JButton limpiarInOutDisplayBtn = new JButton("CE");
		limpiarInOutDisplayBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inOutDisplay.setText("0");
				Definiciones.cantPuntoFlotante = 0;
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.NORTH, limpiarInOutDisplayBtn, 9, SpringLayout.NORTH, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, limpiarInOutDisplayBtn, -6, SpringLayout.NORTH, igualBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, limpiarInOutDisplayBtn, -7, SpringLayout.EAST, controlPanel);
		limpiarInOutDisplayBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		controlPanel.add(limpiarInOutDisplayBtn);
		
		JButton cleanBtn = new JButton("C");
		cleanBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inOutDisplay.setText("0");
				display.setText("");
				Definiciones.operador = false;
				Definiciones.cantPuntoFlotante = 0;
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.WEST, limpiarInOutDisplayBtn, 6, SpringLayout.EAST, cleanBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, cleanBtn, 0, SpringLayout.EAST, sumarBtn);
		sl_controlPanel.putConstraint(SpringLayout.NORTH, cleanBtn, 9, SpringLayout.NORTH, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.WEST, cleanBtn, 0, SpringLayout.WEST, sumarBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, cleanBtn, -6, SpringLayout.NORTH, sumarBtn);
		cleanBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		controlPanel.add(cleanBtn);
		
		JButton puntoBtn = new JButton(".");
		puntoBtn.setFont(new Font("SansSerif", Font.PLAIN, 20));
		puntoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Definiciones.cantPuntoFlotante == 0 && Definiciones.nuevoNum){
					inOutDisplay.setText(inOutDisplay.getText()+".");
					Definiciones.cantPuntoFlotante++;
				}
			}
		});
		sl_controlPanel.putConstraint(SpringLayout.NORTH, puntoBtn, 0, SpringLayout.NORTH, ceroBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, puntoBtn, 6, SpringLayout.EAST, ceroBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, puntoBtn, 0, SpringLayout.SOUTH, ceroBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, puntoBtn, 0, SpringLayout.EAST, nueveBtn);
		controlPanel.add(puntoBtn);
		
		
		
	}
}
