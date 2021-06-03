package swing.quiz;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class S03_KakaoimageButton extends JButton {

	public static final int RYON 		= 0; 
	public static final int APHEACH 	= 1;
	public static final int MUJI 		= 2;
	public static final int TUBE 		= 3;
	
	private static HashMap<Integer,Image> btn_images = new HashMap<>();
	
	static {
		try {
			BufferedImage src = ImageIO.read(new File("./data/text/kakao.jpg"));

			
			int crop_width = src.getWidth() /2 - 44;
			int crop_height = src.getHeight() /2 - 43;
			
			// BufferedImage ÀÇ getSubimage(x,y,width , hegiht);
			btn_images.put(RYON, src.getSubimage(41, 41, crop_width, crop_height));
			btn_images.put(APHEACH, src.getSubimage(src.getWidth()/ 2, 0, crop_width, crop_height));
			btn_images.put(MUJI, src.getSubimage(0, src.getHeight()/ 2, crop_width, crop_height));
			btn_images.put(TUBE, src.getSubimage(src.getWidth()/ 2,src.getHeight()/ 2 ,crop_width , crop_height));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public S03_KakaoimageButton(int picture , int x , int y ,int width, int height) {
		
		setIcon(new ImageIcon(btn_images.get(picture).getScaledInstance(width, height, Image.SCALE_DEFAULT)));
		setBounds(x,y, width , height);
	}
	
	
	public static void main(String[] args) {

	}

}
