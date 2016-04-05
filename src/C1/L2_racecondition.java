package C1;

/**
 * Created by Hernan Y.Ke on 2016/4/5.
 */
public class L2_racecondition {
    private long a;
    private Object key = new Object();
    public L2_racecondition(long a){
        this.a = a;
    }

    public long getValue(){
        return a;
    }

    public void increValue(){
        synchronized (key) {
            a += 1;
        }
    }
}
