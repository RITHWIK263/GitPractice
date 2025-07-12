public class coordinate {
    int x, y;

    coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    static coordinate add(coordinate p1, coordinate p2) {
        return new coordinate(p1.x + p2.x, p1.y + p2.y);
    }
    static coordinate subtract(coordinate p1, coordinate p2) {
        return new coordinate(p1.x - p2.x, p1.y - p2.y);
    }
    static double distance(coordinate p1, coordinate p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter p1 x: ");
        int x1 = sc.nextInt();
        System.out.print("Enter p1 y: ");
        int y1 = sc.nextInt();
        coordinate p1 = new coordinate(x1, y1);

        System.out.print("Enter p2 x: ");
        int x2 = sc.nextInt();
        System.out.print("Enter p2 y: ");
        int y2 = sc.nextInt();
        coordinate p2 = new coordinate(x2, y2);

        coordinate p3 = add(p1, p2);
        coordinate p4 = subtract(p1, p2);

        System.out.println("p3 (p1 + p2): (" + p3.x + ", " + p3.y + ")");
        System.out.println("p4 (p1 - p2): (" + p4.x + ", " + p4.y + ")");
        System.out.printf("Distance between p1 and p2: %.2f\n", distance(p1, p2));
    }
}