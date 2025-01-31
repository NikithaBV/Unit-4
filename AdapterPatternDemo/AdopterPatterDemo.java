/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adopterpatterdemo;

/**
 *
 * @author Nikitha B V
 */

public class AdopterPatterDemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","Badshah.mp3");
        audioPlayer.play ("mp4","VijayPrakash.mp4" ) ;
        audioPlayer.play("vIc","ShreyaGhoshal.vlc");
        audioPlayer.play("avi",".avi");
        

    }
    
}
