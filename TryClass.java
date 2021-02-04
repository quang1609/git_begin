/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_exception;

public class TryClass {
    public static void main(String[] args) {
        int demo=0;
        try{ 
            demo=demo+Integer.parseInt("abc");
            System.out.println(20/demo);
        }
        catch(NumberFormatException n){
            System.out.println("loi khong thuc hien duoc vi khong chuyen duoc du lieu");
        }
        catch(ArithmeticException a){
            System.out.println("lỗi mẫu số phải khác 0");
        }
        catch(Exception e){
            System.out.println("Lỗi "+e.getMessage());
            e.printStackTrace();
        }
    }
}
