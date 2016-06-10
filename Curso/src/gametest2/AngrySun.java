/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gametest2;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class AngrySun extends Enemy {
	int xa = 1;
	int ya = 1;
        Image img;
	private PantallaDeJuego game;
        

	public AngrySun(PantallaDeJuego game,int xx,int yy) {
        this.img = null;
	this.game= game;
        this.x=100;
        this.y=500;
	}

	void move() {
		if (x + xa < 0)
			xa = 2;
		if (x + xa > game.getWidth() - 50)
			xa = -2;
		if (y + ya < 0)
			ya = 2;
		if (y + ya > game.getHeight() - 50)
			ya = -2;

		x = x + xa;
		y = y + ya;
              
	}

	  public void paint(Graphics2D g) {

        try {
            if (img == null) {
                img = ImageIO.read(new File("src\\gametest2\\Images\\angrySun.png"));
            }
        } catch (IOException ex) {
            Logger.getLogger(WhiteCloud.class.getName()).log(Level.SEVERE, null, ex);
        }

        g.drawImage((BufferedImage) img, null, (int) x, (int) y);
    }
        
            boolean hayPiso() {
        int nx, ny;
        nx = (int) ((this.x+25) / 50);
        ny = (int) ((this.y+50) / 50);
     
        try{
                          if (this.game.bloques[ny][nx]!=1) { 
           return false;
        }else {return true;
                }}
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        
    }
        
}
