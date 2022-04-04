public class Fibonacci{

    public static void Fib_sequence(int x) {

         int f_0 = 1;
         int f_1 =1;
         int f_2;

        while(x>0){
            
            f_2 = f_0 + f_1;
            f_0 = f_1;
            f_1 = f_2;

            if (x==0){
               System.out.println(f_2); 
            }
            Fib_sequence(x);
        }
    }

    public static void main(String[] args){

        Fib_sequence(3);


    }
}

/*
using namespace std;      
void printFibonacci(int n){    
    static int n1=0, n2=1, n3;    
    if(n>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
 cout<<n3<<" ";    
         printFibonacci(n-1);    
    }    
}    
int main(){    
    int n;    
    cout<<"Enter the number of elements: ";    
    cin>>n;    
    cout<<"Fibonacci Series: ";    
    cout<<"0 "<<"1 ";  
    printFibonacci(n-2);  //n-2 because 2 numbers are already printed    
     return 0;  
}  
*/