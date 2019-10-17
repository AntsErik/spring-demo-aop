package ee.praktika.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ee.praktika.aopdemo.dao.AccountDAO;

public class MainDemoApp {

    public static void main( String[] args ){

        //read Spring Configuration Java Class
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext( DemoConfig.class );

        //Get the bean from Spring container
        AccountDAO theAccountDAO = context.getBean( "accountDAO", AccountDAO.class );

        //Call the "Business-model"
        theAccountDAO.addAccount();

        //Close the context
        context.close();

    }

}
