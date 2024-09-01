public class eBook extends Item{


    String id;
    String title;
    String author;
    String publisher;
    long fileSize;
    String fileType;
    double price;

    public eBook(int itemId,String itemTypeId,String itemTitle) {

        this.itemType="eBook";
        this.itemTypeId=itemTypeId;
        this.itemId=itemId;
        this.itemTitle=itemTitle;
    }

    public eBook(String id, String title, String author, String publisher, long fileSize, String fileType, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.fileSize = fileSize;
        this.fileType = fileType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "eBook{" +
                "itemId=" + itemId +
                ", itemType='" + itemType + '\'' +
                ", itemTypeId='" + itemTypeId + '\'' +

                '}';
    }

    @Override
    void details() {
        System.out.println("ebook");
    }
}
