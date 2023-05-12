import java.time.LocalDate;

public class EscribirTest
{
    private  String titulo;
    private  int id;
    private  int version;
    private  EscribirTest versionDeTest;
    private LocalDate fecha;
    private String estado;
    private HistoriaDeUsuario historia;
    public EscribirTest(String titulo){
        this.titulo = titulo;
        this.estado = "en revisión";
        this.fecha = LocalDate.now();
    }
    
    public  String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
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
    
    public void setEscribirTestVer(EscribirTest test){
        versionDeTest = test;
    }
    
    public  EscribirTest getEscribirTestVer(){
        return versionDeTest;
    }
    
    public void setDate(LocalDate date){
        fecha = date;
    }
    
    public LocalDate getDate(){
        return fecha;
    }
    
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void setHistoria (HistoriaDeUsuario us){
        this.historia = us;
    }
    
    public HistoriaDeUsuario getHistoria (){
        return this.historia;
    }
}
