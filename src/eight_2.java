
import java.util.Scanner;

public class eight_2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[][]num=new double[4][4];
		int i,j;
		double total=0.0;
		System.out.print("输入一个4×4的矩阵：");
		for (i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				num[i][j]=input.nextDouble();
				if(i==j)
				{
					total+=num[i][j];
				}
				//System.out.print(" "+num[i][j]);
			}
			//System.out.println();
		}
		for (i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(" "+num[i][j]);
			}
			System.out.println();
		}
		System.out.println("对角线之和为："+total);

	}

}
