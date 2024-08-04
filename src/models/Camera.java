package models;

public class Camera {
    private String id;

    public Camera(String id) {
        this.id = id;
    }

    public Image captureImage(){
        System.out.println("capture Image at Camera");
        return new Image();
    }
}
