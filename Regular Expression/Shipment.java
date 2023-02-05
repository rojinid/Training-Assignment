package regularExpression;
public class shipmentid {
	public boolean checkProductNameValidity(String productName) 
	 {
		 String regex="([A-Za-z]{3,10}.\\s[A-Za-z]{3,10}.\\s[A-Za-z]{3,10})"
		 		+ "|([A-Za-z]{3,10}.*\\s[A-Za-z]{3,10})";
		 if(productName.matches(regex))
		 {
			 return true;
		 }	 
	         return false; 
	}
	public boolean checkProductIdValidity(String productId) 
	
	{
		String regex="[A-Za-z0-9]{2,20}";
		if(productId.matches(regex))
		{
			return true;
		}
		
	 return false; 
	}
	public boolean checkTrackerIdValidity(String trackerId) {
		String regex="[A-Z]{1}:[A-Z]{4}:[a-z]{3}:[0-9]{2}";
		if(trackerId.matches(regex))
		{
			return true;
		}
	 return false; 
	} 
}
class Shipment
{ 
	 public static void main(String[] args)
	 {	 
	 shipmentid shipment = new shipmentid();
	 String productName = "Digital Camera";
	 System.out.println("The product name is "+ (shipment.checkProductNameValidity(productName) ? "valid!" : "invalid!"));
	 String productId = "DC1911";
	 System.out.println("The product Id is "+ (shipment.checkProductIdValidity(productId) ? "valid!" : "invalid!"));
	 String trackerId = "D:CMDC:cmd:23";
	 System.out.println("The tracker Id is "+ (shipment.checkTrackerIdValidity(trackerId) ? "valid!" : "invalid!"));
}
}

