public class Demo12{
	public static void main(String [] args){
		//�߼������ ���� ()
		// �¼�1  �¼�2  �����Ľ������boolean
		/*
			��  �¼�1���¼�2ͬʱ����ʱ�Ż����
				& : �ж�����
				&&����·�룩�����¼�1Ϊfalseʱ���¼�2������ִ��
				�������Ƽ�ʹ��&&
		*/
		//1. ���¼� (���㣺��ѡ)
		//System.out.println(3>5 & 5<6); // false & true = false
		//System.out.println(3>5 & 10/0 > 8); // ArithmeticException: / by zero
		//System.out.println(3>5 && 10/0 > 8); //false
		
		
		/*
			��
				�¼�1���¼�2ֻҪ��һ��������������true
				| (shift+\): �ж�����
				||(��·��)�� ���¼�1Ϊtrueʱ�����¼�2����ִ��
		*/
		//System.out.println(3<5 | 10/0 > 8);
		//System.out.println(3<5 || 10/0 > 8);
		
		/*
			�� 
				����ȼ٣��Ǽټ���
				�� (���ȼ�������())
		*/
		//System.out.println(!true);
		//System.out.println(!(3>5));
		
		// ��дһ���ж�����ı��ʽ��
		//���꣺ ����һ�򣬰��겻���İ�������
		/*������
			����һ�� ���ܱ�4���� year%4==0��
			�� ���겻�򣨲��ܱ�100���� year%100!=0��
			���� �İ������� ���ܱ�400���� year%400==0;��
		*/
		int year = 2008;
		boolean result = year%4==0 && year%100!=0  || year%400==0;
		System.out.println(result);
	
		//�ж�һ�����Ƿ���ˮ�ɻ���
		//eg: 153 = 1^3 + 5^3 + 3^3
	}
}