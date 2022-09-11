/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projectconn;

import java.sql.*;

/**
 *
 * @author srira
 */
public class Connectionprovider {
      
    
      public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","*/7410");
            return Con;
        }
        catch(Exception e)
        {
         return null;   
        }
    }

    
    }
}
}
