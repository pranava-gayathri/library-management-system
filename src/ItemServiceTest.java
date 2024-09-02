import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemServiceTest {


    @org.junit.Test

    public void test1(){
        ItemService itemService=new ItemService();
        Item book=new Book(1,"b1","raavan");
        Item ebook=new eBook(2,"e1","alchemist");
        itemService.addItem(book);
        itemService.addItem(ebook);

        assertEquals(itemService.totalCostUsingVisitor(),1000.5);


    }

}