package Services;

import com.AOP.BankAOP.Bank;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogAroundService implements MethodInterceptor {
	public Object invoke(MethodInvocation mi) throws Throwable {
		Log l = LogFactory.getLog(Bank.class);
		l.info("before deposite code.....");
		Object ret = mi.proceed();
		l.info("after deposite code ...");
		return ret;
	}

}
