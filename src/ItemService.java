import java.util.ArrayList;
import java.util.List;

public class ItemService {
    List<Item> items=new ArrayList<>();
    public void addItem(Item item){
        this.items.add(item);
    }
    public List<Item> getItems(){
        return this.items;
    }
    public List<Item> getBooks(){
        return items.stream().filter(item->item instanceof Book).toList();
    }

    public double cost(){
        double sum=0;
        AdminBookService adminBookService=new AdminBookService();
        AdmineBookService admineBookService=new AdmineBookService();
        for(Item item:items){
            if(item instanceof Book){
                sum+=adminBookService.getPriceById(item.getItemTypeId());
            }
            if(item instanceof eBook){
                sum+=admineBookService.getPriceById(item.getItemTypeId());
            }

        }

        return sum;

    }

    public double totalCostUsingVisitor(){
        BookStoreVisitorImpl visitor=new BookStoreVisitorImpl();
        double sum=0;
        for(Item item:items){
            sum=sum+item.accept(visitor);

        }
        return sum;

    }

}
