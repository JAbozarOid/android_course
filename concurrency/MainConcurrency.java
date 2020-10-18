// concurency means doing things Simultaneously and at the same time
// for example when i am working with my phone, im reading pdf book and listen to music and also i'm downloading from internet
// every java application start with thread which called main thread -> in android system it called ui thread or user interface thread
// in ui thread you can create other thread
// thread basically is the unit of execution in your device processor
public class MainConcurrency {
    public static void main(String[] args) {
        // create a thread
        // *** this run as a main thread
        Thread thread = new Thread(new Runnable() {

            // this run method that will be executed inside another thread
            // *** this run as a second thread
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Printing: " + i + "from another thread");
                    try {
                        // 1000 mili second means 1 second
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

        });
        thread.start();

        // if we want to see how two above thread work simultaneously write another for loop
        // in console we can see two for loop print numbers simultaneously
        for (int i = 0; i < 10; i++) {
            System.out.println("Printing: " + i + "from main thread");
            try {
                // 1000 mili second means 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } 
    }
}
