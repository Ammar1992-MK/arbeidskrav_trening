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

    void shouldReturnCXXV(){
        assertEquals("CXXV", toRoman(125));
    }
    @Test
    void shouldReturnMDCCCXCIX(){

        assertEquals("MDCCCXCIX", toRoman(1999));
    }

    private String toRoman(int number) {
        String[] hundreds = {"","C","CC","CCC","CD"};
        String[] tens = {"", "X", "XX", "XXX"};
        String[] units = {"","I","II","III","IV","V"};

        return  hundreds[(number % 1000) / 100] +
                tens[(number % 100) / 10] +
                units[number % 10] ;
    }
}


