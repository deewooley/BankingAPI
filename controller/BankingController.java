package BankingAPI.BankingAPI.controller;

import BankingAPI.BankingAPI.model.Banking;
import BankingAPI.BankingAPI.service.BankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BankingController {
    @Autowired
    BankingService bankingService;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST, value = "/banking")
    public void addBanking(@RequestBody Banking banking){
        bankingService.addBanking(banking);
    }
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET,value = "/banking")
    public List<Banking> getAllBanking(){
        return bankingService.getAllBanking();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(method = RequestMethod.DELETE, value = "/banking/{id}")
    public void deleteBanking(@PathVariable Long id){
        bankingService.deleteBanking(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.PUT,value = "/banking/{id}")
    public void updateBanking(@RequestBody Banking banking, @PathVariable Long id){
        bankingService.updateBanking(id, banking);
    }
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET,value = "/banking/{id}")
    public Optional<Banking> getBankingByID(@PathVariable Long id){
        return bankingService.getBankingByID(id);
    }
}
