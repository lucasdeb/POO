public abstract class Item{
    protected String title;
    protected int publishYear;

    Item(String tile, int publishYear){
        this.title = tile;
        this.publishYear = publishYear;
    }

    public int getPublishYear(){
        return this.publishYear;
    }

    public String getTitle(){
        return this.title;
    }

    public abstract void displayDetails();
}