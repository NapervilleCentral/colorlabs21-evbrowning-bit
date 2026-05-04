
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;//the color class in awt
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
      /**/
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     
     //relative path
     Picture apic = new Picture("images\\black.pigeon2.jpg");
     Picture temple = new Picture("images\\temple.jpg");
     Picture canvas = new Picture("images\\this one.jpg");
     //Picture apic = new Picture("images\\beach.jpg");
     //Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     //Picture ferris2 = new Picture("images/2000 ferris wheel2.jpg");
     //Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");
     //Picture ferris4 = new Picture("images/2000 ferris wheel2.jpg");
     //Picture ferris5 = new Picture("images/2000 ferris wheel2.jpg");
     //Picture ferris6 = new Picture("images/2000 ferris wheel2.jpg");
     //apic.explore();//Dsplays picture
     //ferris1.explore();
     mirrorVertical(apic);
     apic.explore();
     copytoCanvas(apic,canvas);
     canvas.explore();
     
     
     temple.explore();
     //to change color of picture, get all of the pixels!
     //makes an array of pixels
     Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     //pixels = ferris1.getPixels();
    /*
     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length  );
    
    /*
    //access each index//array notation
    System.out.println(pixels[17]);
    //access each pixel//picture method
    Pixel spot = ferris1.getPixel(100,100);
    
    
    Color lavender= new Color(230,230,250);
    
    
    Pixel spot50 = ferris1.getPixel(50,50);
    System.out.println(pixels[17].getColor());
    System.out.println(spot);
    
    Pixel spot17 = pixels[17];
    spot17.setRed(200);
    spot17.setBlue(150);
    spot17.setGreen(175);
    
    
    spot.setColor(Color.yellow);
    spot50.setColor(lavender);
    ferris1.explore();
/*
    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.blue);

    ferris1.explore();
/*
   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    /*
    int red;
    for (Pixel spot1 : pixels)
    {
        //System.out.println( spot1 );
        red=spot1.getRed();
        red= (int) (red*.25);
        spot1.setRed(red);
    }
    //ferris1.explore();
    //ferris1.write("images/SFTry1.jpg");
    
    
    
    Pixel[] pixels2;
    //pixels2 = ferris2.getPixels();
    int blue,green,count=0;
    
    for (Pixel spot2 : pixels2)
    {
        red=spot2.getRed();
        green=spot2.getGreen();
        blue=spot2.getBlue();
        red=(int)((red-255)*-1);
        blue=(int)((blue-255)*-1);
        green=(int)((green-255)*-1);
        spot2.setRed(red);
        spot2.setGreen(green);
        spot2.setBlue(blue);
        count++;
    }
   // ferris2.explore();
    
    Pixel[] pixels3;
    //pixels3 = ferris3.getPixels();
    int avg;
    for (Pixel spot2 : pixels3)
    {
        red=spot2.getRed();
        green=spot2.getGreen();
        blue=spot2.getBlue();
        avg= red+blue+green/3;
        spot2.setRed(avg);
        spot2.setGreen(avg);
        spot2.setBlue(avg);
        count++;
    }
   // ferris3.explore();
    
    Pixel[] pixels4;
   // pixels4 = ferris4.getPixels();
    
    for (Pixel spot2 : pixels4)
    {
        red=spot2.getRed();
        green=spot2.getGreen();
        blue=spot2.getBlue();
        blue=(int)(blue+70);
        red=(int)(red+70);
        green=(int)(green+70);
        spot2.setRed(red);
        spot2.setGreen(green);
        spot2.setBlue(blue);
        
    }
   // ferris4.explore();
    
    Pixel[] pixels5;
   // pixels5 = ferris5.getPixels();
    
  //  for (Pixel spot2 : pixels5)
    {
        red=spot2.getRed();
        green=spot2.getGreen();
        blue=spot2.getBlue();
        blue=(int)(blue+96);
        red=(int)(red-25);
        green=(int)(green+12);
        spot2.setRed(red);
        spot2.setGreen(green);
        spot2.setBlue(blue);
        
    }
   // ferris5.explore();
    
    Pixel[] pixels6;
  //  pixels6 = ferris6.getPixels();
    
  //  for (Pixel spot2 : pixels6)
    {
        red=spot2.getRed();
        green=spot2.getGreen();
        blue=spot2.getBlue();
        if (red >=2 && red <= 7) 
        {
           spot2.setRed(173); 
        }
        if (green >=2 && green <= 7)
        {
           spot2.setGreen(216); 
        }
        if (blue >=2 && blue <= 7)
        {
           spot2.setBlue(230); 
        }
        
        
    }
   // ferris6.explore();
    
    
    
    
    
    
    
    
    
    
    /*
    Random gen = new Random();
    int x;
    x = gen.nextInt(101);
    
    int green,count=0;
    for (Pixel spot1 : pixels)
    {
        if (count%20 == 0)
        {
        spot1.setColor(Color.yellow);
        }
        count++;
    }
    ferris1.explore();
   
 */

 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           

        }
    ferris1.explore();
    
/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/ 
    //write/save a picture as a file
    //ferris1.write("images/ferris11.jpg");

    /**/
  }//main
  
  
  /**
   * method to mirror aroung a vertical line in the middle
   * of the picture based on the width
   */
  public static void mirrorVertical(Picture apic)
  {
      int width = apic.getWidth();
      int mirrorPoint = width/2;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      
      
      //loop through all the rows
      for (int y = 0; y < apic.getHeight();y++)
      {
          //loop from 0 to the middle (mirrir point)
          for (int x = 0; x < mirrorPoint; x++)
          {
              leftPixel = apic.getPixel(x,y);
              rightPixel = apic.getPixel(width-1-x,y);
              rightPixel.setColor(leftPixel.getColor());
          }
      }
      
  }
  /**
   * add two ints to the parameters and place you want target to go 
   * ont the canvas
   */
  public static void copytoCanvas(Picture source, Picture target)
  {
      Pixel sourcePix = null;
      Pixel targetPix = null;
      
      //loop through the columns
      for(int sourceX = 0, targetX = 0;sourceX < source.getWidth(); sourceX++, targetX++)
      {
         for(int sourceY = 0, targetY = 0;sourceY < source.getHeight(); sourceY++, targetY++) 
         {
             sourcePix = source.getPixel(sourceX,sourceY);
             targetPix = target.getPixel(targetX,targetY);
             targetPix.setColor(sourcePix.getColor());
         }
      }
  }
}//class
