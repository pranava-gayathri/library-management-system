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
