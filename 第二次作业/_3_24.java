package �ڶ�����ҵ_���Ǹ��������;

import java.util.Scanner;
import java.util.Random;

public class _3_24 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Random r = new Random();
        Scanner input = new Scanner(System.in);
        String[] a = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] b= {"Clubs", "Diamonds", "Hearts", "Spades"};
        int ran1 = r.nextInt(13);
        int ran2 = r.nextInt(4);
        System.out.print("The card you picked is ");
        System.out.println(a[ran1] + " of " + b[ran2]);
	}

}
