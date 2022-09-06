package day1_keep_all_folders.SocialMedia;

public class Picture {
    private final byte[] image;
    private final String extension;
    String caption;

    public byte[] getImage() {
        return image;
    }

    public String getExtension() {
        return extension;
    }

    public Picture(byte[] image, String extension, String caption) {
        this.image = image;
        this.extension = extension;
        this.caption = caption;
    }
}

