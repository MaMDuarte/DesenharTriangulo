package traingulo;

public class main {

	public static void main(String[] args) {
		int linhas = 5, n = 0;

        for(int i = 1; i <= linhas; ++i, n = 0) {
            for(int espaco = 1; espaco <= linhas - i; ++espaco) {
                System.out.print("  ");
            }

            while(n != 2 * i - 1) {
                System.out.print("* ");
                ++n;
            }

            System.out.println();
        }

	}

}
