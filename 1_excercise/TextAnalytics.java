import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

    public class TextAnalytics{

    String file_path;
    String file_content;
    String[] array_of_words;
    HashMap<String, Integer> word_counter = new HashMap<>();

    public TextAnalytics(String _path){
        this.file_path = _path;

        this.read_file();
        this.split_to_words();
        this.words_to_lowercase();
        this.count_the_words();
    }

    public void read_file(){
        Path file_path = Paths.get(this.file_path);

        try {

        byte[] file_content_in_bytes = Files.readAllBytes(file_path);    
        String file_content_str = new String(file_content_in_bytes, StandardCharsets.UTF_8);
        this.file_content = file_content_str;
    
        } catch (IOException my_error_variable) {
            my_error_variable.printStackTrace();
        }
        
        
    }

    public void split_to_words(){
        this.array_of_words = this.file_content.split(" ");
    }

    public void words_to_lowercase(){
        for (int i = 0; i < this.array_of_words.length; i++) {
            String word_in_array = this.array_of_words[i];
            String word_in_lowercase = word_in_array.toLowerCase();
            this.array_of_words[i] = word_in_lowercase;
        }
    }

    public void count_the_words(){
        for (String word : this.array_of_words) {
            Integer oldCount = this.word_counter.get(word);
            if ( oldCount == null ) {
               oldCount = 0;
            }
            this.word_counter.put(word, oldCount + 1);
         }

         for (HashMap.Entry<String, Integer> entry : this.word_counter.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
}
}


}