package ru.Voronuyk.com.CodingBat.Logic1;

public class AnswerCell {
    /*
Your cell phone rings. Return true if you should answer it.
Normally you answer, except in the morning you only answer if it is your mom calling. In all cases,
 if you are asleep, you do not answer.


answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false
     */
    public static void main(String[] args) {
        answerCell(false, false, false);
        answerCell(false, false, true);
        answerCell(true, false, false);
    }
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        boolean res ;
        if (isAsleep){
            res = false;
        }else if(isMorning & isMom){
            res = true;
        }else  if (isMorning == false ){
            res = true;
        }else{
            res =false;
        }
        System.out.println(res);
        return res;
    }
}
