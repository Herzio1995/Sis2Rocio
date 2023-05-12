import java.time.LocalDate;

public class HistoriaDeUsuario
{
    private  String titulo;
    private  String yo;
    private  String requiero;
    private  String talQue;
    private  String condiciones;
    private  int complex;
    private  int importancia;
    private  int id;
    private  int version;
    private  HistoriaDeUsuario versionDe;
    private LocalDate fecha;
    
    public HistoriaDeUsuario(String titulo, String yo, String requiero, String talQue, String condiciones, int complex, int importancia){
        this.titulo = titulo;
        this.yo = yo;
        this.requiero = requiero;
        this.talQue = talQue;
        this.condiciones = condiciones;
        this.complex = complex;
        this.importancia = importancia;
    }
    
    public  String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public  String getYo(){
        return yo;
    }
    
    public void setYo(String yo){
        this.yo = yo;
    }
    
    public  String getRequiero(){
        return requiero;
    }

    public void setRequiero(String requiero){
        this.requiero = requiero;
    }
    
    public  String getTalQue(){
        return talQue;
    }
    
    public void setTalQue(String talQue){
        this.talQue = talQue;
    }
    
    public  String getCondiciones(){
        return condiciones;
    }
    
    public void setCondiciones(String condiciones){
        this.condiciones = condiciones;
    }
    
    public  int getComplex(){
        return complex;
    }
    
    public void setComplex(int complex){
        this.complex = complex;
    }
    
    public  int getImportancia(){
        return importancia;
    }
    
    public void setImportancia(int importancia){
        this.importancia = importancia;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setVersion(int version){
        this.version = version;
    }
    
    public  int getVersion(){
        return version;
    }
    
    public void setHistoriaVersion(HistoriaDeUsuario us){
        versionDe = us;
    }
    
    public  HistoriaDeUsuario getHistoriaVersion(){
        return versionDe;
    }
    
    public void setDate(LocalDate date){
        fecha = date;
    }
    
    public LocalDate getDate(){
        return fecha;
    }
}
