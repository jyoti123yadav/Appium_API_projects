package Practise_Programs;

public class tostrinngmethodd {

	String name;
	int rollno;
	
	tostrinngmethodd(String name1,int rollno1)
	{
		this.name=name1;
		this.rollno=rollno1;
		
	}
	
	
	public String tosstring()
	{
		return name;
		
	}
	public static void main(String[] args) {
		
		
		tostrinngmethodd x=new tostrinngmethodd("durga",101);
		
		tostrinngmethodd y=new tostrinngmethodd("",103);
		
//		System.out.println(x.name.toString());
		System.out.println(x.equals(y));
	}
	
	
	
	
}
