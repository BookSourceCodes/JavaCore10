/**
 * This program displays a greeting for the reader.
 * @version 1.30 2014-02027
 * @author Cay Horstmann
 */

/**
 从命令行编译并运行该程序：
 	1）打开一个终端窗口
 	2）进入CoreJava10/Volume I/Chapter02/Welcome/src目录
 	3）键入下面的命令：
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
