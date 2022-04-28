import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 2 + 1); //failing test here
    }

    /*
    @Test
    public void getLinks() throws IOException {
        Path filePath = Path.of("test-file.md");
        String content = Files.readString(filePath);

        ArrayList<String> checkLink = MarkdownParse.getLinks(content);
        ArrayList<String> checkList = new ArrayList<String>();

        checkList.add("https://something.com");
        checkList.add("some-thing.html");

        assertEquals("https://something.com", checkLink.get(0));
        assertEquals("some-thing.html", checkLink.get(1));
        assertEquals(checkList, checkLink);

        //MarkdownParse.getLinks("test-file.md");
        //assertEquals("https://something.com", )


    }
*/

}

