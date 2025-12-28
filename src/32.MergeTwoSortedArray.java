class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("Merging sorted array............");
        int[] arr1 = ArrayUtilities.inputArray();
        int[] arr2 = ArrayUtilities.inputArray();
        int[] mergedArray = merge(arr1, arr2);
        System.out.print("Your merged array is : ");
        ArrayUtilities.displayArray(mergedArray);

    }

    public static int[] merge(int[] arr1, int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] mergedArray = new int[newSize];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length){
            if (j == arr2.length ||
                    (i < arr1.length && arr1[i] < arr2[j])) {
                mergedArray[k] = arr1[i];
                i++;
                k++;
            } else {
                mergedArray[k] = arr2[j];
                k++;
                j++;
            }
        }

        return mergedArray;
    }

}
