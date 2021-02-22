package homework;

public class Ex1_1 {


	public static void main(String[] args) {
		double ferenhiet= MyConsole.readDouble("enter a temprature ferenhhiet: " ); //the user enter a temperature
		double ferenhietToCelcius = (double)((ferenhiet-32.0)*5/9);

		System.out.println(ferenhietToCelcius +" C = "+ferenhiet+ " F ");

		double celcius = MyConsole.readDouble("enter a temprature celcius: "); //the user enter a temperature
		double celciusToFarenheit = ((celcius*9.0)/5)+32;

		System.out.println(celciusToFarenheit +" F"+" = "+celcius+" C");

			}
}
//q1

