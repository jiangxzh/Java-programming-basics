/**
算数运算符
*/
public class Demo9{
	public static void main(String [] args){
		//1.加法 +
		int a = +10; //正数
		int b = 3 + 5; //数学加法
		String city = "上海";
		String year = "2019";
		String result = city + year; //字符串拼接
		//字符串和任意结果拼接都将会变成字符串
		System.out.println("result："+3+3); //result:33
		System.out.println("result："+3*3); //result:9
		System.out.println("result："+(3+3));//result:6
		
		//2.减法 -
		int c = -10; //负数
		int d = 3 - 5; //数学减法
		
		//3.乘法 *
		System.out.println(10*10*10); //10^3
		
		//4. 除法 （java默认是整除 / ）
		System.out.println(9/2); // 4 
		System.out.println(9.0F/2);
		int scoreA = 98;
		int scoreB = 69;
		int scoreC = 45;
		//求三个分数的平均分?
		int sum = scoreA+scoreB+scoreC;
		float avg = sum*1.0F/3;
		System.out.println(avg);
		
		//5. 重点： 求余数（取模  % ）
		System.out.println(8 % 3); //余数为2
		int score = 678;    
		//获取个位、十位、百位
		int bai = score/100; 
		int shi = score/10%10;  
		int ge = score%10;
		// 1234 获取个位、十位、百位、千
		System.out.println(8+3*4%5);
	}
}









