package ec.edu.espol;


public class Calservice {

 ICalculator cal;	
	
 	public int addTwoNumbers(int x, int y){
		if (x!=0){
		return cal.add(x, y);}
		else return cal.add(0, y);
	}

	public ICalculator getCal() {
		return cal;
	}

	public void setCal(ICalculator cal) {
		this.cal = cal;
	}
	
	

}
