import java.util.Scanner;
//�û�����Ϸ��ÿ����5�ֲ���5�����ܽ�����
//��5����Ϸ�У����80%�ﵽ80�����ϣ�Ϊһ�������60%�ﵽ80������Ϊ�����������ܽ�����

public class GameGrade {

	public static void main(String[] args) {
		
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("SupperMini��˾��Ϸ����ƽ̨>��Ϸ����\n");
		
		int count=0;
				
		int i=0;
		
		
			for(;i<5;i++){
		
				
				System.out.println("���������"+(i+1)+"�֣��ɼ�Ϊ��");
				
				int score=scanner.nextInt();
				
				if(i==4){
					
					break;
					
					
				}else{
					System.out.println("��������һ��ô��yes/no��");
					
					String selcet=scanner.next();
			
						
					
						if((selcet).equalsIgnoreCase("yes")){
					
							System.out.println("���ڽ�����һ��");
							
							count++;
									
							continue;
					
						}else{
						
							System.err.println("������;�˳���Ϸ��\n�Բ�����δ�ܽ������������Ͱ���");
						
							break;
						
						}	
					
					
					
				}
				

					
			}
	
					if(i/count>=0.8){
						
						System.out.println("������");
												
					}else if(i/count>=0.6){
						
						System.out.println("��һ��");
						
					}else{
						
						System.out.println("���ܽ���");
					}
	
	
	
	
	
	
	}
}
