import java.util.Scanner;
public class Square {
    private Segment diagonal;
    private Point b;
    private Point d;
    public static String name;

    public Square() {
        b = new Point();
        d = new Point();
        diagonal = new Segment();
    }

    public Square(Point b) {
        this.b = b;
        d = new Point();
        diagonal = new Segment(this.b, d);
    }

    public Square(Point b, Point d) {
        this.b = b;
        this.d = d;
        diagonal = new Segment(this.b, this.d);
    }

    public void set_b(Point i) {
        b = i;
    }

    public void set_d(Point j) {
        d = j;
    }

    public void set_diagonal(Segment r) {
        diagonal = r;
    }

    public Point get_b() {
        return b;
    }

    public Point get_d() {
        return d;
    }

    public Segment get_diagonal() {
        return diagonal;
    }

    public void input() {
        Point b = new Point();
        Point d = new Point();
        System.out.println("������� ���������� ������ ����� �� ���������:");
        b.input();
        System.out.println("������� ���������� ������ ����� �� ���������:");
        d.input();
        this.diagonal = new Segment(b, d);
        this.b = b;
        this.d = d;
    }

    public void output() {
        System.out.println("���������� ������ ����� �� ���������: ");
        this.b.output();
        System.out.println("���������� ������ ����� �� ���������: ");
        this.d.output();
        System.out.println("����� ��������� ����� " + this.diagonal.get_length());
        System.out.println("�������� �������� ����� " + this.square_perimeter());
        System.out.println("������� �������� ����� " + this.square_area());
    }

    public double square_perimeter() {
        double perimeter;
        perimeter = 2 * Math.sqrt(2) * diagonal.get_length();
        return perimeter;
    }

    public double square_area() {
        double area;
        area = Math.pow(diagonal.get_length(), 2) / 2;
        return area;
    }

}
