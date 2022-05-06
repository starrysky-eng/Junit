import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private static Skill leapYear = (number) -> {
        if(number <= 0) return false;
        if ((number % 4 == 0) && (number % 100 != 0) || (number % 400 == 0)) {
            return true;
        }
        return false;
    };
    @org.junit.jupiter.api.Test
    void main1() {
        var actual = leapYear.isLeapYear(2000);
        var expected = true;
        assertEquals(actual,expected);
    }
    @org.junit.jupiter.api.Test
    void main2() {
        var actual = leapYear.isLeapYear(1991);
        var expected = false;
        assertEquals(actual,expected);
    }
    @org.junit.jupiter.api.Test
    void main3(){
        var actual = leapYear.isLeapYear(-2);
        var expected = false;
        assertEquals(actual,expected);
    }
}