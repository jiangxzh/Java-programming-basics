public class Demo6{
	public static void main(String [] args){
		//1. ���������Ͳ���
		byte a = (byte)127; //������127Ĭ����int��
		byte b = (byte)128; //byte [-128,127],�ֶ�ǿ��ת��
		//�����ݵ�����: ��intת����byte���ܻ�����ʧ
		//�������͵������ �ڴ�й©
		 
		short c = 32767; //�����ݵ�����: ��intת����short���ܻ�����ʧ
		short d = (short)-32769;//short [-32768,32767]
		// �������͵�˫�����
		
		int x = 100;
		long y = 2147483647; // ���������: 2147483648
		long z = 2147483648L;
		// ��ֵ����int���ֵʱ����ֵ��longʱ�����L
		//��ֵ��int��Χ��ʱ����ֵ��longʱ���Բ��ü�L
		
		//�Զ�/��ʽת���� С��Χ���Զ������Χת��
		byte aa = 10;
		short bb = aa;
		int cc = aa; 
		//short dd = cc; 
		/*java�е�������������֮�丳ֵʱ��Ҫ����������
			������ ���� = С���͵�ֵ; //�Զ�ת��
			С���� ���� = �����͵�ֵ; //������ʧֵ
		*/
		
		short f = 32767;
		//byte f = 127;
		//short h =f;
		//short h = f+1;
		//short h = f+1;//����1��int,f��short ����ͺ������Ӧ����int
		//short h = (short)(f+1);
		//int h = f+1;
		
		
		int q = 2147483647;
		//long e = 1L;
		int w = q+1; //�����Զ����
		System.out.println(w);
		
		//���ۣ� С��Χ�ʹ�Χ�����������Ľ�����Ǵ�Χ
	}
}