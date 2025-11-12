
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /**/
         
         
         //relative path
         //Picture apic = new Picture("images\\beach.jpg");
         //change with selfie picture
         Picture me = new Picture("images/Me.jpg");
         Picture me1 = new Picture("images/Me.jpg");
         Picture me2 = new Picture("images/Me.jpg");
        
         /**
          * method 1 change
          * 
          * 
          */
        int red,green,blue,count=0;
        Pixel[] pixels;
        pixels = me.getPixels();
        int avg;
        for (Pixel spot : pixels)
        {
            red=spot.getRed();
            green=spot.getGreen();
            blue=spot.getBlue();
            avg= red+blue+green/3;
            spot.setRed(avg);
            spot.setGreen(avg);
            spot.setBlue(avg);
            if (spot.getRed()<=255 && spot.getRed()>=220)//off white
            {
                spot.setRed(248);
                spot.setRed(240);
                spot.setRed(227);
            }
            if (spot.getRed()<=220 && spot.getRed()>=190)//off white
            {
                spot.setRed(230);
                spot.setRed(248);
                spot.setRed(243);
            }
            if (spot.getRed()<190 && spot.getRed()>=170)//light blue
            {
                spot.setRed(173);
                spot.setRed(216);
                spot.setRed(230);
            }
            if (spot.getRed()<170 && spot.getRed()>=120)//red
            {
                spot.setRed(255);
                spot.setRed(0);
                spot.setRed(0);
            }
            if (spot.getRed()<120 && spot.getRed()>0)//dark blue
            {
                spot.setRed(0);
                spot.setRed(0);
                spot.setRed(139);
            }
            
        }
        me.explore();
         /**
          * method 2 change
          * 
          */
        Pixel[] pixels2;
        pixels2 = me1.getPixels();
        int min=0,max=0;
        for (Pixel spot : pixels2)
        {
            red=spot.getRed();
            green=spot.getGreen();
            blue=spot.getBlue();
            avg= red+blue+green/3;
            spot.setRed(avg);
            spot.setGreen(avg);
            spot.setBlue(avg);
            if (spot.getRed() > max)
            {
                max=spot.getRed();
            }
            else if (spot.getRed() < min)
            {
                min=spot.getRed();
            }
        }
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
