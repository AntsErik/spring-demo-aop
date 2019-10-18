package ee.praktika.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public boolean addSimpleMember(){
        System.out.println( getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT" );

        return true;
    }
}
