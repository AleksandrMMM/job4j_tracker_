package collection;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import java.util.Comparator;

import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenJobByNameDown() {
        Comparator<Job> cmpJobNameDown = new JobByNameDown();
        int rsl = cmpJobNameDown.compare(
                new Job("Fix bug", 2),
                new Job("Reboot server", 4)
        );
        assertThat(rsl, greaterThan(1));
    }

    @Test
    public void whenJobByNameUp() {
        Comparator<Job> cmpJobNameUp = new JobByNameUp();
        int rsl = cmpJobNameUp.compare(
                new Job("Fix bug", 2),
                new Job("Reboot server", 3)
        );
        assertThat(rsl, lessThan(1));
    }

    @Test
    public void whenJobByNameEqual() {
        Comparator<Job> cmpJobNameUp = new JobByNameUp();
        int rsl = cmpJobNameUp.compare(
                new Job("bug", 2),
                new Job("bug", 3)
        );
        assertThat(rsl, is(0));
    }

    @Test
    public void whenJobByPriorityDown() {
        Comparator<Job> cmpJobPriorityDown = new JobByPriorityDown();
        int rsl = cmpJobPriorityDown.compare(
                new Job("Reboot bug", 4),
                new Job("Fix server", 5)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenJobByPriorityUp() {
        Comparator<Job> cmpJobPriorityUp = new JobByPriorityUp();
        int rsl = cmpJobPriorityUp.compare(
                new Job("Reboot bug", 7),
                new Job("Fix server", 5)
        );
        assertThat(rsl, greaterThan(0));
    }

}