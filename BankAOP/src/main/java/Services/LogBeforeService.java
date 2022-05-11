package Services;

import java.lang.reflect.Method;

import com.AOP.BankAOP.Bank;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeService implements MethodBeforeAdvice {

	public void before(Method m, Object[] param, Object o) throws Throwable {
		
		Log l=LogFactory.getLog(Bank.class);
		l.info("deposite method...");

	}

}
