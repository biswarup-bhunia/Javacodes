package BasicJava.day11.wePrb;

interface Printer {
    void print();
}

class FilePrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Print This");
    }
}

class ConsolePrint extends FilePrinter{
    @Override
    public void print(){
        System.out.println("Print through console.");
    }
}

public class Main{
    public static void main(String[] args) {
        FilePrinter java = new FilePrinter();
        //java is instance of Printer interface
        //

        ConsolePrint console = new ConsolePrint();
        //console is intance of FilePrintetr and Printer both.
        System.out.println(console instanceof FilePrinter);
        console.print();
        java.print();
    }
}
