/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author Abed
 */
public class Controller {
    private Akun model;
    private View view;

    public Controller(Akun model, View view) {
        this.model = model;
        this.view = view;
    }
    
    public void setAkunSaldo(float saldo){
        model.setSaldo(saldo);
    }
    
    public float getAkunSaldo(){
        return model.getSaldo();
    }
    
    public void updateView(){
        view.printCekSaldo(model.getSaldo());
    }
}