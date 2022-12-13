package additions;

class Randomizers {
    
    //просто рандом (@_@)
    public int rand(int min, int max){
    	max -= min;
	    return (int) (Math.random() * ++max) + min;
    }
    
    public boolean probillityBool(double chance){
        return (Math.random()<chance)?false:true;
    }

    public int probillityInt(double chance){
        return (Math.random()<chance)?0:1;
    }
}
