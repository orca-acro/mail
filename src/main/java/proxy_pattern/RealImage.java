package proxy_pattern;

public class RealImage implements Image{
    String filename = "Cat_Playing_With_Dog";
    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }

    public void loadFromDisk() {
        System.out.println("Loading from disk " + filename);
    }
    public RealImage() {
        loadFromDisk();
    }
}
