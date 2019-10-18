package ee.praktika.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ee.praktika.aopdemo.dao.AccountDAO;
import ee.praktika.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

    public static void main( String[] args ){

        //read Spring Configuration Java Class
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext( DemoConfig.class );

        //Get the bean from Spring container
        AccountDAO theAccountDAO = context.getBean( "accountDAO", AccountDAO.class );

        //get membership bean from the spring container
        MembershipDAO theMembershipDAO = context.getBean( "membershipDAO", MembershipDAO.class );

        //Call the "Business-model"
        theAccountDAO.addAccount();

        //Call the Membership "Business-method"
        theMembershipDAO.addAccount();

        //Close the context
        context.close();

    }

}
