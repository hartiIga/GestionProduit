package org.sid.springmvc.web;

import org.sid.springmvc.dao.ProduitRepository;
import org.sid.springmvc.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProduitController {
    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping(path= "/index")
    public String index() {
        return "index";
    }

    @GetMapping(path= "/produits")
    public String listProduit(Model model,
                              @RequestParam(name="page", defaultValue = "0")int page,
                              @RequestParam(name="size", defaultValue = "5")int size,
                              @RequestParam(name="keyword", defaultValue = "")String keyword) {

        Page<Produit> pageProduits = produitRepository.findByNameContains(keyword, PageRequest.of(page, size));
        model.addAttribute("produits", pageProduits.getContent());
        model.addAttribute("pages", new int[pageProduits.getTotalPages()]);
        model.addAttribute("currentPage", page);
        model.addAttribute("keyword", keyword);
        model.addAttribute("size", size);
        return "produits";
    }

    @GetMapping(path= "/deleteProduit")
    public String delete(Long id, String keyword, int page, int size) {
        produitRepository.deleteById(id);
        return "redirect:/produits?page="+page+"&size="+size+"&keyword="+keyword;
    }

    @PostMapping(path= "/saveProduit")
    public String saveProduit(Produit p) {
        produitRepository.save(p);
        return "redirect:/produits";
    }

    @GetMapping(path="/formAddProduit")
    public String formAddProduit() {
        return "formAddProduit";
    }
}
