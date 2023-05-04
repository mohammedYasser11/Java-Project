/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author dell
 */
public class displaymenu {
    public void displaymenu(int x){
        if (x==1){
    System.out.println("********************Welcome to the GFG Library!********************");
    System.out.println(	"				 Select From The Following Options:			 ");
    System.out.println("**********************************************************************");
    System.out.println("0-exit");
     System.out.println("1-add user");
     System.out.println("2-add book");
     System.out.println("3-remove user");
     System.out.println("4- remove book");
     System.out.println("5-search for a book");
     System.out.println("6-search for a user");
     System.out.println("7-block user");}
        else if(x==0){System.out.println("********************Welcome to the GFG Library!********************");
    System.out.println(	"				 Select From The Following Options:			 ");
    System.out.println("**********************************************************************");
    System.out.println("0-exit");
    System.out.println("1-search for a book");
    System.out.println("2-add a book");
    }
    
    }
}
