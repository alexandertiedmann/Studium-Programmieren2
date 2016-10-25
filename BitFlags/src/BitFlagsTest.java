import static org.junit.Assert.*;

public class BitFlagsTest {
    BitFlags flag1,flag2;
    @org.junit.Before
    public void setUp() throws Exception {
        flag1 = new BitFlags(15);//1111
        flag2 = new BitFlags(9); //1001
    }
    /**
     * Test: wechsel zu 0 und Test ob das Ergebnis wie erwartet ist
     * @throws Exception
     */
    @org.junit.Test
    public void swapTo0AndCheck0() throws Exception {
        flag1.swap(3); //an der 3. Stelle
        // ertwartet 11 (1011)
        assertFalse(flag1.isSet(3)); //von 1111 --> 1011
    }
    /**
     * Test: wechsel zu 1 und Test ob das Ergebnis wie erwartet ist
     * @throws Exception
     */
    @org.junit.Test
    public void swapTo1AndCheck1() throws Exception {
        flag2.swap(2); //an der 3. Stelle swappen
        //erwartet 11 (1011)
        assertTrue(flag2.isSet(2)); //1001 --> 1011
    }
}