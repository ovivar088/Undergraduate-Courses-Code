#include <iostream>
#include <cstring>
#include <vector>
/*
The #define creates a macro, the association of an identifier or
parametrized identifier with a token string. After the macro is defined
the compiler can substitue the token string for each occurence 
of the identifier in the source file.
*/
#define num_vertices 7
#define HIGH 999999
#define vert_cost 3

int main() {


    //We bout to get it started

//How many vertices
//int num_vertices = 7;
//FIRST - make the agacency matrix , for some reason the int num_vertices = 7 command is not compatible with matrix being made
    int adjacency_matrix[num_vertices][num_vertices] = 
    {
        {0, 7, 0, 5, 0, 0, 0}, //A
        {7, 0, 8, 9, 7, 0, 0}, //B
        {0, 8, 0, 0, 5, 0, 0}, //C
        {5, 9, 0, 0, 15, 6, 0}, //D
        {0, 7, 5, 15, 0, 8, 9}, //E
        {0, 0, 0, 6, 8, 0, 11}, //F
        {0, 0, 0, 0, 9, 11, 0}, //G
    };

    int vertex_array[num_vertices]; //ARRAY to keep track of 
    //std::cout << num_vertices << "\n" ;

    memset(vertex_array,false,sizeof(vertex_array)); //this array keeps track of which vertices have been included in model
    //Arbitrary vertex, in this case the first vertex is initialized
    vertex_array[0] = true; //vertices that are still FALSE are part of the 
    
    int n_edges = 0; //We have an edge count, should be num_vertices - 1 after completion of algorithm
    for(int k=0; k<7; k++)
        {
            std::cout<< vertex_array[k] << "\t";
        }
        std::cout <<"\n";
        std::cout << "The number of edges = " << n_edges << "\n";

    while(n_edges < num_vertices - 1)  //good till here
    {
        int min = HIGH; //will be checking edge count to this, sure
        
        int r=0; 
        int c=0; //May use this to pinpoint which vertices are in use

       
        for (int i=0; i <= num_vertices-1; i++) //check every vertex which is also good
        {
            if(vertex_array[i]) //if this vertex is actually a part of the system, good
            {
                for (int j=0; j<= num_vertices-1; j++) //check columns
                {
                    if (min > adjacency_matrix[i][j])
                    {
                        //This is necessary because we dont want to connect to the same vertex 
                        //Basically says: if vertex has not been used yet and matrix_val !=0 then we have a legit edge
                        if(!vertex_array[j] && adjacency_matrix[i][j]) 
                        {
                            min = adjacency_matrix[i][j]; //Changing min , loop will continue to check it with other weights in the row
                            r = i; //May not be neccesary
                            c = j; //Will be used to check off vertex array
                        }
                    }
                    
                }
                //At this point, we have checked every value in the row. we have our MINIMUM, we want to use this info to move to the appropriate vertex
                
                
            }
            //Since ATM we are keeping the foor loop for i, we need to increment n_edges before the loop ends, otherwise we wont stop iterating
            
        }
        vertex_array[c] = true; 
        n_edges++; 
        for(int k=0; k<7; k++)
        {
            std::cout<< vertex_array[k] << "\t";
        }
        std::cout <<"\n";
        std::cout << "The number of edges = " << n_edges << "\n"; 
       

    }




}