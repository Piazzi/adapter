
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    @Test
    void shouldReturnXML(){
        Database db = new Database();
        db.setData("<p>some data</p>");
        assertEquals("<?xml version="+1.0+"?> <data>some data</data>", db.getData());
    }

}