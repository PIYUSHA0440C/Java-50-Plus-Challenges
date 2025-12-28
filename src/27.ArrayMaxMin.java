class ArrayMaxMin {
    public static void main(String[] args) {
        System.out.println("Welcome to the finder of min and max element in an array..........");
        int[] numArr = ArrayUtilities.inputArray();
        int max = maxNum(numArr);
        int min = miniNum(numArr);
        System.out.println("The maximum element in array is : "+max);
        System.out.println("The minimum element in the array is : "+min);
    }
    public static int miniNum(int[] numArray){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArray.length){
            if (min > numArray[i]){
                min = numArray[i];
            }
            i++;
        }
        return min;
//        int min = numArray[0];
//        int i = 1;
//        while(i < numArray.length){
//            if(min > numArray[i]){
//                min = numArray[i];
//                i++;
//            }
//        }
//        return min;
    }

    public static int maxNum(int [] numArray){
        if (numArray.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = numArray[0];
        int i = 1;
        while (i < numArray.length){
            if (max < numArray[i]){
                max = numArray[i];
                i++;
            }
        }
        return max;
    }
}

