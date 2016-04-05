package C1;
import C1.L3_deadlock;

/**
 * Created by Hernan Y.Ke on 2016/4/5.
 */
public class L3_deadlockmain {
    public static void main(String[] args) throws InterruptedException {
        L3_deadlock l3 = new L3_deadlock();
        Runnable r1 = ()->l3.a();
        Runnable r2 = ()->l3.b();


        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r2);
        t2.start();
        t1.join();
        t2.join();
    }
}
