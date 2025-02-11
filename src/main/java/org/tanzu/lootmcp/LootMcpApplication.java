package org.tanzu.lootmcp;

import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.ToolCallbacks;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.tanzu.lootmcp.loot.LootService;

import java.util.List;

@SpringBootApplication
public class LootMcpApplication {

    public static void main(String[] args) {
        SpringApplication.run(LootMcpApplication.class, args);
    }

    @Bean
    public List<ToolCallback> registerTools(LootService lootService) {
        return List.of(ToolCallbacks.from(lootService));
    }

}
