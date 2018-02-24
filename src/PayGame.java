import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 根据游戏类型和游戏时长计算应支付的游戏币
游戏类型分为两大类:  牌类和休闲竞技类
游戏的收费标准:   牌类：10元/小时   休闲竞技类：20元/小时
游戏的收费规则 :  游戏时间超过10小时，可以打5折10小时及以下，打8折
                       
 * @param args
 */
public class PayGame {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("SupperMini公司迷你游戏平台>游戏币支付\n");
		
		System.out.println("1.牌类");
		System.out.println("2.休闲竞技类\n\n");
		String number  = "";  
		
		double money;  
		
		double time;   
		
		boolean flag;
		
		//输入游戏类型
		//判断 是否输入的是数字1或2 不是 循环重新输入；
		do{   System.out.println("请选择您玩的游戏类型：");   
					number=scanner.next();
				switch(number){
				case "1": 
					System.out.println("1.牌类"); 
					flag=true;
					break;
				case "2":
					System.out.println("2.休闲竞技类");
					flag=true;
					break;				
				default:
					System.out.println("输入错误请重新输入");
					flag=false;
					
				}
		
		}while(flag==false);
		
		

//		
//		String a="";		                                         //   检验输入时间对错 

//		System.out.println("请输入您的游戏时长:(几个小时？)");            出现问题。
//		                                                                  用double接收时间，
//		do{     time=scanner.next();	                                  当用户输入字母时出错
//				if(scanner.hasNextInt()){                                 但用String去接收时间
//			 															 下个循环中time参与运算
//					  flag=true;										  出现问题。
//					  break;		                                      尝试用BigDecimal解决
//				}else{													   但失败。
//					System.out.println("输入错误，请重新输入....");
//					flag=false;
//				}
//		}while(flag==false)	;
//				
//	
//		BigDecimal num1 = new BigDecimal(time);
//		BigDecimal num2 = new BigDecimal(a);
//		 result = num1.multiply(num2);
		
		
		
		
		//输入游戏时长
		System.out.println("请输入您的游戏时长:(几个小时？)");
		time=scanner.nextDouble();
		
		
		
		
		//根据选择的游戏 进行分类；
		// 此 循环 运行时 发现 可以省略 因为第一个循环 时 已经判断
		// 循环中switch 中的变量 可以 接收 之前 循环中 所赋的值 
		do{		   	
					
					
			  switch(number){
				case "1": //牌类游戏
					//判断游戏时长 进行 支付金额判断
					if(time>=10){
	     	   
					
					
					money=time*10*0.5;
	     	       	   
					System.out.println("您玩的是牌类游戏，时常是"+time+"小时，可以享受5折优惠，需要支付"+money+"游戏币");
	     	   
					}else{
						
					
					money=time*10*0.8;
					
					System.out.println("您玩的是牌类游戏，时常是"+time+"小时，可以享受8折优惠，需要支付"+money+"游戏币");
						
					}   
					flag=false;
					break;
			
				case "2"://竞技类游戏
					//判断游戏时长 进行 支付金额判断
					if(time>=10){
				     	   
						
						
						money=time*20*0.5;
		     	       	   
						System.out.println("您玩的是竞技类游戏，时常是"+time+"小时，可以享受5折优惠，需要支付"+money+"游戏币");
		     	   
					}else{
							
						
						money=time*20*0.8;
						
						System.out.println("您玩的是竞技类游戏，时常是"+time+"小时，可以享受8折优惠，需要支付"+money+"游戏币");
							
					      }
						flag=false;
						break;
				default:
						System.out.println("输入错误，请重新输入....");
						flag=true;
					
				}
	     }while(flag==true);
		
	
	
	
	}
}
