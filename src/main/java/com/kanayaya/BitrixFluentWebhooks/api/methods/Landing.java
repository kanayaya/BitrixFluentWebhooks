package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.landing.*;

public class Landing {
    public final Demos demos;
    public final Template template;
    public final Site site;
    public final Syspage syspage;
    public final Role role;
    public final com.kanayaya.BitrixFluentWebhooks.api.methods.landing.Landing landing;
    public final Repowidget repowidget;
    public final Repo repo;
    public final Block block;
    private final BitrixRestClient client;

    public Landing(BitrixRestClient client) {
        this.client = client;
        demos = new Demos(client);
        template = new Template(client);
        site = new Site(client);
        syspage = new Syspage(client);
        role = new Role(client);
        landing = new com.kanayaya.BitrixFluentWebhooks.api.methods.landing.Landing(client);
        repowidget = new Repowidget(client);
        repo = new Repo(client);
        block = new Block(client);
    }


}