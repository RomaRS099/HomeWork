public class Temperature {
    private double temperature;
    private char scale;

    public Temperature() {
        this.temperature = 0;
        this.scale = 'C';
    }
    public Temperature(double temperature) {
        this.temperature = temperature;
        this.scale = 'C';
    }
    public Temperature(char scale) {
        this.temperature = 0;
        this.scale = scale;
    }
    public Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }
    public double getTemperature() {
        return temperature;
    }
    public char getScale() {
        return scale;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void setScale(char scale) {
        this.scale = scale;
    }
    public void setTemperatureAndScale (double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }
    public double toCelsius() {
        if (this.scale == 'C') {
            return temperature;
        } else {
            return 5.0 * (temperature - 32) / 9.0;
        }
    }
        public double toFahrenheit() {
            if (this.scale == 'F') {
                return temperature;
            } else {
                return (9.0 * temperature / 5.0) + 32;
            }
        }
    }
