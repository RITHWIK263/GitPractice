public class coordinate2 {
    double R, p;

    coordinate2(double R, double p) {
        this.R = R;
        this.p = p;
    }
    static coordinate2 add(coordinate2 i1, coordinate2 i2) {
        return new coordinate2(i1.R + i2.R, i1.p + i2.p);
    }
    static coordinate2 subtract(coordinate2 i1, coordinate2 i2) {
        return new coordinate2(i1.R - i2.R, i1.p - i2.p);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter i1 R: ");
        double R1 = sc.nextDouble();
        System.out.print("Enter i1 p: ");
        double p1 = sc.nextDouble();
        coordinate2 i1 = new coordinate2(R1, p1);

        System.out.print("Enter i2 R: ");
        double R2 = sc.nextDouble();
        System.out.print("Enter i2 p: ");
        double p2 = sc.nextDouble();
        coordinate2 i2 = new coordinate2(R2, p2);

        coordinate2 i3 = add(i1, i2);
        coordinate2 i4 = subtract(i1, i2);

        System.out.println("i3 (i1 + i2): (R=" + i3.R + ", p=" + i3.p + ")");
        System.out.println("i4 (i1 - i2): (R=" + i4.R + ", p=" + i4.p + ")");
    }
}
