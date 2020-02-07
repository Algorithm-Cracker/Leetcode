//ry

class Solution {
    public String multiply(String num1, String num2) {
        if(num1.compareTo("0") == 0 || num2.compareTo("0") == 0) return "0";
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        int add = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = arr2.length - 1; i >= 0; i --) {
            for(int j = arr1.length - 1; j >= 0; j--) {
                int sum;
                if(arr1.length + arr2.length - 2 - i - j < list.size()) {
                    sum = list.get(arr1.length + arr2.length - 2 - i - j) + (int)(arr2[i] - '0') * (int)(arr1[j] - '0') + add;
                    list.set(arr1.length + arr2.length - 2 - i - j, sum % 10);
                    add = sum / 10;
                }
                else {
                    sum = (int)(arr2[i] - '0') * (int)(arr1[j] - '0') + add;
                    list.add(sum % 10);
                    add = sum / 10;
                }
            }
            while(add != 0) {
                list.add(add % 10);
                add /= 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = list.size() - 1; i >= 0; i --) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
