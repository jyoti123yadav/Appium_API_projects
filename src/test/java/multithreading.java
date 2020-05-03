
public class multithreading extends  Thread{

	
	public void run()
	{
		System.out.println("CHild thread");
		Thread.yield();
	}
	
	static class ThreadDemo
	{
	public static void main(String[] args) {
		
		multithreading x=new multithreading();
//		x.run();
//		x.setPriority(2);
		x.start();
		
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("main thread");
		}
		
		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().setName("main1");
	}
	
	}
	
}
