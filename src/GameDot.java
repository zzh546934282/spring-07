import java.util.Scanner;


public class GameDot {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("SupperMini公司游戏迷你平台>游戏点击率\n\n");
		
		int num[]=new int[4];
		
		int total=0;
	
		double avg = 0;
		
		for(int i=0;i<num.length;i++){
		
			    System.out.println("请输入第"+(i+1)+"个游戏的点击率");
		
				num[i]=scanner.nextInt();
			
			if(num[i]>100){
			
				total++;
			
			}			
			avg=100*total/(i+1);
		}	
		
		System.out.println("点击率大于100的游戏数是："+total);
		
		System.out.println("点击率大于100的游戏所占比例为："+avg+"%");
		
	
		
	}
}
