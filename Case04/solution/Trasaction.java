package id.ac.binus.solution.satu;

import java.util.Scanner;

public class Trasaction {
	
	private static Scanner in = new Scanner(System.in);
	
	private static void selectMenu(int choose) {
		if(choose==1){
			Menu.menuPerhitungan();
		}else if(choose==2){
			Menu.menuBMI();
		}else if(choose==3){
			Menu.menuSquare();
		}else if(choose==4){
			Menu.menuRectangle();
		}else if(choose==5){
			Menu.menuCube();
		}else if(choose==6){
			Menu.menuBlock();
		}else if(choose==7){
			Menu.menuBall();
		}
	}
	
	public static void main(String[] args) {
		Menu.displayMenu();
		int choose = in.nextInt();
		selectMenu(choose);
	}

}
