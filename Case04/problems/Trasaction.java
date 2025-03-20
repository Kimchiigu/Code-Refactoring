package id.ac.binus.problems.satu;

import java.util.Scanner;

/*
 * Smell Code : Long Method
 * Reason     : Developer menaruh banyak logic di dalam 1 method
 * Treatment  : Extract Method
 */

/*
 * Smell Code : Dead Code
 * Reason     : Terdapat variabel "type" yang tidak dipakai
 * Treatment  : Hapus Code 
 */

/*
 * Smell Code : Data Class
 * Reason	  : Atribut tidak disimpan di Class secara terpisah
 * Treatment  : Extract Class
 */

/*
 * Smell Code : Primitive Obsession
 * Reason     : Sering menggunakan atribut primitif untuk handle complex logic dan object modelling
 * Treatment  : Membuat Class
 */

public class Trasaction {

	public static void main(String[] args) {
		int type = 0;
		int length = 0;
		int wide = 0;
		int height = 0;
		float area =0;
		float around = 0;
		float volume = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("The menus : ");
		System.out.println("1. Simple Calculator");
		System.out.println("2. BMI Calculation");
		System.out.println("3. Large/Around of Square");
		System.out.println("4. Large/Around of Regtangle");
		System.out.println("5. Large/Around/Volume Cube");
		System.out.println("6. Large/Around/Volume Block");
		System.out.println("7. Large/Volume Globe");
		System.out.println("You choosed : ");
		int choose = in.nextInt();
		
		if(choose==1){
			int first_number = 0;
			int second_number = 0;
			int result = 0;
			
			System.out.println("Entry the first number : ");
			first_number = in.nextInt();
			System.out.println("Entry the second number : ");
			second_number = in.nextInt();
			
			result = first_number + second_number;
			System.out.println("Add-> Result : " + result);
			
			result = first_number-second_number;
			System.out.println("Sub-> Result : " + result);
			
			result = first_number*second_number;
			System.out.println("Mul-> Result : " + result);
			
			result = first_number/second_number;
			System.out.println("Div-> Result : " + result);
			
			
		}else if(choose==2){
			float weight = 0;
			float bmi = 0;
			
			System.out.println("The weight : ");
			weight = in.nextFloat();
			System.out.println("The height : ");
			height = in.nextInt();
			
			bmi = weight/(height*height);
			if(bmi<17)
				System.out.println("BMI : " + bmi + ", You are Thin");
			else if(bmi>=17 && bmi<23)
				System.out.println("BMI : " + bmi + ", You are Normal");
			else if(bmi>=23 && bmi<27)
				System.out.println("BMI : " + bmi + ", You are ever Weight");
			else
				System.out.println("BMI : " + bmi + ", You are Obesitas");
		}else if(choose==3){
			System.out.println("Welcome to Square Class\n\n");
			System.out.println("Square side : ");
			wide = in.nextInt();
			
			area = wide * wide;
			System.out.println("Square's Area : " + area);
		
			around = 4*wide;	
			System.out.println("Square's Around : " + around);
		}else if(choose==4){
			System.out.println("Welcome to Rectangle Class\n\n");
			System.out.println("Length : ");
			length = in.nextInt();
			System.out.println("Wide : ");
			wide = in.nextInt();
			
			area = length * wide;
			System.out.println("Rectangle's Area : "+ area);
		
			around = (2*length)+(2*wide);
			System.out.println("Rectangle's Around : " + around);
		}else if(choose==5){
			System.out.println("Welcome to Cube Class\n\n");
			System.out.println("Rib cube : ");
			wide = in.nextInt();
			
			area=6*wide*wide;
			System.out.println("Cube's Area : "+area);
		
			around = 12*wide;
			System.out.println("Cube's Around : "+around);
		
			volume = wide*wide*wide;
			System.out.println("Cube's Volume : " + volume);
		}else if(choose==6){
			System.out.println("Welcome to Block Class\n\n");
			System.out.println("Length : ");
			length = in.nextInt();
			System.out.println("Wide : ");
			wide = in.nextInt();
			System.out.println("Height : ");
			height = in.nextInt();
			
			area = 2*((length*wide)+(length*height)+(wide*height));
			System.out.println("Block's Area : "+area);
		
			around = 4*(length+wide+height);
			System.out.println("Block's Around : "+around);
		
			volume = length*wide*height;
			System.out.println("Block's volume : " + volume);
		}else if(choose==7){
			System.out.println("Welcome to Ball Class\n\n");
			System.out.println("Ball's Finger : ");
			wide = in.nextInt();
			
			area = (float) (4 * 3.14 * wide * wide);
			System.out.println("Ball's Area : "+ area);
		
			volume = (float) ((4/3)*3.14 * wide * wide * wide);
			System.out.println("Ball's volume : "+volume);
		}
	}

}
