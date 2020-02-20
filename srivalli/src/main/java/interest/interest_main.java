package interest;
import java.io.*;
import java.util.*;
public class interest_main {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		PrintStream s=new PrintStream(new FileOutputStream(FileDescriptor.out));
		int principal,rate,time;
		s.print("Enter principal");
		principal=scan.nextInt();
		s.print("Enter rate");
		rate=scan.nextInt();
		s.print("Enter time");
		time=scan.nextInt();
		
		simple_interest simple_interest_obj=new simple_interest();
		simple_interest_obj.setValues(principal,rate,time);
		s.print("Simple Interest is : "+simple_interest_obj.getSimpleInterest()+"\n");
		
		compound_interest compound_interest_obj=new compound_interest();
		compound_interest_obj.setValues(principal,rate,time);
		s.print("Compound Interest is : "+compound_interest_obj.getcompoundinterest());
		
		s.close();
		scan.close();
		
		
		
	}

}
