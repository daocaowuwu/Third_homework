
import java.util.Scanner;

public class Eight_6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[][] a=new double[3][3];
		double[][] b=new double[3][3];
		double[][] c=new double[3][3];
		int i,j,k;
		System.out.print("输入两个3×3的矩阵：");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=input.nextDouble();
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=input.nextDouble();
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=0;
				for(k=0;k<3;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(String.format("%5.1f",c[i][j]));
			}
			System.out.println();
		}

	}

}
