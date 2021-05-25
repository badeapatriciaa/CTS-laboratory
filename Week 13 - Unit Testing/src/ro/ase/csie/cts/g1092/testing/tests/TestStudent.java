package ro.ase.csie.cts.g1092.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1092.testing.exceptions.WrongAgeException;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongNameException;
import ro.ase.csie.cts.g1092.testing.models.Student;

public class TestStudent {

	//test fixture
	//collection of values we will reuse for unit tests
	public static Student stud;
	static ArrayList<Integer> grades;
	static String initialName;
	static int initialAge;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//to init array only once
		grades=new ArrayList<>();
		grades.add(9);
		grades.add(10);
		initialName="John";
		initialAge=21;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		grades.clear();
		grades=null;
	}

	@Before
	public void setUp() throws Exception {
		//object is recreated multiple times
		  stud=new Student(initialName,initialAge, grades);
	}

	@After
	public void tearDown() throws Exception {
		stud=null;
	}
	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetNameRightValue() throws WrongNameException
	{
	
	String newName="Alice";
	stud.setName(newName);
	assertEquals("Testing with proper name",newName,stud.getName());
	
	}
	
	@Test
	public void testSetAgeRightValues()
	{
		int newAge=initialAge+1;
		try {
			stud.setAge(newAge);
			assertEquals("testing for proper age value", newAge,stud.getAge());
			} catch (WrongAgeException e) {
			fail("We got anexception when that was not expected");
		}
	}
}
