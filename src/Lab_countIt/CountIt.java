package Lab_countIt;

public class CountIt {
	public int linearLoop(int N) {

		int x = 0;

		int count = 0;
		x++;
		while (count < N) {
			x++;
			System.out.println(".");
			x++;
			count++;

		}

		return x;
	}

	public static void main(String[] args) {
		CountIt ex = new CountIt();
		int N = 400000;
		long start = System.currentTimeMillis();
		ex.linearLoop(N);
		Long endTime = System.currentTimeMillis();
		System.out.println(
				"\nN = " + N + ". Loops ran in: " + (endTime - start));

	}




	public long SnippetNestedLoop(long n) {
		long i, j, x = 0;
		i = 0;  x++;
		while (i < n) {  x++;    			// i < n
		x++;    				// SomeStatement
		j = 0; 	x++;      			// j = 0;
		while (j < n) { x++;   		// j < n
		x++;   			// SomeStatement
		j++; x++;   		// j++;
		}
		x++; 				// Can you explain why is this here?
		i++;  x++;  			// i++;
		}
		x++; 					// Can you explain why is this here? Ans: i < n
		return x;
	}
	//	public static void main(String[] args) {
	//		CountIt r = new CountIt();
	//		Long t = System.currentTimeMillis();
	//		System.out.println("TU = " + r.SnippetNestedLoop(160000));
	//		System.out.println ("Time:" + (System.currentTimeMillis() - t));
	//	}
}











