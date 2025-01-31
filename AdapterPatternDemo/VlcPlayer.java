/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adopterpatterdemo;

/**
 *
 * @author Nikitha B V
 */
public class VlcPlayer implements AdvancedMediaPlayer 
{
    
    public void playVlc(String fileName) 
    {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
    
    public void playMp4(String fileName) 
    {
    //do nothing
    }
}
