package com.shop.controller;

import com.shop.dto.ItemDto;
import com.shop.entity.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafExController {
    @GetMapping("/ex01")
    public String thymeLeafExample01(Model model){
        model.addAttribute("data","타임리프 예제 입니다.");
        return "thymeleafEx/thymeleafEx01";
    }

    @GetMapping("/ex02")
    public String thymeleafExample02(Model model) {
        ItemDto itemDto = new ItemDto();
                itemDto.setItemNm("테스트 상품1");
                itemDto.setItemDetail("상품 상세 설명");
                itemDto.setPrice(10000);
                itemDto.setRegTime(LocalDateTime.now());

        model.addAttribute("itemDto", itemDto);

        return "thymeleafEx/thymeleafEx02";
    }
}