package function;

public class Run {
    public static void main(String[] args) {
        StrategyUsage usage = new StrategyUsage();
        System.out.println(
                "Результат работы: " + usage.check(str -> str.isEmpty(), "")
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        str -> str.startsWith("Fun"), "Functional interface"
                )
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        str -> str.contains("rn"), "Surname Name"
                )
        );

        System.out.println("Строка после преобразования " + usage.transform(s -> s.toUpperCase(), "ffsfsdfdfdds"));

        System.out.println(usage.transform(s -> s.concat("работает корректно"), "Строка после преобразования "));

        System.out.println("Строка после преобразования " + usage.transform(String::trim, " ddsd dasdas dadad dadadddq"));
    }
}
