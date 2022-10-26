/*
C++ Program to Find Sum of left and right Diagonal Elements of Matrix
*/


#include <iostream>

using namespace std;

int
main ()
{
  int SIZE;
  cout << "Enter size: ";
  cin >> SIZE;
  int matrix[SIZE][SIZE];
  int sum_left = 0, sum_right = 0;
  cout << "Enter elements into the matrix \n";

  //Taking input into the Matrix and 
  //Adding if they are diagonal elements
  for (int i = 0; i < SIZE; i++)
    {
      for (int j = 0; j < SIZE; j++)
	{
	  cin >> matrix[i][j];
	  if (i == j)
	    sum_left += matrix[i][j];
	  if ((i + j) == SIZE - 1)
	    sum_right += matrix[i][j];
	}
    }

  cout << "Sum of Left Diagonal: " << sum_left << endl;
  cout << "Sum of Right Diagonal: " << sum_right << endl;

  return 0;
}

