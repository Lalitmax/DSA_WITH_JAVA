public class Merge_sort_array_of_strings_recursivily {

    public static void mergeSort(String strArr[], int si, int ei){
        // base case
        if(si>=ei){
            return;
        }
        // find mid
        int mid = si+(ei-si)/2;
        // left part
        mergeSort(strArr,si,mid);
        // right part
        mergeSort(strArr,mid+1,ei);

        // merge
        merge(strArr,si,mid,ei);


    }

    public static void merge(String strArr[], int si, int mid , int ei){
        String strTemp[] = new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        // sort left and right part
        while(i<=mid && j<=ei){
            if(isSmaller(strArr[i],strArr[j])){
                strTemp[k++] = strArr[i++];
            }else{
                strTemp[k++] = strArr[j++]; 
            }
        }

        // bacha hua in left part
        while(i<=mid){
            strTemp[k++] = strArr[i++];
        }

        // bacha hua in right part
        while(j<=ei){
            strTemp[k++] = strArr[j++];
        }

        // copy temp into original array
        for(k=0,i=si; k<strTemp.length; k++,i++){
            strArr[i]=strTemp[k];
        }
    }


    public static boolean isSmaller(String str1, String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
    
        
        String strArr[]={"earth","sun","murcury","mars"};
        mergeSort(strArr,0,strArr.length-1);

        for(int i=0; i<strArr.length; i++){
            System.out.print(strArr[i]+" ");
        }

    
    
    }
}
