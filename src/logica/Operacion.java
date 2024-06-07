package logica;

public class Operacion {
	
	private double num1;
	private double num2;
	private char operador;
	
	public Operacion(double num1, double num2, char operador) {
		this.num1 = num1;
		this.num2 = num2;
		this.operador = operador;
	}
	
	private double suma(){
		return num1+num2;
	}
	
	private double resta(){
		return num1-num2;
	}
	
	private double multiplicacion(){
		return num1*num2;
	}
	
	private double division(){
		return num1/num2;
	}
	
	public double controlador(){
		double result=0;
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

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public char getOperador() {
		return operador;
	}

	public void setOperador(char operador) {
		this.operador = operador;
	}
	
	
	

}
