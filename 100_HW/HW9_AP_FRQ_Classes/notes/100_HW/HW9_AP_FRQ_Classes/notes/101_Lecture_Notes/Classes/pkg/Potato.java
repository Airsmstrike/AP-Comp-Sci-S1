/* 
    Lecture note example - Classes
*/
package pkg;

public class Potato{
    //Global variables
    String color;
    boolean isEdible;
    String type;
    double mass;
    
    //constructors
    public Potato(){
        color = "Brown";
        isEdible = true;
        type = "French Fry";
        mass = 170.5;
    }
    
    public Potato(String c, String t, double m){
        color =c;
        isEdible = false;
        type = t;
        mass = m;
    }
    //methods
    public boolean getEdibility(){
        return isEdible;
    }
    public void eatPotato(){
        mass = 0;
    }
    
}