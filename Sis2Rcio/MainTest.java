import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
public class MainTest extends junit.framework.TestCase{
    private Main main = new Main();
    private HistoriaDeUsuario aux;
    public MainTest(){
        main.CrearHistoria("escribir US", "programador", "_requiero_", "_talQue_", "_condiciones_", 3, 300);
        aux = main.getHistoriaDeLista(0);    
    }

    @Test
    public void testEscribirHistoria(){
        assertNotNull(aux.getYo());
        assertNotNull(aux.getRequiero());
        assertNotNull(aux.getTalQue());
        assertNotNull(aux.getCondiciones());
        assertNotSame(0, aux.getComplex());
        assertNotSame(0, aux.getImportancia());   
    }
    
    @Test
    public void testVersion(){
        main.CrearHistoria("escribir US", "programador", "_requiero_", "_talQue_", "_condiciones_", 3, 300);        
        assertNotNull(main.getUltimaHistoriaDeLista().getHistoriaVersion());
    }
    
    @Test
    public void testFecha(){
        LocalDate myObj = LocalDate.now();
        assertEquals(myObj, aux.getDate());
    }
    
    @Test
    public void testTest(){
        assertEquals(-1,main.BuscarVAnterior("title"));
    }
}
