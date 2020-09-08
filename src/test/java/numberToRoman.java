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
    private String toRoman(int number) {

        return "II";
    }
}


