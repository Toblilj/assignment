package Assignmentexample;

import org.junit.Test;




import static org.junit.Assert.assertEquals;

public class TestClass2 {


    //Testar Sträng variabeln ord.
    //genom att sätta restriktion iomed variabeln är beroende av user input/scanner.
    @Test
    public void testgetword() {
        Asscl1 testword = new Asscl1();
        String expected = "hej";


        testword.setOrd("hej");
        String actual = testword.getOrd();

        assertEquals(expected, actual);

    }

    //Testar int variabeln numOfLines
    @Test
    public void testNumOfLines() {
        Asscl1 testLines = new Asscl1();

        int expected = 0;

        testLines.getnumOfLines();
        int actual = testLines.getnumOfLines();
        assertEquals(expected,actual);
    }


  //Testar int variabeln numOfChar.
 @Test
    public void testPrintText () {
        Asscl1 testInput=new Asscl1();
        int expected=1;

        testInput.setNumOfChars(1);
        int actual=testInput.getNumOfChars();


        assertEquals(expected,actual);

 }






}
