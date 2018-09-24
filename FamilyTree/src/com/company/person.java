package com.company;

import java.util.ArrayList;
import java.util.List;

public class person {
    private String name = "";
    private char sex= ' ';
    private String mother = "";
    private String father = "";
    private List<String> children = new ArrayList<String>();

    public boolean isPossibleRelation(String name)
    {
        if(this.name == name) {return false;}
        if(children.contains(name)) {return false;}
        if(this.mother == name) {return false;}
        if(this.father == name) {return false;}
        return true;
    }

    public void setFather(String name) {
        if (isPossibleRelation(name)) {
            this.father = name;
        }
    }

    public void setMother(String name) {
        if (isPossibleRelation(name)) {
            this.mother = name;
        }
    }

    public boolean setSex(char sex) {
        if (this.sex ==' ') {
            this.sex = sex;
            return true;
        }
        return false;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void addChild(String name)
    {
        if (isPossibleRelation(name)) {
            this.children.add(name);
        }
    }

    public String getName() {
        return name;
    }


    public char getSex()
    {
        return this.sex;
    }

    public String getMother()
    {
        return this.mother;
    }

    public String getFather()
    {
        return this.father;
    }

    public String[] getParents()
    {
        String[] tempArr = new String[2];
        tempArr[0] = this.mother;
        tempArr[1] = this.father;
        return tempArr;
    }

    public String[] getChildren()
    {
        String[] tempArr = new String[children.size()];
        tempArr = children.toArray(tempArr);
        return tempArr;
    }
}
