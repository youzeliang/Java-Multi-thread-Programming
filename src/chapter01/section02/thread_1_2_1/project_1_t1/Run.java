package chapter01.section02.thread_1_2_1.project_1_t1;

/**
 * 代码的运行结果和代码的执行顺序或调用顺序是无关的
 */
public class Run {
	
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println("运行结束");
	}

}
