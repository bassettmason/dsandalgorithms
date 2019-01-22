package LeftJoin;

import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void leftJoinTest() {
        LeftJoin leftJoinClass = new LeftJoin();

        HashMap<String, String> mapA = new HashMap();
        HashMap<String, String> mapB = new HashMap();

        String keyA = "Key";
        String valueA = "aValue";
        mapA.put(keyA, valueA);

        String keyB = "Key";
        String valueB = "bValue";
        mapB.put(keyB, valueB);

        ArrayList<ArrayList<String>> expected = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Key");
        strings.add("aValue");
        strings.add("bValue");
        expected.add(strings);

        assertEquals(expected, leftJoinClass.leftJoin(mapA, mapB));
    }

    @Test
    public void leftJoinEmptyTest() {
        LeftJoin leftJoinClass = new LeftJoin();

        HashMap<String, String> mapA = new HashMap();
        HashMap<String, String> mapB = new HashMap();

        ArrayList<ArrayList<String>> expected = new ArrayList<>();

        assertEquals(expected, leftJoinClass.leftJoin(mapA, mapB));
    }

    @Test
    public void leftJoinNoMatchesTest() {
        LeftJoin leftJoinClass = new LeftJoin();

        HashMap<String, String> mapA = new HashMap();
        HashMap<String, String> mapB = new HashMap();

        String keyA = "KeyA";
        String valueA = "aValue";
        mapA.put(keyA, valueA);

        String keyB = "KeyB";
        String valueB = "bValue";
        mapB.put(keyB, valueB);

        ArrayList<ArrayList<String>> expected = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("KeyA");
        strings.add("aValue");
        strings.add(null);
        expected.add(strings);

        assertEquals(expected, leftJoinClass.leftJoin(mapA, mapB));
    }


}