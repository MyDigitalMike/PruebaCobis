package Model;
import java.text.SimpleDateFormat; 
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.Table;

@Entity  
@Table(name="Libros")  
public class Book {
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    public  int Id;
    public String NombreLibro;
    public String Descripcion;
    public SimpleDateFormat FechaPublicacion = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    public int NumeroEjemplares;
    public float Costo;
    /*Getters And Setters*/
    /*Id*/
    public int GetBookId(){
        return Id;
    }
    public void SetBookId(int Id){
        Id = Id;
    }
    /*End Id*/
    /*Book Name*/
    public String GetBookName(){
        return NombreLibro;
    }
    public void SetBookName(String NombreLibro){
        NombreLibro = NombreLibro;
    }
    /*End Book Name*/
    /*Book Description*/
    public String GetBookDescription(){
        return Descripcion;
    }
    public void SetBookDescription(String Descripcion){
        Descripcion = Descripcion;
    }
    /*End Book Description*/
    /*Publish Date*/
    public SimpleDateFormat GetPublishDate(){
        return FechaPublicacion;
    }
    public void SetPublishDate(SimpleDateFormat FechaPublicacion){
        FechaPublicacion = FechaPublicacion;
    }
    /*End Publish Date*/
    /*Stock*/
    public int GetBookStock(){
        return NumeroEjemplares;
    }
    public void SetBookStock(int NumeroEjemplares){
        NumeroEjemplares = NumeroEjemplares;
    }
    /*End Stock*/
    /*Book Price*/
    public float GetBookPrice(){
        return Costo;
    }
    public void SetBookPrice(float Costo){
        Costo = Costo;
    }
    /*End Book Price*/
}
