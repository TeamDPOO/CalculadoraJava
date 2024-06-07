package gui.mainframes;

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

public class MainApp extends JFrame {

	private JPanel contentPane;
	private JTextField display;

	/**
	 * Create the frame.
	 */
	public MainApp() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 276, 316);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mainPanel.setBounds(10, 11, 250, 50);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		display = new JTextField();
		display.setFont(new Font("SansSerif", Font.PLAIN, 25));
		display.setBackground(new Color(230, 230, 250));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setBounds(0, 0, 250, 50);
		mainPanel.add(display);
		display.setColumns(10);
		
		JPanel controlPanel = new JPanel();
		controlPanel.setBackground(new Color(230, 230, 250));
		controlPanel.setBounds(10, 72, 250, 194);
		contentPane.add(controlPanel);
		SpringLayout sl_controlPanel = new SpringLayout();
		controlPanel.setLayout(sl_controlPanel);
		
		JButton sieteBtn = new JButton("7");
		sieteBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		sl_controlPanel.putConstraint(SpringLayout.NORTH, sieteBtn, 49, SpringLayout.NORTH, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.WEST, sieteBtn, 10, SpringLayout.WEST, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, sieteBtn, 79, SpringLayout.NORTH, controlPanel);
		sl_controlPanel.putConstraint(SpringLayout.EAST, sieteBtn, 49, SpringLayout.WEST, controlPanel);
		controlPanel.add(sieteBtn);
		
		JButton ochoBtn = new JButton("8");
		ochoBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		sl_controlPanel.putConstraint(SpringLayout.NORTH, ochoBtn, 0, SpringLayout.NORTH, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, ochoBtn, 6, SpringLayout.EAST, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, ochoBtn, 0, SpringLayout.SOUTH, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, ochoBtn, 45, SpringLayout.EAST, sieteBtn);
		controlPanel.add(ochoBtn);
		
		JButton nueveBtn = new JButton("9");
		nueveBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		sl_controlPanel.putConstraint(SpringLayout.NORTH, nueveBtn, 0, SpringLayout.NORTH, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, nueveBtn, 6, SpringLayout.EAST, ochoBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, nueveBtn, 0, SpringLayout.SOUTH, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, nueveBtn, 45, SpringLayout.EAST, ochoBtn);
		controlPanel.add(nueveBtn);
		
		JButton cuatroBtn = new JButton("4");
		cuatroBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		sl_controlPanel.putConstraint(SpringLayout.NORTH, cuatroBtn, 6, SpringLayout.SOUTH, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, cuatroBtn, 0, SpringLayout.WEST, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, cuatroBtn, 36, SpringLayout.SOUTH, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, cuatroBtn, 0, SpringLayout.EAST, sieteBtn);
		controlPanel.add(cuatroBtn);
		
		JButton cincoBtn = new JButton("5");
		cincoBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		sl_controlPanel.putConstraint(SpringLayout.NORTH, cincoBtn, 6, SpringLayout.SOUTH, ochoBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, cincoBtn, 0, SpringLayout.WEST, ochoBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, cincoBtn, 36, SpringLayout.SOUTH, ochoBtn);
		controlPanel.add(cincoBtn);
		
		JButton seisBtn = new JButton("6");
		seisBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		sl_controlPanel.putConstraint(SpringLayout.NORTH, seisBtn, 6, SpringLayout.SOUTH, nueveBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, seisBtn, 0, SpringLayout.WEST, nueveBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, seisBtn, 0, SpringLayout.SOUTH, cuatroBtn);
		controlPanel.add(seisBtn);
		
		JButton unoBtn = new JButton("1");
		unoBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		sl_controlPanel.putConstraint(SpringLayout.NORTH, unoBtn, 6, SpringLayout.SOUTH, cuatroBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, unoBtn, 0, SpringLayout.WEST, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, unoBtn, 36, SpringLayout.SOUTH, cuatroBtn);
		controlPanel.add(unoBtn);
		
		JButton dosBtn = new JButton("2");
		dosBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		sl_controlPanel.putConstraint(SpringLayout.NORTH, dosBtn, 6, SpringLayout.SOUTH, cincoBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, dosBtn, 0, SpringLayout.WEST, ochoBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, dosBtn, 0, SpringLayout.SOUTH, unoBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, dosBtn, 0, SpringLayout.EAST, ochoBtn);
		controlPanel.add(dosBtn);
		
		JButton tresBtn = new JButton("3");
		tresBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		sl_controlPanel.putConstraint(SpringLayout.NORTH, tresBtn, 6, SpringLayout.SOUTH, seisBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, tresBtn, 0, SpringLayout.WEST, nueveBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, tresBtn, 0, SpringLayout.SOUTH, unoBtn);
		controlPanel.add(tresBtn);
		
		JButton ceroBtn = new JButton("0");
		ceroBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"0");
			}
		});
		ceroBtn.setFont(new Font("SansSerif", Font.PLAIN, 11));
		sl_controlPanel.putConstraint(SpringLayout.NORTH, ceroBtn, 6, SpringLayout.SOUTH, unoBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, ceroBtn, -129, SpringLayout.EAST, nueveBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, ceroBtn, 33, SpringLayout.SOUTH, unoBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, ceroBtn, 0, SpringLayout.EAST, nueveBtn);
		controlPanel.add(ceroBtn);
		
		JButton sumarBtn = new JButton("+");
		sumarBtn.setFont(new Font("SansSerif", Font.PLAIN, 17));
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, sumarBtn, 0, SpringLayout.SOUTH, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, sumarBtn, -54, SpringLayout.EAST, controlPanel);
		sumarBtn.setAlignmentX(Component.RIGHT_ALIGNMENT);
		sl_controlPanel.putConstraint(SpringLayout.NORTH, sumarBtn, 0, SpringLayout.NORTH, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, sumarBtn, 6, SpringLayout.EAST, nueveBtn);
		controlPanel.add(sumarBtn);
		
		JButton restarBtn = new JButton("-");
		restarBtn.setFont(new Font("SansSerif", Font.PLAIN, 18));
		sl_controlPanel.putConstraint(SpringLayout.NORTH, restarBtn, 0, SpringLayout.NORTH, cuatroBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, restarBtn, 6, SpringLayout.EAST, seisBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, restarBtn, 0, SpringLayout.SOUTH, cuatroBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, restarBtn, 0, SpringLayout.EAST, sumarBtn);
		restarBtn.setAlignmentX(1.0f);
		controlPanel.add(restarBtn);
		
		JButton multiplicarBtn = new JButton("*");
		multiplicarBtn.setFont(new Font("SansSerif", Font.PLAIN, 19));
		sl_controlPanel.putConstraint(SpringLayout.NORTH, multiplicarBtn, 0, SpringLayout.NORTH, unoBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, multiplicarBtn, 6, SpringLayout.EAST, tresBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, multiplicarBtn, 0, SpringLayout.SOUTH, unoBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, multiplicarBtn, 0, SpringLayout.EAST, sumarBtn);
		multiplicarBtn.setAlignmentX(1.0f);
		controlPanel.add(multiplicarBtn);
		
		JButton dividirBtn = new JButton("/");
		dividirBtn.setFont(new Font("SansSerif", Font.PLAIN, 18));
		sl_controlPanel.putConstraint(SpringLayout.NORTH, dividirBtn, 6, SpringLayout.SOUTH, tresBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, dividirBtn, 6, SpringLayout.EAST, ceroBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, dividirBtn, 0, SpringLayout.SOUTH, ceroBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, dividirBtn, 0, SpringLayout.EAST, sumarBtn);
		dividirBtn.setAlignmentX(1.0f);
		controlPanel.add(dividirBtn);
		
		JButton igualBtn = new JButton("=");
		igualBtn.setFont(new Font("SansSerif", Font.PLAIN, 15));
		sl_controlPanel.putConstraint(SpringLayout.NORTH, igualBtn, 0, SpringLayout.NORTH, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, igualBtn, 6, SpringLayout.EAST, sumarBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, igualBtn, 0, SpringLayout.SOUTH, ceroBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, igualBtn, 47, SpringLayout.EAST, sumarBtn);
		controlPanel.add(igualBtn);
		
		JButton borrarBtn = new JButton("<-");
		sl_controlPanel.putConstraint(SpringLayout.NORTH, borrarBtn, -39, SpringLayout.NORTH, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, borrarBtn, 0, SpringLayout.WEST, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, borrarBtn, -5, SpringLayout.NORTH, sieteBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, borrarBtn, 0, SpringLayout.EAST, ochoBtn);
		controlPanel.add(borrarBtn);
		
		JButton limpiarDisplayBtn = new JButton("C");
		sl_controlPanel.putConstraint(SpringLayout.NORTH, limpiarDisplayBtn, 0, SpringLayout.NORTH, borrarBtn);
		sl_controlPanel.putConstraint(SpringLayout.WEST, limpiarDisplayBtn, 6, SpringLayout.EAST, borrarBtn);
		sl_controlPanel.putConstraint(SpringLayout.SOUTH, limpiarDisplayBtn, -6, SpringLayout.NORTH, nueveBtn);
		sl_controlPanel.putConstraint(SpringLayout.EAST, limpiarDisplayBtn, 47, SpringLayout.EAST, borrarBtn);
		controlPanel.add(limpiarDisplayBtn);
	}
}
