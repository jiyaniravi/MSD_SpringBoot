package com.af.msd.dao.address;

import com.af.msd.pojo.PinCode;

import java.util.List;

public interface AddressDAO {
    List<PinCode> getPinCodesByCityId(int cityId);
}
