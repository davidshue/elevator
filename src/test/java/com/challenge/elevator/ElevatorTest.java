package com.challenge.elevator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


/**
 * Created by dshue1 on 10/28/16.
 */
public class ElevatorTest {
	@Test
	public void testPriority() {
		Elevator e1 = new Elevator(1, 100);

		Elevator e2 = new Elevator(2, 100);

		Elevator e3 = new Elevator(3, 100);

		Elevator e4 = new Elevator(4, 100);

		Elevator e5 = new Elevator(5, 100);

		Elevator e6 = new Elevator(6, 100);

		e1.setStatus(Status.idle);
		e1.setCurrentLevel(20);

		e2.setStatus(Status.going_up);
		e2.setCurrentLevel(50);

		e3.setStatus(Status.going_down);
		e3.setCurrentLevel(90);

		e4.setStatus(Status.going_up);
		e4.setCurrentLevel(20);

		e5.setStatus(Status.idle);
		e5.setCurrentLevel(1);

		e6.setStatus(Status.idle);
		e6.setCurrentLevel(100);

		CallRequest cr = new CallRequest(Direction.up, 21);

		System.out.println(e1.getPriority(cr));
		System.out.println(e2.getPriority(cr));
		System.out.println(e3.getPriority(cr));
		System.out.println(e4.getPriority(cr));
		System.out.println(e5.getPriority(cr));
		System.out.println(e6.getPriority(cr));

		assertEquals(e1.getPriority(cr), e4.getPriority(cr));

		assertTrue(e1.getPriority(cr) > e3.getPriority(cr));


		assertTrue(e3.getPriority(cr) > e2.getPriority(cr));
	}
}
