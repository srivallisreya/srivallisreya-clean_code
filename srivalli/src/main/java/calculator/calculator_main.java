package calculator;
import java.util.*;

public class calculator_main {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		String a,b;
		int ch;
		double r;
		boolean flag=true;
		performcalculation p=new performcalculation();
		System.out.println("*****Calculator*****");
		while(flag) {
			
			System.out.println("\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.Exit");
			System.out.println("Enter your choice");
			ch=scan.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter input for calculation between 0-9");
				System.out.println("Enter number 1:");
				a=scan.next();
				System.out.println("Enter number 2:");
				b=scan.next();
				r=p.add(a, b);
				if(r!=0.0) {
				System.out.print("SUM:"+" ");
				System.out.println(r);
				}
				else {
					System.out.println("Enter numbers");
				}
				break;
			case 2:
				System.out.println("Enter input for calculation");
				System.out.println("Enter number 1:");
				a=scan.next();
				System.out.println("Enter number 2:");
				b=scan.next();
				r=p.sub(a, b);
				if(r!=0.0) {
				System.out.print("DIFFERENCE:"+" ");
				System.out.println(r);
				}
				else {
					System.out.println("Enter a number");
				}
				break;
			case 3:
				System.out.println("Enter input for calculation");
				System.out.println("Enter number 1:");
				a=scan.next();
				System.out.println("Enter number 2:");
				b=scan.next();
				r=p.mul(a, b);
				if(r!=0.0) {
				System.out.print("PRODUCT:"+" ");
				System.out.println(r);
				}
				else {
					System.out.println("Enter numbers");
				}
				break;
			case 4:
				System.out.println("Enter input for calculation");
				System.out.println("Enter number 1:");
				a=scan.next();
				System.out.println("Enter number 2:");
				b=scan.next();
				r=p.div(a, b);
				if(r==1.0)
					System.out.println("cannot divide by zero");
				else if(r==0.0) {
					System.out.println("enter number");
				}
				else {
				System.out.print("DIVISION:"+" ");
				System.out.println(r);
				}
				break;
			case 5:
				System.out.println("EXITING");
				flag=false;
				break;
			default:
				flag=false;
				break;
				
			}
		}
		scan.close();
	}
}