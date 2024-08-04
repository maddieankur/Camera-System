import models.CaptureRequest;
import models.TaskPriorityComparator;

import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueService {

    static PriorityBlockingQueue<CaptureRequest> imageCaptureRequestQueue;

    public QueueService() {
        if(this.imageCaptureRequestQueue == null){
            this.imageCaptureRequestQueue = new PriorityBlockingQueue<>(10,new TaskPriorityComparator());
        }
    }

    public PriorityBlockingQueue<CaptureRequest> getImageCaptureRequestQueue() {
        return this.imageCaptureRequestQueue;
    }

    public boolean haveImageRequest(){
        return !imageCaptureRequestQueue.isEmpty();
    }
}
