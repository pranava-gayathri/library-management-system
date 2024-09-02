import java.util.List;

public abstract class Item {
    int itemId;
    String itemType;
    String itemTypeId;
    String itemTitle;

    public Item() {
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(String itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    abstract void details();

    public double accept(BookStoreVisitorImpl visitor){

        if(this instanceof Book) {
            AdminBookService adminBookService = new AdminBookService();
            Book b = adminBookService.getBookById(this.getItemTypeId());
            return visitor.visit(b);
        }
        if(this instanceof eBook){
            AdmineBookService admineBookService=new AdmineBookService();
            eBook b=admineBookService.geteBookById(this.getItemTypeId());
            return visitor.visit(b);
        }
        return 0;
    }


}
