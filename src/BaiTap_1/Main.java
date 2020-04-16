/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap_1;

/**
 *
 * @author levan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Context context = new Context();
        
        System.out.println("Kết quả của phép cộng 75 + 12 là: ");
        context.setTinhToan(new Cong(), 75, 12);
        
        System.out.println("Kết quả của phép trừ 54 - 78 là: ");
        context.setTinhToan(new Tru(), 54, 78);
    }
    
}
