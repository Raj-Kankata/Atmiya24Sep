
public class TestBank extends HDFCBank {

	public static void main(String[] args) {
		
		TestBank t = new TestBank();
		t.credit();
		t.debit();
		t.loan();
		
		RajBank rb = new RajBank();
		rb.credit();
	}
	

	@Override
	public void loan() {
		System.out.println("Loans");
		
	}

	@Override
	public void debit() {
		System.out.println("Debit");
		
	}

}
