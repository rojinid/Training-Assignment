package regularExpression;

public class WebAddress {
	public static boolean checkWebAddressValidity(String password)
	{
		String regex ="^[http|https].*(://www.).[A-Za-z0-9].*.?[com|org|net]";
		if (password.matches(regex))
		{
		return true;
		}
		else
		{
		return false;
	}
	}
	public static void main(String[] args) {
		String webAddress = "http://www.company.com";
		 System.out.println("The web address is "+ (checkWebAddressValidity(webAddress) ? "valid!" :
		"invalid!"));
	}

}
