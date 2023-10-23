package ExceptionHandling;

class UserD extends Exception{
	public UserD(String str) {
		super(str);
	}
}



public class UserDefined {
	public static void main(String str[]) {
		try {
			throw new UserD("User Defined Exception");
		}
		catch(UserD ud) {
			System.out.println("Inside Catch block =>"+ud.getMessage());
		}
	}
}
