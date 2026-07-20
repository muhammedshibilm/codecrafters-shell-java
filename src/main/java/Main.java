import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String message ="is a shell builtin";
        while (true) {
        System.out.print("$ ");
        String command = sc.nextLine();
        
        String[] keywords = command.trim().split("\\s+");

        if (keywords[1].equals("exit")){
            System.out.println("exit " + message);
        }else if (keywords[1].equals("echo")) {
            //  System.out.println(command.substring(5));
            System.out.println("echo "+ message);
        }else if ( keywords[1].equals( "type")){
                System.out.println("type "+message);
        }else{
        System.out.println(command.split("\\s+")[1] + ": not found");
        }
    
} }
}