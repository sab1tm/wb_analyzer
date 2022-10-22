package com.sab1tm.wb_analyzer;

import com.sab1tm.wb_analyzer.data.menu.MenuEntity;
import com.sab1tm.wb_analyzer.services.MenuService;
import lombok.AllArgsConstructor;
import org.flywaydb.core.internal.util.AsciiTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Formatter;
import java.util.List;
import java.util.Locale;

@SpringBootApplication
@EnableFeignClients
@AllArgsConstructor
public class WbAnalyzerApplication implements CommandLineRunner {

    private final MenuService menuService;

    private static Logger LOG = LoggerFactory
            .getLogger(WbAnalyzerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WbAnalyzerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("START: menu updating");
        menuService.updateMenu();

        List<MenuEntity> menus = menuService.getAll();
        menus.forEach(m ->
                LOG.info("\t{}{}", String.format("%-30s", m.getName()), m.getNodes().size()));

        LOG.info("END: menu updating");
    }
}
