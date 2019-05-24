/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.text.DecimalFormat;

/**
 *
 * @author frche1699
 */
public class Formatting {
    
    // public declarations
    public static DecimalFormat dfNum0 = new DecimalFormat("###,##0");
    public static DecimalFormat dfNum1 = new DecimalFormat("###,##0.0");
    public static DecimalFormat dfNum2 = new DecimalFormat("###,##0.00");
    public static DecimalFormat dfNum3 = new DecimalFormat("###,##0.000");
    public static DecimalFormat dfPressInHg = new DecimalFormat("#0.00");
    public static DecimalFormat dfPressHPa = new DecimalFormat("#000");
    
    public static void main(String[] args) {
        
    }
}
