package com.journaldev.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;



/*
 * 
 * 
Mockito Stub
------------
Creates a complete mock: A stub is a complete mock object that you can control the behavior of.
Direct interaction: You can directly specify the return values and behavior of the mock using methods like when and thenReturn.
No interaction with real object: Stubs don't interact with the real object they're mocking.


Mockito Spy
-----------
Partial mock: A spy is a partial mock that wraps a real object.
Interacts with real object: You can call methods on the real object, and Mockito will record the interactions.
Selective mocking: You can choose to mock specific methods of the real object while allowing others to be called on the real instance.
 */

public class MockitoSpyTest {

	@Test
	public void testMethod() {
		List<String> list = new ArrayList<String>();
		List<String> listSpy = spy(list);

		listSpy.add("first-element");
		System.out.println(listSpy.get(0));

		assertEquals("first-element", listSpy.get(0));
		when(listSpy.get(0)).thenReturn("second-element");
		System.out.println(listSpy.get(0));
		assertEquals("second-element", listSpy.get(0));
	}

}
