import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String message ="is a shell buildin";
        while (true) {
        System.out.print("$ ");
        String command = sc.nextLine();

        if (command.equals("exit")){
            System.out.println("exit " + message);
        }else if (command.startsWith("echo ")) {
            //  System.out.println(command.substring(5));
            System.out.println("echo "+ message);
        }else
        System.out.println(command + ": command not found");
        }
     
    }
}
