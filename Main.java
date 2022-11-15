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
        System.out.println("\nВыберите фигуру, параметры которой необходиму определить:");
        System.out.println("1) Точка\n2) Отрезок\n3) Круг\n4) Квадрат\n5) Треугольник\n6) Вернуться в меню");
        do {
            System.out.println("Ответ: ");
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
                System.out.format("Угол между положительным направлением оси X и данным отрезком составляет %f\n", Segment.degrees_calc(segment));
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
            System.out.println("Выберите режим работы программы:");
            System.out.println("1) Создать новый массив отрезков\n2) Вывести на экран существующий отрезок\n3) Возврат в меню выбора режима работы");
            do {
                System.out.println("Ответ: ");
                answer = in.nextInt();
            } while (answer < 1 || answer > 3);
            switch (answer) {
                case 1: {
                    do {
                        System.out.println("Введите количество отрезков, которые вы хотите создать(не более 10): ");
                        n = in.nextInt();
                    } while (n < 1 || n > 10);
                    for (i = 0; i < n; i++) {
                        segments[i] = new Segment();
                        System.out.println("Отрезок №" + (i + 1) + ":");
                        segments[i].input();
                        System.out.println("");
                    }
                    break;
                }
                case 2: {
                    if (i == 0) {
                        System.out.println("Массив пуст");
                        System.out.println("");
                    } else {
                        do {
                            System.out.println("Введите номер отрезка: ");
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
        System.out.println("Выберите режим работы программы:");
        System.out.println("1) Работа с объектами классов\n2) Создать массив объектов класса Segment\n3) Выйти из программы");
        do {
            System.out.println("Ответ: ");
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
        Point.name = "Точка";
        Segment.name = "Отрезок";
        Circle.name = "Круг";
        Square.name = "Квадрат";
        Triangle.name = "Треугольник";
        menu();
    }
}
