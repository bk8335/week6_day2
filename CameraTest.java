import static org.junit.Assert.*;
import org.junit.*;

public class CameraTest {
  Photographer photographer;
  Camera camera;

  @Before
  public void before() {
    photographer = new Photographer();
    camera = new Camera(); 
  }

  @Test
  public void initialCameraSizeZero() {
    assertEquals(0, photographer.cameraCollectionLength() );
  }

  // @Test
  // public void addCamera() {
  //   photographer.addCamera(camera);
  //   assertEquals(1, photographer.cameraCollectionLength() );
  // }

  // @Test
  // public void removeCamera() {
  //   photographer.addCamera(camera);
  //   photographer.addCamera(camera);
  //   photographer.removeCamera(camera);
  //   assertEquals(1, photographer.cameraCollectionLength() );
  // }
}