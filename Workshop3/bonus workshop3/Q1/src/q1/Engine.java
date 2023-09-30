/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author Admin
 */
public class Engine {
    protected String Designer;
    protected int Power;
    
    public Engine() {
        super();
    }

    public Engine(String title, int price) {
        this.Designer = title;
        this.Power = price;
    }

    public int getPower() {
        return Power;
    }

    public String getDesigner() {
        String Dev = Character.toLowerCase(Designer.charAt(0)) + Designer.substring(1,3);
        return Dev;
    }

    public void setPower(int Power) {
        this.Power = Power;
    }

    public void setDesigner(String Designer) {
        this.Designer = Designer;
    }
    
    
    
    
}
