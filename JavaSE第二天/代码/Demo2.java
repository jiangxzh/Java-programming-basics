public class Demo2{
	public static void main(String [] args){
		//���ԣ� ������args��ν��ܲ�����
		//��java.exe ����ʱ�ո񴫲Σ� java Demo2 a b (����ʱ��a b���뵽��args��)
		System.out.println(args[0]);
		System.out.println(args[1]);
		// java.lang.ArrayIndexOutOfBoundsException ��������Խ���쳣
		//�����ַ��[Ljava.lang.String;@15db9742
		// Ctrl + S ����
	}
}