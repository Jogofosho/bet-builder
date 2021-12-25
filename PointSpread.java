public class PointSpread extends Bet{
    // instance variables
    protected String awaySpread;
    protected String homeSpread;
    
    // constructor
    public PointSpread(double awayOdds, double homeOdds, String away, String home,
                        String awaySpread, String homeSpread){
        super(awayOdds, homeOdds, "Point Spread");
        this.awaySpread = awaySpread;
        this.homeSpread = homeSpread;
        this.away = away;
        this.home = home;
    }
    
    //instance methods
/*
 * Expected output:
 * [away team] vs. [home team]
 * Point Spread: 
 * Away, [awaySpread] - [awayOdds]
 * Home, [homeSpread] - [homeOdds]
 */
    public String toString(){
        return super.toString()+"\n"
                +away.substring(4)+", "+awaySpread+" - "+String.format("%.2f", awayOdds)+"\n"
                +home.substring(4)+", "+homeSpread+" - "+String.format("%.2f", homeOdds)+"\n";
    }//toString
}
