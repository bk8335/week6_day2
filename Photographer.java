import java.util.*;

public class Photographer {
  
  private ArrayList<Printable> cameraCollection;

  public Photographer(){
    this.cameraCollection = new ArrayList<Printable>();
  }

  public int cameraCollectionLength() {
    return cameraCollection.size();
  }

  public void addCamera(Printable camera){
    cameraCollection.add(camera);
  }

  public Printable removeCamera(Printable camera) {
    if(cameraCollectionLength() > 0 ) {
      return cameraCollection.remove(0);
    }
    return null;
  }

  public String showDetails() {
    String details = "";
    for(Printable camera : this.cameraCollection) {
      details += camera.printDetails() ;
    }
    return details;  
  }


}