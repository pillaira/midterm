/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 *
 * @author srinivsi
 */
enum code{
    REJECTED,PENDING,PROCESSING,APPROVED}
public class StausUser 
{code code;
        public StausUser(code code)
        {this.code=code;

}
   public void statusDetail()
{
switch(code)
        {
    
    case ZERO: 
            System.out.println("REJECTED");
        break;
        case ONE: System.out.println("PENDING");
        break;
        case TWO:
        System.out.println("PROCESSING");
        break;
        case THREE: 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
 
}
