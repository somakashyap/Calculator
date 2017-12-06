package calc;

import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("Enter the expression:");
		String input = "";
		
		
		try {
			
			
			while (true) {
				char ch = (char) System.in.read();
				if (ch == '=') {
					break;
				}
				input = input + ch;
			}
		} catch (IOException e) {
			System.out.println("Exception in reading input");
			e.printStackTrace();
		}
		System.out.println(input);
		LambdaInvoker l = new LambdaInvoker();
		String result = l.invokeLambda(input);
		System.out.println(result);
	}

}
