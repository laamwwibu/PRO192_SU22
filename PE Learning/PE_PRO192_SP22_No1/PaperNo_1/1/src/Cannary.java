/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mhieu
 */
public class Cannary {

    private String place;
    private int song;

    public Cannary() {

    }

    public Cannary(String place, int song) {
        this.place = place;
        this.song = song;

    }

    public String getPlace() {
        String s = "";
        for (int i = 0; i < place.length(); i++) {
            if (i <= 2 && Character.isUpperCase(place.charAt(i))) {
                s += (char) (place.charAt(i) + 32);
            } else {
                s += place.charAt(i);
            }

        }

        return s;

    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }

    

}
