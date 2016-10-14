import java.util.Scanner;

public class test2 {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入表达式：\n");
		String reader = sc.nextLine();
		String oprator[] = reader.split("[+]");
		char x = 'x';
		derivative(reader,x);

	}
	//这是第一次修改
}
