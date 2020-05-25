package Hacker_Rank_Problem_Solving;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;


public class Java_Reflection_Methods {
public static void main(String[] args){
                Class student = Student1.class;
                Method[] methods = student.getDeclaredMethods();

                ArrayList<String> methodList = new ArrayList<>();
                for(Method method:methods){
                    methodList.add(method.getName());
                }
                Collections.sort(methodList);
                for(Object name: methodList){
                    System.out.println(name);
                }
            }

        }


class Student1 {
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void anothermethod() {
    }
}