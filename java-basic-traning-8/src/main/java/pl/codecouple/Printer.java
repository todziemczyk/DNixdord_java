package pl.codecouple;

class Printer {

    private StringBuilder stringBuilder;

    public Printer(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    Printer(String text) {
        this.stringBuilder = new StringBuilder(text);
    }

    public String reverseString() {
        return stringBuilder.reverse().toString();
    }

    public int findIndexOf(String a) {
        return stringBuilder.indexOf(a);
    }

    public String deleteFrom(String a) {
        return stringBuilder.deleteCharAt(findIndexOf(a)).toString();
    }


    public int getLastIndexOfChar(String a) {
        return stringBuilder.lastIndexOf(a);
    }
}
