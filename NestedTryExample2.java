package NestedTryBlock;

public class NestedTryExample2 {

    public static void main(String[] args) {

        try{
            try{
                try{
                    int arr[] = {1,2,3,4};
                    System.out.println(arr[5]);
                } catch(ArithmeticException e){
                    System.out.println("3rd inner try block");
                }
            } catch(ArithmeticException e){
                System.out.println("2nd inner try block");
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("1st inner try bock");
        }
    }
}
