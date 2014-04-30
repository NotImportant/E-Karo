package models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;

import org.junit.Before;
import org.junit.Test;

import play.test.WithApplication;

public class PermissionTest extends WithApplication {

	@Before
	public void setUp() {
		start(fakeApplication(inMemoryDatabase()));
	}

	@Test
	public void testPermissions() {
		Person admin = new Admin();
		Person student = new Student();
		Person treasurer = new Treasurer();
		Person interestedParty = new InterestedParty();
		Person guardian = new Guardian();
		assertTrue(Permission.hasPermission(255, admin.getPermission()));
		assertFalse(Permission.hasPermission(128, admin.getPermission()));
		assertTrue(Permission.hasPermission(128, treasurer.getPermission()));
		assertFalse(Permission.hasPermission(64, treasurer.getPermission()));
		assertTrue(Permission.hasPermission(64, guardian.getPermission()));
		assertFalse(Permission.hasPermission(32, guardian.getPermission()));
		assertTrue(Permission.hasPermission(32, student.getPermission()));
		assertFalse(Permission.hasPermission(16, student.getPermission()));
		assertTrue(Permission.hasPermission(16, interestedParty.getPermission()));
		assertFalse(Permission.hasPermission(8, interestedParty.getPermission()));
		assertTrue(Permission.hasPermission(0, Permission.NONE));
		assertFalse(Permission.hasPermission(8, Permission.NONE));

		assertEquals("Interested Party", interestedParty.getPermission()
				.getRole());

	}
}
