public class Demo2{
	public static void main(String [] args){
		//面试： 主函数args如何接受参数？
		//在java.exe 解释时空格传参： java Demo2 a b (运行时将a b传入到了args中)
		System.out.println(args[0]);
		System.out.println(args[1]);
		// java.lang.ArrayIndexOutOfBoundsException 数组索引越界异常
		//数组地址：[Ljava.lang.String;@15db9742
		// Ctrl + S 保存
	}
}