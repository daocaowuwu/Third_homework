
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Seven_5 {

	public static void main(String[] args) {
		int i=0;
		List<Integer> list=new ArrayList<Integer>(); //����һ��������ΪInteger������
		Scanner input=new Scanner(System.in);
		System.out.print("����ʮ�����֣�");
		String[] num = input.nextLine().split(" "); //�ַ��������Կո�ָ�����ʹ��һ���ַ�Ҳ�Ǵ����ַ��������У�
		int count=0;
		for(i=0;i<num.length;i++)
		{
			
			if(!list.contains(Integer.parseInt(num[i])))
			{
				list.add(Integer.parseInt(num[i]));
				count++;
			}
		}
		
	System.out.println("���ظ��������� "+count+" ��:");
	for(int s:list)
	{
		System.out.print(s+" ");
	}
		

		
		

	}

}
