package C4;

/**
 * Created by Hernan Y.Ke on 2016/4/5.
 */
public class Singleton {
     static Object key = new Object();
    private static volatile Singleton instance;
    private  Singleton(){};
    public  static Singleton  getInstance(){
        if (instance != null) {
            return instance;
        }
        synchronized (key) {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

}
