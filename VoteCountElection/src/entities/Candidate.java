package entities;

import java.util.Objects;

public class Candidate {

    private String name;
    private Integer Identifier;

    public Candidate() {
    }
    public Candidate(String name, Integer count) {
        this.name = name;
        this.Identifier = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(Integer identifier) {
        this.Identifier = identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(name, candidate.name) && Objects.equals(Identifier, candidate.Identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Identifier);
    }

    @Override
    public String toString() {
        return "Name: " + name +", Identifier: " + Identifier;
    }
}
