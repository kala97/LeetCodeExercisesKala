package com.kala.algorithm.dailycode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 690. 员工的重要性
 */

public class exercise690 {
    HashMap<Integer, Employee> map = new HashMap();

    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        int sum = dfs(id);
        return sum;
    }

    public int dfs(int id) {
        Employee employee = map.get(id);
        int sum = employee.importance;
        List<Integer> subordinates = employee.subordinates;
        for (Integer subordinate : subordinates) {
            sum += dfs(subordinate);
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}

