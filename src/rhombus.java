

public class rhombus {
	static void rhombus(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-(i-1);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      rhombus(5);
	}

}
