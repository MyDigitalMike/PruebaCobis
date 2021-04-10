package Controller;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.CrossOrigin;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
import Model.Book;
import Service.BookService;
@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")  
public class Controller {
    @Autowired  
    private BookService bookservice;
    @PostMapping("save-book")  
    public boolean SaveBook(@RequestBody Book book) {  
         return bookservice.SaveBook(book);   
    }
    @GetMapping("book-list")  
    public List<Book> AllBooks() {  
         return bookservice.GetBooks();         
    }
    @DeleteMapping("delete-book/{Id}")  
    public boolean DeleteBook(@PathVariable("Id") int Id,Book book) {  
        book.SetBookId(Id);  
        return bookservice.DeleteBooks(book);  
    }
    @GetMapping("book/{Id}")  
    public List<Book> AllBooksById(@PathVariable("Id") int Id,Book book) {  
         book.SetBookId(Id);  
         return bookservice.GetBookByID(book);    
    }
    @PostMapping("update-book/{Id}")  
    public boolean UpdateBook(@RequestBody Book book,@PathVariable("Id") int Id) {  
        book.SetBookId(Id);  
        return bookservice.UpdateBook(book);  
    } 
}
