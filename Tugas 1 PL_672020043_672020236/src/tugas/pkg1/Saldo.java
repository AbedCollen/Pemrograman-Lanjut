/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author LENOVO
 */
public class Saldo implements Atm{

    @Override
    public void fungsi() {
        Akun model = retrieveAkunFromDatabase();
        View view = new View();
        Controller controller = new Controller(model, view);
        
        controller.updateView();
    }
    private static Akun retrieveAkunFromDatabase(){
        Akun akun = new Akun();
        Tugas1 tugas1 = new Tugas1(); 
        akun.setSaldo(tugas1.saldo);
        return akun;
    }    
}