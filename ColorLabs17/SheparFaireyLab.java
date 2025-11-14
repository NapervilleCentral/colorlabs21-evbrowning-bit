
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
         Picture me3 = new Picture("images/Me.jpg");
         Picture me4 = new Picture("images/Me.jpg");
         Picture me5 = new Picture("images/Me.jpg");
        int red,green,blue,count=0;
         /**
          * method 1 change
          * 
          * 
         */
        
        Pixel[] pixels;
        pixels = me.getPixels();
        int avg;
        for (Pixel spot : pixels)
        {
            red=spot.getRed();
            green=spot.getGreen();
            blue=spot.getBlue();
            avg= (red+blue+green)/3;
            spot.setRed(avg);
            spot.setGreen(avg);
            spot.setBlue(avg);
            if (spot.getRed()<=255 && spot.getRed()>=191.25)//off white
            {
                spot.setRed(248);
                spot.setGreen(240);
                spot.setBlue(227);
            }
            
            if (spot.getRed()<191.25 && spot.getRed()>=127.5)//light blue
            {
                spot.setRed(173);
                spot.setGreen(216);
                spot.setBlue(230);
            }
            if (spot.getRed()<127.5 && spot.getRed()>=63.75)//red
            {
                spot.setRed(255);
                spot.setGreen(0);
                spot.setBlue(0);
            }
            if (spot.getRed()<63.75 && spot.getRed()>0)//dark blue
            {
                spot.setRed(0);
                spot.setGreen(0);
                spot.setBlue(139);
            }
            
        }
        me.explore();
        me.write("images/method1.jpg");
         
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
            avg= (red+blue+green)/3;
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
        
        double move= (max-min)/4;
        System.out.println(min+"-"+max+"-"+move);
        for (Pixel spot : pixels2)
        {
            red=spot.getRed();
            green=spot.getGreen();
            blue=spot.getBlue();
            if (spot.getRed()<=max-min && spot.getRed()>=max-move)//off white
            {
                spot.setRed(248);
                spot.setGreen(240);
                spot.setBlue(227);
            }
            if (spot.getRed()<max-max/4 && spot.getRed()>=max-move*2)//light blue
            {
                spot.setRed(173);
                spot.setGreen(216);
                spot.setBlue(230);
            }
            if (spot.getRed()<max-move*2 && spot.getRed()>=max-move*3)//red
            {
                spot.setRed(255);
                spot.setGreen(0);
                spot.setBlue(0);
            }
            if (spot.getRed()<max-move*3 && spot.getRed()>min)//dark blue
            {
                spot.setRed(0);
                spot.setGreen(0);
                spot.setBlue(139);
            }
            
        } 
        me1.explore();
        me.write("images/method2.jpg");
        
         /**
          * custom color palette
          */
        Pixel[] pixels3;
        pixels3 = me2.getPixels();
        
        for (Pixel spot : pixels3)
        {
            red=spot.getRed();
            green=spot.getGreen();
            blue=spot.getBlue();
            avg= (red+blue+green)/3;
            spot.setRed(avg);
            spot.setGreen(avg);
            spot.setBlue(avg);
            if (spot.getRed()<=255 && spot.getRed()>=200)//white
            {
                spot.setRed(233);
                spot.setGreen(227);
                spot.setBlue( 233);
            }
            if (spot.getRed()<200 && spot.getRed()>=150)//purply
            {
                spot.setRed(199);
                spot.setGreen(94);
                spot.setBlue(186);
            }
            if (spot.getRed()<150 && spot.getRed()>=50)// dark purple
            {
                spot.setRed(132);
                spot.setGreen(0);
                spot.setBlue(116);
            }
            if (spot.getRed()<50 && spot.getRed()>0)//dark blue
            {
                spot.setRed(69);
                spot.setGreen(0);
                spot.setBlue(61);
            }
            
        } 
        me2.explore();
        me2.write("images/method3(num1).jpg");
        Pixel[] pixels4;
        pixels4 = me3.getPixels();
        
        for (Pixel spot : pixels4)
        {
            red=spot.getRed();
            green=spot.getGreen();
            blue=spot.getBlue();
            avg= (red+blue+green)/3;
            spot.setRed(avg);
            spot.setGreen(avg);
            spot.setBlue(avg);
            if (spot.getRed()<=255 && spot.getRed()>=220)//white
            {
                spot.setRed(233);
                spot.setGreen(227);
                spot.setBlue( 233);
            }
            if (spot.getRed()<220 && spot.getRed()>=170)//purply
            {
                spot.setRed(199);
                spot.setGreen(94);
                spot.setBlue(186);
            }
            if (spot.getRed()<170 && spot.getRed()>=100)// dark purple
            {
                spot.setRed(132);
                spot.setGreen(0);
                spot.setBlue(116);
            }
            if (spot.getRed()<100 && spot.getRed()>0)//dark blue
            {
                spot.setRed(69);
                spot.setGreen(0);
                spot.setBlue(61);
            }
            
        } 
        me3.explore();
        me3.write("images/method3(num2).jpg"); 
         Pixel[] pixels5;
        pixels5 = me4.getPixels();
        
        for (Pixel spot : pixels5)
        {
            red=spot.getRed();
            green=spot.getGreen();
            blue=spot.getBlue();
            avg= (red+blue+green)/3;
            spot.setRed(avg);
            spot.setGreen(avg);
            spot.setBlue(avg);
            if (spot.getRed()<=255 && spot.getRed()>=220)//white
            {
                spot.setRed(233);
                spot.setGreen(227);
                spot.setBlue( 233);
            }
            if (spot.getRed()<220 && spot.getRed()>=180)//purply
            {
                spot.setRed(199);
                spot.setGreen(94);
                spot.setBlue(186);
            }
            if (spot.getRed()<180 && spot.getRed()>=170)//magenta
            {
                spot.setRed(177);
                spot.setGreen(26);
                spot.setBlue(158);
            }
            if (spot.getRed()<170 && spot.getRed()>=100)// dark purple
            {
                spot.setRed(132);
                spot.setGreen(0);
                spot.setBlue(116);
            }
            if (spot.getRed()<100 && spot.getRed()>0)//dark blue
            {
                spot.setRed(69);
                spot.setGreen(0);
                spot.setBlue(61);
            }
            
        } 
        me4.explore();
        me4.write("images/method3(num3).jpg"); 
         Pixel[] pixels6;
        pixels6 = me5.getPixels();
        
        for (Pixel spot : pixels6)
        {
            red=spot.getRed();
            green=spot.getGreen();
            blue=spot.getBlue();
            avg= (red+blue+green)/3;
            spot.setRed(avg);
            spot.setGreen(avg);
            spot.setBlue(avg);
            if (spot.getRed()<=255 && spot.getRed()>=200)//white
            {
                spot.setRed(233);
                spot.setGreen(227);
                spot.setBlue( 233);
            }
            if (spot.getRed()<200 && spot.getRed()>=170)//purply
            {
                spot.setRed(199);
                spot.setGreen(94);
                spot.setBlue(186);
            }
            if (spot.getRed()<170 && spot.getRed()>=140)//magenta
            {
                spot.setRed(177);
                spot.setGreen(26);
                spot.setBlue(158);
            }
            if (spot.getRed()<140 && spot.getRed()>=100)// dark purple
            {
                spot.setRed(132);
                spot.setGreen(0);
                spot.setBlue(116);
            }
            if (spot.getRed()<100 && spot.getRed()>0)//dark blue
            {
                spot.setRed(69);
                spot.setGreen(0);
                spot.setBlue(61);
            }
            
        } 
        me5.explore();
        me5.write("images/method3(num3).jpg"); 
    }//main       
}//class
