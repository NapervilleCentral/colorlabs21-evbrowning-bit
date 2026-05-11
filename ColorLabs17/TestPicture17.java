
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
     
     
     //mirrorTemple(temple);
     //temple.explore();
     //to change color of picture, get all of the pixels!
     //makes an array of pixels
     //Pixel[] pixels;
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
     //Picture apic = new Picture("images\\beach.jpg");
     //Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     //Picture ferris2 = new Picture("images/2000 ferris wheel2.jpg");
     //Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");
     //Picture ferris4 = new Picture("images/2000 ferris wheel2.jpg");
     //Picture ferris5 = new Picture("images/2000 ferris wheel2.jpg");
     //Picture ferris6 = new Picture("images/2000 ferris wheel2.jpg");
     //apic.explore();//Dsplays picture
     //ferris1.explore();
    //write/save a picture as a file
    //ferris1.write("images/ferris11.jpg");
     
     Picture apic1 = new Picture("images\\black.pigeon3.jpg");
     Picture apic2 = new Picture("images\\black.pigeon3.jpg");
     Picture apic3 = new Picture("images\\black.pigeon3.jpg");
     Picture apic4 = new Picture("images\\black.pigeon3.jpg");
     Picture apic5 = new Picture("images\\black.pigeon3.jpg");
     Picture temple = new Picture("images\\temple.jpg");
     Picture canvas = new Picture("images\\this one.jpg");
     
     //apic.explore();
     
     mirrorVertical(apic2);
     greyScale(apic3);
     inside(apic4);
     inverse(apic5);
     
     copytoCanvas(apic1,canvas);
     copytoCanvas(apic2,canvas);
     copytoCanvas(apic3,canvas);
     copytoCanvas(apic4,canvas);
     copytoCanvas(apic5,canvas);
     canvas.explore();

    /**/
  }//main
  public static void inverse(Picture apic)
  {
    Pixel[] pixels2;  
    pixels2 = apic.getPixels();
    int red,blue,green,count=0,newBlue,newRed,newGreen;
    for (Pixel spot : pixels2)
    {
        red=spot.getRed();
        green=spot.getGreen();
        blue=spot.getBlue();
        newBlue=255-blue;
        newGreen=255-green;
        newRed=255-red;
        spot.setRed(newRed);
        spot.setGreen(newGreen);
        spot.setBlue(newBlue);
        count++;
    }
  }
  public static void inside(Picture apic)
  {
    
    inside(apic, 0, 0, apic.getWidth(), apic.getHeight());
    apic.explore();
  }
  private static void inside(Picture pic, int startX, int startY, int width, int height)
  {
      //half
      int newWidth = width/2;
      int newHeight = height/2;
     
      //1/4th
      int offsetX = startX + (width-newWidth) / 2;
      int offsetY = startY + (height-newHeight) / 2;
     
      Pixel target = null;
      Pixel source = null;
    if(height < 1)
    {
        return;
    }
    else
    {
        for(int y = 0; y < newHeight; y++)
        {
            for(int x = 0; x < newWidth; x++)
            {
                  source = pic.getPixel(startX + x * 2, startY + y * 2);
                  target = pic.getPixel(offsetX + x, offsetY + y);
                  target.setColor(source.getColor());
            }
        }      
        inside(pic, offsetX, offsetY, newWidth, newHeight);
    }
  }
  public static void greyScale(Picture apic)
  {
    Pixel[] pixels;  
    pixels = apic.getPixels();
    int avg,red,blue,green,count=0;
    for (Pixel spot : pixels)
    {
        red=spot.getRed();
        green=spot.getGreen();
        blue=spot.getBlue();
        avg= red+blue+green/3;
        spot.setRed(avg);
        spot.setGreen(avg);
        spot.setBlue(avg);
        count++;
    }
   
  }
  public static void mirrorTemple(Picture temple)
  {
      int width = temple.getWidth();
      int mirrorPoint = 283;
      int height = 136;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      
      
      //loop through all the rows
      for (int y = 0; y < height;y++)
      {
          //loop from 0 to the middle (mirrir point)
          for (int x = 0; x < mirrorPoint; x++)
          {
              leftPixel = temple.getPixel(x,y);
              rightPixel = temple.getPixel(width-1-x,y);
              rightPixel.setColor(leftPixel.getColor());
          }
      }
      
  }
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
  {   // recursive copy to a x,y on the source
      Pixel sourcePix = null;
      Pixel targetPix = null;
      
      //loop through the columns              (larger sX=sX+.5)
      for(int sourceX = 0, targetX = 0;sourceX < source.getWidth(); sourceX++, targetX++)
      {
          // goes through rows                                           source+=2 (larger sY=sY+.5)
         for(int sourceY = 0, targetY = 0;sourceY < source.getHeight(); sourceY++, targetY++) 
         {
             sourcePix = source.getPixel(sourceX,sourceY);
             targetPix = target.getPixel(targetX,targetY);
             targetPix.setColor(sourcePix.getColor());
         }
      }
  }
}//class
