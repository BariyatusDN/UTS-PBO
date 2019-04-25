/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package remidiuts;

/**
 *
 * @author Bariyatus
 */
public class Komputer {
    private CPU cpu;
     
    
public Komputer(CPU cpu){
    this.cpu = cpu;
}
public Komputer(){

}
public void memasang (CPU cpu){
    System.out.println("CPU :" +cpu.getCPUData()+" dipasang");
}
public void mencabut(CPU cpu){
    System.out.println("CPU :" +cpu.getCPUData()+" dicabut");
    }
public void cetakInfo(CPU cpu){
    System.out.println("Spesfikasi : CPU : " +cpu.getCPUData());
}
}

