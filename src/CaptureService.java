import models.Camera;
import models.CaptureRequest;

import javax.swing.*;

public class CaptureService {

    private Camera camera;

    private QueueService queueService;

    CaptureService(){
        if(this.camera == null){
            this.camera = new Camera("global");
        }
        if(queueService == null){
            this.queueService = new QueueService();
        }
        Thread imageProcessor = new Thread(new ImageProcessor(queueService,camera));
        imageProcessor.start();
        return;
    }

    public Camera getCamera() {
        return camera;
    }

    void captureImage(CaptureRequest captureRequest){
        this.queueService.getImageCaptureRequestQueue().add(captureRequest);
    }


}
