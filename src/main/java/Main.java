import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.print("$ ");
        String command = sc.nextLine();

        if (command.equals("exit")){
            break;
        }else if (command.startsWith("echo ")) {
             System.out.println(command.substring(5));
        }else if (command.startsWith("type")) {
            String[] keyword =  command.split("\\s+");
            if (keyword[1].equals("echo") || keyword[1].equals("exit") || keyword[1].equals("type")) {
                System.out.println(keyword[1] + " is a shell builtin");
            }else{
                System.out.println(keyword[1] +": not found");
            }
        }else{
        System.out.println(command + ": command not found");
        }
     
    }
}
}