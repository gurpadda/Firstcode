package July29;

public class EditableFile {
    private String filename ;

    public EditableFile(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
