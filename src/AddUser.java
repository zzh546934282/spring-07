import java.util.Scanner;


public class AddUser {
	
	public static void main(String[] args) {
	
		System.out.println("青鸟迷你游戏平台>添加用户信息\n");

		System.out.println("请输入要录入的用户量");
		
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		
		int o;
		
		
	
			for(int j=0;j<n;j++){
				
				System.out.println("请输入第"+(j+1)+"个用户编号《4位数》");
				
				int k=scanner.nextInt();
				
				if(k<10000&&k>999){
						
				}else{
					
					System.out.println("输入错误请重新输入");
					
					continue;
				}
				
				System.out.println("请输入用户年龄");
				
				int m=scanner.nextInt();
				if(m<=10){
					
					System.out.println("很抱歉，您的年龄不适合玩游戏");
					
					System.out.println("录入信息失败");
					
					continue;
					
				}else{
				
				System.out.println("请输入会员积分");
				
				   o=scanner.nextInt();
				}
				
				System.out.println("您录入的会员信息是：");
			
				System.out.println("编号："+k+"年龄："+m+"积分"+o);
				
				System.out.println();
			}
		
			
		}
		
}
