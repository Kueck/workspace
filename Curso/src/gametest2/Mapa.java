
package gametest2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class Mapa {
    int x=0;
    int y=0;
    private PantallaDeJuego game;
    Image background= null;
    Image bloque= null;
    Image gameOver=null;
    Image bandera=null;
    Image iWin=null;
    String text1="vidas:";
    
	public Mapa(PantallaDeJuego game) {
		this.game= game;
	}      
        public void PintaFondo(Graphics2D g) {
             
            try {
              if (background == null) {
                background = ImageIO.read(new File("src\\gametest2\\Images\\background.jpg"));}
            } catch (IOException ex) {
                Logger.getLogger(WhiteCloud.class.getName()).log(Level.SEVERE, null, ex);
            }
           
             g.drawImage((BufferedImage) background, null, x,y);
            
	}       
        public void PintaBloque(Graphics2D g,int i,int j) {
            try {
                if (bloque == null) {
                bloque = ImageIO.read(new File("src\\gametest2\\Images\\block.jpg"));}
            } catch (IOException ex) {
             
                Logger.getLogger(WhiteCloud.class.getName()).log(Level.SEVERE, null, ex);
            }
             g.drawImage((BufferedImage) bloque, null, j*50, i*50);
	}
        public void PintaTextoVidas(Graphics2D g){
              g.setColor(Color.WHITE);
              g.drawString(text1+WhiteCloud.vidas, 550, 50);
              
          }
        public void PintaFin(Graphics2D g) {
             
            try {
                  if (gameOver == null) {
                gameOver = ImageIO.read(new File("src\\gametest2\\Images\\GameOver.jpg"));
            }
            } catch (IOException ex) {
                Logger.getLogger(WhiteCloud.class.getName()).log(Level.SEVERE, null, ex);
            }
           
             g.drawImage((BufferedImage) gameOver, null, -125,y);
            
	}  
         public void PintaVictoria(Graphics2D g) {
             
            try {
                  if (iWin == null) {
                iWin = ImageIO.read(new File("src\\gametest2\\Images\\iWin.jpg"));
            }
            } catch (IOException ex) {
                Logger.getLogger(WhiteCloud.class.getName()).log(Level.SEVERE, null, ex);
            }
           
             g.drawImage((BufferedImage) iWin , null, -125,y);
            
	}  
    
    
}
