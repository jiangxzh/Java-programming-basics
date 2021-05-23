/**
重点：
	1. 八大基本数据类型对应的字节数及中英文
	2. char类型的运算 （大小写转换）
	3. float类型可以由哪些类型表示
	4. 隐式转换（自动），手动强制转换（误差【内存溢出，精度损失】）
*/
public class Demo8{
	public static void main(String [] args){
		// float用法
		byte a1 = 10;
		short a2 = 20;
		int a3 = 30;
		long a4 = 40L;
		
		float aa1= a1; //true
		float aa2= a2; //true
		// 易错 
		float aa3= a3; // float 范围>int范围
		float aa4= a4; // float 范围> long范围
		
		float q = 0.76F; //标准的float类型
		float x = 076; //076会转换成十进制62
		float y = 0XABCD; //十六进制会转换成十进制
		float z = 'a'; //'a' →97
		//float k	= 3E3; //科学计数法 XEY (X*10^y) 浮点型double
		//float j = 0.76;
		System.out.println(3E3);
		
		// double 八大基本类型中范围最大的

		// 布尔类型 boolean  true /false
		//System.out.println(true+1); //错的，boolean不能参与运算
	
		//精度损失
		int test = (int)18.9; //取整（不会四舍五入）
		float test3 = 0.982334644768764323586543245675F;
		float test4 = (float)0.982334644768764323586543245675;
		//0.9823347 float
		//内存溢出
		short test2 = (short)32768;
		System.out.println(test3);
		System.out.println(test4);
		
		//思考题： （后面会解决）
		System.out.println(7.22-7.2); //浮点型本身就存在精度差
		//0.019999999999999574
	}
}