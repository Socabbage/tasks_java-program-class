package �ڶ�����ҵ_���Ǹ��������;

import java.util.Scanner;

public class _3_19 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        if(number1 + number2 > number3 || number2 + number3 > number1 || number1 + number3 > number2)
        {
            int c = number1 + number2 + number3;
            System.out.println(c);
        }
        else
        {
            System.out.println("invalid digits");
        }
	}

}
