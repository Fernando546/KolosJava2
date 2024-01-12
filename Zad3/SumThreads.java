public class SumThreads implements Runnable {
    private int start;
    private int end;
    private int result;

    public SumThreads(int start, int end) {
        this.start = start;
        this.end = end;
        this.result = 0;
    }

    public int getResult() {
        return result;
    }

    @Override
    public void run() {
        if (start <= end) {
            for (int i = start; i <= end; i++) {
                result += i;
            }
        } else {
            for (int i = start; i >= end; i--) {
                result += i;
            }
        }
    }

    public static void main(String[] args) {
        SumThreads sumThread1 = new SumThreads(1, 1000);
        SumThreads sumThread2 = new SumThreads(1000, 1);

        Thread thread1 = new Thread(sumThread1);
        Thread thread2 = new Thread(sumThread2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int finalResult = sumThread1.getResult() + ( - sumThread2.getResult());
        System.out.println("Wynik działania programu: " + finalResult);
    }
}
