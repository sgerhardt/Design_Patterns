package Strategy_Pattern;

/**
 * Created by Sean on 3/7/2015.
 */
public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<< Silence >>");
    }
}
