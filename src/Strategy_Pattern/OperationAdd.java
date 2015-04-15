/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy_Pattern;

/**
 *
 * @author Sharon
 */
public class OperationAdd implements StrategyA{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 + num2;
   }
}
