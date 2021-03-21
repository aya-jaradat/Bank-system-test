package testJUnit;

//import junit.framework.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)

@Suite.SuiteClasses({
	CustomerTest.class,
	AccountTest.class,	
	checkingAccountTest.class,
	SavingAccountTest.class
})

public class BankAccountTestSuite {
	
	
}
