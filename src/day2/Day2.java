package day2;

public class Day2 {
    int[] intArray = new int[]{1,12,2,3,
            1,1,2,3,
            1,3,4,3,
            1,5,0,3,
            2,1,6,19,
            1,19,6,23,
            2,23,6,27,
            2,6,27,31,
            2,13,31,35,
            1,9,35,39,
            2,10,39,43,
            1,6,43,47,
            1,13,47,51,
            2,6,51,55,
            2,55,6,59,
            1,59,5,63,
            2,9,63,67,
            1,5,67,71,
            2,10,71,75,
            1,6,75,79,
            1,79,5,83,
            2,83,10,87,
            1,9,87,91,1,5,91,95,1,95,6,99,2,10,99,103,1,5,103,107,1,107,6,111,1,5,111,115,2,115,6,119,1,119,6,123,1,123,10,127,1,127,13,131,1,131,2,135,1,135,5,0,99,2,14,0,0};

    public void addition(int pos){
        int x=intArray[intArray[pos+1]];
        int y=intArray[intArray[pos+2]];
        intArray[intArray[pos+3]] = x+y;

    }

    public void multiplication(int pos){
        int x=intArray[intArray[pos+1]];
        int y=intArray[intArray[pos+2]];
        int z=x*y;
        intArray[intArray[pos+3]]= z;
    }

    public int day2part1(){
        intArray[1]=12;
        intArray[2]=2;
        process();
        System.out.println(intArray[0]+" "+intArray[1]+" "+intArray[2]+" "+intArray[3]);
        return intArray[0];
    }

    public void process(){
        for(int i=0;i>=0;i++){
            System.out.println(i+" --- "+ intArray[i]);
            if(decideOpcode(intArray[i], i)==99) {
                return;
            }else if(decideOpcode(intArray[i], i)==1){
                i+=3;
            }
        }
    }

    public int decideOpcode(int opCode,int pos){
        if (opCode==1){
            addition(pos);
            return 1;
        }else if(opCode==2){
            multiplication(pos);
            return 1;
        }else if(opCode==99){
            return 99;
        }
        else{
            return 0;
        }

    }
}
