public class Demo6{
	public static void main(String [] args){
		//1. 变量的类型测试
		byte a = (byte)127; //分析：127默认是int，
		byte b = (byte)128; //byte [-128,127],手动强制转换
		//不兼容的类型: 从int转换到byte可能会有损失
		//数据类型的溢出： 内存泄漏
		 
		short c = 32767; //不兼容的类型: 从int转换到short可能会有损失
		short d = (short)-32769;//short [-32768,32767]
		// 数据类型的双边溢出
		
		int x = 100;
		long y = 2147483647; // 过大的整数: 2147483648
		long z = 2147483648L;
		// 当值超过int最大值时，赋值给long时必须加L
		//当值在int范围内时，赋值给long时可以不用加L
		
		//自动/隐式转换： 小范围【自动】向大范围转换
		byte aa = 10;
		short bb = aa;
		int cc = aa; 
		//short dd = cc; 
		/*java中当存在两个变量之间赋值时需要看数据类型
			大类型 变量 = 小类型的值; //自动转换
			小类型 变量 = 大类型的值; //出现损失值
		*/
		
		short f = 32767;
		//byte f = 127;
		//short h =f;
		//short h = f+1;
		//short h = f+1;//出错：1是int,f是short ，求和后的类型应该是int
		//short h = (short)(f+1);
		//int h = f+1;
		
		
		int q = 2147483647;
		//long e = 1L;
		int w = q+1; //数据自动溢出
		System.out.println(w);
		
		//结论： 小范围和大范围的数据运算后的结果还是大范围
	}
}