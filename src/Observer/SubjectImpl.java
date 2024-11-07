package Observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject{

    List<Observer> observers=new ArrayList<Observer>();

    @Override
    public void subscribe(Observer ob) {
     this.observers.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
       this.observers.remove(ob);
    }

    @Override
    public void notifyObserverForChanges(String title) {
    for(Observer ob: this.observers){
        ob.update(title);
    }
    }
}
