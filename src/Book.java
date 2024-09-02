public class Book extends Item{

    String id;
    String title;
    String author;
    String publisher;
    long noOfPages;
    String paperType;
    double price;
    public Book(int itemId,String itemTypeId,String itemTitle) {

        this.itemType="Book";
        this.itemTypeId=itemTypeId;
        this.itemId=itemId;
        this.itemTitle=itemTitle;
    }

    public Book(String title, String id, String author, String publisher, long noOfPages, String paperType, double price) {
        this.title = title;
        this.id = id;
        this.author = author;
        this.publisher = publisher;
        this.noOfPages = noOfPages;
        this.paperType = paperType;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public long getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(long noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "itemId=" + itemId +
                ", itemType=" + itemType +
                ", itemTypeId=" + itemTypeId +

                '}';
    }

    @Override
    void details() {
        System.out.println(itemId + " "+ itemType + " "+itemTypeId+" ");
    }
}
