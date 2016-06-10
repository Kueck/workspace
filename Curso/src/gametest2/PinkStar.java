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


public class PinkStar extends Character {

    Image pStar=null;
    PantallaDeJuego game;
    int x =549;
    int y = 500;
    float ya = 0;
    float xa = 0;
    int vidas=3;
    boolean vivo=true;
    
    
      public PinkStar(PantallaDeJuego game) {
        this.game = game;
    }
   
    public void paint(Graphics2D g) {
            try {
                if (pStar == null) {
                pStar = ImageIO.read(new File("src\\gametest2\\Images\\PinkStar.png"));}
            } catch (IOException ex) {
             
                Logger.getLogger(WhiteCloud.class.getName()).log(Level.SEVERE, null, ex);
            }  
               g.drawImage((BufferedImage) pStar, null, x,y);
	}
   public void move() {
        if (!this.hayPiso((int)this.x+25,(int)this.y+50)) {
          game.gravityHero(); 
        } else {
            while(this.hayPiso((int)this.x+25,(int)this.y+49)){
                y=y-1;
        }
            if (ya > 0) {
                ya = 0;
        }
        }
        if (x + xa > 0 && x + xa < game.getWidth() - 50) {
            x = x + (int)xa;
        }
        y = y + (int)ya;
        }    
     boolean hayPiso(int xx,int yy) {
        int nx, ny;
        
        nx = (int) ((xx ) / 50);
        ny = (int) ((yy ) / 50);
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("nx:" + nx);
        System.out.println("ny:" + ny);
        try {
            return this.game.bloques[ny][nx]==1;
        } catch (Exception e) {
            Muere();
            System.out.println(e);
            return false;
        }

    }
      public void Muere() {
      vidas = vidas - 1;
            x = 0;
            y = 500;
            if (this.vidas <0){
            this.vivo=false;
            }
    }
      
}
