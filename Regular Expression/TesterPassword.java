package regularExpression;
public class TesterPassword {
	public static boolean checkPasswordValidity(String password)
	{
		String regex ="(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%*]).{8,20}";
		if (password.matches(regex))
		{
		return true;
		}
		else {
			return false;
		}
	}
		public static void main(String[] args)
		{
		 String password = "pass%*Word990";
		 System.out.println("The password is "+ (checkPasswordValidity(password) ? "valid!" :"invalid!"));
		}
		}
