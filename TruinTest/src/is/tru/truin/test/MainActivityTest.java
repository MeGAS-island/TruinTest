package is.tru.truin.test;

import com.robotium.solo.Solo;
import is.tru.truin.MainActivity;
import android.test.ActivityInstrumentationTestCase2;



public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{


	private Solo solo;

	public MainActivityTest() {
		super(MainActivity.class);

	}
	

	@Override
	public void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}

	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}

	public void testUmTruinogLifid() throws Exception {
		solo.clickOnMenuItem("Um trúin og Lífið");
		solo.assertCurrentActivity("Expected About activity", "About"); 
		solo.goBack(); 
		solo.takeScreenshot();
		boolean AboutOpened = solo.waitForActivity("About");
		assertTrue("Um truin og Lifid opnad: ", AboutOpened); 

	}
	
	public void testBaenirFragment() throws Exception {
		
		boolean BaenirFound = solo.waitForFragmentByTag("BaenirFragment");
		assertTrue("Baenir fragment: ", BaenirFound); 
	}
	
	public void testAlmanakFragment() throws Exception {
		
		boolean AlmanakFound = solo.waitForFragmentByTag("AlmanakFragment");
		assertTrue("Almanak fragment: ", AlmanakFound); 

	}
	public void testMyndirFragment() throws Exception {
		
		boolean MyndirFound = solo.waitForFragmentByTag("MyndirFragment");
		assertTrue("Myndir fragment: ", MyndirFound); 

	}
	public void testPostillurFragment() throws Exception {
		
		boolean PostillurFound = solo.waitForFragmentByTag("PostillurFragment");
		assertTrue("Postillur fragment: ", PostillurFound); 

	}
	public void testBaenastundFragment() throws Exception {
		
		boolean BaenastundFound = solo.waitForFragmentByTag("BaenastundFragment");
		assertTrue("Baenastund fragment: ", BaenastundFound); 

	}
	
}
