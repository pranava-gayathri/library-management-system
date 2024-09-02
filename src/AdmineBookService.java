import java.util.List;

public class AdmineBookService {
    List<eBook> ebookList=List.of(
            new eBook("e1","alchemist","amish","trivedi",30,".pdf",400.0),
            new eBook("e2","java","amish","trivedi",20,".pdf",600.0),
            new eBook("e3","Clean Code","amish","trivedi",35,".pdf",900.0));
    void addNewBook(eBook ebook){
        ebookList.add(ebook);

    }
    public double getPriceById(String id){
        return ebookList.stream().filter(ebook->ebook.getId().equals(id)).
                mapToDouble(book-> book.getPrice()).findFirst().getAsDouble();
    }
    public eBook geteBookById(String id){
        return ebookList.stream().filter(book->book.getId().equals(id)).findFirst().orElse(null);
    }
}
