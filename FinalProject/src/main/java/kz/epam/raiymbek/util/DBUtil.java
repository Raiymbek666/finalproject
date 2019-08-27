package kz.epam.raiymbek.util;

import java.io.IOException;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
public class DBUtil {
    private static final String DB_USERNAME="db.username";
    private static final String DB_PASSWORD="db.password";
    private static final String DB_URL ="db.url";
    private static final String DB_DRIVER_CLASS="driver.class.name";
    private static final String DB_MIN_IDLE= "db.minidle";
    private static final String DB_MAX_IDLE= "db.maxidle";

    private static Properties properties = null;
    private static BasicDataSource dataSource;
        static{
        try {
            properties = new Properties();
            properties.load(DBUtil.class.getClassLoader().getResourceAsStream("database.properties"));
            dataSource = new BasicDataSource();
            dataSource.setDriverClassName(properties.getProperty(DB_DRIVER_CLASS));
            dataSource.setUrl(properties.getProperty(DB_URL));
            dataSource.setUsername(properties.getProperty(DB_USERNAME));
            dataSource.setPassword(properties.getProperty(DB_PASSWORD));
            dataSource.setMinIdle(Integer.parseInt(properties.getProperty(DB_MIN_IDLE)));
            dataSource.setMaxIdle(Integer.parseInt(properties.getProperty(DB_MAX_IDLE)));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource(){
        return dataSource;
    }
}