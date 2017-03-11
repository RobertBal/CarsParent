package pl.balys;

/**
 * Hello world!
 *
 */
public class CarsData
{
    private String brand;
    private String model;
    private int manufactureYear;
    private double power;

    public CarsData(String brand, String model, int manufactureYear, double power) {

        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.power = power;
    }

    public CarsData(String text){
        if(text==null){
            throw new IllegalArgumentException("YOU");
        }

       String[] strings = new String[4];
        strings=text.split(",");

        if(strings.length!=4){
            throw new IllegalArgumentException("Inncorect format");
        }
        brand = strings[0].trim();
        model = strings[1].trim();
        manufactureYear = Integer.parseInt(strings[2].trim());
        power = Double.parseDouble(strings[3].trim());




    }



     @Override
     public String toString() {
         return brand+","+model+","+manufactureYear+","+power;
     }












    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public double getPower() {
        return power;
    }





    public static void main(String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
