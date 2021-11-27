package proxy_pattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage();
        image.display();
        image.display();
    }
}
