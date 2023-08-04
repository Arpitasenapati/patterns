
public class invertedhalfpyra {
	static void halfpyramid(int rows,int cols) {
		int n=rows;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      halfpyramid(5,5);
	}

}
