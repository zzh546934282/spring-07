import java.util.Scanner;


public class GameDot {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("SupperMini��˾��Ϸ����ƽ̨>��Ϸ�����\n\n");
		
		int num[]=new int[4];
		
		int total=0;
	
		double avg = 0;
		
		for(int i=0;i<num.length;i++){
		
			    System.out.println("�������"+(i+1)+"����Ϸ�ĵ����");
		
				num[i]=scanner.nextInt();
			
			if(num[i]>100){
			
				total++;
			
			}			
			avg=100*total/(i+1);
		}	
		
		System.out.println("����ʴ���100����Ϸ���ǣ�"+total);
		
		System.out.println("����ʴ���100����Ϸ��ռ����Ϊ��"+avg+"%");
		
	
		
	}
}
