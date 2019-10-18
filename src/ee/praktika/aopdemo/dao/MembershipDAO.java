package ee.praktika.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void addSimpleMember(){
        System.out.println( getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT" );
    }
}
