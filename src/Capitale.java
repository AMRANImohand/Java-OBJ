public class Capitale extends Ville {
     
  private String monument;
    
  //Constructeur par défaut
  public Capitale(){
    super();    //Ce mot clé appelle le constructeur de la classe mère
    monument = "aucun";
  }    
      
  //Constructeur d'initialisation de capitale
  public Capitale(String nom, int hab, String pays, String monument){
    super(nom, hab, pays);
    this.monument = monument;
  }    
     
  public String decrisToi(){
    String str = super.decrisToi() + "\n \t ==>>" + this.monument + "en est un monument";

    return str;
    } 

  public String getMonument() {
    return monument;
  } 

  //Définit le nom du monument
  public void setMonument(String monument) {
    this.monument = monument;
  }
  
  public String toString(){
	  String str = super.toString() + "\n \t ==>>" + this.monument + " en est un monument";
	  return str;
	  }
}