public class MoneyLine extends Bet{
    // instance variables 
    
    //constructor
    public MoneyLine(double awayOdds, double homeOdds, String away, String home){
        super(awayOdds, homeOdds, "Money Line");
        this.away = away;
        this.home = home;
    }
    
    //instance methods
    
/*
 * Expected output:
 * [away team] vs. [home team]
 * Money Line: 
 * Away - [awayOdds]
 * Home - [homeOdds]
 */
    public String toString(){
        return super.toString()+"\n"
                +away.substring(4)+" - "+String.format("%.2f", awayOdds)+"\n"
                +home.substring(4)+" - "+String.format("%.2f", homeOdds)+"\n";
    }//toString
}
