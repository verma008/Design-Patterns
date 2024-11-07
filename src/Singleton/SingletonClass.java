/*Design pattern help us to write cleaner, more efficient code while making applications more scalable and maintainable.
Singleton: Ensures only one instance of a class exists across the entire application.
Steps: 1. private constructor
       2. create object with the help of method
       3. create private field to store object
*/

package Singleton;
class SingletonClass {

    //Eager way of creating Singleton object
    private static SingletonClass iagerInstance=new SingletonClass();

    public static SingletonClass getIagerInstance(){
        return iagerInstance;
    }

    //Lazy way of creating singleton object
    private static SingletonClass singleInstance; //to store single object
    private SingletonClass(){}

    public static SingletonClass  getSingleInstance(){
       if(singleInstance==null){
           singleInstance=new SingletonClass();
       }
       return singleInstance;
    }


    //for multithreaded environment,use syncronized block for creating singleton object bcoz working with lazy in multithreading environment will fail..
    // But here it will not work.
    private static SingletonClass instance;

    private static SingletonClass getInstance(){
        if(instance==null){
            synchronized (SingletonClass.class)
            {
                instance=new SingletonClass();
            }
        }
        return instance;
    }


    //final way of resolving issue in multithreaded environment Double checking / Double locking
    private static SingletonClass instance1;

    static SingletonClass getInstance1() {
        if (instance1 == null) {  //first check without locking
            synchronized (SingletonClass.class) {
                if (instance1 == null) { //check within lock
                    instance1 = new SingletonClass();
                }
            }
        }
        return instance1;
    }
}