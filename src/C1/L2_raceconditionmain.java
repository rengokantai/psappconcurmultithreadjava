package C1;
import C1.L2_racecondition;

/**
 * Created by Hernan Y.Ke on 2016/4/5.
 */
public class L2_raceconditionmain {
    public static void main(String[] args) throws InterruptedException {
        L2_racecondition l2 = new L2_racecondition(0L);
        Runnable r = ()->{
            for(int i=0;i<100;i++){
                l2.increValue();
            }
        };
        Thread[] threads = new Thread[100];
        for (int i =0;i<threads.length;i++) {
            threads[i] = new Thread(r);
            threads[i].start();
        }
        for (int i =0;i<threads.length;i++) {
            threads[i].join();
        }
        System.out.println(l2.getValue());
    }
}
