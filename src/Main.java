import models.Camera;
import models.CameraClient;
import models.CaptureRequest;
import models.UrgencyLevel;

public class Main {

    static CaptureService captureService = new CaptureService();

    public static void main(String[] args) {
        CameraClient client1 = new CameraClient("client1");
        captureService.captureImage(new CaptureRequest("captureRequest1", client1, UrgencyLevel.LOW));
        captureService.captureImage(new CaptureRequest("captureRequest2", client1, UrgencyLevel.HIGH));

        CameraClient client2 = new CameraClient("client2");
        captureService.captureImage(new CaptureRequest("captureRequest1", client2, UrgencyLevel.LOW));
        captureService.captureImage(new CaptureRequest("captureRequest2", client2, UrgencyLevel.LOW));

        CameraClient client3 = new CameraClient("client3");
        captureService.captureImage(new CaptureRequest("captureRequest1", client3, UrgencyLevel.HIGH));
        captureService.captureImage(new CaptureRequest("captureRequest2", client3, UrgencyLevel.HIGH));
    }

    // tested scenario with changing the time taken for process image
}

