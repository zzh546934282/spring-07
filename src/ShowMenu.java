import java.util.Scanner;


public class ShowMenu {

	public static void main(String[] args) {
		
		System.out.println("��ӭ����SuperMini��˾������Ϸƽ̨\n");
		
		System.out.println("��ѡ����ϲ������Ϸ\n");
		
		System.out.println("************************************");
		System.out.println("1��������");
		System.out.println("2����ţ");
		System.out.println("3��������");
		System.out.println("4��������");
		System.out.println("************************************\n");
		
		
		
		Scanner scanner=new Scanner(System.in);
		
		
		boolean flag=true;
		do{   System.out.println("��ѡ���������֣�");
			int number=scanner.nextInt();
				switch(number){
				case 1: 
					System.out.println("���ѽ��붷�������䣡"); 
					flag=true;
					break;
				case 2:
					System.out.println("���ѽ��붷ţ���䣡");
					flag=true;
					break;
				case 3:
					System.out.println("���ѽ������������䣡");
					flag=true;
					break;
				case 4:
					System.out.println("���ѽ������������䣡");
					flag=true;
					break;
				default:
					System.out.println("�����������������");
					flag=false;
					
				}
		
		}while(flag==false);
		
	}
}
