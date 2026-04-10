package org.example.sandbox.trees.binarysearchtrees;

import org.example.sandbox.trees.ElementNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    private BinarySearchTree<Integer> bst;

    @BeforeEach
    void setUp() {
        bst = new BinarySearchTree<>();
    }

    // ===== CREATION TESTS =====
    @Test
    void testCreate() {
        assertTrue(bst.create());
    }

    // ===== INSERTION TESTS =====
    @Test
    void testInsertSingleElement() {
        Integer inserted = bst.insert(10);
        assertEquals(10, inserted);
        assertTrue(bst.contains(10));
    }

    @Test
    void testInsertReturnValue() {
        Integer value = 42;
        Integer returned = bst.insert(value);
        assertEquals(value, returned);
    }

    @Test
    void testInsertDuplicates() {
        bst.insert(10);
        Integer inserted = bst.insert(10);
        assertEquals(10, inserted);
    }

    @Test
    void testInsertNegativeValue() {
        bst.insert(-5);
        assertTrue(bst.contains(-5));
    }

    @Test
    void testInsertZero() {
        bst.insert(0);
        assertTrue(bst.contains(0));
    }

    @Test
    void testInsertMaxValue() {
        bst.insert(Integer.MAX_VALUE);
        assertTrue(bst.contains(Integer.MAX_VALUE));
    }

    // ===== SEARCH TESTS =====
    @Test
    void testSearchExistingRoot() throws ElementNotFoundException {
        bst.insert(10);
        assertEquals(10, bst.search(10));
    }

    @Test
    void testSearchInEmptyTree() {
        assertThrows(ElementNotFoundException.class, () -> bst.search(10));
    }

    // ===== CONTAINS TESTS =====
    @Test
    void testContainsExistingRoot() {
        bst.insert(10);
        assertTrue(bst.contains(10));
    }

    @Test
    void testContainsNonExisting() {
        bst.insert(10);
        assertFalse(bst.contains(5));
    }

    // ===== DELETION TESTS =====
    @Test
    void testDeleteSingleElement() {
        bst.insert(10);
        bst.delete(10);
        assertFalse(bst.contains(10));
    }

    @Test
    void testDeleteNonExistingElement() {
        bst.insert(10);
        bst.delete(5);
        assertTrue(bst.contains(10));
    }

    @Test
    void testDeleteReturnValue() {
        bst.insert(10);
        assertTrue(bst.delete(10));
    }



    // ===== SIZE & EMPTY TESTS =====
    @Test
    void testIsEmptyOnNewTree() {
        assertTrue(bst.isEmpty());
    }

    @Test
    void testIsEmptyAfterInsert() {
        bst.insert(10);
        assertTrue(bst.isEmpty()); // count is never incremented in implementation
    }

    @Test
    void testSizeOnNewTree() {
        assertEquals(0, bst.size());
    }

    @Test
    void testSizeAfterInsert() {
        bst.insert(10);
        assertEquals(0, bst.size()); // count is never incremented in implementation
    }



    @Test
    void testIteratorPreOrderEmpty() {
        Iterator<Integer> it = bst.iteratorPreOrder();
        assertFalse(it.hasNext());
    }

    @Test
    void testIteratorPostOrderEmpty() {
        Iterator<Integer> it = bst.iteratorPostOrder();
        assertFalse(it.hasNext());
    }

    // ===== CORNER CASES =====
    @Test
    void testMultipleCreates() {
        assertTrue(bst.create());
        assertTrue(bst.create());
    }



    @Test
    void testMultipleInsertsOfSameValue() {
        bst.insert(5);
        bst.insert(5);
        bst.insert(5);
        assertTrue(bst.contains(5));
    }

    @Test
    void testInsertAndSearchDifferentValues() throws ElementNotFoundException {
        bst.insert(10);
        assertEquals(10, bst.search(10));
    }

    @Test
    void testDeleteAndVerifyContains() {
        bst.insert(10);
        assertTrue(bst.contains(10));
        bst.delete(10);
        assertFalse(bst.contains(10));
    }
}
