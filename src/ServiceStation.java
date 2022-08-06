public class ServiceStation implements ServiceForVehicle {
    @Override
    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        car.checkEngine();
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        System.out.println();
    }

    @Override
    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
        System.out.println();
    }

        @Override
        public void check (Truck truck){
            System.out.println("Обслуживаем " + truck.getModelName());
            truck.checkEngine();
            truck.checkTrailer();
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            System.out.println();
        }
    }
