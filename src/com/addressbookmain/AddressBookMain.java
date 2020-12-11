
package com.addressbookmain;

class Person 
{   
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
 
    public Person(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }    
}

public class AddressBookMain 
{
    public static void main(String[] args) 
    {
        System.out.println("*-*-* WELCOME TO ADDRESS BOOK *-*-*");
    }  
}
