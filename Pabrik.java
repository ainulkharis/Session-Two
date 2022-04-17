import Model.TShirt;

public class Pabrik {
    public static void main(String[] args) {

        TShirt A = new TShirt("A", "Hodie", "Katun", "hitam", false,
                false, 4, 50000, 3000);

        A.Pabrik();

        TShirt B = new TShirt("B", "Polo", "Polyester", "putih", true,
                true, 2, 30000, 2000);

        System.out.println("\n");

        B.Pabrik();




    }
}
