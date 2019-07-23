package com.APBCBS.api.TestUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnectionUtil {
	
	Connection conn = null;
	
	Statement stat = null;
	
	ResultSet resultSet =null;
	
	String natl_id = null;
	
	public String setUpConnection(String dburl, String dbusername, String dbpwd)
	{
		String query="select * from (select COD_CUST_NATL_ID from FCRHOST.CH_X_MOBILE_ACCT_XREF where cod_cust_typ='SBA' group by COD_CUST_NATL_ID having count(COD_CUST_NATL_ID) < 9) where rownum = 1";
				
		try
		{
			Class.forName("oracle.jdbc.OracleDriver").newInstance();
			
			conn = DriverManager.getConnection(dburl, dbusername, dbpwd);
			
			stat = conn.createStatement();
			
			resultSet = stat.executeQuery(query);
			
			resultSet.next();
			
			natl_id = resultSet.getString(1);
			
			System.out.println("The DB values is : " + natl_id);		
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return natl_id;
	}
	
	public String lkyA025(String dburl, String dbusername, String dbpwd)
	{
		String query="select * from (select cxma.COD_CUST_NATL_ID from FCRHOST.CH_ACCT_MAST am inner join FCRHOST.CH_X_MOBILE_ACCT_XREF cxma on am.COD_ACCT_NO = cxma.COD_ACCT_NO where cxma.COD_CUST_TYP='LKY' and cxma.COD_ACCT_TYPE='W' and am.cod_acct_stat='8' and am.BAL_AVAILABLE>0 order by am.DAT_ACCT_OPEN desc) where rownum=1";
				
		try
		{
			Class.forName("oracle.jdbc.OracleDriver").newInstance();
			
			conn = DriverManager.getConnection(dburl, dbusername, dbpwd);
			
			stat = conn.createStatement();
			
			resultSet = stat.executeQuery(query);
			
			resultSet.next();
			
			natl_id = resultSet.getString(1);
			
			System.out.println("The DB values is : " + natl_id);		
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return natl_id;
		
	}
	public String fkyA025(String dburl, String dbusername, String dbpwd)
	{
		String query="select * from (select cxma.COD_CUST_NATL_ID from FCRHOST.CH_ACCT_MAST am inner join FCRHOST.CH_X_MOBILE_ACCT_XREF cxma on am.COD_ACCT_NO = cxma.COD_ACCT_NO where cxma.COD_CUST_TYP='FKY' and cxma.COD_ACCT_TYPE='W' and am.cod_acct_stat='8' and am.BAL_AVAILABLE>0 order by am.DAT_ACCT_OPEN desc) where rownum=1";
				
		try
		{
			Class.forName("oracle.jdbc.OracleDriver").newInstance();
			
			conn = DriverManager.getConnection(dburl, dbusername, dbpwd);
			
			stat = conn.createStatement();
			
			resultSet = stat.executeQuery(query);
			
			resultSet.next();
			
			natl_id = resultSet.getString(1);
			
			System.out.println("The DB values is : " + natl_id);		
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return natl_id;
		
	}


}
