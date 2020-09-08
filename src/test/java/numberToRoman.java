import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class numberToRoman {

    @Test
    void shouldReturnII(){

       assertEquals("II", toRoman(2));
    }

    @Test
    void shouldReturnIII(){
        assertEquals("III", toRoman(3));
    }

    @Test

    void shouldReturnXX(){
        assertEquals("XX", toRoman(20));
    }

    @Test

    void shouldReturn(){
        assertEquals("XCCV", toRoman(125));
    }

    private String toRoman(int number) {

        String[] tens = {"", "X", "XX", "XXX"};
        String[] units = {"","I","II","III"};

        return  tens[(number % 100) / 10] +
                units[number % 10] ;
    }
}


