import java.util.Scanner;


public class AddUser {
	
	public static void main(String[] args) {
	
		System.out.println("����������Ϸƽ̨>����û���Ϣ\n");

		System.out.println("������Ҫ¼����û���");
		
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		
		int o;
		
		
	
			for(int j=0;j<n;j++){
				
				System.out.println("�������"+(j+1)+"���û���š�4λ����");
				
				int k=scanner.nextInt();
				
				if(k<10000&&k>999){
						
				}else{
					
					System.out.println("�����������������");
					
					continue;
				}
				
				System.out.println("�������û�����");
				
				int m=scanner.nextInt();
				if(m<=10){
					
					System.out.println("�ܱ�Ǹ���������䲻�ʺ�����Ϸ");
					
					System.out.println("¼����Ϣʧ��");
					
					continue;
					
				}else{
				
				System.out.println("�������Ա����");
				
				   o=scanner.nextInt();
				}
				
				System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
			
				System.out.println("��ţ�"+k+"���䣺"+m+"����"+o);
				
				System.out.println();
			}
		
			
		}
		
}
