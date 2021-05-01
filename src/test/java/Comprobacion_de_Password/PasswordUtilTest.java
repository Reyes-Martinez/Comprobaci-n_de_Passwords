package Comprobacion_de_Password;

import org.junit.jupiter.api.Test;

import static Comprobacion_de_Password.PasswordUtil.SecurityLevel.*;
import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilTest {
    @Test
    void weak_when_has_less_than_letters() {
        assertEquals(WEAK ,PasswordUtil.assesPassword("1234567"));
    }
    @Test
    void weak_when_has_only_letters() {
        assertEquals(WEAK ,PasswordUtil.assesPassword("abcdefgh"));
    }
    @Test
    void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM ,PasswordUtil.assesPassword("abcd1234"));
    }
    @Test
    void strong_when_has_letters_numbers_and_simbols() {
        assertEquals(STRONG ,PasswordUtil.assesPassword("abcd123!"));
    }
}