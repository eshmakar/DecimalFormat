package com.test;
import java.text.DecimalFormat;

public class DecimalFormatt {
    public static void main(String[] args) {

//DecimalFormat d = new DecimalFormat();
 // d.setMaximumFractionDigits(2); максимум сколько цифр выводить после запятой
//  d.setMinimumFractionDigits(2); минимум сколько цифр выводить после запятой
 // System.out.println(d.format(5.9877)); 5,99

//1193. татарский (Россия): #,##0.00 ¤ -> -1 234,56 ₽ -> -1234.56
//624. татарский (Россия): #,##0 -> -1 235 -> -1235
//55. татарский (Россия): #,##0.### -> -1 234,56 -> -1234.56
//1762. татарский (Россия): #,##0 % -> -123 456 % -> -1234.56

// 123456789.01 (". ¤") -> 123456789, ₽
// 123456789.01 (".0 ¤") -> 123456789,0 ₽
// 123456789.01 (".00 ¤") -> 123456789,01 ₽
// 123456789.01 (",#.00 ¤") -> 1 2 3 4 5 6 7 8 9,01 ₽
// 123456789.01 (",#53.00 ¤") -> 1 2 3 4 5 6 7 8 9,0153 ₽
// 123456789.01 (",##.00 ¤") -> 1 23 45 67 89,01 ₽
// 123456789.01 (",###.## ¤") -> 123 456 789,01 ₽
// 123456789.01 (",###.00 ¤") -> 123 456 789,01 ₽
// 123456789.01 (",####.00 ¤") -> 1 2345 6789,01 ₽
// 123456789.01 (",#####.00 ¤") -> 1234 56789,01 ₽
// 123456789.01 (",##0%") -> 12 345 678 901%
// 123456789.01 ("¤ ,##0") -> ₽ 123 456 789

        String shablon = "¤ ,##0";
        DecimalFormat decimalFormat = new DecimalFormat(shablon);
        System.out.println(decimalFormat.format(123456789.01));















        //ПОЛУЧЕНИЕ ВСЕХ ВОЗМОЖНЫХ ВАРИАНТОВ ДЛЯ ВСЕВОЗМОЖНЫХ ЯЗЫКОВ
   /*     Locale[] locales = NumberFormat.getAvailableLocales();
        double myNumber = -1234.56;
        NumberFormat form;
        int count = 0;
        for (int j = 0; j < 4; ++j) {
            System.out.println("FORMAT");
            for (int i = 0; i < locales.length; ++i) {
                if (locales[i].getCountry().length() == 0) {
                    continue; // Skip language-only locales
                }
                System.out.print(++count + ". "+locales[i].getDisplayName());
                switch (j) {
                    case 0:
                        form = NumberFormat.getInstance(locales[i]);
                        break;
                    case 1:
                        form = NumberFormat.getIntegerInstance(locales[i]);
                        break;
                    case 2:
                        form = NumberFormat.getCurrencyInstance(locales[i]);
                        break;
                    default:
                        form = NumberFormat.getPercentInstance(locales[i]);
                        break;
                }
                if (form instanceof DecimalFormat) {
                    System.out.print(": " + ((DecimalFormat) form).toPattern());
                }
                System.out.print(" -> " + form.format(myNumber));
                try {
                    System.out.println(" -> " + form.parse(form.format(myNumber)));
                } catch (ParseException e) {
                }
            }
        }*/
    }
}
