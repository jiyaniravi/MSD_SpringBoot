package com.af.msd.service.address;

import com.af.msd.dao.address.AddressDAO;
import com.af.msd.pojo.PinCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    AddressDAO addressDAO;

    @Override
    public List<PinCode> getPinCodesByCityId(int cityId) {
        if(cityId <= 0){
            throw new InvalidParameterException("cityId is Invalid");
        }

        return addressDAO.getPinCodesByCityId(cityId);
    }
}
