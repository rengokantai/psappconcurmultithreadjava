package C1;

/**
 * Created by Hernan Y.Ke on 2016/4/5.
 */
public class L3_deadlock {
    private Object key1 = new Object();
    private Object key2 = new Object();

    public void a(){
        synchronized (key1){
            System.out.println(Thread.currentThread().getName()+" in a");
            b();
        }
    }

    public void b(){
        synchronized (key2){
            System.out.println(Thread.currentThread().getName()+" in b");
            c();
        }
    }

    public void c(){
        synchronized (key1){
            System.out.println(Thread.currentThread().getName()+" in c");
        }
    }
}
