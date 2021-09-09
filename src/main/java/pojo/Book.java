package pojo;

public class Book {

    private String name;
    private int countStr;

    public Book(String name, int countStr) {
        this.name = name;
        this.countStr = countStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountStr() {
        return countStr;
    }

    public void setCountStr(int countStr) {
        this.countStr = countStr;
    }
}
