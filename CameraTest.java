import static org.junit.Assert.*;
import org.junit.*;

public class CameraTest {
  Photographer photographer;

  @Before
  public void before() {
    photographer = new Photographer("Batman");
  }

  @Test
  public void getPhotographerName() {
    assertEquals("Batman", photographer.getName() );
  }

  @Test
  public void initialCameraSizeZero() {
    assertEquals(0, photographer.cameraCollectionLength() );
  }
}