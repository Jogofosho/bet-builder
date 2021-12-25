public class AnytimeScorer extends PropBet {
    // instance variables
    double odds;
    
    // constructor
    public AnytimeScorer(String name, String scoreType, double odds){
        super(name,scoreType);
        this.odds = odds;
    }
    
    public String toString(){
        return super.toString()+String.format("%.2f", odds)+"\n";
    }
}
