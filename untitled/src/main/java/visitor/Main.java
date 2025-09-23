package visitor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory(Arrays.asList(
                new File("doc.txt", 100),
                new File ("image.png", 200),
                new Directory(Arrays.asList(
                        new File("notes.txt", 50),
                        new File("archive.zip", 300)
                ))
        ));

        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        root.accept(searchVisitor);
        System.out.println("Text files found: " + searchVisitor.getMatchingFiles());

        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size: " + sizeVisitor.getTotalSize());
    }
}
