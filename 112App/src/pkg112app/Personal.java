/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg112app;

/**
 *
 * @author Edy
 */
public class Personal {
    
    private float x;
    private float y;
    private boolean status;
    private String tip;

    public Personal() {
    }

    public Personal(float x, float y, boolean status, String tip) {
        this.x = x;
        this.y = y;
        this.status = status;
        this.tip = tip;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public String getTip()
    {
        return tip;
    }
    
    public void setTip(String tip)
    {
        this.tip = tip;
    }
    

    @Override
    public String toString() {
        return "Personal{" + "x=" + x + ", y=" + y + ", status=" + status + ",tip" + tip + '}';
    }
    
    
}
