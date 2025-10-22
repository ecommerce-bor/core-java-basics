package com.product.exception;

public class UserNotFoundException {

    public String getUserByName(String name){
        try {
            if (name.equals("user")) {
                return name;
            }
        }catch (Exception e){
            System.out.println("Exception "+e.getMessage());
        }
        return "data";
    }

    public String getUserById(String name){
        try {
            if (name.equals("user")) {
                return name;
            }
        }catch (NullPointerException n){
            System.out.println("Exception "+n.getMessage());
        }catch (Exception npe){

        }
        return "data";
    }

    public String getUserByEmail(String email){
        try {
            if (email.equals("user")) {
                return email;
            }
        }catch (NullPointerException n){
            System.out.println("Exception "+n.getMessage());
            try{

            }catch (Exception e){

            }
        }catch (Exception npe){

        }
        return "data";
    }

    public static void main(String[] args) {
        UserNotFoundException userNotFoundException=new UserNotFoundException();
        userNotFoundException.getUserByName(null);
    }
}
