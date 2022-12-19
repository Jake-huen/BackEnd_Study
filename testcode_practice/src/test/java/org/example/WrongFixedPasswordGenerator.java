package org.example;

public class WrongFixedPasswordGenerator implements PasswordGeneratorPolicy{

    @Override
    public String generatePassword(){
        return "ab"; // 2글자
    }
}
