package logica;

//import java.lang.Float;
import logica.Operacion;

public class Entrada {

	private String display;
	
	public Entrada(String display) {
		super();
		this.display = display;
	}


	public int validacion(){
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
	
	public Operacion resultado(int i){
		
		double num1=0;
		double num2=0;
		char operador;
		
		if(i!=display.length()){
			
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
	
}
