
public class SolutionHammingDistance {

	public int hammingDistance(int x, int y){
//		One line solution found in LeetCode forum
//		Not as efficient as my solution below (at least in JAVA)
//		return Integer.bitCount(x^y);
		
		int counter = 0;
        while (x != 0 || y != 0) {
			if (x%2 != y%2) counter++;
			x /= 2; y /= 2;
		}
        
        return counter;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionHammingDistance HD = new SolutionHammingDistance();
		System.out.println(HD.hammingDistance(24531, 23544));
	}
}
