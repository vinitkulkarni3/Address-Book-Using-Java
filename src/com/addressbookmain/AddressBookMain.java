
package com.addressbookmain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Predicate;

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
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> personList = new ArrayList<Person>();
        
        System.out.print("Enter first name:");
        String firstName = sc.next();             
        System.out.print("Enter last name:");
        String lastName = sc.next();
        System.out.print("Enter address:");
        String address = sc.next();
        System.out.print("Enter city:");
        String city = sc.next();
        System.out.print("Enter state:");
        String state = sc.next();
        System.out.print("Enter zip:");
        String zip = sc.next();
        System.out.print("Enter phoennumber:");
        String phoneNumber = sc.next();
                       
        Person personObject = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
        personList.add(personObject);
        System.out.println("---Created Address Book and Inserted succesfully---");
        
        
        int temp = 1;
        while(temp > 0)
        {
            System.out.println("[1.Edit]    [2.Delete]  [3.Add]");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1: //Edit Existing
                        System.out.print("enter the name to edi t: ");
                        String tempFirstName = sc.next();
            
                        for(Iterator<Person> itrr = personList.iterator(); itrr.hasNext();)
                        { 
                            Person p = (Person)itrr.next();
        
                            if(p.firstName.equals(tempFirstName))
                            {
                                System.out.println("1.lastname 2.adddress 3.city 4.state 5.zip 6.phonenumber");
                                int editChoice = sc.nextInt();
                                if(choice == 1)
                                {
                                    System.out.println("enter last name to fix");
                                    String editLastName = sc.next();
                                    p.lastName = editLastName;
                                }
                                else if(choice == 2)
                                {
                                    System.out.println("enter address to fix");
                                    String editaddress = sc.next();
                                    p.address = editaddress; 
                                }
                                else if(choice == 3)
                                {
                                    System.out.println("enter city to fix");
                                    String editCity = sc.next();
                                    p.city = editCity;
                                }
                                else if(choice == 4)
                                {
                                    System.out.println("enter state to fix");
                                    String editState = sc.next();
                                    p.state = editState;
                                }
                                else if(choice == 5)
                                {
                                    System.out.println("enter zip to fix");
                                    String editZip = sc.next();
                                    p.zip = editZip;
                                }
                                else if(choice == 6)
                                {
                                    System.out.println("enter phone to fix");
                                    String editPhone = sc.next();
                                    p.phoneNumber = editPhone;
                                }
                                else
                                {
                                    System.out.println("Invalid choice");
                                }
                            }
                            else
                            {
                                System.out.println("No name found");
                            }
                        }       
                break;
                
                case 2://Delete
                        System.out.print("enter name to match and delete : ");
                        String sear = sc.next();
                        for(Iterator<Person> itrr = personList.iterator(); itrr.hasNext();)
                        { 
                            Person p = (Person)itrr.next();
                            if(p.firstName.equals(sear))
                            {
                                System.out.println("removed succefully");
                                itrr.remove();
                                break;
                            }
                            else
                            {
                                System.out.println("invalid name");
                            }
                        }
                break;
                
                case 3: //Add Multiple person
                        System.out.print("enter name firstname: ");
                        String searchFirstName = sc.next();
                        Predicate<Person> pStream = s -> s.firstName.contains(searchFirstName);
                        boolean b1 = personList.stream().anyMatch(pStream); 
            
                        if(b1 == true)
                        {
                            System.out.println("first name found");
                        }
                        else
                        {
                            System.out.print("Enter last name:");
                            String lastName1 = sc.next();
                            System.out.print("Enter address:");
                            String address1 = sc.next();
                            System.out.print("Enter city:");
                            String city1 = sc.next();
                            System.out.print("Enter state:");
                            String state1 = sc.next();
                            System.out.print("Enter zip:");
                            String zip1 = sc.next();
                            System.out.print("Enter phoennumber:");
                            String phoneNumber1 = sc.next();
                       
                            Person personObjects1 = new Person(searchFirstName, lastName1, address1, city1, state1, zip1, phoneNumber1);
                            personList.add(personObjects1);

                            System.out.println("Inserted");
                        }
                break;
                
                default: System.out.println("Invalid Option");
                break;
                
            }
        }
    }  
}
