package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @DisplayName("패스워드 초기화한다.")
    @Test
    void passwordTest(){
        // given
        User user = new User();

        // when
        // user.initPassword(new CorrectFixedPasswordGeneratorPolicy());
        user.initPassword(()->"abcdefgh");
        // random으로 만들어지는데 조건에 해당 되면 test통과할거고 아니면 통과하지 못한다.
        // 그럼 이러한 경우에 test code를 어떻게 작성해야할까

        // then -> password가 setting이 되기를 기대한다.
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화되지 않는다.")
    @Test
    void passwordTest2(){
        // given
        User user = new User();

        // when
        // user.initPassword(new WrongFixedPasswordGenerator());
        user.initPassword(()-> "ab");

        // then
        assertThat(user.getPassword()).isNull();
    }
}