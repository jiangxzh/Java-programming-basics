public class Demo7{
	public static void main(String [] args){
		// �ַ����͵���ز���
		char ch = 'a'; //2byte
		int x = ch; //4byte  97 �Զ���unicode���ַ�ת���ɶ�Ӧ��ʮ������
		//�ص㣺 ASCII��'a':97   'A':65  '0':48��
		
		char ch2 = 98; //�ص㣺��ʮ���ƶ��ղ�unicode��
		char ch3 = 20013; //'��'
		
		System.out.println('��'+0); // 'a'
		System.out.println(ch+1); //97+1=98
		//System.out.println((char)(ch+1));
		
		ch = 'b'; //ͨ��ch��ȡ'B' : ʹ�õĻ���ͬһ������ch
		char ch5 = (char)(ch-32); //B
		//ch = ch-32;
		System.out.println('2'+2); // 50	
		
		// ��char����ʹ��ʱ�����ַ�����
		//��char��������ʱ���ͻ��ֽ�char����unicode��ת����ʮ�����ٲ�������
		
		char gender = 'M'; //'F'
		char sex = '��';
		
	}
}