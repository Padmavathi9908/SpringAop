//package Test;
//import com.AOP.BankAOP.Bank;
//
//import org.springframework.aop.framework.ProxyFactoryBean;
//
//import Services.LogBeforeService;
//
//public class Client
//{
//	public static void Main(String[] args) throws Throwable 
//	{
//		//create target
//		Bank b=new Bank();
//		//create advice
//		LogBeforeService lbs=new LogBeforeService();
//		//add target+advice to proxy
//		
//		ProxyFactoryBean pfb=new ProxyFactoryBean();
//		pfb.setTarget(b);
//		pfb.addAdvice(lbs);
//		//generate service obj
//		
//		Bank bproxy=(Bank)pfb.getObject();
//		int amt=bproxy.deposite("sbi123", 50000);
//		System.out.println("amt");
//	}
//
//}
