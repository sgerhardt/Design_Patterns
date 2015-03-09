import Singleton_Pattern.Singleton;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * Created by Sean on 3/6/2015.
 */
public class DesignTester {
    public static void main(String[] args) {
        DesignTester test_object = new DesignTester();
        test_object.testSingleton();
    }

    private void testSingleton(){
        /*Try creating multiple objects, but note that only
        one will be created. This is helpful when you know you only need ONE object of a certain class.
        For instance, you probably only need one instance of a settings object, or one instance of a driver.
        */
        Singleton.getInstance();
        Singleton.getInstance();
    }

}
