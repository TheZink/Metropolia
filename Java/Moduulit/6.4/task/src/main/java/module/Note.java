package module;

public class Note {
    private String title;
    private String content;
    private Notebook notebook;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        this.notebook = new Notebook();

    }
    
    public void setTitle(String titleInput) {
        this.title = titleInput;
        System.out.println("User set title: " + titleInput);
        
    }

    public void setContent(String contentInput) {
        this.content = contentInput;
        System.out.println("User set content: " + contentInput);
    }

    public String getTitle() {
        return this.title;
    }
    
    public String getContent() {
        return this.content;
    }

    // Method to save content to notebook
    public void saveContent() {
        notebook.setNote(title, content);
        System.out.println("Content saved to notebook: " + title);
    }

    // Method to retrieve content from notebook
    public void getContent(Notebook notebook) {
        String retrievedContent = notebook.getNote(title);
        title = retrievedContent;
        System.out.println(title + " content retrieved from notebook");

    }

}
