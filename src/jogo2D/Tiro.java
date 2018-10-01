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
public class Tiro extends Base{
    
    private final int larguraTela = 800; //largura da imagem de fundo
    private final int velocidade = 2; //incremento do x para o tiro
    
    public Tiro() {
        
        ImageIcon ref = new ImageIcon(FrmJogo.class.getResource("/img/tiro.png"));
        img = ref.getImage();
        
        this.largura = img.getWidth(null);
        this.altura = img.getHeight(null);
        rect.height = altura;
        rect.width = largura;
        
        visible = true;
    }
    

    @Override
    public void mover() {
        this.x += velocidade;
        if(this.x > larguraTela){
            setVisible(false);
        }
        this.rect.x = x;
        this.rect.y = y;
    }
    
}
