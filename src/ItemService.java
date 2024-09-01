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

}
