package logica;

import java.lang.*;
import logica.Operacion;

public class Entrada {
	
	private Operacion operacion;
	private int posicion;
	
	public Entrada(String display) {
		this.posicion = validacion(display);
		this.operacion = resultado(posicion, display);
	}

	//Devuelve -1 si hay division x cero y si no la posicion del operador
	public int validacion(String display){
		boolean parada=true;
		int i=1;
		
		while(i<display.length() && parada){
			if(!Character.isDigit(display.charAt(i)) && display.charAt(i)!='.'){
				parada=false;
			}
			i++;
		}
		if(display.charAt(i-1)=='/' && display.charAt(i)=='0')
			i=0;
	return i-1;
	}
	
	//Crea a Operacion con sus numeros y su operador
	public Operacion resultado(int i, String display){
		
		double num1=0;
		double num2=0;
		char operador='+';
		
		if(i!=-1 && i!=display.length()){
			int a=i;
			if(a==1){
				String snum1=""+display.charAt(0);
				num1=Double.parseDouble(snum1);
			}else{
				String snum1=display.substring(0, i);
				num1=Double.parseDouble(snum1);
			}
			
			a=display.length()-i+1;
			if(a==1){
				String snum2="0"+display.charAt(i+1);
				num2=Double.parseDouble(snum2);
			}else{
				String snum2=display.substring(i+1, display.length());
				num2=Double.parseDouble(snum2);
			}
			
			operador=display.charAt(i);
		}else if(i==display.length()){
			num1=Double.parseDouble(display);
		}
		
		Operacion operacion = new Operacion(num1, num2, operador);
		
		return operacion;
	}

	public Operacion getOperacion() {
		return operacion;
	}

	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	
	
}
