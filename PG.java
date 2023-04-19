package ucsal;

public class PG {

	public static void main(String[] args) {
		final int RZ = 3;
		for (int ti = 2, ct = 0; ct < 200;) {
			System.out.println(ti + " ");
			ti *= RZ;	
			ct = ti;
		}

	}

}
