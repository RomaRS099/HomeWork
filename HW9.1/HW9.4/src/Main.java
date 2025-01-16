//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Temperature temp1 = new Temperature();
        System.out.println("Default: " + temp1.getTemperature() + " " + temp1.getScale());
        
        Temperature temp2 = new Temperature(100);
        System.out.println("Temp2: " + temp2.getTemperature() + " " + temp2.getScale());

        Temperature temp3 = new Temperature('F');
        System.out.println("Temp3: " + temp3.getTemperature() + " " + temp3.getScale());

        Temperature temp4 = new Temperature(32, 'F');
        System.out.println("Temp4: " + temp4.getTemperature() + " " + temp4.getScale());

        System.out.println("Temp4 in Celsius: " + temp4.toCelsius());
        System.out.println("Temp2 in Fahrenheit: " + temp2.toFahrenheit());

        temp1.setTemperatureAndScale(25, 'C');
        System.out.println("Temp1 updated: " + temp1.getTemperature() + " " + temp1.getScale());
    }
}