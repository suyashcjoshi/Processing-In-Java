/**
 * Starter program showing how to call Processing4 APIs from Java SE
 * @author Suyash Joshi
 * @since Aug 5, 2022
 * Copyright 2022 Suyash Joshi
 */

package dev.suyashjoshi.creativecode;

import processing.core.PApplet;

public class App extends PApplet{
	
	public void settings(){
		size(500, 500);
	}
	
	public void draw(){
		ellipse(mouseX, mouseY, 50, 50);
	}
	
	public void mousePressed(){
		background(64);
	}
	
	public static void main(String[] args){
        try {
            PApplet.main("dev.suyashjoshi.creativecode.App");
        }
        catch (Exception e) {
            e.printStackTrace(new java.io.PrintStream(System.out));
        }
        
	}
}