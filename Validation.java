package your.package.Utils;

/**
 * Created by jrvansuita on 17/11/15.
 */

public class Validation {

    private static final int[] weightCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
    private static final int[] weightCNPJ = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

    private static int computeDigit(String str, int[] weight) {
        int sum = 0;
        for (int index = str.length() - 1, digit; index >= 0; index--) {
            digit = Integer.parseInt(str.substring(index, index + 1));
            sum += digit * weight[weight.length - str.length() + index];
        }
        sum = 11 - sum % 11;
        return sum > 9 ? 0 : sum;
    }

    public static boolean isValidCPF(String cpf) {
        cpf = onlyNumbers((CharSequence)cpf);
        if ((cpf == null) || (cpf.length() != 11)) return false;

        Integer digitA = computeDigit(cpf.substring(0, 9), weightCPF);
        Integer digitB = computeDigit(cpf.substring(0, 9) + digitA, weightCPF);
        return cpf.equals(cpf.substring(0, 9) + digitA.toString() + digitB.toString());
    }

    public static boolean isValidCNPJ(String cnpj) {
        cnpj = onlyNumbers((CharSequence) cnpj);
        if ((cnpj == null) || (cnpj.length() != 14)) return false;

        Integer digitA = computeDigit(cnpj.substring(0, 12), weightCNPJ);
        Integer digitB = computeDigit(cnpj.substring(0, 12) + digitA, weightCNPJ);
        return cnpj.equals(cnpj.substring(0, 12) + digitA.toString() + digitB.toString());
    }
    
    public static String onlyNumbers(CharSequence s) {
        return s.toString().replaceAll("\\D+", "");
    }

}
