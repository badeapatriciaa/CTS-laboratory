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
import ro.ase.csie.cts.g1092.testing.exceptions.WrongGradesException;
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
	@Test
	public void testSetnameErrorCondition() {
		String newName="Io";
		try {
			stud.setName(newName);
			//if we dont exec -> line doesnt throw exc ->next line will be exec
			fail("We didnt get the expected exception");
		} catch (WrongNameException e) {
			//if we get exception ->unit test passed ->
			assertTrue(true);
		}
	}
	@Test(expected=WrongAgeException.class)
	public void testSetAgeErrorCondition() throws WrongAgeException
	{
		int newAge=-4;
		stud.setAge(newAge);
	}
	
	@Test
	public void testGetMinGradeOrderingAsc() throws WrongGradesException
	{
		ArrayList<Integer> orderedGrades=new ArrayList<>();
		orderedGrades.add(7);
		orderedGrades.add(8);
		orderedGrades.add(9);
		stud.setGrades(orderedGrades);
		
		int expectedGrade=7;//min grade
		int minGrade=stud.getMinGrade();
		assertEquals("Testing with an oredred array of grades",expectedGrade,minGrade);
		}
	
	@Test
	public void testGetMinGradeCardinalityZero() throws WrongGradesException
	{
		ArrayList<Integer> emptyGrades=new ArrayList<>();
	
		stud.setGrades(emptyGrades);
		int expectedGrade=0;
		int minGrade=stud.getMinGrade();
		assertEquals("Testing with 0 grades", expectedGrade, minGrade);
	}
	
	
	@Test
	public void testGetMinGradeCardinalityOne() throws WrongGradesException
	{
		int singleGrade=9;
		ArrayList<Integer> oneGrade=new ArrayList<>();
		oneGrade.add(singleGrade);
		stud.setGrades(oneGrade);
		
		int expectedGrade=singleGrade;
		int minGrade=stud.getMinGrade();
		
		assertEquals("Testing with 1 grade", expectedGrade, minGrade);
	}
	
	//Inverse relationship I
	//trsting something by evryfing the opposite
	@Test
	public void testSetNameInverseRelation() throws WrongNameException
	{
		String newName="Alice";
		stud.setName(newName);
		assertNotEquals(initialName, stud.getName());
		
	}
}
