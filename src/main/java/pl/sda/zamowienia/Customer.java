package pl.sda.zamowienia;

import pl.sda.zamowienia.exceptions.price.AgeException;
import pl.sda.zamowienia.exceptions.price.EmailException;

public class Customer {
    private String name;
    private String surname;
    private int age;
    private String email;

    public Customer(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if(checkAge(age)) {
            this.age = age;
        }
        else{
            throw new AgeException("Klient musi być pełnoletni");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailException {
        if(!this.checkEmail(email)){
            throw new EmailException("Niepoprawny Email");
        }
        else {
            this.email = email;
        }
    }
    public boolean checkAge(int age){
        if(age>=18){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean checkEmail(String email){
        return email.contains("@");
    }



    }
}
