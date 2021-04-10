package DAO;
import Model.Book;
import java.util.List;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.query.Query;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;  
@Repository  
public class ImplementBookDao implements BookDao {
    @Autowired  
    private SessionFactory sessionFactory;
    @Override
    public boolean SaveBook(Book book) {
        boolean status=false;  
        try {  
           sessionFactory.getCurrentSession().save(book);  
           return status = true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    }
    @Override
    public List<Book> GetBooks() {
        Session currentSession = sessionFactory.getCurrentSession();  
        Query<Book> query=currentSession.createQuery("from Libros", Book.class);  
        List<Book> list=query.getResultList();  
        return list;  
    }

    @Override
    public boolean DeleteBooks(Book book) {
        boolean status=false;  
        try {  
            sessionFactory.getCurrentSession().delete(book);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    }

    @Override
    public boolean UpdateBook(Book book) {
        boolean status=false;  
        try {  
            sessionFactory.getCurrentSession().update(book);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status; 
    }

    @Override
    public List<Book> GetBookById(Book book) {
        Session currentSession = sessionFactory.getCurrentSession();  
        Query<Book> query=currentSession.createQuery("from Libros where Id=:Id", Book.class);  
        query.setParameter("Id", book.GetBookId());  
        List<Book> list=query.getResultList();  
        return list;  
    }
    
}
