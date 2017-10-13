import java.util.*;

public class FiniteStateMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = 0;
        System.out.println("Initially state is < 0S");
        while(true){
            System.out.println("Enter event");
            String event = in.next();
            if(event.equals("1R")){
                if(s < 4){
                    s = s + 1;
		    System.out.println("Current state < " +s+ "S");
                }
                else{
                    System.out.println("Can not perform this action please enter some other state");
                }
            }
            else if(event.equals("2R")){
                if(s < 3){
                    s = s + 2;
		    System.out.println("Current state < " +s+ "S");
                }
                else{
                    System.out.println("Can not perform this action please enter some other state");
                }
            }
            else if(event.equalsIgnoreCase("buy")){
                if(s == 4){
                    System.out.println("COMPLETED");
                    break;
                }
                else{
                    System.out.println("Unreachable terminal states");
                }
            }
            else if(event.equalsIgnoreCase("cancel")){
                System.out.println("CANCELLED");
                break;
            }
            else{
                System.out.println("Invalid event");
            }
        }
    }
}
