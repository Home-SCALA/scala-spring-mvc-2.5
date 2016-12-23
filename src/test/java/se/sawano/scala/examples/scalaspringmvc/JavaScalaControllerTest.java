/*
 * Copyright 2012 Daniel Sawano
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package se.sawano.scala.examples.scalaspringmvc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class JavaScalaControllerTest {
    private JavaScalaController controller;

    @Before
    public void setUp() throws Exception {
        controller = new JavaScalaController();
    }

    @Test
    public void pingShouldReturnPong() throws Exception {
        String answer = controller.ping();
        assertEquals("pong", answer);
    }
}
