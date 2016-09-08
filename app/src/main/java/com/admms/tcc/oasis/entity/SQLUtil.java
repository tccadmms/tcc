package com.admms.tcc.oasis.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by DemonHide-RB on 9/7/2016.
 */
public class SQLUtil {
    private String str;

    public SQLUtil(String str) {
        this.str = str;
    }

    public List<String> parseSQL() {
        Boolean processStatement = true;

        List<String> listSQL = new ArrayList<String>();
        int posInsert;
        String newStatement;

        if (str != "") {
            while (processStatement) {

                posInsert = str.lastIndexOf("INSERT");

                if (posInsert == 0) {
                    processStatement = false;
                }

                newStatement = str.substring(str.lastIndexOf("INSERT"));
                listSQL.add(newStatement);

                str = str.replace("\r\n\r\n" + newStatement, "");

            }
        }

        Collections.reverse(listSQL);

        return listSQL;
    }

    public List<String> parseLine() {
        Boolean processStatement = true;

        List<String> listSQL = new ArrayList<String>();
        int posInsert;
        String newStatement;

        if (str != "") {
            while (processStatement) {

                posInsert = str.lastIndexOf("\r\n");

                if (posInsert < 0) {
                    processStatement = false;

                    listSQL.add(str);
                } else {

                    newStatement = str.substring(posInsert);

                    str = str.replace(newStatement, "");
                    newStatement = newStatement.replace("\r\n", "");

                    listSQL.add(newStatement);

                }
            }
        }

        Collections.reverse(listSQL);

        return listSQL;
    }
}
