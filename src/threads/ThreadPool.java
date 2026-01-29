package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable {

    private final int taskId;
    ThreadPool(int taskId){
        this.taskId=taskId;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is processing task : "+taskId);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("task interrupted "+e.getMessage());
        }
        System.out.println(Thread.currentThread().getName()+" finished task: "+taskId);
    }
    public static void main(String[] args) {

        //create a fixed thread pool with 3 threads
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        //submit 5 task to the thread pool
        for(int i=1;i<=5;i++){
            executorService.submit(new ThreadPool(i));
        }

    }

}
