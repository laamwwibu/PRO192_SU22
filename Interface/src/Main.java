/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VICTUS
 */
public class Main {

    public static void main(String[] args) {
        GetInput getData = new GetInput();
        //1. User choose base of input number
        int inputBase = getData.getBase("Enter input base: ");
        //2. User enter value of input number
        String inputValue = getData.getInputValue(inputBase);
        //3. User enter base of output number
        int outputBase = getData.getBase("Enter output base: ");
        //4. convert base of inputValue to base of output
        String outputValue = convertBase(inputBase, outputBase, inputValue);
        //5. Display output vavlue
        displayOutput(outputValue);
    }

}
