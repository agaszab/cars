class Cars {
    public static void main(String[] args) {
        Car car = new Car("BMW",345, 34.9); //marka, model, rocznik, pojemność silnika

        car.show();
        car.decreaseSpeed(100);
        car.turbo();
        car.show();
        car.increaseSpeed(45);
        car.show();
    }
}