/**
 * TestUtilsTest.java
 * 
 * Copyright 2010 Jeffrey Finkelstein
 * 
 * This file is part of jfcommon-test.
 * 
 * jfcommon-test is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 * 
 * jfcommon-test is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * jfcommon-test. If not, see <http://www.gnu.org/licenses/>.
 */
package jfcommon.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for the {@link TestUtils} class.
 * 
 * @author Jeffrey Finkelstein
 * @since 0.1
 */
public class TestUtilsTest {

  /**
   * Test method for {@link jfcommon.test.TestUtils#fail(java.lang.Throwable)}.
   */
  @Test
  public void testFail() {
    try {
      TestUtils.fail(new Exception());
    } catch (final AssertionError error) {
      assertTrue(error instanceof AssertionError);
    }
  }

  /**
   * Test method for
   * {@link jfcommon.test.TestUtils#shouldHaveThrownException()}.
   */
  @Test
  public void testShouldHaveThrownException() {
    try {
      TestUtils.shouldHaveThrownException();
    } catch (final AssertionError error) {
      assertTrue(error instanceof AssertionError);
    }
  }

}
