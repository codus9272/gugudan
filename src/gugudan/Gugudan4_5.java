package gugudan;
import java.util.Scanner;
public class Gugudan4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("4단");
        int result = 4*1;
        System.out.println(result);
        result = 4*2;
        System.out.println(result);
        result = 4*3;
        System.out.println(result);
        result = 4*4;
        System.out.println(result);
        result = 4*5;
        System.out.println(result);
        result = 4*6;
        System.out.println(result);
        result = 4*7;
        System.out.println(result);
        result = 4*8;
        System.out.println(result);
        result = 4*9;
        System.out.println(result);
        
        System.out.println("구구단 중 출력한 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("number : " + number);
        
        result = number * 1;
        System.out.println(result);
	}

}
