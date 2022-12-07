/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class FolderProxy implements IFolder {
    private Folder folder;
    private User user;

    public FolderProxy(User user) {
        this.user = user;
        this.folder = new Folder();
    }
    
    

    @Override
    public void performOperations() {
        if (this.user.getLogin().equals("admin") && this.user.getPassword().equals("123")) {
            this.folder.performOperations();
        } else {
            throw new IllegalArgumentException("acesso indevido");
        }
        
    }
    
}
