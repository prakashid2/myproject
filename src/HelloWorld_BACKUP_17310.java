import java.text.*;

/**
 * @author Lenovo
 *
 */
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World !!");
		java.util.Date dt = new java.util.Date();
<<<<<<< HEAD
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss z");
		System.out.println("Current Time = "+dateformat.format(dt));
=======

		SimpleDateFormat dateformat2 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
		System.out.println("Date in another formmat "+dateformat2.format(dt));
>>>>>>> feature2
	}
}
