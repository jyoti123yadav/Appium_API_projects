
public class sleep1 extends Thread{

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		class exce
		{
			public void main(String[] args) {
				
				
				sleep1 x=new sleep1();
				x.start();
				x.interrupt();
				System.out.println("endd of sleeps");
				
				
			}
		}
	}
	
	
	
	
}
