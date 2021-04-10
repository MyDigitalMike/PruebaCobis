package Service;
import java.util.List; 
import Model.Book;
public interface BookService {
    public boolean SaveBook(Book book);
    public List <Book> GetBooks ();
    public boolean DeleteBooks(Book book);
    public List<Book> GetBookByID(Book book);   
    public boolean UpdateBook(Book book);   
}
