import java.util.Stack;

public class Vector {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push("A");
		s.push("b");
		s.push("s");
		s.push("e");
		s.push("y");
		
		System.out.println(s);
		
		System.out.println(s.search("A"));
		System.out.println(s.search("y"));
	}
	
	
}
