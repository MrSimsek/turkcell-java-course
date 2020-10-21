package com.denizsimsek;

import com.denizsimsek.classes.*;

enum Example{
    VALUE1,
    VALUE2,
    NONE_VALUE
 }

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person deniz = new Person("Deniz", 27, Gender.MALE);
        deniz.introduce();

        System.out.println("------------");

        Youtuber youtuber = new Youtuber(500);
        youtuber.introduce();

        Camera kodak = new Camera(100, "Kodak");
        youtuber.setCamera(kodak);

        System.out.println(youtuber.getName() + " is using " + youtuber.getCamera().getManufacturer() + " at zoom level of " + youtuber.getCamera().getZoomLevel());
    }
}
