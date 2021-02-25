package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<Circle>();
		myCircles.add(new Circle(3.0));
		myCircles.add(new Circle(4.0));
		
		
		System.out.println("Total areas: " + totalArea(myCircles));
	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
