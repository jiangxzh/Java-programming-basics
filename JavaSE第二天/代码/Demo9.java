/**
���������
*/
public class Demo9{
	public static void main(String [] args){
		//1.�ӷ� +
		int a = +10; //����
		int b = 3 + 5; //��ѧ�ӷ�
		String city = "�Ϻ�";
		String year = "2019";
		String result = city + year; //�ַ���ƴ��
		//�ַ�����������ƴ�Ӷ��������ַ���
		System.out.println("result��"+3+3); //result:33
		System.out.println("result��"+3*3); //result:9
		System.out.println("result��"+(3+3));//result:6
		
		//2.���� -
		int c = -10; //����
		int d = 3 - 5; //��ѧ����
		
		//3.�˷� *
		System.out.println(10*10*10); //10^3
		
		//4. ���� ��javaĬ�������� / ��
		System.out.println(9/2); // 4 
		System.out.println(9.0F/2);
		int scoreA = 98;
		int scoreB = 69;
		int scoreC = 45;
		//������������ƽ����?
		int sum = scoreA+scoreB+scoreC;
		float avg = sum*1.0F/3;
		System.out.println(avg);
		
		//5. �ص㣺 ��������ȡģ  % ��
		System.out.println(8 % 3); //����Ϊ2
		int score = 678;    
		//��ȡ��λ��ʮλ����λ
		int bai = score/100; 
		int shi = score/10%10;  
		int ge = score%10;
		// 1234 ��ȡ��λ��ʮλ����λ��ǧ
		System.out.println(8+3*4%5);
	}
}









