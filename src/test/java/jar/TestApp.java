package jar;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestApp {
    static App app ;
    static String s = "5+8-7";
    static int a;

    @BeforeClass
    public static  void getAppResult(){
        app =  new App();
        a = app.resultt(s);
    }
    @Test
    public void testAppSum()
     {
         assertTrue( app.resultt(s)==6 );
     }
     @Test
     public void testAppSIsEmpty(){
         assertFalse(s.equals(""));
     }
     @Test
    public void testAppContainsIllegalSymbols(){
         assertFalse(s.contains("[A-Za-z]"));
     }

    @AfterClass
    public static void deleteApp(){
        app=null;
    }

}


