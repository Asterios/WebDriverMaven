package steps;

import static org.testng.Assert.assertTrue;

import java.sql.ResultSet;
import java.sql.SQLException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DBManager;
import utils.TestConfig;
import org.testng.Assert;

public class CP_Positive_Steps {

	ResultSet res;
	
	@Given("^I am connected on the database$")
	public void i_am_connected_on_the_database() throws ClassNotFoundException, SQLException  {
	    
		DBManager.setMysqlDbConnection();
	}

	@When("^I do query for account \"([^\"]*)\"$")
	public void i_do_query_for_account(String account) throws SQLException {
	    
		String query = "select account_id, COLL_VAL, submission_date  from mv_tech_instr_coll_val where account_id = ' " +account+ " ';";
		res = DBManager.getMysqlQueryResulSet(query);
	}

	@Then("^the collateral value is bigger than zero$")
	public void the_collateral_value_is_bigger_than_zero() throws SQLException  {
	    
		System.out.print("account_id");
        //System.out.print("\t" + "bas_iso_curr_cd");
        //System.out.print("\t" + "MRKT_VAL");
        System.out.print("\t" + "COLL_VAL");
        System.out.println("\t" + "Date");
		
		while (res.next()) {
			
			System.out.print(res.getString(1));
            System.out.print("\t" +  "\t" + res.getString(2));
            System.out.println("\t" + "\t" + res.getString(3));
       
            String coll_val_string = res.getString(2);
    		int coll_val_int = Integer.parseInt(coll_val_string);
    		boolean bigger_than_zero = (coll_val_int > 0);
    		
    		System.out.println("bigger_than_zero: " +bigger_than_zero );
    		
    		if(bigger_than_zero) {
    			
    			System.out.println("Test passed");
    			
    		}
    		
    		else {
    			
    			System.out.println("Test failed");
    			assertTrue(bigger_than_zero);
    		}
    		
		}
		
				
		
		
	}
}
