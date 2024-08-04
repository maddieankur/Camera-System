import models.Camera;
import models.CaptureRequest;
import models.Image;

import java.util.Calendar;
import java.util.Queue;

public class ImageProcessor implements Runnable{

    QueueService queueService;

    Camera camera;

    public ImageProcessor(QueueService queueService, Camera camera) {
        this.queueService = queueService;
        this.camera = camera;
    }

    @Override
    public void run() {
        try {
            while (true){
                if(queueService.haveImageRequest()) {
                    CaptureRequest captureRequest = this.queueService.getImageCaptureRequestQueue().poll();
                    processImageRequest(captureRequest);
                    Thread.sleep(3000);
                    // Change the time to change result.
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void processImageRequest(CaptureRequest captureRequest){
        Image capturedImage = camera.captureImage();
        if(null != capturedImage){
            // success callback
            capturedImage.setId(captureRequest.getId());
            captureRequest.getCameraClient().onSuccess(capturedImage);
        } else {
            // failure callback
            capturedImage.setId(captureRequest.getId());
            captureRequest.getCameraClient().onFailure(new Exception("Camera Not Working"));
        }
    }
}
