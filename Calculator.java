// класс Calculator
public class Calculator {
	private int result;
	private int arg;
	
	public void add (int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void cleanResult() {
		this.result = 0;
		this.arg = 0;
	}
	
	public void subtract (int ... params) {
		for (int i = 0; i < params.length; i++){
			if (i == 0)  this.arg = params[i];
			else this.result = arg - params[i];		 
		}
	}
	
	public void divide (int ... params) {
		for (int i = 0; i < params.length; i++){
			if (i == 0)  this.arg = params[i];
			else this.result = arg / params[i];		 
		}		
	}
	
	public void multiply (int ... params) {
		for (int i = 0; i < params.length; i++){
			if (i == 0)  this.arg = params[i];
			else this.result = arg * params[i];		 
		}		
	}
}