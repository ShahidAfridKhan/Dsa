package arrays;

    class Solution {
        public static int findSecondHighest(int[] arr) {

            int highest = Integer.MIN_VALUE;
            int secondHighest = Integer.MIN_VALUE;

            for(int i=0;i<arr.length;i++){
                if(arr[i]>highest){
                    highest=arr[i];
                }
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]>secondHighest && arr[i]!=highest){
                    secondHighest=arr[i];
                }
            }
            if (secondHighest == Integer.MIN_VALUE) {
                return -1;
            }

            return secondHighest;
        }

        public static void main(String[] args) {
            int[] visitors = {120, 450, 300, 450, 200};
            System.out.println(findSecondHighest(visitors));
        }
    }

