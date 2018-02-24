import java.util.Scanner;


public class ShowMenu {

	public static void main(String[] args) {
		
		System.out.println("欢迎进入SuperMini公司迷你游戏平台\n");
		
		System.out.println("请选择您喜爱的游戏\n");
		
		System.out.println("************************************");
		System.out.println("1：斗地主");
		System.out.println("2：斗牛");
		System.out.println("3：泡泡龙");
		System.out.println("4：连连看");
		System.out.println("************************************\n");
		
		
		
		Scanner scanner=new Scanner(System.in);
		
		
		boolean flag=true;
		do{   System.out.println("请选择，输入数字：");
			int number=scanner.nextInt();
				switch(number){
				case 1: 
					System.out.println("您已进入斗地主房间！"); 
					flag=true;
					break;
				case 2:
					System.out.println("您已进入斗牛房间！");
					flag=true;
					break;
				case 3:
					System.out.println("您已进入泡泡龙房间！");
					flag=true;
					break;
				case 4:
					System.out.println("您已进入连连看房间！");
					flag=true;
					break;
				default:
					System.out.println("输入错误请重新输入");
					flag=false;
					
				}
		
		}while(flag==false);
		
	}
}
