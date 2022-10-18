Junit 5 Notes

Benefits of unit testing
Provide quick feedback that the code works as expected 

Executes target code also referred to system under test 

Test code obtains the test of the target code to confirms that the results  are correct  
This proves that what the code was expected to do is what it actually did.

Expected  
  Act as a design aid (code that is hard to test could be an early indicator of a design problem that needs to be addressed.)
Unit test act as a form of documentation  

Container
a node in the test tree that contains other containers or tests as its children (e.g. a test class).


@Test 

a node in the test tree that verifies expected behavior when executed (e.g. a @Test method).

Can be used for a patient intake system  for outpatient  clinic
Checking for conditions in the calendar 
•	Schedule appointments 
•	Collect patient information
•	Send appointment notifications
Holds a java array list of patient appointments  
Can add new patient information 
All can be tested to insure it aligns with the calendar

Annotations in java provide metadata about code but are not executable code 
Metadata - data that provides information about other data
Assert








 Annotations

@ test
	@Test annotation, this annotation does not declare any attributes, 
@ParameterizedTest	Denotes that a method is a parameterized test. Such methods are inherited unless they are overridden.
@RepeatedTest	Denotes that a method is a test template for a repeated test. Such methods are inherited unless they are overridden.
@DisplayNameGeneration	Declares a custom display name generator for the test class. Such annotations are inherited 
@BeforeEach	Denotes that the annotated method should be executed before each @Test, @RepeatedTest, @ParameterizedTest, or @TestFactory method in the current class; analogous to JUnit 4’s @Before. Such methods are inherited – unless they are overridden or superseded (i.e., replaced based on signature only, irrespective of Java’s visibility rules).
@AfterEach	Denotes that the annotated method should be executed after each @Test, @RepeatedTest, @ParameterizedTest, or @TestFactory method in the current class; analogous to JUnit 4’s @After. Such methods are inherited – unless they are overridden or superseded (i.e., replaced based on signature only, irrespective of Java’s visibility rules).
@BeforeAll	Denotes that the annotated method should be executed before all @Test, @RepeatedTest, @ParameterizedTest, and @TestFactory methods in the current class; analogous to JUnit 4’s @BeforeClass. Such methods are inherited 
@AfterAll	Denotes that the annotated method should be executed after all @Test, @RepeatedTest, @ParameterizedTest, and @TestFactory methods in the current class; analogous to JUnit 4’s @AfterClass. Such methods are inherited



