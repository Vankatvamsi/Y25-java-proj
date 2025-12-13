package com.homeassignments;

public class HA6EmailValidate 
{
        public static void main(String[] args) 
        {
            String email = "test@example.com";
            String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            if (email.matches(regex))
                System.out.println("Valid Email");
            else
                System.out.println("Invalid Email");
        }
    }
