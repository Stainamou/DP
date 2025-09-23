package visitor;

import java.util.List;

public class Directory implements FileSystemElement {
    public List<FileSystemElement> children;

    public Directory(List<FileSystemElement> children) {
        this.children = children;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
        for (FileSystemElement child : children) {
            child.accept(visitor);
        }
    }
}
