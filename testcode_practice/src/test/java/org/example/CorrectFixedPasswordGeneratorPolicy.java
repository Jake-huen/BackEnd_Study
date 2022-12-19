package org.example;

public class CorrectFixedPasswordGeneratorPolicy implements PasswordGeneratorPolicy {

    @Override
    public String generatePassword(){
        return "abcdefgh"; // 8글자
    }
}
