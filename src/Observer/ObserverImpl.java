package Observer;

public class ObserverImpl implements Observer{

    private String name;
    public ObserverImpl(String name){
        this.name=name;
    }

    @Override
    public void update(String title) {
        System.out.println("Hey "+this.name+" new video uploaded :"+title);

    }
}
