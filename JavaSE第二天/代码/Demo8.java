/**
�ص㣺
	1. �˴�����������Ͷ�Ӧ���ֽ�������Ӣ��
	2. char���͵����� ����Сдת����
	3. float���Ϳ�������Щ���ͱ�ʾ
	4. ��ʽת�����Զ������ֶ�ǿ��ת�������ڴ������������ʧ����
*/
public class Demo8{
	public static void main(String [] args){
		// float�÷�
		byte a1 = 10;
		short a2 = 20;
		int a3 = 30;
		long a4 = 40L;
		
		float aa1= a1; //true
		float aa2= a2; //true
		// �״� 
		float aa3= a3; // float ��Χ>int��Χ
		float aa4= a4; // float ��Χ> long��Χ
		
		float q = 0.76F; //��׼��float����
		float x = 076; //076��ת����ʮ����62
		float y = 0XABCD; //ʮ�����ƻ�ת����ʮ����
		float z = 'a'; //'a' ��97
		//float k	= 3E3; //��ѧ������ XEY (X*10^y) ������double
		//float j = 0.76;
		System.out.println(3E3);
		
		// double �˴���������з�Χ����

		// �������� boolean  true /false
		//System.out.println(true+1); //��ģ�boolean���ܲ�������
	
		//������ʧ
		int test = (int)18.9; //ȡ���������������룩
		float test3 = 0.982334644768764323586543245675F;
		float test4 = (float)0.982334644768764323586543245675;
		//0.9823347 float
		//�ڴ����
		short test2 = (short)32768;
		System.out.println(test3);
		System.out.println(test4);
		
		//˼���⣺ �����������
		System.out.println(7.22-7.2); //�����ͱ���ʹ��ھ��Ȳ�
		//0.019999999999999574
	}
}