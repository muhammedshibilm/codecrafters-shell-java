import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String message ="is a shell builtin";
        while (true) {
        System.out.print("$ ");
        String command = sc.nextLine();

        if (command.contains("exit")){
            System.out.println("exit " + message);
        }else if (command.contains("echo")) {
            //  System.out.println(command.substring(5));
            System.out.println("echo "+ message);
        }else
        System.out.println(command + ": command not found");
        }
     
    }
}
