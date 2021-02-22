package homework;

public class Ex1_2 {
	public static void Ex_2(double a, double b, double c) {
		double powB =  Math.pow(b, 2);//b^2
		if(4*a*c > powB) {//if the root negative
			System.out.println("Error, no real roots!");
		}else if(4*a*c == powB) {//if there is only one solution 
			System.out.println("x1=x2= "+riboit(a, b, c));
		}else {
			if(a==0) {
				System.out.println("x1=x2= "+riboit(a, b, c));
			}else {
				System.out.print("x1 = "+riboit(a, b, c)+" ");
				System.out.println("x2 = "+riboit_minos(a, b, c));
			}
		}
	}
public static double riboit(double x, double y, double z) {
	double temp1 = 0;
	double powB =  Math.pow(y, 2); //y^2
	temp1 = -y + Math.sqrt(powB-4*x*z); // above the root line
	temp1 = temp1/(2*x); // below the root line
	if(4*x*z==powB)
		return temp1;
	else {
		temp1=(-z)/y;
		return temp1;
	}	
}
public static double riboit_minos(double x, double y, double z) {
	double temp2 = 0;
	double powB = Math.pow(y, 2);
	temp2 = -y - Math.sqrt(powB-4*x*z);
	temp2 = temp2/(2*x);
	return temp2;
	}

	public static void main(String[] args) {
		System.out.println("Hello user, welcome! menu");
		System.out.println("ax^2 + bx +c:");
		System.out.println("plese chose 1 option: ");	
		int ans = MyConsole.readInt("0 - exit the program, 1 - find a sulotion to an eqution");
		while(ans!=0) {
			if(ans ==1) {
				double a=MyConsole.readDouble("please enter a double 1:");
				double b=MyConsole.readDouble("please enter a double 2:");
				double c=MyConsole.readDouble("please enter a double 3:");
				System.out.println("the equition the you entered is:"+a+"x^2 + "+b+"x + "+c);
				Ex_2(a, b, c);
				ans = MyConsole.readInt( "to continue, enter 1. to exit the program, enter 0");
			}else {
				System.out.println("Please enter valid input, your choice does not exist in the system  ");
			}
		}
		System.out.println("bye bye");
	}
}
//q2