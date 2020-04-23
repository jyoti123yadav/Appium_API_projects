import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		
		char c=getffirstnonRepeated("abbbbcccc");
		System.out.println(c);	
	}

	private static char getffirstnonRepeated(String string) 
	{
		// TODO Auto-generated method stub
		Map<Character,Integer> countmap=new LinkedHashMap<Character,Integer>(string.length());
		for(char ch:string.toCharArray())
		{
			countmap.put(ch,countmap.containsKey(ch)? countmap.get(ch)+1:1 );	
		}
		
		
		for (Entry<Character, Integer> entry: countmap.entrySet())
		{
			if(entry.getValue()==1)
			{
				return entry.getKey();
			}
		}
		
		throw new RuntimeException("didn't find any character");
	}
	
	
}
