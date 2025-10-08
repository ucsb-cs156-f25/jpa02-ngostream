package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Nathan N.", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("ngostream", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f25-01", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("John V."),"Team should contain John V.");
        assertTrue(t.getMembers().contains("Nathan N."),"Team should contain Nathan N.");
        assertTrue(t.getMembers().contains("Nicolas S."),"Team should contain Nicolas S.");
        assertTrue(t.getMembers().contains("Noah L."),"Team should contain Noah L.");
        assertTrue(t.getMembers().contains("William C."),"Team should contain William C.");
        assertTrue(t.getMembers().contains("Yi L."),"Team should contain Yi L.");
    }

    @Test
    public void getTeam_returns_team_with_John() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("John V."),"Team should contain John V.");
    }

    @Test
    public void getTeam_returns_team_with_Nathan() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Nathan N."),"Team should contain Nathan N.");
    }

    @Test
    public void getTeam_returns_team_with_Nicolas() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Nicolas S."),"Team should contain Nicolas S.");
    }

    @Test
    public void getTeam_returns_team_with_Noah() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Noah L."),"Team should contain Noah L.");
    }

    @Test
    public void getTeam_returns_team_with_William() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("William C."),"Team should contain William C.");
    }

    @Test
    public void getTeam_returns_team_with_Yi() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Yi L."),"Team should contain Yi L.");
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
