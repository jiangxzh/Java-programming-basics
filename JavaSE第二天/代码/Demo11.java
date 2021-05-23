public class Demo11{
	public static void main(String [] args){
		//1.关系运算符 (结果永远是boolean)
		/*
		System.out.println(3>5);  //false
		System.out.println(3<5);  //true
		System.out.println(5<=5); 
		System.out.println(5>=5); 
		System.out.println(5!=5);  //不等
		*/
		
		// 重点： 如何判断两个值是否相等
		//java 中 = 表示赋值（将等号右边的值赋值给等号左边的变量）
		/*
			1. 基本数据类型（八种）通过 == 比较数值
			2. 引用数据类型 字符串 == 比较的是地址
		*/
		//System.out.println(5==5); 
		//System.out.println(5.0==5);  //特殊
		
		//程序开发中尽量避免此种写法
		//System.out.println(3<5==true); 
		//System.out.println(3<5); 
		
		String str = "abc"; //字符串常量
		String str2 = "abc";
		String str3 = new String("abc");
		
		//System.out.println(str == str2); //地址相同
		System.out.println(str == str3); //地址不相同 false
		
		//若只想比较字符串中的内容，不管地址
		System.out.println(str.equals(str3)); //true
	}
}