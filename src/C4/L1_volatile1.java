package C4;

/**
 * Created by Hernan Y.Ke on 2016/4/5.
 */
public class L1_volatile1 {
    private volatile long a;
    //private Object key = new Object();
    public L1_volatile1(long a){
        this.a = a;
    }

    public long getValue(){
        return a;
    }

    public void increValue(){
        //synchronized (key) {
            a += 1;
        //}
    }
}
