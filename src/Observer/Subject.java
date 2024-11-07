package Observer;

interface Subject {

    //register an observer to a subject
    void subscribe(Observer ob);

    //unregister an observer from the subject
    void unsubscribe(Observer ob);

    //notify all observers for the change in subject's state
    void notifyObserverForChanges(String title);
}
