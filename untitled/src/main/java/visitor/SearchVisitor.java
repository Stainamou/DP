package visitor;

import java.util.ArrayList;
import java.util.List;


public class SearchVisitor implements FileSystemVisitor {
    private final String extension;
    private final List<File> matchingFiles = new ArrayList<>();

    public SearchVisitor(String extension) {
        this.extension = extension;
    }

    @Override
    public void visit(File file) {
        if (file.name.endsWith(extension)) {
            matchingFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {

    }

    public List<File> getMatchingFiles() {
        return matchingFiles;
    }
}
