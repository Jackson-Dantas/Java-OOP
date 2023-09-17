public class Book implements Publication{
    private String title;
    private String author;
    private int totPages;
    private boolean isOpen;
    private People reader;

    public Book(String title, String author, int totPages, boolean isOpen, People reader) {
        this.title = title;
        this.author = author;
        this.totPages = totPages;
        this.isOpen = isOpen;
        this.reader = reader;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title= '" + title + '\'' +
                ", author= '" + author + '\'' +
                ", totPages= " + totPages +
                ", isOpen= " + isOpen +
                ", reader= " + reader.getName() +
                '}';
    }

    public String details(){
        return "Nome do livro " + this.getTitle() +
                ", Autor " + this.getAuthor() +
                ", O total de páginas do livro é " + this.getTotPages() +
                ", este livro está sendo lido agora por  " + this.getReader().getName();
    }

    //Special methods

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotPages() {
        return totPages;
    }

    public void setTotPages(int totPages) {
        this.totPages = totPages;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public People getReader() {
        return reader;
    }

    public void setReader(People reader) {
        this.reader = reader;
    }

    @Override
    public void openBook() {
        this.setOpen(true);
    }

    @Override
    public void closeBook() {
        this.setOpen(false);
    }

    @Override
    public void browserPage() {

    }

    @Override
    public void advancePage() {

    }

    @Override
    public void rewindPage() {

    }
}
