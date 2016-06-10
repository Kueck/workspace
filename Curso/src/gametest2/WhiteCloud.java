
package gametest2;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class WhiteCloud extends Character {

    static int vidas = 3;
    int x = 0;
    float xa = 0;
    int y = 500;
    float ya = 0;

    float aux = 0;
    float salto = 0;
    private final PantallaDeJuego game;
    Image img = null;
    boolean vivo = true;
    boolean presionando = false;
    int actualY=0;
    public WhiteCloud(PantallaDeJuego game) {
        this.game = game;
    }

    public void move(Enemy e[]) {
        if (!this.hayBloque(this.x + 25, this.y + 50)) {     // si no hay piso aplico gravedad 
           
            ya=ya+0.05f;
            // game.gravityHero();
        }
        if (this.hayBloque(this.x + 25, this.y + 50)) {
            while (this.hayBloque((int) this.x + 25, this.y + 49)) {  //mientras haya piso mantengo al personaje sobre el
                y = y - 1;
            }
            if (ya > 0) {       // si la gravedad afectase al personaje mientras esta en el piso la velocidad de caida se lleva a 0 evitando que caiga
                ya = 0;
            }
        }
         if (this.hayBloque(this.x + 25, this.y+(int)ya )) {
             // si la gravedad afectase al personaje mientras esta en el piso la velocidad de caida se lleva a 0 evitando que caiga
                ya = 0;
           
        }       
        
        
        if (!this.hayBloque(this.x+(int)xa, this.y+25)) {
            if (!this.hayBloque(this.x + 50+(int)xa, this.y+25)) {
                if (x + xa > 0 && x + xa < game.getWidth() - 50) {
                    x = x + (int) xa;
                }
            } 
        } 
        
        if((int)y+ya>0){
         
            y = y + (int) ya; 
            
        }
        System.out.println("x:"+this.x);
        System.out.println("y:"+this.y);
        hayEnemy(e);
    }

    public void paint(Graphics2D g) {

        try {
            if (img == null) {
                img = ImageIO.read(new File("src\\gametest2\\Images\\WhiteCloud.jpg"));
            }
        } catch (IOException ex) {
            Logger.getLogger(WhiteCloud.class.getName()).log(Level.SEVERE, null, ex);
        }

        g.drawImage((BufferedImage) img, null, (int) x, (int) y);
    }

    public void keyReleased(KeyEvent e) {
        xa = 0;
        ya = 0;

        presionando = false;
    }

    boolean hayBloque(int xx, int yy) {
        int nx, ny;

        nx = (int) ((xx) / 50);
        ny = (int) ((yy) / 50);
        try {
            if (this.game.bloques[ny][nx] == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            Muere();
            System.out.println(e);
            return false;
        }

    }

    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_A) {
            xa = -1;
            presionando = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_D) {
            xa = 1;
            presionando = true;
        }
        if (!presionando && hayBloque((int) this.x + 25, (int) this.y + 50)) {
            if (e.getKeyCode() == KeyEvent.VK_W) {
                if(!hayBloque(this.x+25,this.y-1))
                ya = -5;
                Sounds.sJump.play();
                presionando = true;
            }
            
        }
    }

    public void Muere() {
        vidas = vidas - 1;
        x = 0;
        y = 500;
        if (vidas <= 0) {
            vivo = false;
        }
    }
    
    public void hayEnemy(Enemy e[]){
        for(int i=0;i<e.length;i++){
    if( 
            e[i].x+50>=this.x&&
            e[i].x<=this.x+50&&
            e[i].y>=this.y&&
            e[i].y+50<=this.y+50
            )
        Muere();
        }
    }
     public boolean rescataDoncella(PinkStar ps){
      
    if( 
            ps.x+50>=this.x&&
            ps.x<=this.x+50&&
            ps.y>=this.y&&
            ps.y+50<=this.y+50
            )
        return true;else
        return false;
        }
    
}
