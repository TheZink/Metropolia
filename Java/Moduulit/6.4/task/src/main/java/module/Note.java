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
        System.out.println("Note: Title is saved: " + title);
        System.out.println("Note: Content is saved: " + content);
    }

    // Method to retrieve content from notebook
    public void retrieveContent() {
        String retrievedContent = notebook.getNote(title);
        this.content = retrievedContent;
        System.out.println("Note: Title is retrieved: " + title);
        System.out.println("Note: Content is retrieved: " + content);
    }

}
