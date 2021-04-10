package DAO;
import java.util.List;  
import Model.Book;
public interface BookDao {
    public boolean SaveBook(Book book);
    public List <Book> GetBooks ();
    public boolean DeleteBooks(Book book);
    public List<Book> GetBookById(Book book);  
    public boolean UpdateBook(Book book);
}
