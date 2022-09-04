package curso_java;

public class FuncoesString {
    public String toLowerCase(String string) {
        return string.toLowerCase();
    }

    public String toUpperCase(String string) {
        return string.toUpperCase();
    }

    public String removeSpaces(String string) {
        return string.trim();
    }

    public String getSubstring(String string, int position) {
        return string.substring(2);
    }

    public String replaceLetterInString(String string, String replaced, String replacer) {
        return string.replace(replaced, replacer);
    }

    public int getIndexOf(String string, String ocurrence) {
        return string.indexOf(ocurrence);
    }
}
