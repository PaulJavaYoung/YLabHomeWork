package com.oldboy.tasks.Lesson3.OrgStructure.InterfaceAndClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OrgStructureParserImpl implements OrgStructureParser{

    private static Map<Long, Employee> companyStructure = new HashMap<>();

    @Override
    public Employee parseStructure(File csvFile){

        companyStructureLoad(csvFile);
        return getBigBossReturner();

    }

    public Map<Long, Employee> getCompanyStructure() {
        return companyStructure;
    }

    private static void companyStructureLoad(File csvFile){
        String regexCorrectFile = "id.+";
        Pattern firstStr = Pattern.compile(regexCorrectFile);

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String str;
            while ((str = br.readLine()) != null) {
                Matcher matcherForFirsStr = firstStr.matcher(str);
                if (!matcherForFirsStr.matches()) {

                    Long id = Long.parseLong(str.split(";")[0]);
                    Long boss_id = str.split(";")[1] == ""? null: Long.parseLong(str.split(";")[1]);
                    String name = str.split(";")[2];
                    String position = str.split(";")[3];

                    Employee employee = new Employee();

                    employee.setId(id);
                    employee.setBossId(boss_id);
                    employee.setName(name);
                    employee.setPosition(position);

                    companyStructure.put(id,employee);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Employee getBigBossReturner(){
        Set set = companyStructure.entrySet();
        Iterator i = set.iterator();

        Employee findBoss = null;

        while(i.hasNext()) {
            Map.Entry myStructCompany = (Map.Entry)i.next();
            Employee justAnEmployee = (Employee) myStructCompany.getValue();
            if(justAnEmployee.getBossId() != null){
                justAnEmployee.setBoss(companyStructure.get(justAnEmployee.getBossId()));
                companyStructure.get(justAnEmployee.getBossId()).getSubordinate().add(justAnEmployee);
            }

            if(justAnEmployee.getBossId() == null){
                findBoss = (Employee) myStructCompany.getValue();
            }
        }
        return findBoss;
    }
}