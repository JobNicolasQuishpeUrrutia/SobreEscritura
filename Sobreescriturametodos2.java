package sobreescriturametodos2;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

class Vehiculo{
    private String marca;
    private String tecnologia;
    private int modelo;
    
    public Vehiculo(){
        marca="";
        tecnologia="";
        modelo=0;   
    }
    public Vehiculo(String marca,String tecnologia, int modelo){
        this.marca=marca;
        this.tecnologia=tecnologia;
        this.modelo=modelo;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getTecnologia(){
        return tecnologia;
    }
    public int getModelo(){
        return modelo;
    }
}
class Automovil extends Vehiculo{
    private String matriculaAutomovil;
    public Automovil(){
        super();
        matriculaAutomovil="Desconocido";
    }
    public Automovil(String marca,String tecnologia,int modelo){
        super(marca,tecnologia,modelo);
        matriculaAutomovil=" Desconocido";
     
    }
    public void setMatriculaAutomovil(String matriculaAutomovil){
        this.matriculaAutomovil=matriculaAutomovil;
    }
    public String getMatriculaAutomovil(){
        return matriculaAutomovil;
    }
    
    public void mostrarDatos(){
        System.out.println("Datos del Automóvil:\nMARCA DEL AUTOMÓVIL: "
                + getMarca()+ "\nTecnología:" + getTecnologia()+"\nMatrícula:"
                        + "---MATRÍCULA DEL AUTOMÓVIL---" + getMatriculaAutomovil());
        
    }
}


class ListadoPropietario extends Automovil{
    private String nombre;
    private String cedula;
    private String domicilio;
    private String edad;
    public ListadoPropietario(){
        super();
        nombre="";
        cedula="";
        domicilio="";
        edad="";
    }
    public ListadoPropietario(String marca,String tecnologia,int modelo){
        super(marca,tecnologia,modelo);
        nombre="";
        cedula="";
        domicilio="";
        edad="";
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
     public void setCedula(String cedula){
        this.cedula=cedula;
    }
    public String getCedula(){
        return cedula;
    }
     public void setDomicilio(String domicilio){
        this.domicilio=domicilio;
    }
     public String getDomicilio(){
        return domicilio;
    }
     public void setEdad(String edad){
        this.edad=edad;
    }
    public String getEdad(){
        return edad;
    }
    public void mostrarDatos(){
        System.out.println("Datos del Propietario: \nNOMBRE: " + getNombre()+"\nCédula:"+ getCedula()
                +"\nDomicilio:"+ getDomicilio()+"\nEdad:" +getEdad());
    }
}

class AutomovilAutonomo extends Automovil{
    private Calendar fechaComienzoFabricacionAutonomia;
    public AutomovilAutonomo(Calendar fechaComienzoFabricacionAutonomia){
        super();
        fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia; 
    }
    public AutomovilAutonomo(String marca,String tecnologia, int modelo,
            Calendar fechaComienzoFabricacionAutonomia){
        super(marca,tecnologia,modelo);
        this.fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia;
    }
    public Calendar getFechaComienzoFabricacionAutonomia(){
        return fechaComienzoFabricacionAutonomia;
    }
    public void mostrarDatos(){
        System.out.println("Datos del Automóvil Autónomo: \n MARCA DEL AUTOMÓVIL: "+
                getMarca()+"\n TECNOLOGÍA:"+getTecnologia()+
                "\n MATRÍCULA AUTOMÓVIL: "+getMatriculaAutomovil()+"\n FECHA DE FABRICACIÓN: "
                +fechaComienzoFabricacionAutonomia.getTime().toString());
    }
}
class ListadoAutomoviles{
    private ArrayList<Automovil>listadoAutomoviles;
    
    //Constructor
    public ListadoAutomoviles(){
        listadoAutomoviles=new ArrayList<Automovil>();
    }
    //METODOS
    public void addAutomovil(Automovil automovil){
        listadoAutomoviles.add(automovil);
    }
    //Cierremetodo add automovil
    public void Listar(){
        System.out.println("DATOS DE LOS AUTOMÓVILES EXISTENTES EN EL LISTADO:");
        for(Automovil tmp:listadoAutomoviles){
            tmp.mostrarDatos();
        }
    }
}
class ListadoPropietarios{
    private ArrayList<Automovil>listadoPropietarios;
    
