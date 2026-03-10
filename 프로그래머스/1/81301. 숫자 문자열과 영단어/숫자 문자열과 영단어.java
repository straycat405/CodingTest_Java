class Solution {
    public int solution(String s) {
            StringBuilder sb = new StringBuilder();
            // startsWith로 스캔
            // 잡히는거 검출
            while (s.length() > 0) {
                if (s.startsWith("one")) {
                    sb.append("1");
                    s =  s.substring(3);
                } else if (s.startsWith("two")) {
                    sb.append("2");
                    s =  s.substring(3);
                } else if (s.startsWith("three")) {
                    sb.append("3");
                    s =  s.substring(5);
                } else if (s.startsWith("four")) {
                    sb.append("4");
                    s =  s.substring(4);
                } else if (s.startsWith("five")) {
                    sb.append("5");
                    s =  s.substring(4);
                } else if (s.startsWith("six")) {
                    sb.append("6");
                    s =  s.substring(3);
                } else if (s.startsWith("seven")) {
                    sb.append("7");
                    s =  s.substring(5);
                } else if (s.startsWith("eight")) {
                    sb.append("8");
                    s =  s.substring(5);
                } else if (s.startsWith("nine")) {
                    sb.append("9");
                    s =  s.substring(4);
                } else if (s.startsWith("zero")) {
                    sb.append("0");
                    s =  s.substring(4);
                } else if (s.startsWith("1")) {
                    sb.append("1");
                    s =  s.substring(1);
                } else if (s.startsWith("2")) {
                    sb.append("2");
                    s =  s.substring(1);
                } else if (s.startsWith("3")) {
                    sb.append("3");
                    s =  s.substring(1);
                } else if (s.startsWith("4")) {
                    sb.append("4");
                    s =  s.substring(1);
                } else if (s.startsWith("5")) {
                    sb.append("5");
                    s =  s.substring(1);
                } else if (s.startsWith("6")) {
                    sb.append("6");
                    s =  s.substring(1);
                } else if (s.startsWith("7")) {
                    sb.append("7");
                    s =  s.substring(1);
                } else if (s.startsWith("8")) {
                    sb.append("8");
                    s =  s.substring(1);
                } else if (s.startsWith("9")) {
                    sb.append("9");
                    s =  s.substring(1);
                } else if (s.startsWith("0")) {
                    sb.append("0");
                    s =  s.substring(1);
                }

            }

            // 영어면 숫자 변환
            // 숫자면 그대로 -> sb에 append
            // 기존 글자에서 앞부분 날리고 반복

            return Integer.parseInt(String.valueOf(sb));
    }
}