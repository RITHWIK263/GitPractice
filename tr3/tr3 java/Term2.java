public class Term2 {
    public static void main(String[] ar){
        int start = 20;
        int end = 1;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(start + " ");
                start -= 2;
            } else {
                System.out.print(end + " ");
                end++;
            }
        }
    }
}