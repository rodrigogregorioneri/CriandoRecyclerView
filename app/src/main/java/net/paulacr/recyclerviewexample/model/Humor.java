package net.paulacr.recyclerviewexample.model;



/**
 * Created by Paula on 25/07/2015.
 */
public class Humor {

    private String title;
    private Integer icon;

    public Humor(String title, Integer icon) {
        this.title = title;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

}
