package C1;
import C1.L2_racecondition;

/**
 * Created by Hernan Y.Ke on 2016/4/5.
 */
public class L2_raceconditionmain {
    public static void main(String[] args) throws InterruptedException {
        L2_racecondition l2 = new L2_racecondition(0L);
        Runnable r = ()->{
            for(int i=0;i<1000;i++){
                l2.increValue();
            }
        };
        Thread t = new Thread(r);
        t.start();
        t.join();
        System.out.println(l2.getValue());
    }
}
