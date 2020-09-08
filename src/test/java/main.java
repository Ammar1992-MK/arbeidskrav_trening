public class main {

    main main = new main();

    public static String toRoman(int number) {
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
