import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;

public class Interface {
    private String[] COMMANDS = {"install-drive", "list-drives", "pvcreate", "pvlist", "vgcreate", "vgextend", "vglist", "lvcreate", "lvlist"};
    private ArrayList<PHD> installedPHDs;
    public void run(){
        installedPHDs = new ArrayList<>();
        System.out.println("Welcome to the Logical Volume Manager.");
        while(true) {
            System.out.print("Enter cmd or type help to see available commands: ");
            String input = new Scanner(System.in).nextLine();
            if (input.equals("exit")) exit(-1);
            String command = "";
            String theRest = "";
            if(!input.contains(" ")) command = input;
            else {
                command = input.substring(0,input.indexOf(" "));
                theRest = input.substring(input.indexOf(" ") + 1);
            }
            System.out.println("command........."+command);
            switch (command) {
                case "install-drive" -> {
                    installedPHDs.add(new PHD(theRest.substring(0, theRest.indexOf(" ")), Integer.parseInt(theRest.substring(theRest.indexOf(" ") + 1, theRest.length() - 1))));
                }
                case "list-drives" -> {
                    for(PHD p : installedPHDs) System.out.println(p.toString());
                }
                case "pvcreate" -> {

                }
                case "pvlist" -> System.out.println("cheese");
                case "vgcreate" -> System.out.println("cheese");
                case "vgextend" -> System.out.println("cheese");
                case "vglist" -> System.out.println("cheese");
                case "lvcreate" -> System.out.println("cheese");
                case "lvlist" -> System.out.println("cheese");
            }
        }
    }
}
