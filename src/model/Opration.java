package model;

public class Opration {

    //perform the math opretion the mark this class
    
public int calculateTotal(int[]mark) {

    int total = 0;
    for (int i=0;i<mark.length;i++) {

        total=total+mark[i];
    }
return total;

}

public double calculateAverage(int total){

  double average=total/4;

  return average;

    }

 public int calculateMinMark(int []mark){
    int min=mark[0];
    for(int i=0;i<mark.length;i++){

        if(mark[i]<min){
            min=mark[i];
        }
    }
    return min;

 }

 public int calculateMaxMark(int []mark){

    int max=mark[0];
    for(int i=0;i<mark.length;i++){
        if(mark[i]>max){
            max=mark[i];
        }

    }
    return max;
 }






}




