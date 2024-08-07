import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/---------------------------------------------------\\");
        System.out.println("|                                                   |");
        System.out.println("|        Conversor de unidade de temperatura        |");
        System.out.println("|                                                   |");
        System.out.println("\\---------------------------------------------------/");
        System.out.println("\n<--------------- Opções disponíveis ---------------->");
        System.out.println("| [1] Celsius(°C) para Fahrenheit(°F)               |");
        System.out.println("| [2] Fahrenheit(°F) para Celsius(°C)               |");
        System.out.println("| [3] Kelvin(K) para Celsius(°C)                    |");
        System.out.println("| [4] Celsius(°C) para Kelvin(K)                    |");
        System.out.println("| [5] Kelvin(K) para Fahrenheit(°F)                 |");
        System.out.println("| [6] Fahrenheit(°F) para Kelvin(K)                 |");
        System.out.println("<--------------------------------------------------->");
        System.out.print("Digite sua opção desejada: ");
        String entradaUsuario = scanner.nextLine();
        double temperature;


        switch (entradaUsuario) {
            case "1":
                System.out.print("\nDigite a temperatura em Celsius(°C) para ser convertida para Fahrenheit(°F): ");
                temperature = scanner.nextDouble();
                double tempCelsiusToFahrenheit = UnidadeTemperatura.CELSIUS_TO_FAHRENHEIT.converter(temperature);

                if (tempCelsiusToFahrenheit < -459.67) {
                    System.out.println("\nEsta temperatura está abaixo do zero absoluto (0 K, -273,15°C e -459,67°F), ou seja, não é válida.\nFé");
                } else {
                    System.out.printf("\n%.2f°C convertido para Fahrenheit é %.2f°F\n", temperature, tempCelsiusToFahrenheit);
                }


                break;
            case "2":
                System.out.print("\nDigite a temperatura em Fahrenheit(°F) para ser convertida para Celsius(°C): ");
                temperature = scanner.nextDouble();
                double tempFahrenheitToCelsius = UnidadeTemperatura.FAHRENHEIT_TO_CELSIUS.converter(temperature);

                if (tempFahrenheitToCelsius < -273.15) {
                    System.out.println("\nEsta temperatura está abaixo do zero absoluto (0 K, -273,15°C e -459,67°F), ou seja, não é válida.\n");
                } else {
                    System.out.printf("\n%.2f°F convertido para Celsius é %.2f°C\n", temperature, tempFahrenheitToCelsius);
                }
                break;
            case "3":
                System.out.print("\nDigite a temperatura em Kelvin(K) para ser convertida para Celsius(°C): ");
                temperature = scanner.nextDouble();
                double tempKelvinToCelsius = UnidadeTemperatura.KELVIN_TO_CELSIUS.converter(temperature);

                if (tempKelvinToCelsius < -273.15) {
                    System.out.println("\nEsta temperatura está abaixo do zero absoluto (0 K, -273,15°C e -459,67°F), ou seja, não é válida.\n");
                } else {
                    System.out.printf("\n%.2f K convertido para Celsius é %.2f°C\n", temperature, tempKelvinToCelsius);
                }
                break;
            case "4":
                System.out.print("\nDigite a temperatura em Celsius(°C) para ser convertida para Kelvin(K): ");
                temperature = scanner.nextDouble();
                double tempCelsiusToKelvin = UnidadeTemperatura.CELSIUS_TO_KELVIN.converter(temperature);

                if (tempCelsiusToKelvin < 0) {
                    System.out.println("\nEsta temperatura está abaixo do zero absoluto (0 K, -273,15°C e -459,67°F), ou seja, não é válida.\n");
                } else {
                    System.out.printf("\n%.2f°C convertido para Kelvin é %.2f K\n", temperature, tempCelsiusToKelvin);
                }
                break;
            case "5":
                System.out.print("\nDigite a temperatura em Kelvin(K) para ser convertida para Fahrenheit(°F): ");
                temperature = scanner.nextDouble();
                double tempKelvinToFahrenheit = UnidadeTemperatura.KELVIN_TO_FAHRENHEIT.converter(temperature);

                if (tempKelvinToFahrenheit < -459.67) {
                    System.out.println("\nEsta temperatura está abaixo do zero absoluto (0 K, -273,15°C e -459,67°F), ou seja, não é válida.\n");
                } else {
                    System.out.printf("\n%.2f K convertido para Fahrenheit é %.2f°F\n", temperature, tempKelvinToFahrenheit);
                }
                break;
            case "6":
                System.out.print("\nDigite a temperatura em Fahrenheit(°F) para ser convertida para Kelvin(K): ");
                temperature = scanner.nextDouble();
                double tempFahrenheitToKelvin = UnidadeTemperatura.FAHRENHEIT_TO_KELVIN.converter(temperature);

                if (tempFahrenheitToKelvin < 0) {
                    System.out.println("\nEsta temperatura está abaixo do zero absoluto (0 K, -273,15°C e -459,67°F), ou seja, não é válida.\n");
                } else {
                    System.out.printf("\n%.2f°F convertido para Kelvin é %.1f K\n", temperature, tempFahrenheitToKelvin);
                }
                break;
            default:
                System.out.println("\nSelecione uma opção válida.");
        }


        scanner.close();
    }
}