import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class numberToRoman {

    @Test
    void shouldReturnII(){

       assertEquals("II", main.toRoman(2));
    }

    @Test
    void shouldReturnIII(){
        assertEquals("III", main.toRoman(3));
    }

    @Test

    void shouldReturnXX(){
        assertEquals("XX", main.toRoman(20));
    }

    @Test

    void shouldReturnCXXV(){
        assertEquals("CXXV", main.toRoman(125));
    }
    @Test
    void shouldReturnMDCCCXCIX(){

        assertEquals("MCDXCIX", main.toRoman(1999));
    }
    @Test
    void shouldReturnMMM(){

        assertEquals("MMM", main.toRoman(3000));
    }


}


