package view;
import model.*;
import presenter.Presenter;

import java.util.*;
public class Runner {

	
	public static void main(String[] args) {

		Scanner ing = new Scanner(System.in);
		Presenter presenter = new Presenter();
		Product product = new Product();
		ServiceSale serv = new ServiceSale();
		boolean f = true;
		// acumulador de ventas
		double acum=0;
		//total de ventas
		int sales=0;
		 
		while (f) {
			System.out.println("Chose the product you want to buy \n 1.Milk \n 2.Whisky \n 3.Aspirin \n 4.Deodorant \n 5.Bread \n 6.Pancake");
			
				int pro =ing.nextInt();
				switch (pro) {
				case 1: 
					System.out.println("Enter the amount you want to buy");
					int amount=ing.nextInt();
					System.out.println(presenter.p1());
					acum = (acum + serv.calcIva());
					break;
				case 2: 
					System.out.println("Enter the amount you want to buy");
					int amount1=ing.nextInt();
					System.out.println(presenter.p2());
					acum = (acum + serv.calcIva());
					break;
				case 3: 
					System.out.println("Enter the amount you want to buy");
					int amount2=ing.nextInt();
					System.out.println(presenter.p3());
					acum = (acum + serv.calcIva());
					break;
				case 4: 
					System.out.println("Enter the amount you want to buy");
					int amount3=ing.nextInt();
					System.out.println(presenter.p4());
					acum = (acum + serv.calcIva());
					break;
				case 5: 
					System.out.println("Enter the amount you want to buy");
					int amount4=ing.nextInt();
					System.out.println(presenter.p5());
					acum = (acum + serv.calcIva());
					break;
				case 6: 
					System.out.println("Enter the amount you want to buy");
					int amount5=ing.nextInt();
					System.out.println(presenter.p6());
					acum = (acum + serv.calcIva());
					break;
				default:
					System.out.println("Invalid option, please try again");
				}

			
			sales=sales+1;
			
			System.out.println("Chose an option \n 1.Buy more \n 2.Exit");
			int op = ing.nextInt();
			
			if (op == 2) {
				f= false;
			}
			
		}
		double average = acum/sales;
		System.out.println("Total in sales: "+acum+"\n Total sales: "+sales+"\n Average: "+average);
	}

}

