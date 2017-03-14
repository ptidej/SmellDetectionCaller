/*******************************************************************************
 * Copyright (c) 2001-2014 Yann-Ga�l Gu�h�neuc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Yann-Ga�l Gu�h�neuc and others, see in file; API and its implementation
 ******************************************************************************/
package ptidej.sad.smelldetectioncaller;

import java.io.File;
import java.util.Arrays;

public class SmellDetectionCaller {
	public static void main(final String[] args) {
		final String path = "../0 - SmellDetectionCaller/";
		final String[] folders = new File(path).list();
		Arrays.sort(folders);
		for (int i = 0; i < folders.length; i++) {
			final String name = folders[i];
			final String directory = path + name + "/bin/";
			SmellDetectionHelper.analyseCodeLevelModelFromJavaClassFiles(directory, name, "rsc/");
		}
	}
}
