import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {

    // 继承 Thread 类并重写 run 方法
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("I am a child thread");
        }
    }

    public static class RunnableTask implements Runnable {

        @Override
        public void run() {
            System.out.println("I am a child thread");
        }
    }

    // 创建任务类，类似 Runnable
    public static class CallerTask implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "Hello";
        }
    }

    public static void main(String[] args) throws InterruptedException {

        // 创建线程
        MyThread thread = new MyThread();
        // 启动线程
        thread.start();

        Runnable task = new RunnableTask();
        new Thread(task).start();
        new Thread(task).start();

        // 创建异步任务
//        FutureTask<String> futureTask = new FutureTask<>(new CallerTask());
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            return "Hello";
        });
        // 启动线程
        new Thread(futureTask).start();
        try {
            // 等待任务执行完毕，并返回结果
            String result = futureTask.get();
            System.out.println(result);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
