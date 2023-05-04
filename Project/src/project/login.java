/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.util.Scanner;
/**
 *
 * @author dell
 */
@SuppressWarnings("empty-statement")
public class login {
    login(){}
                public void login1(int x){
		displaymenu ob=new displaymenu();
		SYSTEM_LIBRARY a = new SYSTEM_LIBRARY();
                        
                Scanner input = new Scanner(System.in);
		int choice;

		// Creating menu
		// using do-while loop
		do {

			ob.displaymenu(x);
			choice = input.nextInt();
                        if(x==1){

			// Switch case
			switch (choice) {
                            case 0 :
                                choice=0;
                                break;
                            case 1:
                                a.Add_person();
                                break;
                            case 2:
                                a.ADD_BOOK();
                                break;
                            case 3:
                                a.removeperson();
                                break;
                            case 4:
                                a.REMOVE_BOOK();
                                break;
                            case 5:
                                a.BOOK_SEARCH();
                                break;
                            case 6:
                                a.search();
                                break;
                            case 7:
                                a.block();
                                break;
                            default:
                                System.out.println("Please rechoose the number");
                                break;

				// Case
			

		}
                        }
                        else if (x==0){
                            switch(choice){
                            case 0 :
                                choice=0;
                                break;
                            case 1:
                                a.BOOK_SEARCH();
                                break;
                            case 2:
                                a.ADD_BOOK();
                                break;
                            }
                        
                        
                        }
                    // Case
                    		// Checking condition at last where we are
		// checking case entered value is not zero
		} while (choice != 0);
}
}

