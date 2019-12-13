public class RacingBike {

    //Information

    // noting that both manufacturer & model are strings
    String manufacturer;
    String model;

    // Adding methods to cover the specifications of each motorcycle
    // manufacturer, model, engine size, dry weight, and speed

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void engine_size(int cc) {
        System.out.println("The engine size is " + cc + "cc.");

    }

    public void dry_weight(int lbs) {
        System.out.println("With a dry weight of " + lbs + " pounds.");
    }

    public void speed(int mph) {
        if (mph > 200)
            System.out.println("The " + model + " is a Motogp bike with a top speed of " + mph + " mph." +
                    "\nIt is Not street legal.");
            else
        System.out.println("The " + model + " is street legal with a top speed of " + mph + "mph.");
    }

    public void price(int dollars) {
        if (dollars < 2000000)
        System.out.println("The sales price is $" + dollars + " USD.");
            else
            System.out.println("Motogp Motorcycles are estimated at $2,000,000 USD, and are Not for sale.");
    }
}
