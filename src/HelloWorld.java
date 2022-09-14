import java.text.*;

/**
 * Hello World program to print current date and time
 * @author Lenovo
 *
 */
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World !!");
		java.util.Date dt = new java.util.Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss z");
		
		System.out.println("Current Time = "+dateformat.format(dt));
		SimpleDateFormat dateformat2 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
		System.out.println("Date in another formmat "+dateformat2.format(dt));
		
		System.out.print("For SimpleDateFormat pls refer - https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html");
	}
}
