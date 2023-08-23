/*


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.application1;

/**
 *
 * @author lohit
 */
public class Application1 {

    public static void main(String[] args) {
        int result=0;
        for(int i=100;i<=200;i++)
        {
            if(i%8==0)
                result+=i;
        }
        System.out.println("the sum of all digit between 100 and 200 is:"+result);
    }
}
        
