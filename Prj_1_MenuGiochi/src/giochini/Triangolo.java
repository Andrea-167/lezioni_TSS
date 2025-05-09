package giochini;

public class Triangolo {

	public static void disegnaTriangolo() {
		int numRighe = 5;
		
		for(int i = 0; i < numRighe; i++) {
			for(int j = i; j < numRighe - 1; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < 2 * i + 1; k++) {
				if( k == 0 || k == 2 * i || i == numRighe - 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		disegnaTriangolo();
	}
}
