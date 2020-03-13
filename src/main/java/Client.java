import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String args[]) throws IOException {
        System.out.println("Client started");

        // Network
        String name = "Skylli";
        String ipaddress = "10.169.20.13";
        int port = 8088;
        Socket socket = new Socket(ipaddress, port);
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);



        // Menu
        Scanner sc = new Scanner(System.in);
        System.out.println("******** MENU CLIENT ********");
        System.out.println("What do you want to do ?");
        System.out.println("    1. Increment");
        System.out.println("    2. Send");
        System.out.println("    3. Voir (?)");
        System.out.println("*****************************");
        String userChoice = sc.nextLine();

        System.out.println("Vous avez choisis : " + userChoice);

        switch (userChoice){
            case "1":
                // do Increment
                break;
            case "2":
                //  do Send
                break;
            default:
                // error
                break;
        }






    }

    private static void initNetwork() {

    }
}
