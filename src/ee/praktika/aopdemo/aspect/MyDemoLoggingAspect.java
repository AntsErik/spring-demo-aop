package ee.praktika.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    //this is an aspect / java class that has a collection of advices, before and after and so on..

    //let us start with a before advice

    @Before( "execution(public void ee.praktika.aopdemo.dao.AccountDAO.addAccount())" )
    public void beforeAddAccountAdvice(){
        System.out.println( "\n======>>> Executing @Before advice on addAccount() in the AccountDAO class" );
    }
}
