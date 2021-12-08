package function;

import java.util.function.Function;
import java.util.function.Predicate;

public class StrategyUsage {
    public boolean check(Predicate<String> pred, String s) {
        return pred.test(s);
    }

    public String transform(Function<String, String> fun, String s) {
        return fun.apply(s);
    }
}
