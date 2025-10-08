package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Nathan N.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "ngostream";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-01");
        team.addMember("John V.");
        team.addMember("Nathan N.");
        team.addMember("Nicolas S.");
        team.addMember("Noah L.");
        team.addMember("William C.");
        team.addMember("Yi L.");
        return team;
    }
}
