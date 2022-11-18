package copyPaster;

import java.lang.Math;

class pasterCreate {

    private char[] hands = {'\\', '~', '-'};
    private char[] eyes = {'^', '*','%','@','!','.','<','>'};
    private char[] mouths = {'_'};

    // private char hand;
    // private char eye;
    // private char mouth;
    
    pasterCreate(){

        char[] parts = partChoiser(hands, eyes, mouths);
        System.out.println( donePasta(parts) );

    }

    private char[] partChoiser(char[] hands, char[] eyes, char[] mouths){
        char[] result = new char[3];

        result[0] = hands[rand(0, hands.length - 1)];
        result[1] = eyes[rand(0, eyes.length - 1)];
        result[2] = mouths[rand(0, mouths.length - 1)];

        return result;
    }

    private String donePasta(char[] parts){
        String result = "";
        boolean ticker = true;

        for ( int i = 0; i <= parts.length - 1; i++ ){
            
            if ( i == 1 && ticker ){
                result = result + "(";
                ticker = false;
                i--;
            }

            else{
                result = result + parts[i];
            }
        }

        ticker = true;
        
        for ( int i = parts.length - 1; i >= 0; i-- ){
            
            if ( i == 0 && ticker ){
                result = result + ")";
                ticker = false;
                i++;
            }

            else{
                result = result + parts[i];
            }
        }


        return result;
    }

    private int rand(int min, int max){
    	max -= min;
	    return (int) (Math.random() * ++max) + min;
    }
}
