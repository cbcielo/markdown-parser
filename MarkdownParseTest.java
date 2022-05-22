import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1); //passing test 
    }

    @Test
    public void snippetCheck1() throws IOException {
        Path fileName = Path.of("snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> output = new ArrayList<String>();
    }

    @Test
    public void snippetCheck2() throws IOException {
        Path fileName = Path.of("snippet2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> output = new ArrayList<String>();
        output.add("b.com");
        output.add("a.com(())");
        output.add("example.com");

        assertEquals(output, links);

    }

    @Test
    public void snippetCheck3() throws IOException {
        Path fileName = Path.of("snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(List.of("https://www.twitter.com", "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule", 
        "https://cse.ucsd.edu"), links);
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

