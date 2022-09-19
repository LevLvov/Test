package Tests;

import org.testng.annotations.Test;

public class ReadersData {
    @Test
    public void readersData() {
        Readers Loh = new Readers("Lvov Lev", 1, 45);
        Loh.takeBooks(6, 6);

    Loh.returnBooks(2,2);
    }
}
