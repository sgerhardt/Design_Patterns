package Singleton_Pattern;

/**
 * Created by Sean on 3/6/2015.
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton(){
        System.out.println("Hello World!");
    }

public static Singleton getInstance(){
    if(instance == null){
        instance = new Singleton();
    }
    return instance;
}

}
