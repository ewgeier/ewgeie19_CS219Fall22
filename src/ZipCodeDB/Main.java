package ZipCodeDB;

public class Main {
    public static void main(String[] args) {
        Zipcode z1 = new Zipcode("13617", "NY", "Canton", 75.16, 44.59, 11781);

        System.out.println(z1);

        Zipcode z2 = new Zipcode("13346", "NY", "Hamilton", 75.54, 42.82, 5821);
        System.out.println(z2);

        Database db = new Database();

    }
}
