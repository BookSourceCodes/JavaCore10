/**
 * This program displays a greeting for the reader.
 * @version 1.30 2014-02027
 * @author Cay Horstmann
 */

/**
 �������б��벢���иó���
 	1����һ���ն˴���
 	2������CoreJava10/Volume I/Chapter02/Welcome/srcĿ¼
 	3��������������
 		$ javac Welcome.java
 		$ java Welcome
 */
public class Welcome {

	public static void main(String[] args) {
		String greeting = "Welcome to Core Java!";
		System.out.println(greeting);
		for (int i = 0; i < greeting.length(); i++) {
			System.out.print("=");
		}
		System.out.println();
	}
}
