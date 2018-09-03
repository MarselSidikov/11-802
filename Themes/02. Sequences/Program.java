import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int sum = 0;
		while (number != -1) {
			sum = sum + number;
			number = scanner.nextInt();
		}
		System.out.println(sum);
	}
}