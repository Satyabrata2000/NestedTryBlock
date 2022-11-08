package NestedTryBlock;

public class NestedTryExample1 {

    public static void main(String[] args) {

        try {
            System.out.println("String 1");
            int a = 10 / 0;
            try {
                System.out.println("String 2");
                int b[] = new int[5];
                b[5] = 4;
                try {
                    System.out.println("String 3");
                } catch (ArithmeticException e) {
                    System.out.println("String 4");
                }
            } catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println("String 5");
            }
        } catch (Exception e2) {
            System.out.println("String 6");
        }
    }
}


