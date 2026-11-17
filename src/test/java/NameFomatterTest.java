import static org.junit.jupiter.api.Assertions.*;

class NameFomatterTest {

    @org.junit.jupiter.api.Test
    void test_formatWithAllParts() {

        String expected = "Johnson, Dr. Mel B, PhD";

        String actual = NameFomatter.format("Dr.", "Mel", "B", "Johnson", "PhD");

        assertEquals(expected, actual);

    }
}