package C4;

/**
 * Created by Hernan Y.Ke on 2016/4/5.
 */
public class Singleton {
    private static Singleton instance;
    private  Singleton(){};
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

}
