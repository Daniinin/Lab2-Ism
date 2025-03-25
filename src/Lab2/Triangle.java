package Lab2;
class Triangle extends Form {
    private float height, base;

    public Triangle() { super(); this.height = 0; this.base = 0; }
    public Triangle(String color, float height, float base) { super(color); this.height = height; this.base = base; }
    public float getArea() { return (base * height) / 2; }
    public String toString() { return super.toString() + " (Lab2.Triangle)"; }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle t = (Triangle) obj;
        return Float.compare(t.height, height) == 0 && Float.compare(t.base, base) == 0;
    }
}

