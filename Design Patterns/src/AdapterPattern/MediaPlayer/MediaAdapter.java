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
public class MediaAdapter implements MediaPlayer{
    AdvanceMediaPlayer advanceMediaPlayer;
    String audioType;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc"))
            advanceMediaPlayer=new VLCPlayer();
        else if(audioType.equalsIgnoreCase("mp4"))
            advanceMediaPlayer= new Mp4Player();
    }
    
    

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc"))
            advanceMediaPlayer.playVLC(fileName);
        else if(audioType.equalsIgnoreCase("mp4"))
            advanceMediaPlayer.playMp4(fileName);
    }
    
}
