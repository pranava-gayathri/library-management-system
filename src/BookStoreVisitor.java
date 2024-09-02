//public interface BookStoreVisitor {
//
//    double visit(Book book);
//    double visit(eBook ebook);
//
//}
public interface BookStoreVisitor<Item>{
    double visit(Item item);
}