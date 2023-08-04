
public class halfpyramid {
	static void halfpyramid(int rows,int cols) {
	int n=rows;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		System.out.println();
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    halfpyramid(4,4);
	}

}
