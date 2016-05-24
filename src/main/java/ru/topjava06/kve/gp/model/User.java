package ru.topjava06.kve.gp.model;

import java.util.Set;

public class User extends NamedEntity {


    protected String name;
    protected String email;
    protected String password;
    protected boolean hasVote=false;
    protected Set<Role> roles;

    public User(Integer id, String name,String email,String password, boolean hasVote, Set<Role> roles)
    {
        super(id,name);
        this.email=email;
        this.password=password;
        this.hasVote=hasVote;
        this.roles=roles;
    }
}
