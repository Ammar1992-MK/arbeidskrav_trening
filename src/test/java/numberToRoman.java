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

    private String toRoman(int number) {

        String[] units = {"","I","II","III"};

        return units[number % 10] ;
    }
}


