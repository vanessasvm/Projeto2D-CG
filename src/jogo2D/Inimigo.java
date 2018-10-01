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
public class Inimigo extends Base{
    
    private static final int larguraTela = 800;
    private int nivel;
    private int velocidade;//define inc do x para inimigo
    
    public Inimigo(int nivel){
        this.nivel = nivel;
        this.x = larguraTela;
        
        ImageIcon ref;
        if(nivel == 1){
            ref = new ImageIcon(FrmJogo.class.getResource("/img/dark_aster.png"));
            //img = ref1.getImage();
        } else {
            ref = new ImageIcon(FrmJogo.class.getResource("/img/thanos.png"));
            //img = ref.getImage();
        }
        
        img = ref.getImage();
        this.largura = img.getWidth(null);
        this.altura = img.getHeight(null);
        rect.height = altura;
        rect.width = largura;
        visible = true;
            
    }
    
    public void mover(){
        if(nivel == 1){
            velocidade = 1;
        } else {
            velocidade = 2;
        }
        this.x -= velocidade;
        if(this.x < 0){
            this.x = 800;
        }
        this.rect.x = x;
        this.rect.y = y;
        
        
    }
    
}
