public class OverUnderProp extends PropBet{
    
    //constructor
    public OverUnderProp(String name, String betType, double line, double underOdds, double overOdds){
        super(name, "Over/Under "+betType+", "+line);
        odds1 = underOdds;
        odds2 = overOdds;
    }
    
    public String toString(){
        return super.toString()+"\n"
                +"Under - "+String.format("%.2f", odds1)+"\n"
                +"Over - "+String.format("%.2f", odds2)+"\n"; 
    }
}
