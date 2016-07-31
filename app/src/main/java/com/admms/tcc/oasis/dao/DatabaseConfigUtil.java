package com.admms.tcc.oasis.dao;

import com.admms.tcc.oasis.entity.Avaliador;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.PlanoAcao;
import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by DemonHide-RB on 7/31/2016.
 */
public class DatabaseConfigUtil extends OrmLiteConfigUtil {

    //Anotações que podem ser encontradas dentro do site do ORMLite foram inseridas na íntegra aqui.

    private static final Class<?>[] tables = new Class[]{Avaliador.class, Estabelecimento.class, PlanoAcao.class};
    // Following code goes in your database configuration main method.
    private static final String ORMLITE_CONFIGURATION_FILE_NAME = "ormlite_config.txt";

    public static void main (String[] args) throws IOException, SQLException {
        /**
        * Full configuration path includes the project root path, and the location
        * of the ormlite_config.txt file appended to it.
        */
        File configFile = new File(new File("").getAbsolutePath()
                .split("app" +File.separator + "build")[0] + File.separator +
                "app" + File.separator +
                "src" + File.separator +
                "main" + File.separator +
                "res" + File.separator +
                "raw" + File.separator +
                ORMLITE_CONFIGURATION_FILE_NAME);
        try {
            writeConfigFile(configFile, tables);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
