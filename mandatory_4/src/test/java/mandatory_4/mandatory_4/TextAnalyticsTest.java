package mandatory_4.mandatory_4;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;


public class TextAnalyticsTest {

    // readFile
    @Test
    public void testIfReadFileExists() {
        String testFileName = "C:\\Users\\Kristjan\\Desktop\\mandatory_4\\test.txt";
        TextAnalytics TestFile = new TextAnalytics(testFileName);
        String result = TestFile.read_file();
        System.out.println(result);
        assertTrue(result != null);
    }

    @Test
    public void testIfHasArrayToSplit() {
        String text = "C:\\Users\\Kristjan\\Desktop\\mandatory_4\\test.txt";
        TextAnalytics TestFile = new TextAnalytics(text);
        String[] result = TestFile.split_to_words();
        assertTrue(result != null);
    }

    @Test
    public void testLowerCaseWorking() {
        String sPath = "C:\\Users\\Kristjan\\Desktop\\mandatory_4\\test.txt";
        TextAnalytics TestFile = new TextAnalytics(sPath);
        String[] result = TestFile.words_to_lowercase();
        assertTrue(result != null);
    }

    @Test
    public void testIfCountTheWordsWorks() {
        String sPath = "C:\\Users\\Kristjan\\Desktop\\mandatory_4\\test.txt";
        HashMap<String, Integer> word_counter = new HashMap<>();
        TextAnalytics TestFile = new TextAnalytics(sPath);
        word_counter = TestFile.count_the_words();
        assertTrue(word_counter != null);
    }

}