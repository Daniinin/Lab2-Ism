package Lab2;


class application {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("red", 5, 10);
        Triangle t2 = new Triangle("red", 5, 10);
        Circle c1 = new Circle("green", 7);
        Square s1 = new Square("yellow", 4);

        System.out.println(t1 + " - Area: " + t1.getArea());
        System.out.println(c1 + " - Area: " + c1.getArea());
        System.out.println(s1 + " - Area: " + s1.getArea());
        System.out.println("t1 equals t2: " + t1.equals(t2));
    }
}//


