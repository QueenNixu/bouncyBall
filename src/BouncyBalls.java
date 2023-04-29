/**
 * description
 * 
 * @author Agus
 * @version
 * @since
 *
 */
public class BouncyBalls {

	public static void main(String[] args) {
		 // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);

        // initial values
        double posX = 0.480, posY = 0.860;     // position
        double veloX = 0.015, veloY = 0.023;     // velocity
        double radius = 0.05;              // radius
        
        

        // main animation loop
        extracted(posX, posY, veloX, veloY, radius); 	
        
        dibujaCirculo(posX, posY, radius);
	}

	private static void dibujaCirculo(double posX, double posY, double radius) {
		// clear the background
        StdDraw.clear(StdDraw.GRAY);
        // draw ball on the screen
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(posX, posY, radius);
        // display and pause for 20 ms
        StdDraw.show(20);
        
       
	}

	private static void extracted(double posX, double posY, double veloX, double veloY, double radius) {
		while (true)  { 

            // bounce off wall according to law of elastic collision
            if (Math.abs(posX + veloX) > 1.0 - radius) veloX = -veloX;
            if (Math.abs(posY + veloY) > 1.0 - radius) veloY = -veloY;

            // update position
            posX = posX + veloX; 
            posY = posY + veloY; 

            dibujaCirculo(posX, posY, radius); 
        }
	}

}
