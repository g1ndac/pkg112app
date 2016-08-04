/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg112app;

import java.util.Date;

/**
 *
 * @author Edy
 */
public class Urgenta {
    
    private String nume;
    private char grad;
    private Date data; 
    private float x;
    private float y;
    private boolean status;
    
    public Urgenta() {
    }

    public Urgenta(String nume, char grad, Date data, float x, float y, boolean status) {
        this.nume = nume;
        this.grad = grad;
        this.data = data;
        this.x = x;
        this.y = y;
        this.status = status;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public char getGrad() {
        return grad;
    }

    public void setGrad(char grad) {
        this.grad = grad;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public boolean getStatus()
    {
        return status;
    }
    public void setStatus(boolean status)
    {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Urgenta{" + "nume=" + nume + ", grad=" + grad + ", data=" + data + ", x=" + x + ", y=" + y + ",status " + status + '}';
    }
    
  
    
}
