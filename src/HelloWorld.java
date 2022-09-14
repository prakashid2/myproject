import java.text.*;

/**
 * @author Lenovo
 *
 */
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World !!");
		java.util.Date dt = new java.util.Date();

		SimpleDateFormat dateformat2 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
		System.out.println("Date in another formmat "+dateformat2.format(dt));
	}
}
