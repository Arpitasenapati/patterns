
public class pyramid {
	static void pyramid(int rows,int cols) {
		int n=rows;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pyramid(4,4);      
	}

}
