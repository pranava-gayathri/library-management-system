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

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
