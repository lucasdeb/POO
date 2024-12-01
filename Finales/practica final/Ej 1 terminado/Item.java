public abstract class Item {
    // Atributos
    private String title;
    private int publishYear;
    // Constructores
    public Item(){}
    public Item(String title, int pYear){
        this.title= title;
        this.publishYear= pYear;
    }
    // Getters y Setters
    public String getTitle() {
        return this.title;
    }
    public int getPublishYear() {
        return this.publishYear;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    // Métodos restantes
    public abstract void displayDetails();
}
