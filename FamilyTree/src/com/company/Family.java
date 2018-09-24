package com.company;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<String> names = new ArrayList<String>();
    private List<person> members = new ArrayList<person>();

    private person findPerson(String name)
    {
        return members.get(names.indexOf(name));
    }

    public boolean male(String name)
    {
        isMember(name);
        return findPerson(name).setSex('m');
    }

    public boolean female(String name)
    {
        isMember(name);
        return findPerson(name).setSex('f');
    }

    public boolean isMale(String name)
    {
        if(findPerson(name).getSex()=='m')
        {
            return true;
        }
        return false;
    }

    public boolean isFemale(String name)
    {
        if(findPerson(name).getSex()=='f')
        {
            return true;
        }
        return false;
    }

    public boolean setParent(String childName, String parentName)
    {
        person parent = findPerson(parentName);
        person child = findPerson(childName);
        if(parent.isPossibleRelation(childName))
        {
            if (parent.getSex() == 'f' && child.getMother() == "") {
                child.setMother(parentName);
                parent.addChild(childName);
                return true;
            } else if (parent.getSex() == 'm' && child.getFather() == "") {
                child.setFather(parentName);
                parent.addChild(childName);
                return true;
            } else if (child.getMother() == "" && child.getFather() == "") {
                //if parent sex is unknown and both parent are unknown
                return false;
            }
            if (child.getMother() == "") {
                child.setMother(parentName);
                parent.addChild(childName);
                parent.setSex('f');
                return true;
            }
            if (child.getFather() == "") {
                child.setFather(parentName);
                parent.addChild(childName);
                parent.setSex('m');
                return true;
            }
        }

        return false;
    }

    public String[] getParents(String childName)
    {
        return findPerson(childName).getParents();
    }

    public String[] getChildren(String parentName)
    {
        return findPerson(parentName).getChildren();
    }

    private void isMember(String name)
    {
        if(!names.contains(name))
        {
            names.add(name);
            members.add(new person());
            int location = names.indexOf(name);
            members.get(location).setName(name);
        }
    }
}
