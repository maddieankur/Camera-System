package models;

public class CaptureRequest {
    String id;
    CameraClient cameraClient;
    UrgencyLevel urgencyLevel;

    public CaptureRequest(String id, CameraClient cameraClient, UrgencyLevel urgencyLevel) {
        this.id = id;
        this.cameraClient = cameraClient;
        this.urgencyLevel = urgencyLevel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CameraClient getCameraClient() {
        return cameraClient;
    }

    public void setCameraClient(CameraClient cameraClient) {
        this.cameraClient = cameraClient;
    }

    public UrgencyLevel getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(UrgencyLevel urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }
}
