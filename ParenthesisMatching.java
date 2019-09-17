import java.util.ArrayList;
import java.util.List;

public class ParenthesisMatching{

    static boolean isBalanced(String string){
        String [] letters = string.split("");
        String character = null;
        List<String> brackets = new ArrayList<>();
        boolean isBalanced = true;
        for(int counter = 0; counter < letters.length; counter ++){
            //if not balanced break loop
            if(!isBalanced) break;
            //get character
            character = letters[counter];
            //if character is one of open brackets then add to list
            if(character.equalsIgnoreCase("(") || character.equalsIgnoreCase("{") 
            || character.equalsIgnoreCase("[")){
                brackets.add(character);
            }
            else if(character.equalsIgnoreCase(")") || character.equalsIgnoreCase("}") 
            || character.equalsIgnoreCase("]")){
                //if characeter is one of close brackets then remove its pair from list
                String bracket = brackets.get(brackets.size() - 1);
                if(character.equalsIgnoreCase(")")){
                    isBalanced = bracket.equalsIgnoreCase("(");
                }
                else if(character.equalsIgnoreCase("}")){
                    isBalanced = bracket.equalsIgnoreCase("{");
                }
                else if(character.equalsIgnoreCase("]")){
                    isBalanced = bracket.equalsIgnoreCase("[");
                }
                if(isBalanced) brackets.remove(brackets.size() - 1);
            }

        }

        return isBalanced && brackets.isEmpty();
    }

    public static void main(String[] args) {
        String testOne = "f(e(d))";
        String testTwo = "(a[0]+b[2c[6]]){24+53}";
        String testThree = "(a[0]+b[2c[6]]){24+53}";
        System.out.println("Should be true: " + isBalanced(testOne));
        System.out.println("Should be true: " + isBalanced(testTwo));
        System.out.println("Should be false: " + isBalanced(testThree));
    }
}