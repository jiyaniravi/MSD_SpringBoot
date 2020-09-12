package com.af.msd.dao.rowmapper;

import com.af.msd.pojo.PinCode;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PinCodeMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new PinCode().withPinCodeId(rs.getInt("pincode_id"))
                .withCityId(rs.getInt("city_id"))
                .withPinCode(rs.getInt("pincode"))
                .withArea(rs.getString("area"))
                .build();
    }
}