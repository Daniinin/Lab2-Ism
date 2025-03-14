//1.Forme geometrice

class Form {
    private String color;

    public Form() { this.color = "white"; }
    public Form(String color) { this.color = color; }
    public float getArea() { return 0; }
    public String toString() { return "This form has the color " + color; }
}

class Triangle extends Form {
    private float height, base;

    public Triangle() { super(); this.height = 0; this.base = 0; }
    public Triangle(String color, float height, float base) { super(color); this.height = height; this.base = base; }
    public float getArea() { return (base * height) / 2; }
    public String toString() { return super.toString() + " (Triangle)"; }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle t = (Triangle) obj;
        return Float.compare(t.height, height) == 0 && Float.compare(t.base, base) == 0;
    }
}

class Circle extends Form {
    private float radius;

    public Circle() { super(); this.radius = 0; }
    public Circle(String color, float radius) { super(color); this.radius = radius; }
    public float getArea() { return (float) (Math.PI * radius * radius); }
    public String toString() { return super.toString() + " (Circle)"; }
}

class Square extends Form {
    private float side;

    public Square() { super(); this.side = 0; }
    public Square(String color, float side) { super(color); this.side = side; }
    public float getArea() { return side * side; }
    public String toString() { return super.toString() + " (Square)"; }
}

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
}

