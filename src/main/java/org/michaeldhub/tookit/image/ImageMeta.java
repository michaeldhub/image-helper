package org.michaeldhub.tookit.image;

public class ImageMeta {
    private String naturalWidth;
    private String naturalHeight;
    private String themeColor;

    public ImageMeta() {
    }

    public ImageMeta(String naturalWidth, String naturalHeight, String themeColor) {
        this.naturalWidth = naturalWidth;
        this.naturalHeight = naturalHeight;
        this.themeColor = themeColor;
    }

    public String getNaturalWidth() {
        return naturalWidth;
    }

    public void setNaturalWidth(String naturalWidth) {
        this.naturalWidth = naturalWidth;
    }

    public String getNaturalHeight() {
        return naturalHeight;
    }

    public void setNaturalHeight(String naturalHeight) {
        this.naturalHeight = naturalHeight;
    }

    public String getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }
}
