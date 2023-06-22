/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;

/**
 *
 * @author 12898
 */
public class Practice {

    
    public enum Colours{
    RED,YELLOW,GREEN,BLUE
    }
    public enum Ranks{
        ZERO,ONE, TWO, THREE,FOUR,FIVE,SIX,
        SEVEN,EIGHT,NINE,SKIP,REVERSE,DRAWTWO,DRAWFOUR,WILDCARD
    }
    
    private final Colours colours;
    private final Ranks ranks;

    public Practice(Colours colours,Ranks ranks)
    {
        this.colours=colours;
        this.ranks=ranks;
    }
    
    public Colours getColours() {
        return colours;
    }

    public Ranks getRanks() {
        return ranks;
    }
}
    /**
     * @param args the command line arguments
     */
   

