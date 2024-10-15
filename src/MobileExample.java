
public class MobileExample {

	public static void main(String[] args) {
		//to call static function
		calling();
		MobileExample.calling();
		
		
		new MobileExample();  //only single object
		//new MobileExample(); - Object
		//m - Object Reference
		
		//to call static and non-static functions
		MobileExample m = new MobileExample(); //multiple objects
		MobileExample m1 = new MobileExample();
		MobileExample m2 = new MobileExample();
		MobileExample m3 = new MobileExample();
		
		m1.calling();
		
		m1.chatting();
		m2.chatting();
		new MobileExample().chatting();
			
	}
	//static
	public static void calling() {
		System.out.println("call to a number");
	}
	//non-static
	public void chatting() {
		System.out.println("chat to a number");
	}
	
}
