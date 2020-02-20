package calculator;

public class performcalculation {
	double a,b;
	double X,Y;
	public double add(String x,String y) {
		try {
			a=Integer.parseInt(x);
			b=Integer.parseInt(y);
			return a+b;
		}
		catch(Exception e) {
			return 0.0;
		}
		
		}
	
	
	
	public double sub(String x,String y) {
		try {
			a=Integer.parseInt(x);
			b=Integer.parseInt(y);
			return a-b;
		}
		catch(Exception e) {
			return 0.0;
		}	}
	
	
	public double mul(String x,String y) {
		try {
			a=Integer.parseInt(x);
			b=Integer.parseInt(y);
			return a*b;
		}
		catch(Exception e) {
			return 0.0;
		}	}
	
	
	public double div(String x,String y) {
		try {
			a=Integer.parseInt(x);
			b=Integer.parseInt(y);
			if(b!=0) {
			return a/b;
			}
			else {
				return(1.0);
			}
			}
		
		catch(Exception e) {
			return 0.0;
		}
	}
	

}
