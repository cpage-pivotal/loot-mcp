package org.tanzu.lootmcp.loot;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class LootService {
    private static final String LOOT_TABLE = "Randomly generate treasure or loot to be discovered by a player";
    private static final String DIE_ROLL_PARAM = "Result of a 8-sided die roll, used to select the loot";

    @Tool(description = LOOT_TABLE)
    public String lootTable(@ToolParam(description = DIE_ROLL_PARAM) Integer dieRoll) {
        String[] loot = {
                "A succulent Green Plum",
                "A signed copy of Spring Boot in Action by Craig Walls",
                "A Raspberry Pie baked by DaShaun Carter",
                "A GemFire Necklace",
                "5,000 Tanzu Platform Units",
                "A posh squash labeled BOSH",
                "A golden Rabbit statue emblazoned with the initials MQ",
                "A magical Amulet of Service Binding"
        };
        return loot[dieRoll%8-1];
    }

}
