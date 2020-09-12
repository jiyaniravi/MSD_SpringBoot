package com.af.msd.service.address;

import com.af.msd.pojo.PinCode;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AddressService {
    List<PinCode> getPinCodesByCityId(int cityId);
}
