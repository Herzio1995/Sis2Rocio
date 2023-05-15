import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
public class MainTest extends junit.framework.TestCase{
    private Main main = new Main();
    private HistoriaDeUsuario aux;
    private TestC aux2;
    public MainTest(){
        main.CrearHistoria("escribir US", "programador", "_requiero_", "_talQue_", "_condiciones_", 3, 300);
        main.CrearTest("titulo");
        aux = main.getHistoriaDeLista(0);
        aux2 = new TestC("titulo");
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
        System.out.println(aux.getDate());
        assertEquals(myObj, aux.getDate());
    }
    
    @Test
    public void testTest(){
        assertEquals(-1,main.BuscarVAnterior("title"));
    }
    
    @Test
    public void testEstadoEnRevision(){
        TestC e = new TestC("titulo");
        assertEquals("en revisión", e.getEstado());
    }
    
    @Test
    public void testFechaTest(){
        LocalDate myObj = LocalDate.now();
        System.out.println(aux2.getDate());
        assertEquals(myObj, aux2.getDate());
    }
    
    @Test
    public void testDeberiaTenerUS(){
        aux2.setHistoria(aux);
        assertEquals(aux, aux2.getHistoria());
    }
}
