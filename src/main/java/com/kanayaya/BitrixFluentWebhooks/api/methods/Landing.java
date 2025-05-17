package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.landing.*;

public class Landing {
    public final Demos demos;
    public final Template template;
    public final Site site;
    public final Role role;
    public final Landing landing;
    public final Repo repo;
    public final Block block;
    private final BitrixRestClient client;

    public Landing(BitrixRestClient client) {
        this.client = client;
        demos = new Demos(client);
        template = new Template(client);
        site = new Site(client);
        role = new Role(client);
        landing = new Landing(client);
        repo = new Repo(client);
        block = new Block(client);
    }


}