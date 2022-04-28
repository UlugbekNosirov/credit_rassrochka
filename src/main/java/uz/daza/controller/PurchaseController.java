package uz.daza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uz.daza.dto.PurchaseDto;
import uz.daza.service.purchase.PurchaseService;

import java.io.IOException;

@Controller
@RequestMapping("/")
public class PurchaseController {

    private final PurchaseService service;

    public PurchaseController(PurchaseService service) {
        this.service = service;
    }

    @RequestMapping(value = "purchase/", method = RequestMethod.GET)
    private String createPage() {
        return "/purchase";
    }

    @RequestMapping(value = "purchase/", method = RequestMethod.POST)
    private String create(@ModelAttribute PurchaseDto dto) throws IOException {
        service.create(dto);
        return "redirect:/Salom/";
    }
}
