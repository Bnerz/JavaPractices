import java.util.ArrayList;
import java.util.List;



public class Test {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Ana");
		list.add("Paulo");
		list.add("Marco");
		list.add("Alex");
		
		list.removeIf(x -> x.charAt(0) == 'A');
		System.out.println(list.indexOf("Paulo"));
		System.out.println(list.size());
		for (String x : list) {
				System.out.println(x);
			
		}
		
		
		
	}

}
