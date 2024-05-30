public class Main {
    public static void main(String[] args) {
        Helper h = new Helper();
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(5000);
                h.DontThrowException();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });
        Thread thread2 = new Thread(h::ThrowException);

        thread1.start();
        thread2.start();

        System.out.println("Main Method Execution completed");
    }


};

