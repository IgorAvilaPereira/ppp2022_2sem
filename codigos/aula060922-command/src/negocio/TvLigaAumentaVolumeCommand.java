/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class TvLigaAumentaVolumeCommand implements Command {
    private Tv tv;
    
    public TvLigaAumentaVolumeCommand(Tv tv){
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        this.tv.on();
        this.tv.setVolume(50);
    }

    @Override
    public void undo() {
        this.tv.off();
    }
    
}
