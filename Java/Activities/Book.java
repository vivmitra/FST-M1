package Test;

abstract public class Book {
    String title;

    abstract void setTitle(String s);

    public String getTitle() {
        return title;
    }
}

class MyBook extends Book {

    public void setTitle(String s) {
        title = s;
    }
}
