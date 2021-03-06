package gametest2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PantallaDeJuego extends JPanel {

        
        int[][] bloques= {{0,0,0,0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0,0,0,0},  
                         {0,0,0,0,0,0,0,0,0,0,0,0,0}, 
                         {0,0,0,0,0,0,0,0,0,0,0,0,0}, 
                         {0,1,1,1,1,1,1,1,1,1,0,0,1}, 
                         {0,0,0,0,0,0,0,0,0,1,0,0,1}, 
                         {1,1,1,1,1,1,1,1,0,1,0,0,1}, 
                         {0,0,0,0,0,0,0,0,0,1,0,0,1}, 
                         {1,0,0,0,0,0,0,0,1,1,0,0,1}, 
                         {0,0,0,0,0,1,0,1,0,1,0,0,1}, 
                         {0,0,0,1,0,0,0,0,0,0,0,2,1}, 
                         {1,1,1,1,1,1,1,1,1,1,1,1,1}};
        
        /* {0,0,0,0,0,0,0,0,0,0,0,0,0}
         * {1,1,1,1,1,1,1,1,1,1,1,1,1}
         * {1,0,1,0,1,0,1,0,1,0,1,0,1}
         * {0,1,0,1,0,1,0,1,0,1,0,1,0}
         */
 
        

	AngrySun aSun = new AngrySun(this,0,0);
	WhiteCloud wCloud = new WhiteCloud(this);
        Mapa map=new Mapa(this);
        float gravedad = 0.05f;
        static boolean jugando=true;   
        PinkStar pStar= new PinkStar(this);
        Enemy  e[];
       boolean youWin=false;
        
	public PantallaDeJuego() {
        this.e = new Enemy[]{aSun};
                KeyLis kls=new KeyLis(this);
		addKeyListener(kls);
		setFocusable(true);
                
	}	
	private void move() {
        wCloud.ya = wCloud.ya + gravedad;
	wCloud.move(e);
        aSun.move();
        wCloud.hayEnemy(e);
        youWin=wCloud.rescataDoncella(pStar);
	}
     

 
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
		map.PintaFondo(g2d);
               
                                for (int j=0;j<bloques[0].length;j++){
                                    for(int i=0;i<bloques.length;i++){
                                     if (bloques[i][j]==1)
                                         map.PintaBloque(g2d,i,j);
                                     if (bloques[i][j]==1)
                                         map.PintaBloque(g2d,i,j);
                                     if (bloques[i][j]==1)
                                         map.PintaBloque(g2d,i,j);
                                         }
                                    } 
                                
                wCloud.paint(g2d);
                map.PintaTextoVidas(g2d);
                pStar.paint(g2d);
                 aSun.paint(g2d);
                if (!wCloud.vivo){
                 map.PintaFin(g2d);
                jugando=false;}
              
                if(youWin){
                    map.PintaVictoria(g2d);
                    jugando=false;
                   
                }
	}
        public void gravityHero(){

}
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Juego Penca");
              
		PantallaDeJuego game = new PantallaDeJuego();
		frame.add(game);
		frame.setSize(630,630);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
		
		while (jugando) {
                    
			game.move();
			game.repaint();
			Thread.sleep(10);
		}
	}
}