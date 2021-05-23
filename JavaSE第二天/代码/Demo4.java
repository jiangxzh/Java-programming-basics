public class Demo4{
	public static void main(String [] args){
		// 变量：可以变化修改的数据
		// java中八大基本数据类型（面试必考）
		// 无符号 有符号
		/* 整数 (长度) 默认值：0
				字节 byte  -128~127  （无符号范围256）
				短整型 short  -32768~32767  （无符号范围65535）
				整型 int  -2147483648~2147483647 (java中的整数默认是int)
				长整型 long 
			浮点数(精度长度) 默认值：0.0
				单精度浮点型 float
				双精度浮点型 double S (java中的小数默认是double)
			字符型 char (character字符)	默认值'\u0000' 字符空格
			布尔型 boolean (取值范围 true/false), 默认值false
		*/
		/*
			开发如何合理选择数据类型？
			依据： 按照类型所占字节大小
			
			1byte :  btye  boolean
			2byte:  short  char
			4byte: int float
			8byte: long double
		*/
		/*
			特殊规则
			1. float类型定义时，需要在数据后加F/f
			2. long类型定义时，需要在数据后加L/l
		*/
		// java 中默认采用的编码是unicode编码(前128位就是ASCII)
		// ASCII : 美国标准信息交换码 0~127
		
	}
}