/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author adham
 */
public class Reader extends Person {
    
         public Reader(){
         
     }
    public Reader (int id, long cellphone, String password, String type, String first_name, String last_name, String address, String email, boolean isBlocked){
    super( id,  cellphone, password, type, first_name,  last_name, address, email, false);
    }
}
