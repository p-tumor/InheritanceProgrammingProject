import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;

public class Interface {
    private final String[] COMMANDS = {"install-drive", "list-drives", "pvcreate", "pvlist", "vgcreate", "vgextend", "vglist", "lvcreate", "lvlist"};
    private ArrayList<PHD> installedPHDs;
    private ArrayList<PHD> freePHDs;
    private ArrayList<PV> madePVs;
    private ArrayList<PV> freePVs;
    public void run(){
        installedPHDs = new ArrayList<>();
        freePHDs= new ArrayList<>();
        madePVs = new ArrayList<>();
        freePVs = new ArrayList<>();
        System.out.println("Welcome to the Logical Volume Manager.");
        while(true) {
            System.out.print("Enter cmd or type help to see available commands: ");
            String[] s = new Scanner(System.in).nextLine().split(" ");
            System.out.println(Arrays.toString(s));
            if (s[0].equals("exit")) exit(-1);
            switch (s[0]) {
                case "install-drive" -> {
                    if(s.length == 3) {
                        installedPHDs.add(new PHD(s[1],Integer.parseInt(s[2].substring(0,s[2].length()-1))));
                        freePHDs.add(installedPHDs.get(installedPHDs.size()-1));//to add reference to same object to another list
                    }
                }
                case "list-drives" -> {
                    for(PHD p : installedPHDs) System.out.println(p.toString());
                }
                case "pvcreate" -> {
                    if(s.length == 3){
                        //installedPHDs.in
                    }
                }
                case "pvlist" -> System.out.println("cheese");
                case "vgcreate" -> System.out.println("cheese");
                case "vgextend" -> System.out.println("cheese");
                case "vglist" -> System.out.println("cheese");
                case "lvcreate" -> System.out.println("cheese");
                case "lvlist" -> System.out.println("cheese");
                default -> System.out.println("oh no");
            }
        }
    }
}
