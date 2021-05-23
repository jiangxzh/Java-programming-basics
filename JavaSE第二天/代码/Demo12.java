public class Demo12{
	public static void main(String [] args){
		//逻辑运算符 与或非 ()
		// 事件1  事件2  独立的结果都是boolean
		/*
			与  事件1和事件2同时成立时才会成立
				& : 判断两次
				&&（短路与）：当事件1为false时，事件2将不会执行
				开发中推荐使用&&
		*/
		//1. 与事件 (考点：多选)
		//System.out.println(3>5 & 5<6); // false & true = false
		//System.out.println(3>5 & 10/0 > 8); // ArithmeticException: / by zero
		//System.out.println(3>5 && 10/0 > 8); //false
		
		
		/*
			或
				事件1和事件2只要有一个成立则结果就是true
				| (shift+\): 判断两次
				||(短路或)： 当事件1为true时，则事件2不会执行
		*/
		//System.out.println(3<5 | 10/0 > 8);
		//System.out.println(3<5 || 10/0 > 8);
		
		/*
			非 
				非真既假，非假既真
				！ (优先级仅次于())
		*/
		//System.out.println(!true);
		//System.out.println(!(3>5));
		
		// 编写一个判断闰年的表达式？
		//闰年： 四年一闰，百年不闰，四百年再闰
		/*分析：
			四年一闰 （能被4整除 year%4==0）
			且 百年不闰（不能被100整除 year%100!=0）
			或者 四百年再闰 （能被400整除 year%400==0;）
		*/
		int year = 2008;
		boolean result = year%4==0 && year%100!=0  || year%400==0;
		System.out.println(result);
	
		//判断一个数是否是水仙花数
		//eg: 153 = 1^3 + 5^3 + 3^3
	}
}