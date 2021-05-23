public class Demo7{
	public static void main(String [] args){
		// 字符类型的相关操作
		char ch = 'a'; //2byte
		int x = ch; //4byte  97 自动查unicode表将字符转换成对应的十进制数
		//重点： ASCII【'a':97   'A':65  '0':48】
		
		char ch2 = 98; //重点：将十进制对照查unicode表
		char ch3 = 20013; //'中'
		
		System.out.println('国'+0); // 'a'
		System.out.println(ch+1); //97+1=98
		//System.out.println((char)(ch+1));
		
		ch = 'b'; //通过ch获取'B' : 使用的还是同一个变量ch
		char ch5 = (char)(ch-32); //B
		//ch = ch-32;
		System.out.println('2'+2); // 50	
		
		// 当char单独使用时就是字符类型
		//当char参与运算时，就会现将char对照unicode表转换成十进制再参与运算
		
		char gender = 'M'; //'F'
		char sex = '男';
		
	}
}