/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisprakpbo;

import java.util.Scanner;

/**
 *
 * @author Aswira Yuniar
 */
public class Main {
    public static void main(String[] args){
        String name, email, phoneNumber, cari, ulang;
        
        
        do {
            ContactsManager Manager = new ContactsManager();

            name = "Aswira";
            email = "aswiraaa27@gmail.com";
            phoneNumber = "+6285823743127";
            Contact kontak = new Contact(name, email, phoneNumber);
            Manager.addContact(kontak);

            name = "Alen";
            email = "alenski2001@gmail.com";
            phoneNumber = "085887223147";
            Contact kontak2 = new Contact(name, email, phoneNumber);
            Manager.addContact(kontak2);

            name = "Disas";
            email = "diansastro@gmail.com";
            phoneNumber = "+6289667443123";
            Contact kontak3 = new Contact(name, email, phoneNumber);
            Manager.addContact(kontak3);

            name = "shopee";
            email = "shopee@gmail.com";
            phoneNumber = "(150)0702";
            Contact kontak4 = new Contact(name, email, phoneNumber);
            Manager.addContact(kontak4);

            Scanner input = new Scanner(System.in);
            System.out.print("Search Name : "); cari = input.nextLine();
            System.out.println("Looking for " + cari + "'s contact..");
            
            Contact result = Manager.searchContact(cari.toLowerCase());
            
            if(result != null){
                System.out.println("Name        : " + result.getName());
                System.out.println("Phone Number: " + result.getPhoneNumber());
                System.out.println("E-mail      : " + result.getEmail());
            }else{
                System.out.println("contact not found!");
            }
            
            System.out.println("Again? (y/n)"); ulang = input.nextLine();
            if("n".equals(ulang)){
                System.exit(0);
            }
        } while (true);
        
    }
    
}

