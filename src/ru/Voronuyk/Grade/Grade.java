package ru.Voronuyk.Grade;

public class Grade {
    /*
    грудус между часовой и минутной стрелкой.
    */
    public static void main(String[] args) {

        int hour = (int) (Math.random() * 12);
        int minutes = (int) (Math.random() * 60);
        System.out.println("Время  "+hour+"."+minutes);
        System.out.println("градус между стрелками часов ="+grade(hour ,minutes));
    }

    public static int grade(int hour, int minutes){

        int gradeH = hour*(360/12)+ minutes*(30/60);
        int gradeM = minutes*(360/60);

        if (gradeH > gradeM) {
            return gradeH - gradeM;
        } else if (gradeH < gradeM) {
            return gradeM - gradeH;
        } else
            return  0;
    }
}


