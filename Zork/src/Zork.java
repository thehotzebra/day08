import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zork {
    
    public static final String NORTH = "north";
    public static final String SOUTH = "south";
    public static final String EAST = "east";
    public static final String WEST = "west";
    public static final String EXIT = "exit";

    public static final List<String> VALID_COMMANDS = Arrays.asList(NORTH, SOUTH, EAST, WEST, EXIT);

    public static void main(String[] args) throws Exception{
    
        Reader r = new FileReader("zork.txt");
        BufferedReader br = new BufferedReader(r);

        
        String location = "west_of_house";
        String startplace = "West of House";
        System.out.println(startplace + "\nYou are standing in an open field west of a white house, with a boarded front door.\nThere is a small mailbox here.");
        String line;
        
        Scanner sc = new Scanner(System.in);
        boolean stop = false;

        while (!stop) { //!= not equal
            line = sc.nextLine();
            line = line.trim();
        }
        sc.close();
    }

        public void ProcessInput(String input) {
            Scanner sc = new Scanner(input);
            String command = sc.next().trim();
            
            switch (command) {

                case NORTH:
                System.out.println("North of House\n");
                System.out.println("You are facing the north side of a white house. There is no door here, and all the windows are boarded up.\nTo the north a narrow path winds through the trees.");
                // for (String b: break) {
                // String linebreak = b.replaceAll("<break>","\n");
                break;

                case EXIT:
                break;

                default:
                break;
            }
            sc.close();


            
        
    
    }
}


