package hospital;

import org.junit.Test;

public class ReceptionistTest {
	Receptionist underTest = new Receptionist("", "", false);
	
	@Test
	public void shouldBeAbleToReportIfOnPhone() {
		boolean check = underTest.getPhoneStatus();
	}


}
