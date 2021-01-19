

public class Car {
    public Car() {

    }
    public static class car {
        private String color;
        private String year;
        private String size;
        private int Year;


        private car() {
            color = "";
            year = "";
            size = "";
        }

        private car (String color, String year, String size) {
            this.color = color;
            this.year = year;
            this.size = size;
        }


        private String getColor() {
            return color;
        }

        private void setColor(String color) {
            this.color = color;
        }

        private int getYear() {
            return Year;
        }

        public void color() {
            System.out.println("Car color");
        }

        public void size() {
            System.out.println("Car size");
        }


        public void year() {
            System.out.println("Car year");
        }


        // public (external) constants
        public static final String TYPE_SPORTY = "Sporty";
        public static final String TYPE_FAMILY = "Family";

        private String carType;

        public car (String color, String size) {
            this.color = color;
            this.size = size;
        }

        public String getCarType() {
            return carType;
        }

        public void setCarType(String carType) {
            this.carType = carType;
        }


        @Override
        public String toString() {
            return "Car{" +
                    "color='" + color + '\'' +
                    ", size =" + size +
                    ", year =" + year +
                    ", carType='" + carType + '\'' +
                    '}';
        }
    }
}

