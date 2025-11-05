package com.finance.fin_api.controller;


import com.finance.fin_api.model.Asset;
import com.finance.fin_api.model.Bond;
import com.finance.fin_api.model.Stock;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/assets")
public class AssetController {
    private final List<Asset> portfolio = List.of(
            new Bond("US912828K742", new BigDecimal("950000"), new BigDecimal("0.0375"), LocalDate.of(2030, 6, 15)),
            new Stock("US02079K3059", new BigDecimal("2800000"), "GOOGL", new BigDecimal("1.2"))
    );
    @GetMapping("/audit")
    public List<String> auditAll() {
        return portfolio.stream()
                .map(Asset::generateAuditLog)
                .toList();
    }
}