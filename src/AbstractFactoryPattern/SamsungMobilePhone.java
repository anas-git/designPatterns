/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

/**
 *
 * @author DELL
 */
public class SamsungMobilePhone implements Electronics {
    
    @Override
    public void ElectronicsType() {
        System.out.println("Samsung:Mobile Phone Ordered.");
    }
    
}
