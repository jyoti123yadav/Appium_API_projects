import java.util.TreeMap;

public class Navigablemap {

	public static void main(String[] args) {
		
		TreeMap<String,String> x=new TreeMap<String,String>();
		x.put("c","can");
		x.put("d","dan");
		x.put("e","ean");
		x.put("f","fan");
		x.put("g","gan");
		
		System.out.println(x);
		
		System.out.println(x.firstKey());
		System.out.println(x.lastKey());
		System.out.println(x.pollFirstEntry());
		System.out.println(x.pollLastEntry());
		
		
	}
	
	
	
	
}
