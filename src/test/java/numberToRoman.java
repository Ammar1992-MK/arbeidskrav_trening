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

        assertEquals("MCDXCIX", toRoman(1999));
    }
    @Test
    void shouldReturnMMM(){

        assertEquals("MMM", toRoman(3000));
    }

    private String toRoman(int number) {
        String[] thousands = {"", "M", "MM"};
        String[] hundreds = {"","C","CC","CCC","CD", "D", "DC", "DCC", "DCCC", "CD" };
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"","I","II","III","IV","V", "VI", "VII", "VIII", "IX"};

        return  thousands[(number /1000)] +
                hundreds[(number % 1000) / 100] +
                tens[(number % 100) / 10] +
                units[number % 10] ;
    }
}


