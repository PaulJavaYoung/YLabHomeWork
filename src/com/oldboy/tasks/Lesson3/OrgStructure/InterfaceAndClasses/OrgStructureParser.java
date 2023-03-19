package com.oldboy.tasks.Lesson3.OrgStructure.InterfaceAndClasses;

import java.io.File;
import java.io.IOException;

public interface OrgStructureParser {
    Employee parseStructure(File csvFile) throws IOException;
}
