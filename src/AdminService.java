import java.util.ArrayList;
import java.util.List;

public class AdminService<T> {
    List<Book> bookList=new ArrayList<>();
    List<eBook> ebookList=new ArrayList<>();


    void addNewBook(T t){
        if(t instanceof Book)
            bookList.add((Book)t);
        if(t instanceof eBook)
            ebookList.add((eBook) t);
    }
}
