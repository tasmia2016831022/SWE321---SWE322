/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern.MediaPlayer;

/**
 *
 * @author Dell
 */
public class VLCPlayer implements AdvanceMediaPlayer{

    @Override
    public void playVLC(String filename) {
        System.out.println("VLC file play: "+ filename);
    }

    @Override
    public void playMp4(String filename) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
