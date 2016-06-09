/*
 * The MIT License
 *
 * Copyright 2016 Thibault Debatty.
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

package info.debatty.java.datasets.examples;

import info.debatty.java.datasets.gaussian.Center;
import info.debatty.java.datasets.gaussian.Dataset;

/**
 *
 * @author Thibault Debatty
 */
public class GaussianMixture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dataset gaussian_mixture = new Dataset(500);
        gaussian_mixture.addCenter(
                new Center(
                        2,
                        new double[]{10.0, 10.0},
                        new double[]{1.0, 1.0}));

        gaussian_mixture.addCenter(
                new Center(
                        2,
                        new double[]{6.0, 3.0},
                        new double[]{1.0, 1.5}));

        gaussian_mixture.addCenter(
                new Center(
                        1,
                        new double[]{0.0, 4.0},
                        new double[]{2.0, 2.0}));

        for (Double[] vector : gaussian_mixture) {
            println(vector);
        }
    }

    public static void println(Double[] array) {
        for (Double value : array) {
            System.out.print("" + value + " ");
        }
        System.out.print("\n");
    }

}
