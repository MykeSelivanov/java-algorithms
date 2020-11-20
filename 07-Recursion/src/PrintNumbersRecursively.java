public class PrintNumbersRecursively {

    public static void main(String[] args) {

        printFromNTo0(5);
        System.out.println();
        printFromNto100(90);

    }

    public static void printFromNto100(int n) {
        if (n > 100) {
            System.out.print("Reached 100");
            return;
        }
        System.out.print(n + " ");
        printFromNto100(++n);
    }

    public static void printFromNTo0(int n) {
        if (n < 0) {
            System.out.print("Reached 0");
            return;
        }
        System.out.print(n + " ");
        printFromNTo0(--n);
    }

}
