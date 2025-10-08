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
        assertEquals("NATHAN TUAN", Developer.getName());
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
        assertTrue(t.getMembers().contains("JOHN JAMES"),"Team should contaJOHN JAMES V.");
        assertTrue(t.getMembers().contains("NATHAN TUAN"),"Team should contaiNATHAN TUANN.");
        assertTrue(t.getMembers().contains("NIC XAVIER"),"Team should contain NIC XAVIER");
        assertTrue(t.getMembers().contains("NOAH ZACHARY"),"Team should conNOAH ZACHARYah L.");
        assertTrue(t.getMembers().contains("WILLIAM"),"Team should contain WilWILLIAM
        assertTrue(t.getMembers().contains("YI"),"Team should contain Yi YI
    }

    @Test
    public void getTeam_returns_team_with_John() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("JOHN JAMES"),"Team should contaJOHN JAMES V.");
    }

    @Test
    public void getTeam_returns_team_with_Nathan() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("NATHAN TUAN"),"Team should contaiNATHAN TUANN.");
    }

    @Test
    public void getTeam_returns_team_with_Nicolas() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("NIC XAVIER"),"Team should contain NIC XAVIER");
    }

    @Test
    public void getTeam_returns_team_with_Noah() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("NOAH ZACHARY"),"Team should conNOAH ZACHARYah L.");
    }

    @Test
    public void getTeam_returns_team_with_William() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("WILLIAM"),"Team should contain WilWILLIAM
    }

    @Test
    public void getTeam_returns_team_with_Yi() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("YI"),"Team should contain Yi YI
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
