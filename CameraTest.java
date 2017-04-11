import static org.junit.Assert.*;
import org.junit.*;

public class CameraTest {
  Photographer photographer;
  DigitalCamera cameraDigital;
  AnalogCamera cameraAnalog;

  @Before
  public void before() {
    photographer = new Photographer();
    cameraDigital = new DigitalCamera();
    cameraAnalog = new AnalogCamera();
  }

  @Test
  public void initialCameraSizeZero() {
    assertEquals(0, photographer.cameraCollectionLength() );
  }

  @Test
  public void addDigitalCamera() {
    photographer.addCamera(cameraDigital);
    assertEquals(1, photographer.cameraCollectionLength() );
  }

  @Test
  public void removeDigitalCamera() {
    photographer.addCamera(cameraDigital);
    photographer.addCamera(cameraDigital);
    photographer.removeCamera(cameraDigital);
    assertEquals(1, photographer.cameraCollectionLength() );
  }

  @Test
  public void addAnalogCamera() {
    photographer.addCamera(cameraAnalog);
    assertEquals(1, photographer.cameraCollectionLength() );
  }

  @Test
  public void removeAnalogCamera() {
    photographer.addCamera(cameraAnalog);
    photographer.addCamera(cameraAnalog);
    photographer.removeCamera(cameraAnalog);
    assertEquals(1, photographer.cameraCollectionLength() );
  }

  @Test
  public void printCameracollectionDetails() {
    photographer.addCamera(cameraDigital);
    assertEquals("xyz", photographer.showDetails() );
  }

}