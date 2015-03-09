package Observer_Pattern;

/**
 * Created by Sean on 3/8/2015.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    //This method is called to notify all observers when the subject's state has changed
    public void notifyObservers();
}
