class IsArraySorted {
    public static void main(String[] args) {
        System.out.println("Welcome to array sorting check-post....................");
        int[] numArr = ArrayUtilities.inputArray();
        boolean isDecreasing = isDecreasing(numArr);
        boolean isIncreasing = isIncreasing(numArr);
        if (isIncreasing){
            System.out.println("Array is sorted in Increasing Order.");
        }
        else if(isDecreasing){
            System.out.println("Array is sorted in Decreasing Order.");
        } else {
            System.out.println("Array is not sorted.");
        }

    }

    public static boolean isDecreasing(int[] numArr){
        int i = 0;
        while (i < numArr.length-1){
            if(numArr[i] < numArr[i+1]){
                return false;
            }
            i++;
        }
        return true;

    }

    public static boolean isIncreasing(int[] numArr){
        int i = 0;
        while (i < numArr.length-1){
            if (numArr[i] > numArr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }

}
