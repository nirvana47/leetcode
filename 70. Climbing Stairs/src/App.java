public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int fibo1 = 0, fibo2 = 1;
        int fibonacci = 0;
        for (int i = 0; i < 45; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.print(fibonacci + " ");
        }

        // System.out.println(fibonacci);
    }
}
