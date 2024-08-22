/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

import java.util.Random;

/**
 *
 * @author ningia
 */
public class Asteroid extends Character {
    private double rotationalMovement;
    
    public Asteroid(int x, int y) {
        super(new PolygonFactory().createPolygon(), x, y);
        
        Random rnd = new Random();
        
        super.getCharacter().setRotate(rnd.nextInt(360));
        
        int accellerationAmount = 1 + rnd.nextInt(10);
        for (int i = 0; i < accellerationAmount; i++) {
            accelerate();
        }
        
        this.rotationalMovement = 0.5 - rnd.nextDouble();
    }
    
    @Override
    public void move() {
        super.move();
        super.getCharacter().setRotate(super.getCharacter().getRotate() + rotationalMovement);
    }
}
