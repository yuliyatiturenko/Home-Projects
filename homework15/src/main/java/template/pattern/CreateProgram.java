package template.pattern;

public abstract class CreateProgram {
    final void writeAndGetResult(){
        writeCode();
        fixBugs();
        compile();
        testing();
        run();
        getResult();
    }

    abstract void writeCode();

     void fixBugs(){
         System.out.println("Bugs fixed");
     }

    abstract void compile();

     void testing(){
         System.out.println("Control quality finished");
    }

     void run(){
         System.out.println("Start program running ");
     }

     void getResult(){
         System.out.println("Get results ");
     }

}
