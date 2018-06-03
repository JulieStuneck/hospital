package hospital;

import org.junit.Test;

public class ReceptionistTest {
	Receptionist underTest = new Receptionist("", "", boolean);
	
	@Test
	public void shouldBeAbleToReportIfOnPhone() {
		boolean check = underTest.getPhoneStatus();
	}


}
