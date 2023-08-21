import java.lang.String;

public class ThreadSleepEg extends Thread{
    public  void run(){
        String arr[] = {"Mumbai" , "Pune" , "Delhi", "Goa","Haidrabad" , "Nashik"};
        for (int i = 0; i < arr.length; i++) {
            try{
                Thread.sleep(800);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(arr[i]);
        }
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadSleepEg th = new ThreadSleepEg();
        th.start();
        System.out.println(th.getPriority());


        try{
            th.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        
        
        ThreadSleepEg th1 = new ThreadSleepEg();
        th1.start();
        System.out.println(th1.getPriority());
        
    }
}
