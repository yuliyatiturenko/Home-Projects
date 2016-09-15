package Fibonachi2;


public class FibonachiRecursion {
    public static void main(String[] args) {
        int chisloFibonachi=fibonachi(10);
        System.out.println(chisloFibonachi);
    }

    public static int fibonachi(int elementPosled) {

        if(elementPosled==1|| elementPosled==2){
            return 1;
        } else return (fibonachi(elementPosled-1)+fibonachi(elementPosled-2));
    }
}
