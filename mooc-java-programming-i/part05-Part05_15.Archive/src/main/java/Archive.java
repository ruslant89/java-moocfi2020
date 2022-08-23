public class Archive {
    private String identifier;
    private String name;

    public Archive (String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedArchive = (Archive) compared;

        if (this.identifier.equals(comparedArchive.identifier)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
