package interest;

public class simple_interest{
	private int principal,time,rate;
	double interest;
	
	public double getSimpleInterest() {
		interest=(principal*time*rate)/100;
		return interest;
	}
	
	public void setValues(int principal,int time,int rate) {
		this.principal=principal;
		this.time=time;
		this.rate=rate;
	}

}
