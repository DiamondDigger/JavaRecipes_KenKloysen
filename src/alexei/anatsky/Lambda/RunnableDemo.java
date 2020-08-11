package alexei.anatsky.Lambda;

public class RunnableDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() { // unnamed nested class
            @Override
            public void run() {
                System.out.println("Inside Runnable in nested unnamed class");
            }
        }).start();

        new Thread(() -> System.out.println("Inside Thread constructor via lambda"))
                .start();

        Runnable r = () -> System.out.println("Expression executing method run");
        new Thread(r).start();
    }
}
