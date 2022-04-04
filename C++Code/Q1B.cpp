#include <iostream>
#include <cstring>
#include <vector>


#define num_vertices 3
#define HIGH 999999

int main() {


    //We bout to get it started

//How many vertices
//int num_vertices = 7;
//FIRST - make the agacency matrix , for some reason the int num_vertices = 7 command is not compatible with matrix being made
    int adjacency_matrix[num_vertices][num_vertices] = 
    {
        {0, 5, 6}, //1
        {5, 0, 1}, //2
        {6, 1, 0}, //3
    };

    int vertex_array[num_vertices]; //ARRAY to keep track of 
    //std::cout << num_vertices << "\n" ;

    memset(vertex_array,false,sizeof(vertex_array)); //this array keeps track of which vertices have been included in model
    //Arbitrary vertex, in this case the first vertex is initialized
    vertex_array[0] = true; //vertices that are still FALSE are part of the 
    
    int n_edges = 0; //We have an edge count, should be num_vertices - 1 after completion of algorithm
    for(int k=0; k<3; k++)
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
        for(int k=0; k<3; k++)
        {
            std::cout<< vertex_array[k] << "\t";
        }
        std::cout <<"\n";
        std::cout << "The number of edges = " << n_edges << "\n"; 
       

    }




}