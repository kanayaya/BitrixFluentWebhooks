package com.kanayaya.BitrixFluentWebhooks.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Iblock;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Sign;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Smile;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Mailservice;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Tasks;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Events;
import com.kanayaya.BitrixFluentWebhooks.api.methods.App;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Imopenlines;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Sonet_group;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Im;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Like;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Imconnector;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Sonet_group_subject;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Ai;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Tasks_extended;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Disk;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Task;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Userfieldconfig;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Lists;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Telephony;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Humanresources;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Placement;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Server;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Timeman;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Access;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Configuration;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Log;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Landing_cloud;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Documentgenerator;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Bizproc;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Feature;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Voximplant;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Imbot;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Department;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Event;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Userfieldtype;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Crm;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Socialnetwork;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Calendar;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Rpa;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Mobile;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Messageservice;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Userconsent;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Forum;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Pull;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Sale;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Landing;
import com.kanayaya.BitrixFluentWebhooks.api.methods.User;
import com.kanayaya.BitrixFluentWebhooks.api.methods.Entity;

import java.util.List;
import java.util.stream.Collectors;

public class Invoker {
    private final BitrixRestClient client;
    public final Iblock iblock;
    public final Sign sign;
    public final Smile smile;
    public final Mailservice mailservice;
    public final Tasks tasks;
    public final Events events;
    public final App app;
    public final Imopenlines imopenlines;
    public final Sonet_group sonet_group;
    public final com.kanayaya.BitrixFluentWebhooks.api.methods.Method method;
    public final Im im;
    public final Like like;
    public final Imconnector imconnector;
    public final Sonet_group_subject sonet_group_subject;
    public final Ai ai;
    public final Tasks_extended tasks_extended;
    public final Disk disk;
    public final Task task;
    public final Userfieldconfig userfieldconfig;
    public final Lists lists;
    public final Telephony telephony;
    public final Humanresources humanresources;
    public final Placement placement;
    public final Server server;
    public final Timeman timeman;
    public final Access access;
    public final Configuration configuration;
    public final Log log;
    public final Landing_cloud landing_cloud;
    public final Documentgenerator documentgenerator;
    public final Bizproc bizproc;
    public final Feature feature;
    public final Voximplant voximplant;
    public final Imbot imbot;
    public final Department department;
    public final Event event;
    public final Userfieldtype userfieldtype;
    public final Crm crm;
    public final Socialnetwork socialnetwork;
    public final Calendar calendar;
    public final Rpa rpa;
    public final Mobile mobile;
    public final Messageservice messageservice;
    public final Userconsent userconsent;
    public final Forum forum;
    public final Pull pull;
    public final Sale sale;
    public final Landing landing;
    public final User user;
    public final Entity entity;

    public Invoker(BitrixRestClient client) {
        this.client = client;
        iblock = new Iblock(client);
        sign = new Sign(client);
        smile = new Smile(client);
        mailservice = new Mailservice(client);
        tasks = new Tasks(client);
        events = new Events(client);
        app = new App(client);
        imopenlines = new Imopenlines(client);
        sonet_group = new Sonet_group(client);
        method = new com.kanayaya.BitrixFluentWebhooks.api.methods.Method(client);
        im = new Im(client);
        like = new Like(client);
        imconnector = new Imconnector(client);
        sonet_group_subject = new Sonet_group_subject(client);
        ai = new Ai(client);
        tasks_extended = new Tasks_extended(client);
        disk = new Disk(client);
        task = new Task(client);
        userfieldconfig = new Userfieldconfig(client);
        lists = new Lists(client);
        telephony = new Telephony(client);
        humanresources = new Humanresources(client);
        placement = new Placement(client);
        server = new Server(client);
        timeman = new Timeman(client);
        access = new Access(client);
        configuration = new Configuration(client);
        log = new Log(client);
        landing_cloud = new Landing_cloud(client);
        documentgenerator = new Documentgenerator(client);
        bizproc = new Bizproc(client);
        feature = new Feature(client);
        voximplant = new Voximplant(client);
        imbot = new Imbot(client);
        department = new Department(client);
        event = new Event(client);
        userfieldtype = new Userfieldtype(client);
        crm = new Crm(client);
        socialnetwork = new Socialnetwork(client);
        calendar = new Calendar(client);
        rpa = new Rpa(client);
        mobile = new Mobile(client);
        messageservice = new Messageservice(client);
        userconsent = new Userconsent(client);
        forum = new Forum(client);
        pull = new Pull(client);
        sale = new Sale(client);
        landing = new Landing(client);
        user = new User(client);
        entity = new Entity(client);
    }
    public List<String> methods() {
        JsonNode invoke = client.invoke(Method.METHODS);
        try {
            return client.getMapper().treeToValue(
                    invoke,
                    client.getMapper().getTypeFactory().constructCollectionType(List.class, String.class)
            );

        } catch (JsonProcessingException e) {
            throw new RuntimeException("server returned wrong answer: " + invoke.toPrettyString(), e);
        }
    }
    // public void scope() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SCOPE
    // public void events() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#EVENTS
    // public void profile() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#PROFILE
    // public void batch() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#BATCH
    // public void events() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#EVENTS
}
