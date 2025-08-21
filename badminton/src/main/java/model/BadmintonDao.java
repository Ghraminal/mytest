package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DTO.ResvDTO;
import util.DBUtil;

public class BadmintonDao {
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;

    public void insertName(String resv_no, String resv_date, String court_no, String cust_no) {
        try {
            conn = DBUtil.getConnection();
            String sql = "INSERT INTO TBL_RESV(resv_no, resv_date, court_no , cust_no) VALUES(?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, resv_no);
            pstmt.setString(2, resv_date);
            pstmt.setString(3, court_no);
            pstmt.setString(4, cust_no);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, pstmt, rs);
        }
    }

    public List<ResvDTO> getAll() {
        List<ResvDTO> list = new ArrayList<ResvDTO>();
        try {
            conn = DBUtil.getConnection();
            String sql = "SELECT * FROM TBL_RESV";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                String resv_no = rs.getString("resv_no");
                String resv_date = rs.getString("resv_date");
                String cust_no = rs.getString("cust_no");
                String court_no = rs.getString("court_no");
                
                ResvDTO resvDto = new ResvDTO(resv_no, resv_date, cust_no, court_no);
                list.add(resvDto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, pstmt, rs);
        }
        return list;
    }
}
