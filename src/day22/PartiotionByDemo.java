package day22;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartiotionByDemo {

	public static void main(String[] args) {
		String sentance="one two three four five six seven eight nine ten";
		String words[]=sentance.split(" "); //["one", "two", three, four, five, six, seven, eight, nine, ten]
		
		Map<Boolean,List<String>> hashmap=new HashMap();
		
		hashmap=Arrays.stream(words)
		.collect(Collectors.partitioningBy(str->str.length()>=5));
		
		System.out.println(hashmap);
		

	}

}
//length>=5 
//{
//true =  [three,seven,eight]
//false = [one,two,four,five,six,nine,ten]
//}

//key boolean
//value list<type of stream>
