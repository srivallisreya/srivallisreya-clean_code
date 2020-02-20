package houseconstruction;
import java.io.*;


public class house_main {
	
	public static void main(String args[]) {
		
		PrintStream s=new PrintStream(new FileOutputStream(FileDescriptor.out));
		double r;
		
		house_cal house=new house_cal();
		
		house.setValues(12.5,"standard","no");
		r=house.gettotalamount();
		s.print("Total construction cost : "+r);
		
		s.close();
		
		
		
		
	}

}
		
