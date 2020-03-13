public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");


        while(true){
            try {
                Thread.sleep(1000);
                System.out.println("Main is running...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
