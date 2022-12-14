/**
 * 
 */
import java.io.Serializable;
/**
 * @author phili
 *
 */
public class User implements Serializable{
	 private String userName;
	 private String password;
	 public User(String userName, String pw) 
	 {
		 this.userName = userName;
		 password = pw;
	 }
	 public void setUserName(String userName) {
		 this.userName = userName;
	 }
	 public String getUserName() {
		 return userName;
	 }
	

}
