public class Demo11{
	public static void main(String [] args){
		//1.��ϵ����� (�����Զ��boolean)
		/*
		System.out.println(3>5);  //false
		System.out.println(3<5);  //true
		System.out.println(5<=5); 
		System.out.println(5>=5); 
		System.out.println(5!=5);  //����
		*/
		
		// �ص㣺 ����ж�����ֵ�Ƿ����
		//java �� = ��ʾ��ֵ�����Ⱥ��ұߵ�ֵ��ֵ���Ⱥ���ߵı�����
		/*
			1. �����������ͣ����֣�ͨ�� == �Ƚ���ֵ
			2. ������������ �ַ��� == �Ƚϵ��ǵ�ַ
		*/
		//System.out.println(5==5); 
		//System.out.println(5.0==5);  //����
		
		//���򿪷��о����������д��
		//System.out.println(3<5==true); 
		//System.out.println(3<5); 
		
		String str = "abc"; //�ַ�������
		String str2 = "abc";
		String str3 = new String("abc");
		
		//System.out.println(str == str2); //��ַ��ͬ
		System.out.println(str == str3); //��ַ����ͬ false
		
		//��ֻ��Ƚ��ַ����е����ݣ����ܵ�ַ
		System.out.println(str.equals(str3)); //true
	}
}