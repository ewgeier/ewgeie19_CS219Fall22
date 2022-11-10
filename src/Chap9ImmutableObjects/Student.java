package Chap9ImmutableObjects;

import java.sql.SQLOutput;

public class Student {

    // Classes encapsulate related data
    private String first; // Instance variables
    private String last;
    private String id;
    private String nickname;

    public Student(String first_, String last_, String id_, String nickname_){
        first = first_;
        last = last_;
        id = id_;
        nickname = nickname_;
    }



    public String toString(){
        return last + ", " + first + "(" + nickname + ")";
    }

}
