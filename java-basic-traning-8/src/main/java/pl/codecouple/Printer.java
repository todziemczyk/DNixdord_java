package pl.codecouple;

class Printer {

    private StringBuilder stringBuilder;

    Printer(String text) {
        this.stringBuilder = new StringBuilder(text);
    }

    public String reverseString() {
        return stringBuilder.reverse().toString();
    }

    public int findIndexOf(String a) {
        return stringBuilder.indexOf(a);
    }

    public StringBuilder deleteFrom(String a) {
        return stringBuilder.deleteCharAt(findIndexOf(a));
    }
}
