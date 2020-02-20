package interest;
import java.lang.Math;
public class compound_interest {
	private int c_principal,c_rate,c_time;
	double c_interest;
	
	public double getcompoundinterest() {
		c_interest=c_principal*Math.pow((1+c_rate/100),c_time)-c_principal/100;
		return c_interest;
		
	}
	
	public void setValues(int c_principal,int c_time,int c_rate) {
		this.c_principal=c_principal;
		this.c_time=c_time;
		this.c_rate=c_rate;
	}

}
