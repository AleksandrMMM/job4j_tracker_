package map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class CollegeTwo {
    private final Map<StudentTwo, Set<SubjectTwo>> students;

    public CollegeTwo(Map<StudentTwo, Set<SubjectTwo>> students) {
        this.students = students;
    }

    public Optional<StudentTwo> findByAccount(String account) {

        return students.keySet().stream()
                .filter(value -> value.getAccount().equals(account))
                .findFirst();
    }

    public Optional<SubjectTwo> findBySubjectName(String account, String name) {
        Optional<StudentTwo> s = findByAccount(account);
        Optional<SubjectTwo> sub = null;
        if (s.isPresent()) {
            Set<SubjectTwo> sb = students.get(s.get());
            sub = sb.stream().filter(ss -> ss.getName().equals(name))
                    .findFirst();

        }
        return sub;
    }
}