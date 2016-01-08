package ec.edu.espol;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CalServiceTest {

	
	Calservice calService;
	
	
	@Before
	public void setup(){
		ICalculator cal = Mockito.mock(ICalculator.class);
		Mockito.when(cal.add(3, 3)).thenReturn(6);
		calService = new Calservice();
		calService.setCal(cal);
	}
	
	@Test
	public void testAddTwoNumbers(){
		Assert.assertEquals(5, calService.addTwoNumbers(3, 3));
	}

}
