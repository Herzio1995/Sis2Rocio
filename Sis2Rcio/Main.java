import java.util.ArrayList;
import java.time.LocalDate; 
public class Main
{
    private ArrayList<HistoriaDeUsuario>ListaHistorias = new ArrayList<HistoriaDeUsuario>();
    private ArrayList<EscribirTest>ListaTest = new ArrayList<EscribirTest>();
    public Main(){

    }

    public void CrearHistoria(String titulo, String yo, String requiero, String talQue, String condiciones, int complex, int importancia){
        HistoriaDeUsuario aux = new HistoriaDeUsuario(titulo, yo, requiero, talQue, condiciones,complex, importancia);
        if(BuscarVAnterior(titulo) == -1){
            aux.setDate(LocalDate.now());
            ListaHistorias.add(aux);
            aux.setId(ListaHistorias.size() - 1);
        }
        else {
            ListaHistorias.add(aux);
            aux.setId(BuscarVAnterior(titulo));
            aux.setVersion(ListaHistorias.get(BuscarVAnterior(titulo)).getVersion()+1);
            aux.setHistoriaVersion(ListaHistorias.get(BuscarVAnterior(titulo)));
        }
    }

    public  int BuscarVAnterior(String titulo){
        for(int i = 0; i < ListaHistorias.size(); i++){
            if(titulo.equals(ListaHistorias.get(i).getTitulo())){
                return i;
            }
        }
        return -1;
    }

    public  HistoriaDeUsuario getHistoriaDeLista(int index){
        return ListaHistorias.get(index);
    }
    
    public  HistoriaDeUsuario getUltimaHistoriaDeLista(){
        return ListaHistorias.get(ListaHistorias.size()-1);
    }
    
    public void CrearTest(String titulo){
        EscribirTest aux2 = new EscribirTest(titulo);
        
    }
}
