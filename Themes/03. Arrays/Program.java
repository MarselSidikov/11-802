class Program {
	public static void main(String[] args) {
		int a[];
		a = new int[5];

		int b[] = new int[5];

		int c[] = {4, 5, 2, 4, 0};

		int z[] = c;

		z[2] = 777;

		System.out.println(c[2]);

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}