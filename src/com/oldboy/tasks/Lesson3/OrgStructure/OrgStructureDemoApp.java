package com.oldboy.tasks.Lesson3.OrgStructure;

import com.oldboy.tasks.Lesson3.OrgStructure.InterfaceAndClasses.*;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class OrgStructureDemoApp {
    private static final String file_for_read = "src\\com\\oldboy\\tasks\\Lesson3\\OrgStructure\\Files\\BaseOrgStructure.csv";
    private static final File myFile = new File(file_for_read);

    public static void main(String[] args) throws IOException {

        OrgStructureParser parser = new OrgStructureParserImpl();
        System.out.println("\n--------------------- Генеральный директор ---------------------");
        try {
            Employee superBoss = parser.parseStructure(myFile);
            System.out.println(superBoss + "\n" + superBoss.getSubordinate());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n--------------------- Список сотрудников ---------------------");
        for (Map.Entry<Long, Employee> prn : ((OrgStructureParserImpl) parser).getCompanyStructure().entrySet()) {
            System.out.println(prn + " в подчинении человек: " +
                    prn.getValue().getSubordinate().size());
        }
    }
}
