package logica;

//import java.lang.Float;
import logica.Operacion;

public class Entrada {
	
	private Operacion operacion;
	private int posicion;
	
	public Entrada(String display) {
		this.posicion = validacion(display);
		this.operacion = resultado(posicion, display);
	}

	public int validacion(String display){
		boolean parada=true;
		int i=1;
		
		while(i<display.length() && parada){
			if(!Character.isDigit(display.charAt(i)) && display.charAt(i)!='.'){
				parada=false;
			}	
		}
		if(display.charAt(i)=='/' && display.substring(i+1).equals("0"));
			i=-1;
	return i;
	// puedes invocar este metodo dentro del metodo de resultado xq si es -1 quiere decir que hay division x cero
	}
	
	public Operacion resultado(int i, String display){
		
		double num1=0;
		double num2=0;
		char operador='+';
		
		if(i!=display.length() && i!=-1){
			
			String snum1=display.substring(0, i-1);
			num1=Double.parseDouble(snum1);
			
			String snum2=display.substring(i, i-1);
			num2=Double.parseDouble(snum2);
			
			operador=display.charAt(i);
			
		}else{
			num1=Double.parseDouble(display);
			operador='+';
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
