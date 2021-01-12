
public class Piramide {

	public static void main(String[] args) {
		int h,i,na,ne;
		h=9;
		for(i=1;i<=h+1;i++) {
			for(ne=0;ne<=h-i;ne++) {
				System.out.print(" ");
			}
			for(na=1;na<=2*i-1;na++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
