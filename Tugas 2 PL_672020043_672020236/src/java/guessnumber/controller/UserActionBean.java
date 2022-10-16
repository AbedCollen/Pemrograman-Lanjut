/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessnumber.controller;

import guessnumber.services.ATMService;
import guessnumber.services.IATMService;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;

/**
 *
 * @author Abed
 */
@ManagedBean(name = "userActionBean")
@RequestScoped
public class UserActionBean {
    private int jumlah;
    private IATMService _atmService;
    private ATMService atmService;

    public UserActionBean() {
        _atmService = new ATMService();
    }
    
    public int getSaldo() {
        return _atmService.getSaldo();
    }
    
    public int getjumlah() {
        return jumlah;
    }
    
    public void setjumlah (int jumlah) {
        this.jumlah = jumlah;
    }
    
    public String peringatan() {
        if (jumlah % 50000 == 0) {
            return "";
        } else {
            return "<br>Jumlah uang harus kelipatan 50000, silahkan masukkan kembali";
        }        
    }
    
    public String peringatan2() {
        if (_atmService.getSaldo() - jumlah < 100000) {
            return "Jumlah saldo minimal 100000, tidak bisa tarik uang<br>";      
        } else {
            return "";
        }
    }
    
    public int setor() {
        atmService = new ATMService();
        int saldo = _atmService.getSaldo();
        if (jumlah % 50000 == 0) {
        saldo += jumlah;
        atmService.setSaldo(saldo);
        }
        return saldo;
    }
    
    public int tarik() {
        atmService = new ATMService();
        int saldo = _atmService.getSaldo();
        if (saldo > 100000) {
            if (jumlah % 50000 == 0) {
                if (saldo - jumlah >= 100000) {
                    saldo -= jumlah;
                    atmService.setSaldo(saldo);
                }                
            }
        }        
        return saldo;
    }
}
