package com.briup.crm.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.briup.crm.bean.SalChance;
import com.briup.crm.service.SalChanceService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/chance")
public class SaleChanceController {
	@Autowired
	private SalChanceService chanceSerice;
	
	@RequestMapping("/findSaleChance/{curPage}")
	public String findSaleChance(@PathVariable int curPage,HttpSession session) {
		PageInfo<SalChance> chanceInfo =
				chanceSerice.findSalChance(curPage, 5);
		session.setAttribute("chanceInfo", chanceInfo);
		return "sales/sales";
	}
	
	@RequestMapping("/findSaleChanceLike/{curPage}")
	public String findSaleChanceLike(@PathVariable int curPage,String custName,String region,HttpSession session) {
		PageInfo<SalChance> chanceInfo = 
				chanceSerice.findSalChanceLike(curPage, 5, custName, region);
		List<SalChance> list = chanceInfo.getList();
		for(SalChance chance:list) {
			System.out.println(chance.getChcCustName());
		}
		session.setAttribute("chanceInfo", chanceInfo);
		
		return "sales/sales";
	}
	@RequestMapping("/savaOrUpdate")
	@ResponseBody
	public String savaOrUpdate(SalChance chance) {
		System.out.println("chance: "+chance);
		chanceSerice.savaOrUpdate(chance);
		return "保存成功";
	}
	
	@RequestMapping("/findChanceById/{chanceId}")
	@ResponseBody
	public SalChance findChanceById(@PathVariable long chanceId) {
		SalChance chance = 
				chanceSerice.findChanceById(chanceId);
		return chance;
	}
	
	@RequestMapping("/deleteChanceById/{chanceId}")
	@ResponseBody
	public String deleteChanceById(@PathVariable long chanceId) {
		chanceSerice.deleteChanceById(chanceId);
		return "删除成功";
	}
	
	
	
}
