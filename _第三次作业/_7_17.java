package ���Ĵ���ҵ_���鳤��������;

import java.util.Scanner;

public class _7_17 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers of students: ");
        int n=input.nextInt();
        System.out.print("Enter the names of students one by one:");
        String[] stu;
        stu = new String[n];
        for(int i=0;i<n;++i)
        {
            stu[i]=input.next();
        }
        System.out.print("Enter the scores of students: ");
        double[] scores;
        scores = new double[n];
        for(int i=0;i<n;++i)
        {
            scores[i]=input.nextDouble();
        }
        for(int i=0;i<10;i++)
        {
            for(int j=n-1;j>i;j--)
            {
                if(scores[j]>scores[j-1])
                {
                    String tempstr=stu[j];
                    stu[j]=stu[j-1];stu[j-1]=tempstr;
                    double tempint=scores[j];scores[j]=scores[j-1];scores[j-1]=tempint;
                }
            }
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(stu[k]);
            if(k!=n-1)
            {
                System.out.print(" ");
            }
        }
        System.out.println();
	}

}
