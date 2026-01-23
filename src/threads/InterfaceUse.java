package threads;

public class InterfaceUse {

    public static void main(String[] args) {
        Thread thread=new Thread(new ThreadInterface());
        thread.start();

        for (int i=0;i<100;i++){
            System.out.println("thread 1");
        }
    }
}

class ThreadInterface implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("thread 2");
        }
    }
}





