import java.math.BigDecimal;
import java.util.Scanner;

/**
 * ������Ϸ���ͺ���Ϸʱ������Ӧ֧������Ϸ��
��Ϸ���ͷ�Ϊ������:  ��������о�����
��Ϸ���շѱ�׼:   ���ࣺ10Ԫ/Сʱ   ���о����ࣺ20Ԫ/Сʱ
��Ϸ���շѹ��� :  ��Ϸʱ�䳬��10Сʱ�����Դ�5��10Сʱ�����£���8��
                       
 * @param args
 */
public class PayGame {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("SupperMini��˾������Ϸƽ̨>��Ϸ��֧��\n");
		
		System.out.println("1.����");
		System.out.println("2.���о�����\n\n");
		String number  = "";  
		
		double money;  
		
		double time;   
		
		boolean flag;
		
		//������Ϸ����
		//�ж� �Ƿ������������1��2 ���� ѭ���������룻
		do{   System.out.println("��ѡ���������Ϸ���ͣ�");   
					number=scanner.next();
				switch(number){
				case "1": 
					System.out.println("1.����"); 
					flag=true;
					break;
				case "2":
					System.out.println("2.���о�����");
					flag=true;
					break;				
				default:
					System.out.println("�����������������");
					flag=false;
					
				}
		
		}while(flag==false);
		
		

//		
//		String a="";		                                         //   ��������ʱ��Դ� 

//		System.out.println("������������Ϸʱ��:(����Сʱ��)");            �������⡣
//		                                                                  ��double����ʱ�䣬
//		do{     time=scanner.next();	                                  ���û�������ĸʱ����
//				if(scanner.hasNextInt()){                                 ����Stringȥ����ʱ��
//			 															 �¸�ѭ����time��������
//					  flag=true;										  �������⡣
//					  break;		                                      ������BigDecimal���
//				}else{													   ��ʧ�ܡ�
//					System.out.println("�����������������....");
//					flag=false;
//				}
//		}while(flag==false)	;
//				
//	
//		BigDecimal num1 = new BigDecimal(time);
//		BigDecimal num2 = new BigDecimal(a);
//		 result = num1.multiply(num2);
		
		
		
		
		//������Ϸʱ��
		System.out.println("������������Ϸʱ��:(����Сʱ��)");
		time=scanner.nextDouble();
		
		
		
		
		//����ѡ�����Ϸ ���з��ࣻ
		// �� ѭ�� ����ʱ ���� ����ʡ�� ��Ϊ��һ��ѭ�� ʱ �Ѿ��ж�
		// ѭ����switch �еı��� ���� ���� ֮ǰ ѭ���� ������ֵ 
		do{		   	
					
					
			  switch(number){
				case "1": //������Ϸ
					//�ж���Ϸʱ�� ���� ֧������ж�
					if(time>=10){
	     	   
					
					
					money=time*10*0.5;
	     	       	   
					System.out.println("�������������Ϸ��ʱ����"+time+"Сʱ����������5���Żݣ���Ҫ֧��"+money+"��Ϸ��");
	     	   
					}else{
						
					
					money=time*10*0.8;
					
					System.out.println("�������������Ϸ��ʱ����"+time+"Сʱ����������8���Żݣ���Ҫ֧��"+money+"��Ϸ��");
						
					}   
					flag=false;
					break;
			
				case "2"://��������Ϸ
					//�ж���Ϸʱ�� ���� ֧������ж�
					if(time>=10){
				     	   
						
						
						money=time*20*0.5;
		     	       	   
						System.out.println("������Ǿ�������Ϸ��ʱ����"+time+"Сʱ����������5���Żݣ���Ҫ֧��"+money+"��Ϸ��");
		     	   
					}else{
							
						
						money=time*20*0.8;
						
						System.out.println("������Ǿ�������Ϸ��ʱ����"+time+"Сʱ����������8���Żݣ���Ҫ֧��"+money+"��Ϸ��");
							
					      }
						flag=false;
						break;
				default:
						System.out.println("�����������������....");
						flag=true;
					
				}
	     }while(flag==true);
		
	
	
	
	}
}