    //Constructor
    public ListadoPropietarios(){
        listadoPropietarios=new ArrayList<Automovil>();
    }
    //METODOS
    public void addPropietario(Automovil automovil){
        listadoPropietarios.add(automovil);
    }
    //Cierremetodo add automovil
    public void Listar1(){
        System.out.println("");
        for(Automovil pt:listadoPropietarios){
            pt.mostrarDatos();
        }
    }
}
/**
 *
 * @author Junior Cangui y Nicolas Quishpe
 */
public class Sobreescriturametodos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Los meses van de 0 a 11, luego 10
        System.out.println("                                Universidad de las Fuerzas Armadas ESPE ");
        System.out.println("                                            Sede Latacunga");
        System.out.println("Asignatura: Programación [7450]");
        System.out.println("Docente: Ing. Guerra Cruz Luis Alberto");
        System.out.println("Integrantes: Junior Cangui --- Nicolás Quishpe");
        System.out.println("Carrera: Ingeniería Automotriz");
            System.out.println("Tema: SOBRE ESCRITURA DE MÉTODOS \n");
       
           int elegirlista=Integer.parseInt(JOptionPane.showInputDialog("Digíte\n [1]   LISTA: Datos de vehículos"
               + "\n [2]   LISTA: Datos de Propietarios\n [3]   SALIR"));
           
        switch(elegirlista){
        case 3:
                 System.out.println(" EJECUCIÓN FINALIZADA");
                 System.exit(0);
                 break;

        case 1:
            System.out.println("____________________________________________________________________");
            System.out.println("                    LISTA DE VEHÍCULOS");
            System.out.println("____________________________________________________________________");
               int opcion1=Integer.parseInt(JOptionPane.showInputDialog("Digíte\n [1]   FORD"
               + "\n [2]   NISSAN\n [3]   SALIR"));
           
               switch(opcion1){
       
           
        case 1:
        Automovil automovil1=new Automovil("Ford--","TECNOLOGÍA:Canadiense",2018);
                 automovil1.setMatriculaAutomovil(" Ontario ABZM-264-20");
                 ListadoAutomoviles listado1=new ListadoAutomoviles();
                 listado1.addAutomovil(automovil1);
                 listado1.Listar();
                 
                 break;
       
       case 2:
       
         Calendar fecha=Calendar.getInstance();
                  fecha.set(2019,10,22);
                  AutomovilAutonomo autonomo1=new AutomovilAutonomo("Nissan"," TECNOLOGÍA EUROPEA ",2020,fecha);
                  ListadoAutomoviles listado2=new ListadoAutomoviles();
                  listado2.addAutomovil(autonomo1);
                  listado2.Listar();
                 break;
       case 3:
                 System.out.println(" EJECUCIÓN FINALIZADA");
                 System.exit(0);
                 break;
          }
               break;
          
           
             case 2:
                 System.out.println("________________________________________________________________________");
                 System.out.println("                  LISTADO DE PROPIETARIOS");
                 System.out.println("________________________________________________________________________");
             int elegirpropietario=Integer.parseInt(JOptionPane.showInputDialog("Digite\n [1]   PROPIETARIO 1"
               + "\n [2]   PROPIETARIO 2 \n[3]   SALIR"));
             
      switch(elegirpropietario){
            case 1:
                 
                 ListadoPropietario propietario1=new ListadoPropietario();
                 System.out.println(" PROPIETARIO DEL VEHÍCULO FORD");
                 propietario1.setNombre(" Nico Quisphe");
                 propietario1.setCedula(" 1724421753");
                 propietario1.setDomicilio(" Calderón");
                 propietario1.setEdad(" 23");
                 
                 ListadoPropietarios listado3=new ListadoPropietarios();
                 listado3.addPropietario(propietario1);
                 listado3.Listar1();
               break;
            case 2:
                
                ListadoPropietario propietario2=new ListadoPropietario();
                System.out.println(" PROPIETARIO DEL VEHÍCULO NISSAN");
                 propietario2.setNombre(" Junior Cangui");
                 propietario2.setCedula(" 1724047392");
                 propietario2.setDomicilio(" Machachi");
                 propietario2.setEdad(" 21");
                 ListadoPropietarios listado4=new ListadoPropietarios();
                 listado4.addPropietario(propietario2);
                 listado4.Listar1();
                 
                 break;
            case 3:
                 System.out.println(" EJECUCIÓN FINALIZADA");
                 System.exit(0);
                 break;
        }
       }
      }
     }