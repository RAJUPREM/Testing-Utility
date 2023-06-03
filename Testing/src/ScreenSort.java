import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class ScreenSort {
	
	
	public static void main(String [] args) throws AWTException, IOException
	{
		System.out.println("Here we can take the screensort");
		Robot robot =new Robot();
		Rectangle rect =new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage screenShot=robot.createScreenCapture(rect);
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the file name : ");
		String fileName=sc.next();
		ImageIO.write(screenShot, "JPG", new File ("C:\\Users\\rajushar\\Pictures\\JavaScreen\\"+fileName+".jpg"));
		System.out.println("Your Screen sort has taken and stored into C:\\Users\\rajushar\\Pictures\\JavaScreen\\");
		
		File file = new File ("C:\\Users\\rajushar\\Pictures\\JavaScreen\\");
		Desktop desktop = Desktop.getDesktop();
		desktop.open(file);
		
	}

}
