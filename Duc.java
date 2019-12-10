public class Duc extends RacingBike {
    public static void main(String[] args) {
        Duc duc = new Duc();
        duc.setManufacturer("Ducati");
        duc.setModel("Desmosedici");

        System.out.println("**** " + duc.getManufacturer() + " " + duc.getModel() + " ****");
        duc.engine_size(1000);
        duc.dry_weight((int) 346.12);
        duc.speed(225);
        duc.price((int) 2000000);
    }
}
