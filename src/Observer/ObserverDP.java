/*Allows an object (the subject) to notify other objects (observers) of changes in its state.
This is useful for implementing event-handling systems.
One to many relation*/
package Observer;

public class ObserverDP {
    public static void main(String[] args) {

         SubjectImpl sb=new SubjectImpl();

         ObserverImpl o1=new ObserverImpl("Archana");
         ObserverImpl o2=new ObserverImpl("Aman");

         sb.subscribe(o1);
         sb.subscribe(o2);

         sb.notifyObserverForChanges("Java Programming");
         sb.notifyObserverForChanges("Design pattern");
    }
}
