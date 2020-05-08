import java.io.*; 

  

class Main { 

      

    

    static void heapify(int a[], int n, int i) 

    { 

        int smallest = i;  

        int l = 2 * i + 1; 

        int r = 2 * i + 2; 

  

    

        if (l < n && a[l] < a[smallest]) 

            smallest = l; 

  

        
        if (r < n && a[r] < a[smallest]) 

            smallest = r; 

  


        if (smallest != i) { 

            int temp = a[i]; 

            a[i] = a[smallest]; 

            a[smallest] = temp; 

  

        

            heapify(a, n, smallest); 

        } 

    } 

  

    

    static void deletemin(int a[], int n) 

    { 

         

        for (int i = n / 2 - 1; i >= 0; i--) 

            heapify(a, n, i); 

  


        for (int i = n - 1; i >= 0; i--) { 

              

    

            int temp = a[0]; 

            a[0] = a[i]; 

            a[i] = temp; 

  

     

            heapify(a, i, 0); 

        } 

    } 

  

    

 static void printArray(int a[], int n) 

    { 

        for (int i = 0; i < n; ++i) 

            System.out.print(a[i] + " "); 

        System.out.println(); 

    } 

  

     

    public static void main(String[] args) 

    { 

        int a[] = { 2,10,3,1,4,8,5,6,11,9}; 

        int n = a.length; 

  

        deletemin(a, n); 

  

        System.out.println("Sorted array is "); 

        printArray(a, n); 

    } 
}