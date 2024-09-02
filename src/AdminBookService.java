import java.util.ArrayList;
import java.util.List;

public class AdminBookService {
    private static final int variable = 0;
    List<Book> bookList=List.of(
            new Book("raavan","b1","amish","trivedi",300,"PaperBack",600.5),
            new Book("sita","b2","amish","trivedi",360,"PaperBack",500.5),
            new Book("ram","b3","amish","trivedi",400,"PaperBack",700.5));


    void addNewBook(Book book){
        bookList.add(book);


    }

    public double getPriceById(String id){
        return bookList.stream().filter(book->book.getId().equals(id)).
                mapToDouble(Book::getPrice).findFirst().getAsDouble();
    }

    public Book getBookById(String id){
        return bookList.stream().filter(book->book.getId().equals(id)).findFirst().orElse(null);
    }


}
