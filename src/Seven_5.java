
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Seven_5 {

	public static void main(String[] args) {
		int i=0;
		List<Integer> list=new ArrayList<Integer>(); //定义一个数据型为Integer的链表
		Scanner input=new Scanner(System.in);
		System.out.print("输入十个数字：");
		String[] num = input.nextLine().split(" "); //字符串数组以空格分隔（即使是一个字符也是存入字符串数组中）
		int count=0;
		for(i=0;i<num.length;i++)
		{
			
			if(!list.contains(Integer.parseInt(num[i])))
			{
				list.add(Integer.parseInt(num[i]));
				count++;
			}
		}
		
	System.out.println("不重复的数字有 "+count+" 个:");
	for(int s:list)
	{
		System.out.print(s+" ");
	}
		

		
		

	}

}
