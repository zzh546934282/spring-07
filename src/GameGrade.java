import java.util.Scanner;
//用户玩游戏，每次玩5局不足5局则不能晋级。
//在5局游戏中，如果80%达到80分以上，为一级，如果60%达到80分以上为二级，否则不能晋级。

public class GameGrade {

	public static void main(String[] args) {
		
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("SupperMini公司游戏迷你平台>游戏晋级\n");
		
		int count=0;
				
		int i=0;
		
		
			for(;i<5;i++){
		
				
				System.out.println("您正在玩第"+(i+1)+"局，成绩为：");
				
				int score=scanner.nextInt();
				
				if(i==4){
					
					break;
					
					
				}else{
					System.out.println("继续玩下一局么（yes/no）");
					
					String selcet=scanner.next();
			
						
					
						if((selcet).equalsIgnoreCase("yes")){
					
							System.out.println("正在进入下一局");
							
							count++;
									
							continue;
					
						}else{
						
							System.err.println("您已中途退出游戏。\n对不起，您未能晋级，继续加油啊！");
						
							break;
						
						}	
					
					
					
				}
				

					
			}
	
					if(i/count>=0.8){
						
						System.out.println("晋二级");
												
					}else if(i/count>=0.6){
						
						System.out.println("晋一级");
						
					}else{
						
						System.out.println("不能晋级");
					}
	
	
	
	
	
	
	}
}
