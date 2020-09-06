package printer;


public class PrinterMachine{

    private String str;

    public PrinterMachine() {
        System.out.println("Welcome to Printer Machine !");
    }

    public void setString(String str){
        this.str = str;
    }

    public String getString(){
        return str;
    }

}
