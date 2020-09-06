package printerTask;

public class MyLib {

    private static String str;

    public MyLib() {
        System.out.println("Welcome to Library of Printer");
    }

    public static String get(){
        return str;
    }

    public static void set(String str){
        MyLib.str = str;
    }
}
