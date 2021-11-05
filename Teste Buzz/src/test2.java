
public class test2 {

	public static void main(String[] args) {
		int minhaArray[] = { 1, 3, 7, 9, 4, 6, 4, 5, 5, 4, 6, 5, 4, 543, 2153, 4 };
		int sum = 0;
		
		for(int x : minhaArray) {
			sum += x;
		
			
			System.out.println(sum);
		}
			
		System.out.printf("valor total: "+ sum);
	}
}