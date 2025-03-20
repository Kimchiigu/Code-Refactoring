package id.ac.binus.solution.satu;

import java.util.Scanner;

public class Menu {

	private static Scanner in = new Scanner(System.in);
	
	public static void displayMenu() {
		System.out.println("The menus : ");
		System.out.println("1. Simple Calculator");
		System.out.println("2. BMI Calculation");
		System.out.println("3. Large/Around of Square");
		System.out.println("4. Large/Around of Rectangle");
		System.out.println("5. Large/Around/Volume Cube");
		System.out.println("6. Large/Around/Volume Block");
		System.out.println("7. Large/Volume Globe");
		System.out.println("You choosed : ");
	}
	
	public static void printHasilPerhitungan(String type, int result) {
		System.out.println(type + "-> Result : " + result);
	}
	
	public static void printShapeClass(String type) {
		System.out.println("Welcome to " + type + " Class\n\n");
	}
	
	public static void menuPerhitungan() {
		System.out.println("Entry the first number : ");
		int first_number = in.nextInt();
		System.out.println("Entry the second number : ");
		int second_number = in.nextInt();
		printHasilPerhitungan("Add", Perhitungan.penjumlahan(first_number, second_number));
		printHasilPerhitungan("Sub", Perhitungan.pengurangan(first_number, second_number));
		printHasilPerhitungan("Mul", Perhitungan.perkalian(first_number, second_number));
		printHasilPerhitungan("Div", Perhitungan.pembagian(first_number, second_number));
	}
	
	public static void menuBMI() {
		System.out.println("The weight : ");
		float weight = in.nextFloat();
		System.out.println("The height : ");
		int height = in.nextInt();
		BMI BMI = new BMI(weight, height);
		BMI.cekBMI();
	}
	
	public static void menuSquare() {
		printShapeClass("Square");
		System.out.println("Square side : ");
		int wide = in.nextInt();
		Square square = new Square(wide);
		System.out.println("Square's Area : " + square.getArea());
		System.out.println("Square's Around : " + square.getAround());
	}
	
	public static void menuRectangle() {
		printShapeClass("Rectangle");
		System.out.println("Length : ");
		int length = in.nextInt();
		System.out.println("Wide : ");
		int wide = in.nextInt();
		Rectangle rectangle = new Rectangle(length, wide);
		System.out.println("Rectangle's Area : "+ rectangle.getArea());
		System.out.println("Rectangle's Around : " + rectangle.getAround());
	}
	
	public static void menuCube() {
		printShapeClass("Cube");
		System.out.println("Rib cube : ");
		int wide = in.nextInt();
		Cube cube = new Cube(wide);
		System.out.println("Cube's Area : "+ cube.getArea());
		System.out.println("Cube's Around : "+ cube.getAround());
		System.out.println("Cube's Volume : " + cube.getVolume());
	}
	
	public static void menuBlock() {
		printShapeClass("Block");
		System.out.println("Length : ");
		int length = in.nextInt();
		System.out.println("Wide : ");
		int wide = in.nextInt();
		System.out.println("Height : ");
		int height = in.nextInt();
		Block block = new Block(wide, length, height);
		System.out.println("Block's Area : "+ block.getArea());
		System.out.println("Block's Around : "+ block.getAround());
		System.out.println("Block's volume : " + block.getVolume());
	}
	
	public static void menuBall() {
		printShapeClass("Ball");
		System.out.println("Ball's Finger : ");
		int wide = in.nextInt();
		Ball ball = new Ball(wide);
		System.out.println("Ball's Area : "+ ball.getArea());
		System.out.println("Ball's volume : "+ ball.getVolume());
	}
}
