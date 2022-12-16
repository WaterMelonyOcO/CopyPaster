package additions;

public class pasterCreate {

    private ChoserForElements choose = new ChoserForElements();

    private char[][] hands = {{'\\', '/'}, {'╚', '╗'}, {'➘', '➚'},{'~', '-','°','°','\\', '/','╚', '╗','➘', '➚'}};
    private char[][] eyes = {{'♢', '♦'},{'⤚', '⤙'},{'>','<'},{'^', '*','%','@','!','.', '♡',':', '₱', '°', '°', '\''}};
    private char[][] mouths = {{'_', '≭'}};//'︹', 'ㅅ','؂'
    // private char[] addSymbol = {'✝', '♭', '♫'};
    private char[][] someShell = {{'(',')'},{'{','}'},{'|'}};

    //создаю пасту
    public String getEmoji(){
        char[][] parts = choose.partChoiser(hands, eyes, mouths, someShell);
        return ConstructPasta(parts);
    }


    // private String ConstructPasta(char[][] parts) {
    //     return Arrays.deepToString(parts);
    // }

    // "собирается" конечная паста
    private String ConstructPasta(char[][] parts){

        String result = "";

        //левая рука  //оболочкаЛ   //глазЛ        //рот         //глазР       //оболочкаР   //рукаР
        result += parts[0][0];
        result += parts[3][0];
        result += parts[1][0];
        result += parts[2][0];
        result += parts[1][1];
        result += parts[3][1];
        result += parts[0][1];   

        return result;
    }

}
