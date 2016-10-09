package template.pattern;

public class Main {
    public static void main(String[] args) {
        ProgramWithC programWithC=new ProgramWithC();
        ProgramWithJava programWithJava=new ProgramWithJava();
        programWithC.writeAndGetResult();
        System.out.println();
        programWithJava.writeAndGetResult();
    }
}
