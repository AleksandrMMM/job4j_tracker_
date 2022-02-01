package map;

import java.util.Objects;

public class SubjectTwo {
    private String name;

    private int score;

    public SubjectTwo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectTwo subject = (SubjectTwo) o;
        return Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
