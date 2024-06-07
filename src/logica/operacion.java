package logica;

public class Operacion {
	
	private float num1;
	private float num2;
	private char operador;
	
	public Operacion(float num1, float num2, char operador) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.operador = operador;
	}
	
	private float suma(){
		return num1+num2;
	}
	
	private float resta(){
		return num1-num2;
	}
	
	private float multiplicacion(){
		return num1*num2;
	}
	
	private float division(){
		return num1/num2;
	}
	
	public float controlador(){
		float result=0;
		if(operador=='+')
			result=suma();
		else if(operador=='-')
			result=resta();
		else if(operador=='*')
			result=multiplicacion();
		else if(operador=='/')
			result=division();
		
		return result;
	}
	
	

}
