package Season1;

public class Ex13별찍기4 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
