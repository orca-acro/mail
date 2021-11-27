package proxy_pattern;

public class ProxyImage implements Image{
    private String fileName;
    private RealImage realImage;

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage();
        }
    realImage.display();
    }
    public ProxyImage() {
        display();
    }
}
