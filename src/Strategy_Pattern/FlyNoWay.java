package Strategy_Pattern;

/**
 * Created by Sean on 3/7/2015.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("I can't fly");
    }
}
