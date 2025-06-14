package model;

import java.io.Serializable;

public class Voter implements Serializable {
    private int id;
    private String name;
    private boolean hasVoted;

    public Voter(int id, String name) {
        this.id = id;
        this.name = name;
        this.hasVoted = false;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public boolean hasVoted() { return hasVoted; }

    public void vote() { this.hasVoted = true; }
}
