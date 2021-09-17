package Main;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void TestDifferenceMainMethod() {
        //Вызываем метод разности двух чисел
        float expected = Main.difference(5.23f,2.34f);
        //Число которое должно получиться
        float actual = 2.89f;
        //Вызываем метод тестирования с погрешностью
        Assert.assertEquals(expected, actual,0.01);

    }
}