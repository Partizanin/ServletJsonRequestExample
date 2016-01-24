/**
 * Created with Intellij IDEA.
 * Project name: ServletJsonRequestExample.
 * Date: 24.01.2016.
 * Time: 16:03.
 * To change this template use File|Setting|Editor|File and Code Templates.
 */
public class Word {

    public String line;

    public Word(String line) {
        this.line = line;
    }


    @Override
    public String toString() {
        return "Word{" +
                "line='" + line + '\'' +
                '}';
    }
}
