package C2;

/**
 * Created by Hernan Y.Ke on 2016/4/5.
 */
public class L1_producerconsumer {
    private static int[] buffer;
    private static int count;
    private static Object lock = new Object();
    static class Producer{
        void produce(){
            synchronized (lock) {
                while (isFull(buffer)) {
                }
                buffer[count++] = 1;
            }
        }
    }
    static class Consumer{
        void consume(){
            synchronized (lock) {
                while (isEmpty(buffer)) {
                }
                buffer[--count] = 0;
            }
        }
    }

    static boolean isEmpty(int[] buf){
        return count==0;
    }

    static boolean isFull(int[] buf){
        return count==buf.length;
    }

    public static void main(String[] args) throws InterruptedException {
        buffer = new int[4];
        count =0 ;
        Producer p = new Producer();
        Consumer c = new Consumer();
        Runnable ptask = ()->{
            for(int i=0;i<3;i++){
                p.produce();
            }
            System.out.println("done producing");
        };
        Runnable ctask = ()->{
            for(int i=0;i<3;i++){
                c.consume();
            }
            System.out.println("done consuming");
        };
        Thread pthread = new Thread(ptask);

        Thread cthread = new Thread(ctask);
        cthread.start();
        pthread.start();

        cthread.join();
        pthread.join();
        System.out.println(count);

    }
}
