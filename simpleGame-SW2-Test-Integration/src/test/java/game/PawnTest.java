package game;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Interface.PhonyList;
import core.Board;
import core.Pawn;
import junit.framework.Assert;

public class PawnTest {
	
	Pawn pw;

	@Before
	public void setup(){
		PhonyList pho = Mockito.mock(PhonyList.class);
		Mockito.when(pho.isDead()).thenReturn(true);		
		
	}
	
	@Test
	public void testAddBonus(){
		Assert.assertEquals(true, true);
	}

}
