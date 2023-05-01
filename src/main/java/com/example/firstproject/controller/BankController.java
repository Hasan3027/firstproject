package com.example.firstproject.controller;

import com.example.firstproject.DB;
import com.example.firstproject.entity.Bank;
import com.example.firstproject.entity.Enums.Type;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class BankController {

    @RequestMapping(path = "/bank", method = RequestMethod.GET)
    public List<Bank> getAllBank() {
        return DB.banks;
    }

    @RequestMapping(path = "/bank/{id}", method = RequestMethod.DELETE)
    public String deleteBank(@PathVariable int id) {
        for (Bank bank : DB.banks) {
            if (bank.getId() == id) {
                DB.banks.remove(bank);
                return "Delete buldi";
            }
        }
        return "DELETE BULDI !";
    }

    @RequestMapping(path = "/bank", method = RequestMethod.POST)
    public String addBank(@RequestBody Bank bank) {
        if (bank.getAmount() == null && bank.getType() == null) {
            return "Iltimos oldin formani tuldiring !";
        }
        Bank.nextId++;
        bank.setId(Bank.nextId);
        DB.banks.add(bank);
        return "Muvafaqiyatli qushildi";
    }

    @RequestMapping(path = "/bank/{id}", method = RequestMethod.PUT)
    public String changeType(@PathVariable int id) {
        for (Bank bank : DB.banks) {
            if (bank.getId().equals(id)){
                switch (bank.getType()){
                    case CASH -> bank.setType(Type.CARD);
                    case CARD -> bank.setType(Type.PAY_ME);
                    case PAY_ME -> bank.setType(Type.BANK);
                    case BANK -> bank.setType(Type.CASH);
                }
                return "Uzgardi";
            }
        }
        return "Topilmadi bunaqa bank";
    }



}
