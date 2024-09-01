
public class Main
{
    public static void main(String[] args)
    {

      AdminService adminService=new AdminService<>();
      Book newbook =new Book("raavan","b1","amish","trivedi",300,"PaperBack",600.5);
      eBook neweBook =new eBook("e1","alchemist","amish","trivedi",300,".pdf",600.5);
      adminService.addNewBook(newbook);
      adminService.addNewBook(neweBook);

      ItemService itemService=new ItemService();
      Item book=new Book(1,"b1","raavan");
      Item ebook=new eBook(2,"e1","alchemist");
      itemService.addItem(book);
      itemService.addItem(ebook);


     System.out.println(itemService.getBooks());
    }
}