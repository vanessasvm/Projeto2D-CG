/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo2D;

import javax.swing.ImageIcon;

/**
 *
 * @author Vanessa
 */
public class Nave extends Base{
    
    //private ArrayList<Tiro> tiros = new ArrayList();
    
    public Nave() {
        ImageIcon ref = new ImageIcon(FrmJogo.class.getResource("/img/milano.png"));
        img = ref.getImage();
        altura = img.getHeight(null);
        largura = img.getWidth(null);
        rect.height = altura;
        rect.width = largura;
        
        this.x = 50;
        this.y = 50;
        
        visible = true;
    }

    @Override
    public void mover() {
        x = x + incX;
        y = y + incY;
        this.rect.x = x;
        this.rect.y = y;
              
        //limita x a largura da tela
        if (this.x < 1) {
            this.x = 1;
        }
        
        if (this.x > 700) {
            this.x = 700;
        }

	//limita y a altura da tela
        if (this.y < 15) {
            this.y = 15;
        }

        if (this.y > 300) {
            this.y = 300;
	}
        
    }
                  
}
