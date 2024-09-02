//public class BookStoreVisitorImpl implements BookStoreVisitor{
//    @Override
//    public double visit(Book book) {
//        return book.getPrice();
//    }
//
//    @Override
//    public double visit(eBook ebook) {
//        return ebook.getPrice();
//    }
//}
public class BookStoreVisitorImpl implements BookStoreVisitor<Item>{



    @Override
    public double visit(Item item) {

        return switch (item){
            case Book book-> book.getPrice();
            case eBook ebook-> ebook.getPrice();
            default -> 0;
        };
    }
}