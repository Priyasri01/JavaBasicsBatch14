
public class ReturnMethod01 {

		// TODO Auto-generated method stub
		
		/*Create a method createEmail(). Based on values of users name, lastName and email type,
	    your method should return complete email Address.
	    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or */
		
		String createEmail(String firstName, String lastName, String emailtype) {
			
			return firstName + lastName +"@"+emailtype;
			
			
			
			
		}
		
public static void main(String[] args) {
	
	ReturnMethod01 obj=new ReturnMethod01();
	
	System.out.println(obj.createEmail("Peter", "rose", "gmail.com"));
	
	
}
	

}
