/*
 * The MIT License
 *
 * Copyright 2017 tibo.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package info.debatty.java.datasets.fish;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import junit.framework.TestCase;

/**
 *
 * @author tibo
 */
public class ImageTest extends TestCase {

    public ImageTest(String testName) {
        super(testName);
    }

    /**
     * Test of load method, of class Image.
     */
    public void testLoad() throws Exception {
        System.out.println("load");
        URL resource = getClass().getResource("/fish/image-00000.bin");

        Image image = Image.load(Paths.get(resource.getPath()));
        File tmp_file = File.createTempFile("fish", ".png");
        image.get(0).write("png", tmp_file);
        System.out.println(image.get(0).toString());
    }

}
