package com.shahed.javaee.service;

import com.shahed.javaee.dtos.FieldItem;
import com.shahed.javaee.entity.Person;
import com.shahed.javaee.jparepo.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
public class VueService {

    @Autowired
    private BaseRepository baseRepository;

    public List<FieldItem> getDynamicFieldList(){
        return Arrays.asList(
                new FieldItem("accountNumber",
                        "Account Number",
                        1,
                        "getAccountDetails",
                        1,
                        null,
                        "1401050001414",
                        "blur",
                        ""),
                new FieldItem("accountHolder",
                        "Account Holder",
                        2,
                        "",
                        1,
                        null,
                        "",
                        "",
                        ""),
                new FieldItem("accountCurrency",
                        "Account Currency",
                        3,
                        "",
                        1,
                        null,
                        "",
                        "",
                        ""),
                new FieldItem("routingNumber",
                        "Routing Number",
                        4,
                        "",
                        1,
                        null,
                        "",
                        "",
                        "")
        );
    }

    @Transactional
    public void save(Person person){
        baseRepository.save(person);
    }

}
