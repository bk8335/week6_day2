import java.util.*;

public class Photographer {
  
  private String name;
  private ArrayList<Camera> cameraCollection;

  public Photographer(String name){
    this.name = name;
    this.cameraCollection = new ArrayList<Camera>();
  }

  public String getName() {
    return this.name;
  }

  public int cameraCollectionLength() {
    return cameraCollection.size();
  }

  public void addCamera(Camera camera){
    cameraCollection.add(camera);
  }
}