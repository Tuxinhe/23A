public class CShape {
    protected String color;

    public CShape(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0.0;
    }
}

public class CTriangle extends CShape {
    private double a, b, c;

    public CTriangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return 0.5 * a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        String color = "红色";
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        CTriangle triangle = new CTriangle(color, a, b, c);

        System.out.println("颜色: " + triangle.color);
        System.out.println("面积: " + triangle.getArea());
    }
}
