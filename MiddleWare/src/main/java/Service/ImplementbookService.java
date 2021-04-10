package Service;
import java.util.List; 
import DAO.BookDao;
import Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service  
@Transactional  
public class ImplementbookService implements BookService{
    @Autowired  
    private BookDao bookdao;
    @Override
    public boolean SaveBook(Book book) {
        return bookdao.SaveBook(book); 
    }
    @Override
    public List<Book> GetBooks() {
        return bookdao.GetBooks();  
    }
    @Override
    public boolean DeleteBooks(Book book) {
        return bookdao.DeleteBooks(book);
    }
    @Override
    public boolean UpdateBook(Book book) {
        return bookdao.UpdateBook(book);  
    }
    @Override
    public List<Book> GetBookByID(Book book) {
        return bookdao.GetBookById(book);
    }
}
