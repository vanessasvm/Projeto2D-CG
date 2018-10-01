/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo2D;

import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;

/**
 *
 * @author Vanessa
 */
public abstract class Base {
    
    protected int x = 0;
    protected int y = 0;
    protected int incX = 1;
    protected int incY = 1;
    protected int altura;
    protected int largura;
    protected boolean visible;
    protected Color cor = Color.BLACK;
    protected Color borda = Color.GREEN;
    protected Image img;
    protected Rectangle rect = new Rectangle(0, 0, 0, 0);
    
        
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        this.rect.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        this.rect.y = y;
    }

    public int getIncX() {
        return incX;
    }

    public void setIncX(int incX) {
        this.incX = incX;
    }

    public int getIncY() {
        return incY;
    }

    public void setIncY(int incY) {
        this.incY = incY;
    }   

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
        this.rect.height = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
        this.rect.width = largura;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }
        
    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x, y, largura, altura);
    }
    
    public void mover() {
        x = x + incX;
        y = y + incY;
        this.rect.x = x;
        this.rect.y = y;
        
    }
    
    public Colisao trataColisao(int width, int height) {
        Colisao resp = Colisao.NONE;
        
        if (x < 0) {
            resp = Colisao.LEFT;
        } else if (x > width - 30) {
            resp = Colisao.RIGHT;
        }

        if (y < 28) {
            resp = Colisao.UP;
        } else if (y > height - altura) {
            resp = Colisao.DOWN;
        }
        
        return resp;
    }
    
    public boolean colisao(Base outraBase){
        if(this.equals(outraBase))
            return false;
        else            
            return rect.intersects(outraBase.rect);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.x;
        hash = 47 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Base other = (Base) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
    
    
    
}
