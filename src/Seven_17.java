
import java.util.Scanner;

public class Seven_17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("输入学生个数：");
		int n=input.nextInt();
		int i=0;
		int[] num=new int[25];
		String[] name=new String[25];
		System.out.print("输入学生姓名 成绩：");
		for(i=0;i<n;i++)
		{
			name[i]=input.next();
			num[i]=input.nextInt();
		}
		int max,k=0,j;
		int t;
		String p;
		for(j=0;j<n;j++)
		{
			max=num[j];
			k=j;
		for(i=1+j;i<n;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
				k=i;
			}
			
		}
		t=num[k];
		num[k]=num[j];
		num[j]=t;
		p=name[k];
		name[k]=name[j];
		name[j]=p;
		}
		for(i=0;i<n;i++)
		{
			System.out.println(name[i]+" :"+num[i]);
		}
		

	}

}
