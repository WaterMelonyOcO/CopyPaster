package additions;

//выборка частей
public class ChoserForElements {

    private Randomizers rand = new Randomizers();
    
    protected char[][] partChoiser(char[][] hands, char[][] eyes, char[][] mouths, char[][] shell){
        char[][] result = new char[4][];

        result[0] = Choiser(hands);
        result[1] = Choiser(eyes);
        result[2] = Choiser(mouths);  
        result[3] = Choiser(shell);

        return result;
    }

    protected char[] Choiser( char[][] some ){

        char[] item = some[ rand.rand (0, some.length - 1) ];
        if ( item.length == 2 ){
            return item;
        }
        else if ( some.length == 1 ){
            char time = item[ rand.rand(0, item.length - 1)];
            item = new char[1];
            item[0] = time;
            return item;
            
        }
        else{
            char[] time = new char[2];
            time[0] = some[some.length - 1][ rand.rand ( 0, some[some.length - 1].length - 1 ) ];
            time[1] = some[some.length - 1][ rand.rand ( 0, some[some.length - 1].length - 1 ) ];
            return time;
        }
    }
}
