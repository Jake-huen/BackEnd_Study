package org.example;

public class User {

    private String password;

    // 이러한 메소드를 테스팅해야 되는 상황이 왔을 경우
    public void initPassword(PasswordGeneratorPolicy passwordGeneratorPolicy){
        // RandomPasswordGenerator가 몇 글자를 만들지 모르기 때문에
        // test 코드를 짜기가 어렵다.
        // 이 부분을 control하기 위해서 새로운 interface가 필요하다.

        // as - is 방식
        // RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        
        // to - be 방식
        String password = passwordGeneratorPolicy.generatePassword();
        if(password.length()>=8 && password.length()<=12){
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
