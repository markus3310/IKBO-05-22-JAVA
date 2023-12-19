public class ObjectInterfacesExample {
    public static void main(String[] args) {
        // Создаем объекты с различными именами и ценами
        Planet Earth = new Planet("saturn", 1500000);
        Car bmw = new Car("BMW", 50000);

        // Проверяем методы getName() и getPrice() для объектов
        System.out.println("Имя собаки: " + Earth.getName());
        System.out.println("Цена BMW: $" + bmw.getPrice());
    }
}