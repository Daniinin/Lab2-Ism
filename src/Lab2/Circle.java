package Lab2;

class Circle extends Form {
    private float radius;

    public Circle() { super(); this.radius = 0; }
    public Circle(String color, float radius) { super(color); this.radius = radius; }
    public float getArea() { return (float) (Math.PI * radius * radius); }
    public String toString() { return super.toString() + " (Lab2.Circle)"; }
}//
