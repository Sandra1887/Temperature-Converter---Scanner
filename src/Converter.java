import java.util.*;

public class Converter {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("The temperature in Celsius?");
        while (!sc.hasNextDouble()) {
            if(!sc.hasNext())
                System.exit(0);
            sc.nextLine();
            System.out.println("Wrong input! The temperature in Celsius?");
        }
        double temp = sc.nextDouble();

        double fahrenheit = Scales.celFah(temp);
        double kelvin = Scales.fahKel(fahrenheit);
        double celsius = Scales.kelCel(kelvin);

        System.out.format("Celsius converted to..\nFahrenheit:\t%4.1f°" + "\nKelvin:\t\t%4.1fK" +"\nCelsius:\t%4.1f°",
                fahrenheit, kelvin, celsius);

    }
}