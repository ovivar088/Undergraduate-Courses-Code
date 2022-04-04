#include <iostream>


int main(){

//Declare initial Fibonnaci Conditions
unsigned long int f0 = 1;
unsigned long int f1 = 1;
unsigned long int f2 = 2;

//What number are you interested in discovering
int number;
std::cout << "What Index of Fibonacci?" << "\n";
std::cin >> number ;



for(int i = 2; i <= number; i++){

f2 = f1 + f0;


if (i == number) {
std::cout << f2 << " ";
}

f0 = f1;
f1 = f2;


}
std::cout << "\n\n";
return 0;

}
