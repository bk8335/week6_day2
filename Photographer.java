import java.util.*;

public class Photographer {
  
  private ArrayList<Printable> cameraCollection;

  public Photographer(){
    this.cameraCollection = new ArrayList<Printable>();
  }

  public int cameraCollectionLength() {
    return cameraCollection.size();
  }

  // public void addCamera(Printable printable){
  //   cameraCollection.add(camera);
  // }

  // public Printable removeCamera(Printable printable) {
  //   if(cameraCollectionLength() > 0 ) {
  //     return cameraCollection.remove(0);
  //   }
  //   return null;
  // }
}