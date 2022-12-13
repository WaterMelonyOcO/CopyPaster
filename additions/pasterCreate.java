package additions;


import java.lang.Math;
import java.util.Arrays;

 public class pasterCreate {

    private Randomizers rand = new Randomizers();
    private ChoserForElements choose = new ChoserForElements();

    private char[][] hands = {{'\\', '/'}, {'╚', '╗'}, {'➘', '➚'},{'~', '-','°','°','\\', '/','╚', '╗','➘', '➚'}};
    private char[][] eyes = {{'♢', '♦'},{'⤚', '⤙'},{'<','>'},{'^', '*','%','@','!','.', '♡',':', '₱', '°', '°', '\''}};
    private char[][] mouths = {{'_', '؂', '≭', '︹', 'ㅅ'}};
    // private char[] addSymbol = {'✝', '♭', '♫'};
    // private char[][] someShell = {{'{','}'}};

    //создаю пасту
    public String getEmoji(){
        char[][] parts = choose.partChoiser(hands, eyes, mouths);
        return ConstructPasta(parts);
    }
    

    private String ConstructPasta(char[][] parts) {
        return Arrays.deepToString(parts);
    }
    
    // "собирается" конечная паста
    
}
