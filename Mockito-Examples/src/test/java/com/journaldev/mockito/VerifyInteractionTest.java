package com.journaldev.mockito;

import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;

public class VerifyInteractionTest {
	@Test
	public void testMethod() {
		@SuppressWarnings("unchecked")
		List<String> mockedList = Mockito.mock(List.class);

		mockedList.add("first-element");
		mockedList.add("second-element");
		mockedList.add("third-element");
		mockedList.add("third-element");
		mockedList.clear();

		verify(mockedList).add("first-element");
		verify(mockedList).add("second-element");
		verify(mockedList, VerificationModeFactory.times(2)).add("third-element");

		verify(mockedList).clear();
	}
	
/*
List<String> mockedList = Mockito.mock(List.class);
Use code with caution.

This line creates a mock object of the List interface using Mockito's mock() method. This mock object will simulate the behavior of a real list but allow us to control and verify its interactions.

2. Interacting with the Mock List:

Java
mockedList.add("first-element");
mockedList.add("second-element");
mockedList.add("third-element");
mockedList.add("third-element");
mockedList.clear();  

Use code with caution.

These lines add elements to the mock list and then clear it. Since we're dealing with a mock, these actions don't actually modify any underlying data structure.

3. Verifying Interactions:

verify(mockedList).add("first-element");
verify(mockedList).add("second-element");
verify(mockedList, VerificationModeFactory.times(2)).add("third-element");
verify(mockedList).clear();  

These lines verify that the mock list was interacted with as expected:
verify(mockedList).add("first-element");: Verifies that the add() method was called once with the argument "first-element".
verify(mockedList).add("second-element");: Verifies that the add() method was called once with the argument "second-element".
verify(mockedList, VerificationModeFactory.times(2)).add("third-element");: Verifies that the add() method was called exactly twice with the argument "third-element".
verify(mockedList).clear();: Verifies that the clear() method was called once.
Overall Purpose:

This code demonstrates how to create a mock object, interact with it, and verify its behavior using Mockito. This is a common pattern in unit testing, where mock objects are used to isolate the code under test and simulate interactions with external dependencies.
*/	

}
