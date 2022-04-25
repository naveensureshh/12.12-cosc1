
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Before;
import org.junit.Test;    

public class TestFile {
//declaring workingDir variable
    private Path workingDir;

    @Before
    public void init() {
    	//path file location
        this.workingDir = Path.of("", "src/test/Exercise12_12.java");
    }
    
    @Test
    
    public void read() throws IOException {
    	//reading name of file
    	Path file = this.workingDir.resolve("Exercise12_12.java");
    	String content = Files.readString(file);
    	assertThat(content, is("file"));
    }
    

}    