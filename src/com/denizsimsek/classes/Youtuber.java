package com.denizsimsek.classes;

public class Youtuber extends Person {
    private int subscribersCount;
    private Camera camera;

    public Youtuber(String name, int age, int subscribersCount) {
        super(name, age, Gender.MALE);
        this.subscribersCount = subscribersCount;
    }

    public Youtuber(String name, int subscribersCount) {
        super(name);
        this.subscribersCount = subscribersCount;
    }

    public Youtuber(int subscribersCount) {
        this.subscribersCount = subscribersCount;
    }

    public int getSubscribersCount() {
        return subscribersCount;
    }

    public void setSubscribersCount(int subscribersCount) {
        this.subscribersCount = subscribersCount;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void introduce() {
        System.out.println("Hey guys, I am " + getName() + "!");
    }
}
