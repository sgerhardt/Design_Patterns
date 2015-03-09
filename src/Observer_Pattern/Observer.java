package Observer_Pattern;

/**
 * Created by Sean on 3/8/2015.
 */
public interface Observer {
    //The parameters here represent the state value the Observers get from the subject when a weather measurement changes.
    public void update(float temp, float humidity, float pressure);
}
