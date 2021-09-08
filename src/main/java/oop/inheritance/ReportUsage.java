package oop.inheritance;

public class ReportUsage {

    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report name", "report boby");
        System.out.println(text);

        System.out.println(gen(new HtmlReport()));
        System.out.println(gen(new JSONReport()));
    }

    public static String gen(TextReport report) {
        return report.generate("Report name", "report boby");
    }
}
