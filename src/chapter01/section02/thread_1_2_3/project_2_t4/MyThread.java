package chapter01.section02.thread_1_2_3.project_2_t4;

public class MyThread extends Thread {

	private int count=5;

	/**
	 * 当一个线程在调用rnu前，先判断run方法有没有被锁上，如果上锁，必须等待其他线程对run方法调用结束后
	 * 才可以执行run方法
	 * 加锁的这段代码叫”互斥锁“或”临界区“
	 */

	@Override
	public void run() {
	//synchronized public void run() {
		super.run();
			count--;
			System.out.println("由 "+this.currentThread().getName()+" 计算，count="+count);
	}
}
