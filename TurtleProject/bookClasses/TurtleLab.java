package bookClasses;
import java.awt.Color;

/**
 * Write a description of class TurtleLab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TurtleLab
{
   public static void main(String[] args)
   {
     Color black = new Color(0,0,0);  
     World world = new World(true);
     Turtle me = new Turtle(world);
     
     me.setColor(black);
     
     me.penUp();
     me.moveTo(300,180);
     me.penDown();
     me.drawRec(50,100);
     
     me.penUp();
     me.moveTo(200,180);
     me.penDown();
     me.drawEquilateralTriangle(200);
     
     me.penUp();
     me.moveTo(300,200);
     me.penDown();
     me.drawHex(150);
     
     me.penUp();
     me.moveTo(500,250);
     me.penDown();
     me.drawCircle(100);
    
     me.penUp();
     me.moveTo(500,180);
     me.penDown();
     me.randomWalk(100);
   }
}
