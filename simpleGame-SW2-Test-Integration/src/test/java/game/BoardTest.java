package game;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Interface.PhonyList;
import core.Board;



public class BoardTest {

	Board brd;

	@Before
	public void setup(){
		PhonyList pho = Mockito.mock(PhonyList.class);
		Mockito.when(pho.isBonusSquare(2, 2)).thenReturn(true);		
		
	}
	
	@Test
	public void testAddBonus(){
		Assert.assertEquals(false, false);
	}
}
