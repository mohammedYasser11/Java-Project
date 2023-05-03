
package com.mycompany.project;

/**
 *
 * @author adham
 */
abstract class Person {
    
    private int id;
    private int cellphone; 
    private String password;
    private String type;
    private String first_name;
    private String last_name;
    private String address;
    private String email;
    private boolean isBlocked;

    public Person() {
    }

    public Person(int id, int cellphone, String password, String type, String first_name, String last_name, String address, String email, boolean isBlocked) {
        this.id = id;
        this.cellphone = cellphone;
        this.password = password;
        this.type = type;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.email = email;
        this.isBlocked = isBlocked;
    }

    public int getId() {
        return id;
    }

    public int getCellphone() {
        return cellphone;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
