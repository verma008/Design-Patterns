package Builder;

public class Shop{
    public static void main(String[] args) {

//        Phone p=new Phone("Android",4,3200);
//        System.out.println(p);

        Phone p=new PhoneBuilder().setOs("Android").getPhone();
        System.out.println(p);
    }
}
