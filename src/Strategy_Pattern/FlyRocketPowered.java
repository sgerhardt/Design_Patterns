package Strategy_Pattern;

/**
 * Created by Sean on 3/7/2015.
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
