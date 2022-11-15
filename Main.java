import java.util.Scanner;
public class Main {

    public static int dynamic_variables() {
        Scanner in = new Scanner(System.in);
        Point point = new Point();
        Segment segment = new Segment();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        int answer;
        System.out.println("\n�������� ������, ��������� ������� ���������� ����������:");
        System.out.println("1) �����\n2) �������\n3) ����\n4) �������\n5) �����������\n6) ��������� � ����");
        do {
            System.out.println("�����: ");
            answer = in.nextInt();
        } while (answer < 1 || answer > 6);
        switch (answer) {
            case 1: {
                point.input();
                System.out.println(Point.name);
                point.output();
                break;
            }
            case 2: {
                segment.input();
                System.out.println(Segment.name);
                segment.output();
                System.out.format("���� ����� ������������� ������������ ��� X � ������ �������� ���������� %f\n", Segment.degrees_calc(segment));
                break;
            }
            case 3: {
                circle.input();
                System.out.println(Circle.name);
                circle.output();
                break;
            }
            case 4: {
                square.input();
                System.out.println(Square.name);
                square.output();
                break;
            }
            case 5: {
                triangle.input();
                System.out.println(Triangle.name);
                triangle.output();
                break;
            }
            case 6: {
                return 0;
            }
        }
        dynamic_variables();
        return 0;
    }

    public static int array_of_segments(){
        Scanner in = new Scanner(System.in);
        Segment[] segments = new Segment[10];
        int i = 0, n, answer, number;
        while(true) {
            System.out.println("�������� ����� ������ ���������:");
            System.out.println("1) ������� ����� ������ ��������\n2) ������� �� ����� ������������ �������\n3) ������� � ���� ������ ������ ������");
            do {
                System.out.println("�����: ");
                answer = in.nextInt();
            } while (answer < 1 || answer > 3);
            switch (answer) {
                case 1: {
                    do {
                        System.out.println("������� ���������� ��������, ������� �� ������ �������(�� ����� 10): ");
                        n = in.nextInt();
                    } while (n < 1 || n > 10);
                    for (i = 0; i < n; i++) {
                        segments[i] = new Segment();
                        System.out.println("������� �" + (i + 1) + ":");
                        segments[i].input();
                        System.out.println("");
                    }
                    break;
                }
                case 2: {
                    if (i == 0) {
                        System.out.println("������ ����");
                        System.out.println("");
                    } else {
                        do {
                            System.out.println("������� ����� �������: ");
                            number = in.nextInt();
                        } while (number < 1 || number > i);
                        segments[number - 1].output();
                        System.out.println("");
                    }
                    break;
                }
                case 3:
                    return 0;
            }
        }
    }


    public static int menu(){
        Scanner in = new Scanner(System.in);
        int answer;
        System.out.println("�������� ����� ������ ���������:");
        System.out.println("1) ������ � ��������� �������\n2) ������� ������ �������� ������ Segment\n3) ����� �� ���������");
        do {
            System.out.println("�����: ");
            answer = in.nextInt();
        } while (answer < 1 || answer > 3);
        switch (answer) {
            case 1: dynamic_variables(); break;
            case 2: array_of_segments(); break;
            case 3: return 0;
        }
        menu();
        return 0;
    }

    public static void main(String[] args) {
        System.setProperty("file.encoding","1251");
        Segment.a1 = new Point(0, 0);
        Segment.b1 = new Point(2, 0);
        Point.name = "�����";
        Segment.name = "�������";
        Circle.name = "����";
        Square.name = "�������";
        Triangle.name = "�����������";
        menu();
    }
}
