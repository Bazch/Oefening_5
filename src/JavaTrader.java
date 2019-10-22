public class JavaTrader {

    public static void main(String[] args) {
        Aandelen amazon = new Aandelen();
        Aandelen oracle = new Aandelen();
        amazon.koop(100);
        oracle.koop(200);
        oracle.koop(200);

        System.out.println(amazon.toString());
        System.out.println(oracle.toString());

    }
}
