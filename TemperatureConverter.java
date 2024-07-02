import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the unit of measurement (Celsius, Fahrenheit, or Kelvin): ");
        scanner.nextLine(); // Consume the newline character
        String originalUnit = scanner.nextLine().toLowerCase();

        double convertedTemperatureCelsius = 0;
        double convertedTemperatureFahrenheit = 0;
        double convertedTemperatureKelvin = 0;

        if (originalUnit.equals("celsius")) {
            convertedTemperatureCelsius = temperature;
            convertedTemperatureFahrenheit = (temperature * 9/5) + 32;
            convertedTemperatureKelvin = temperature + 273.15;
        } else if (originalUnit.equals("fahrenheit")) {
            convertedTemperatureCelsius = (temperature - 32) * 5/9;
            convertedTemperatureFahrenheit = temperature;
            convertedTemperatureKelvin = (temperature - 32) * 5/9 + 273.15;
        } else if (originalUnit.equals("kelvin")) {
            convertedTemperatureCelsius = temperature - 273.15;
            convertedTemperatureFahrenheit = (temperature - 273.15) * 9/5 + 32;
            convertedTemperatureKelvin = temperature;
        } else {
            System.out.println("Invalid unit of measurement. Please enter Celsius, Fahrenheit, or Kelvin.");
            System.exit(1);
        }

        System.out.println("Converted Temperatures:");
        System.out.println("Celsius: " + convertedTemperatureCelsius + " °C");
        System.out.println("Fahrenheit: " + convertedTemperatureFahrenheit + " °F");
        System.out.println("Kelvin: " + convertedTemperatureKelvin + " K");

        scanner.close();
    }
}