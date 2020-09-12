package com.af.msd.dao.address;

import com.af.msd.dao.rowmapper.PinCodeMapper;
import com.af.msd.pojo.PinCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AddressDAOImpl implements AddressDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<PinCode> getPinCodesByCityId(int cityId) {
        String query = "select * from tblm_pincode where city_id=?";
        return jdbcTemplate.query(query, new Object[] {cityId}, new PinCodeMapper());
    }
}
