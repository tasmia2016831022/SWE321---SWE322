/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePattern.DVDPlayer;

/**
 *
 * @author Dell
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.playMovie();
        movie.stopMovie();
    }
}
