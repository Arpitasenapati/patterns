

public class hollowrhombus {
	static void hollowrhombus(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-(i-1);j++) {
				System.out.print(" ");
			}
			//hollow rectangle:
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     hollowrhombus(5);
	}

}
