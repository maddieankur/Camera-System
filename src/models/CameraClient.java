package models;

public class CameraClient {
    private String clientId;

    public CameraClient(String clientId) {
        this.clientId = clientId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void onSuccess(Image image) {
        System.out.println(String.format("Received Image %s at client %s", image.getId(), this.getClientId()));
    }

    public void onFailure(Exception e){
        System.out.println(String.format("Error during capture for client  due to %s",e.getMessage()));
    }
}
