class Solution {
    public String solution(String s, int n) {
            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 65 && arr[i] <= 90) {
                    arr[i] += n;



                    if (arr[i] > 90 && arr[i] < 122) {

                        //만약 z를 넘어 a로 돌아갔다면
                        // z까지 도달한 분량을 제외한 나머지 분량을 65 / 97에 더하기
                        // z까지 도달한 분량 구하는법
                        int num = arr[i] - 90; //ex) W + 8 = 95 -> 95 - 90 = 5 (3만큼 이동하고 5만큼 더 이동해야함)
                        arr[i] = 64;
                        arr[i] += num;
                    }
                }
                if (arr[i] >= 97 && arr[i] <= 122) {
                    arr[i] += n;
                    if (arr[i] > 122) {
                        int num = arr[i] - 122;
                        arr[i] = 96;
                        arr[i] += num;
                    }
                }
            }
            return new String(arr);
    }
}