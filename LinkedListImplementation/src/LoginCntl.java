/**
 * 
 */
import java.util.ArrayList;
/**
 * @author phili
 *
 */
public class LoginCntl {
	 	private UserList currentUserList;
	    private ArrayList<User> listOfUsers;
	    
	    public LoginCntl() {
	        // Get an instance of the current UserList class
	        currentUserList = new UserList();
	        listOfUsers = currentUserList.getListOfUsers();
	        // Then we would put up theLoginUI window...
	    }
	    
	    
	    public UserList getUserList(){
	        return currentUserList;
	    }

}
