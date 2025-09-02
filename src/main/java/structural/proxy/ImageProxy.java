package structural.proxy;

import structural.proxy.interfaces.Image;

public class ImageProxy implements Image {
    private String fileName;
    private HighResolutionImage realImage;
    public ImageProxy(String fileName) {
        this.fileName = fileName;
        System.out.println("ImageProxy: Created for " + fileName + ". Real image not loaded yet.");
    }
    private boolean checkAccess(String userRole) {
        System.out.println("ProtectionProxy: Checking access for role: " + userRole + " on file: " + fileName);
        // Simulate a basic access control rule
        return "ADMIN".equals(userRole) || !fileName.contains("secret");
    }

    @Override
    public void display(String userRole) {
        System.out.println("LoggingProxy: Attempting to display " + fileName + " at " + new java.util.Date());
        if (!checkAccess(userRole)) {
            System.out.println("ProtectionProxy: Access denied for " + fileName);
            return;
        }

        if (realImage == null) {
            System.out.println("ImageProxy: display() requested for " + fileName + ". Loading high-resolution image...");

            System.out.println("ImageProxy: Loading image for authorized access...");
            realImage = new HighResolutionImage(fileName);
        }
        else {
            System.out.println("ImageProxy: Using cached high-resolution image for " + fileName);
        }
        // Delegate the display call to the real image
        realImage.display();
        System.out.println("LoggingProxy: Finished displaying " + fileName + " at " + new java.util.Date());
    }

    @Override
    public void display() {

    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
