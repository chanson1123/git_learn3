package binarysearch;

public class binarySearch{

    public int classicBinarySearch(int[] array, int target){
        if(array == null || array.length == 0){
            return -1;
        }
        int l = 0, r = array.length - 1;
        while(l <= r){
            int m = l + (r - l)/2;
            if( target == array[m] ){
                return m;
            } else if( target < array[m]){
                r = m -1;
            } else{
                l = m + 1;
            }
        }
        return -1;
    }


    public int firstOccr(int[] array, int target){
        if(array == null || array.length == 0){
            return -1;
        }
        int l = 0, r = array.length - 1;
        while(l < r - 1){
            int m = l + (r - l)/2;
            if(target >= array[m]){
                r = m;
            } else{
                l = m;
            }
        }
        if(target == array[l]){
            return l;
        }
        if(target == array[r]){
            return r;
        }
        return -1;
    }


    public int lastOccr(int[] array, int target){
        if(array == null || array.length == 0){
            return -1;
        }
        int l = 0, r = array.length - 1;
        while(l < r - 1){
            int m = l + (r - l)/2;
            if(target <= array[m]){
                l = m;
            } else {
                r = m;
            }
        }
        if (target == array[r]){
            return r;
        }
        if ( target == array[l]){
            return l;
        }
        return -1;
    }


    public int closestIndex(int[] array, int target){
        if(array == null || array.length == 0){
            return -1;
        }
        int l = 0, r = array.length - 1;
        while(l < r - 1){
            int m = l + (r - l)/2;
            if(target == array[m]){
                return m;
            } else if(target < array[m]){
                r = m;
            } else {
                l = m;
            }
        }
        if( Math.abs(target - array[l]) <= Math.abs(target - array[r])){
            return l;
        } else{
            return r;
        }
        return -1;
    }


    public int[] sortedMatrix(int[][] matrix, int target){
        if(matrx == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[]{-1,-1};
        }
        int m = matrix.length, n = matrix[0].length - 1;
        int l = 0, r = m * n - 1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(target == matrix[mid/n][mid%n]){
                return new int[]{mid/n, mid%n};
            } else if(target < matrix[mid/n][mid%n]){
                r = mid;
            } else{
                l = mid;
            }
        }
        return new int[]{-1,-1};
    }
}