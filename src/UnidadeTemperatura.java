public enum UnidadeTemperatura {
    CELSIUS_TO_FAHRENHEIT {
        @Override
        public  double converter(double tempCelsius) {
            return (tempCelsius * 9 / 5) + 32;
        }
    },
    FAHRENHEIT_TO_CELSIUS {
        @Override
        public double converter (double tempFahrenheit) {
            return (tempFahrenheit - 32) * 5 / 9;
        }
    },
    KELVIN_TO_CELSIUS {
        @Override
        public double converter (double tempKelvin) {
            return tempKelvin - 273.15;
        }
    },
    CELSIUS_TO_KELVIN {
        @Override
        public double converter (double tempCelsius) {
            return tempCelsius + 273.15;
        }
    },
    KELVIN_TO_FAHRENHEIT {
        @Override
        public double converter (double tempKelvin) {
            return (tempKelvin - 273.15) * 9 / 5 + 32;
        }
    },
    FAHRENHEIT_TO_KELVIN {
        @Override
        public double converter (double tempFahrenheit) {
            return (tempFahrenheit - 32) * 5 / 9 + 273.15;
        }
    };

    public abstract double converter (double temperature);
}
