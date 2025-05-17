package com.kanayaya.BitrixFluentWebhooks.api;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Iblock;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Server;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Timeman;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Access;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Configuration;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Log;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Documentgenerator;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Bizproc;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Voximplant;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Mailservice;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Department;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Event;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Tasks;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Events;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Userfieldtype;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Crm;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Socialnetwork;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Calendar;
import com.kanayaya.BitrixFluentWebhooks.api.methods.App;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Imopenlines;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Sonet_group;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Im;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Ai;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Messageservice;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Userconsent;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Sale;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Disk;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Landing;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Task;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Userfieldconfig;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Telephony;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Placement;
import com.kanayaya.BitrixFluentWebhooks.api.methods.User;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Entity;
public class Invoker {
    private final BitrixRestClient client;
    public final Iblock iblock;
    public final Server server;
    public final Timeman timeman;
    public final Access access;
    public final Configuration configuration;
    public final Log log;
    public final Documentgenerator documentgenerator;
    public final Bizproc bizproc;
    public final Voximplant voximplant;
    public final Mailservice mailservice;
    public final Department department;
    public final Event event;
    public final Tasks tasks;
    public final Events events;
    public final Userfieldtype userfieldtype;
    public final Crm crm;
    public final Socialnetwork socialnetwork;
    public final Calendar calendar;
    public final App app;
    public final Imopenlines imopenlines;
    public final Sonet_group sonet_group;
    public final Im im;
    public final Ai ai;
    public final Messageservice messageservice;
    public final Userconsent userconsent;
    public final Sale sale;
    public final Disk disk;
    public final Landing landing;
    public final Task task;
    public final Userfieldconfig userfieldconfig;
    public final Telephony telephony;
    public final Placement placement;
    public final User user;
    public final Entity entity;

    public Invoker(BitrixRestClient client) {
        this.client = client;
        iblock = new Iblock(client);
        server = new Server(client);
        timeman = new Timeman(client);
        access = new Access(client);
        configuration = new Configuration(client);
        log = new Log(client);
        documentgenerator = new Documentgenerator(client);
        bizproc = new Bizproc(client);
        voximplant = new Voximplant(client);
        mailservice = new Mailservice(client);
        department = new Department(client);
        event = new Event(client);
        tasks = new Tasks(client);
        events = new Events(client);
        userfieldtype = new Userfieldtype(client);
        crm = new Crm(client);
        socialnetwork = new Socialnetwork(client);
        calendar = new Calendar(client);
        app = new App(client);
        imopenlines = new Imopenlines(client);
        sonet_group = new Sonet_group(client);
        im = new Im(client);
        ai = new Ai(client);
        messageservice = new Messageservice(client);
        userconsent = new Userconsent(client);
        sale = new Sale(client);
        disk = new Disk(client);
        landing = new Landing(client);
        task = new Task(client);
        userfieldconfig = new Userfieldconfig(client);
        telephony = new Telephony(client);
        placement = new Placement(client);
        user = new User(client);
        entity = new Entity(client);
    }
    // public void methods() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#METHODS
    // public void scope() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SCOPE
    // public void events() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#EVENTS
    // public void profile() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#PROFILE
    // public void batch() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#BATCH
}
