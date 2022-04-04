#include <iostream>
#include <stdlib.h>
#include <stdio.h>

int adjacency[10][10], distance[10][10], n; //global reused variables

//Basic min function
int min(int a , int b)
{
    return (a<b) ? a:b; //else  
}
//Pathfinding and adjusting function
void path()
{
    int i,j,k;
    for(k=0;k<n;k++)
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                //Key to the Floyd Marshal algorithm
                distance[i][j] = min(distance[i][j],distance[i][k] + distance[k][j]);
            }
        }
    }
}

//Will prompt user to input matrix and call path algorithm
int main()
{
    int i,j;
    printf("\n Enter the number of vertices: ");
    scanf("%d", &n);//address of n, look into scan
    printf("\n Enter the adjacency/weight matrix:\n");
    //At this point we are just asking the user to give us the graph

    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d", &adjacency[i][j]);
            distance[i][j] = adjacency[i][j]; //Distance matrix is adjacency matrix
        }
    }
    path();
    printf("\n The Distance Matrix is : \n");
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            printf("%5d", distance[i][j]);
        }
        printf("\n");
    }
    int important;
    std::cout << "\n" << "Please input the vertex that is important :";
    std::cin >> important ;
    std::cout << "\n";
    //If a city is to go through city k , we need to add that cities respective distance from i.
    std::cout << "The following is the distance matrix through vertex : " << important << "\n";
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if( i != j )
            {
            printf("%5d", distance[i][j] + distance[i][important]);
            }
            else
            {
                 printf("%5d", distance[i][j]);
            }
        }
        printf("\n");
    }
}


//How could i optimize this to have must include  some cities.
//I think we would say that the adjacency matrix must include some value