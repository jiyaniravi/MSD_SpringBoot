package com.af.msd.controller.address;

import com.af.msd.common.response.MSDResponse;
import com.af.msd.common.response.code.AddressResponse;
import com.af.msd.common.response.code.CommonResponse;
import com.af.msd.pojo.PinCode;
import com.af.msd.service.address.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("/GET_PIN_CODES_FOR_CITY/{cityId}")
    public MSDResponse getPinCodesForCity(@PathVariable int cityId){

        try {
            List<PinCode> pinCodes = addressService.getPinCodesByCityId(cityId);
            return new MSDResponse(AddressResponse.RETRIEVE_PIN_CODES_FOR_CITY_SUCCESS)
                    .withResponse(Collections.singletonMap("pinCodes",pinCodes))
                    .build();
        }catch (RuntimeException e){
            return new MSDResponse(AddressResponse.RETRIEVE_PIN_CODES_FOR_CITY_FAILURE).build();
        }
    }

    @RequestMapping("/SAVE_ADDRESS")
    public MSDResponse saveAddress(){
        return null;
    }
}
