class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(8.0);

        System.out.println("Радиус круга: " + circle.getRadius());
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Длина окружности: " + circle.getCircumference());

        circle.setRadius(7.5);

        System.out.println("Радиус круга после изменения: " + circle.getRadius());
        System.out.println("Площадь круга после изменения: " + circle.getArea());
        System.out.println("Длина окружности после изменения: " + circle.getCircumference());
    }
}
