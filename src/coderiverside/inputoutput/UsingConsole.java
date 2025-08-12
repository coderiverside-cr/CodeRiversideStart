package coderiverside.inputoutput;
import java.io.Console;
import java.io.PrintWriter;

public class UsingConsole {
    public static void main(String[] args) {
        Console console = System.console();
        if(console == null){
            System.out.println("Console is not supported");
            return;
        }
        PrintWriter out = console.writer();
        out.println("To quit type: exit");
        out.println("Type value and press enter:");
        String txt = null;
        while (!(txt = console.readLine()).equals(("exit"))) {
            System.out.println("Echo: " + txt);
        }
    }
}
