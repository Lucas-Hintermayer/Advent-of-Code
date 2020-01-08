package day4;

import java.util.ArrayList;
import java.util.List;

public class Day4 {

    int from=246540;
    int to=787419;

    public int day4part1(){
       return countDifferentPasswordsPart1();
    }
    public int day4part2(){
       return countDifferentPasswordsPart2();
    }

    public int countDifferentPasswordsPart1(){
        int count=0;
        ArrayList<Integer> listNumber=new ArrayList<>();
        for(int i=from;i<to;i++){
            listNumber=seperateInList(i);
            if(checkPasswordPart1(listNumber)){
                count++;
            }
        }
        return count;

    }

    public int countDifferentPasswordsPart2(){
        int count=0;
        ArrayList<Integer> listNumber=new ArrayList<>();
        for(int i=from;i<to;i++){
            listNumber=seperateInList(i);
            if(checkPasswordPart2(listNumber)){
                count++;
            }
        }
        return count;
    }

    public ArrayList<Integer> seperateInList(int z){
        ArrayList<Integer> list=new ArrayList<Integer>();
        int x=z;
        String text=z+"";
        String[] numberList=text.split("");
        for (int i=0;i<6;i++){
            //System.out.println(numberList[i]);
            list.add(Integer.parseInt(numberList[i]));
        }
        return list;
    }

    public boolean checkPasswordPart1(ArrayList<Integer> list){
        boolean isRising=true;
        boolean isOneDouble=false;
        for(int i=1;i<list.size();i++){
            if(list.get(i-1)>list.get(i)){
                isRising=false;
            }else if(list.get(i-1)==list.get(i)){
                isOneDouble=true;
            }
        }
        if(isRising&&isOneDouble){
           // System.out.println(list.toString());
            return true;
        }else {
            return false;
        }
    }

    public boolean checkPasswordPart2(ArrayList<Integer> list){
        boolean isRising=true;
        boolean isOneDouble=false;
        boolean isTwoChain=false;
        int lowestChain=0;
        for(int i=1;i<list.size();i++){
            if(list.get(i-1)>list.get(i)){
                isRising=false;

            }else if(list.get(i-1)==list.get(i)){
                isOneDouble=true;
                lowestChain++;
            }else if(lowestChain==1){
                isTwoChain=true;
               //System.out.println(list.toString());
            }
        }
        if(isRising&&isOneDouble&&isTwoChain){
            System.out.println(list.toString());

            return true;
        }else {
            return false;
        }
    }
}
