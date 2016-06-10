/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gametest2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author josenavarrete
 */
public class KeyLis implements KeyListener {
    PantallaDeJuego gt2;
 @Override
			public void keyTyped(KeyEvent e) {
                            gt2.wCloud.keyPressed(e);
			}

    public KeyLis(PantallaDeJuego gt2) {
        this.gt2 = gt2;
    }

			@Override
			public void keyReleased(KeyEvent e) {
				gt2.wCloud.keyReleased(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {
			gt2.wCloud.keyPressed(e);
			}   
}
