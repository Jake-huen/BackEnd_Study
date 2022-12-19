package org.example;

@FunctionalInterface
public interface PasswordGeneratorPolicy {
    String generatePassword();
}
