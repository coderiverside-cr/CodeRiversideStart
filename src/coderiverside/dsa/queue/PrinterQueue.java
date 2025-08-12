package coderiverside.dsa.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueue {
    private final Queue<String> printQueue = new ArrayDeque<>();

    public void addJob(String job){
        printQueue.offer(job);
        System.out.println("Added job to queue Job = " + job);
    }

    public void processJobs(){
        while(!printQueue.isEmpty()){
            String job = printQueue.poll();
            System.out.println("Processing job = " + job);
        }
    }

    public static void main(String[] args) {
        PrinterQueue printerQueue = new PrinterQueue();
        printerQueue.addJob("Job 1");
        printerQueue.addJob("Job 2");
        printerQueue.addJob("Job 3");

        printerQueue.processJobs();

    }
}
