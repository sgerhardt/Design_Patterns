package Strategy_Pattern;

/**
 * Created by Sean on 3/7/2015.
 */
public class MiniDuckSimulator {
    /*
    * This simulator and the associated classes demonstrates the Strategy pattern.
    * The strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
    * Strategy lets the algorithm vary independently from the client that uses it. For example, the duck is a client,
    * and the behaviors are the families of algorithms in this scenario.
    * */
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performQuack();
        model.performFly();
    }
}
