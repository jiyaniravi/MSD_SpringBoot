package com.af.msd.controller.address;

import com.af.msd.common.response.MSDResponse;
import com.af.msd.common.response.code.CommonResponse;
import com.sun.tools.javac.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class AddressController {

    @RequestMapping("/GET_PIN_CODES_FOR_CITY")
    public MSDResponse getPinCodesForCity(){

        return new MSDResponse(CommonResponse.SUCCESS)
                        .withResponse(Collections.singletonMap("Key","Value"))
                        .withResponseList(List.of(
                                new MSDResponse().withCode(1).withMessage("1: Message").build(),
                                new MSDResponse().withCode(2).withMessage("2:Message ").build()
                        )).build();
    }

    @RequestMapping("/SAVE_ADDRESS")
    public MSDResponse saveAddress(){
        return null;
    }
}
