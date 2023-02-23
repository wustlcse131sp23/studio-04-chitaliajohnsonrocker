package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
	StdDraw.setPenColor(100, 0, 0);
	StdDraw.filledRectangle(0.3, 0.5, 0.11, 0.2);
	StdDraw.setPenColor(0, 0, 100);
	StdDraw.filledRectangle(0.52, 0.5, 0.11, 0.2);
	StdDraw.setPenColor(0, 100, 0);
	StdDraw.filledRectangle(0.74, 0.5, 0.11, 0.2);
	double [] x = {0.7, 0.8, 0.9, 1.0, 0.6};
	double [] y = {0.6, 0.7, 0.6, 0.65, 0.65};
	StdDraw.setPenColor(StdDraw.PINK);
	StdDraw.filledPolygon(x, y);
	double [] a = {0.7, 0.75, 0.8};
	double [] b = {0.6, 0.55, 0.57};
	StdDraw.setPenColor(StdDraw.PINK);
	StdDraw.filledPolygon(a, b);
	double [] c = {0.9, 0.85, 0.8};
	double [] d = {0.6, 0.55, 0.57};
	StdDraw.setPenColor(StdDraw.PINK);
	StdDraw.filledPolygon(c, d);
	double [] e = {0.7, 0.75, 0.8};
	double [] f = {0.6, 0.565, 0.57};
	StdDraw.setPenColor(StdDraw.GREEN);
	StdDraw.filledPolygon(e, f);
	double [] g = {0.9, 0.85, 0.8};
	double [] h = {0.6, 0.565, 0.57};
	StdDraw.setPenColor(StdDraw.GREEN);
	StdDraw.filledPolygon(g, h);
	}
}