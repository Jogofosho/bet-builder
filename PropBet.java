public abstract class PropBet{
    // instance variables
    protected String playerName;
    protected String betType;
    protected double odds1;
    protected double odds2;
    
    //constructor
    public PropBet(String name, String type){
        playerName = name;
        betType = type;
    }
    
    public String toString(){
        return playerName+"\n"+
                betType+": ";
    }
    
}
