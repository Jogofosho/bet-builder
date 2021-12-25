import java.util.ArrayList;

public class Main{
    
    public static void main(String[] args){
        String away = "CAR Panthers";
        String home = "BUF Bills";
        
        Game test = new Game(away,home);
        OverUnder ou1 = new OverUnder(1.90,1.90,44.0);
        MoneyLine ml1 = new MoneyLine(5.40,1.16,away,home);
        PointSpread ps1 = new PointSpread(1.90,1.90,away,home,"+13.0","-13.0");
        
        test.addGameBet(ou1);
        test.addGameBet(ml1);
        test.addGameBet(ps1);
        
        AnytimeScorer as1 = new AnytimeScorer("Stefon Diggs","Anytime TD",1.83);
        AnytimeScorer as2 = new AnytimeScorer("Josh Allen","Anytime TD", 2.05);
        AnytimeScorer as3 = new AnytimeScorer("Dawson Knox","Anytime TD", 2.30);
        
        OverUnderProp oup1 = new OverUnderProp("Josh Allen","Passing Yards",268.0,1.90,1.90);
        
        test.addPropBet(as1);
        test.addPropBet(as2);
        test.addPropBet(as3);
        test.addPropBet(oup1);
        
        System.out.println(test);
        
        // System.out.println(test);
        
    }//main
    
}//Main
