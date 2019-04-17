package io.github.coolitea.springbootwebservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KospiController {
	
    private Map<String, Company> companyMap;

	@GetMapping("/api/companies")    
	public Map<String, Company> getKospiCompanies(@RequestParam(name="reqRanking", required=false, defaultValue="") String reqRanking) {
		 System.out.println("[parameter] reqRanking : " + reqRanking); 

		companyMap = new HashMap<>();        
        
        Company company1 = new Company("005930", "삼성전자", 47050, 2808783);
        Company company2 = new Company("000660", "SK하이닉스", 80200, 583858);
        Company company3 = new Company("005935", "삼성전자우", 37950, 312286);
        Company company4 = new Company("005380", "현대차", 131000, 279905);
        Company company5 = new Company("051910", "LG화학", 371000, 261898);
        
        companyMap.put("1", company1);
        companyMap.put("2", company2);
        companyMap.put("3", company3);
        companyMap.put("4", company4);
        companyMap.put("5", company5);
        
        if (reqRanking.isEmpty()) {
        	return companyMap;        	
        } else {
        	Map<String, Company> map = new HashMap<>();
        	map.put(reqRanking, companyMap.get(reqRanking));
        	return map;
        }
    }
}
