package game;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public abstract class  Entity extends Punto2D {
	private int TamañodelCuerpo;
	///Posicione y,x
	/// tamaño size (Seria el ancho y alto)

	public abstract void move(int dx, int dy);

	public abstract Rectangle getBound();

	public abstract boolean isCollsion(Entity o);
	
	////Por defecto
	public abstract void render(Graphics2D g2d2);
}