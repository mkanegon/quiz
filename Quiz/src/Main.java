import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n;

		System.out.print("問題文\n選択肢1\n選択肢2\n選択肢3\n選択肢4\n解答:");
        do {
		    n = scanner.nextInt();
        }while(n < 1 || 4 < n);

        scanner.close();
	}

}
