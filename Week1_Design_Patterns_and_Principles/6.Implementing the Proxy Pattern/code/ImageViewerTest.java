
public class ImageViewerTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("dog.jpg");
        Image image2 = new ProxyImage("cat.jpg");
        Image image3 = new ProxyImage("dog.jpg"); // Cached reuse

        System.out.println("\n--- First Display ---");
        image1.display(); // Loads from server
        image2.display(); // Loads from server

        System.out.println("\n--- Second Display (should use cache) ---");
        image3.display(); // Loads from cache
    }
}
