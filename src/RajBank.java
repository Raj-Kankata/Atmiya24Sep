
public class RajBank implements Bank_Interface {

	public static void main(String[] args) {
		RajBank rb = new RajBank();
		rb.credit();
		rb.debit();
		rb.loan();
		rb.insurance();
		
		Bank_Interface b = new RajBank();
		b.credit();
		b.debit();
		b.loan();

	}
	public void credit() {
		System.out.println("Credit");
	}
	public void debit() {
		System.out.println("Debit");
	}
	public void loan() {
		System.out.println("Loans");
	}
	public void insurance() {
		System.out.println("Insurance");
	}

}
