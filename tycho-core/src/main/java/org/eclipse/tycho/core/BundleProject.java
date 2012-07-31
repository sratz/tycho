/*******************************************************************************
 * Copyright (c) 2008, 2011 Sonatype Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sonatype Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.core;

import java.util.List;

import org.apache.maven.project.MavenProject;
import org.eclipse.tycho.classpath.ClasspathEntry;
import org.eclipse.tycho.classpath.ClasspathEntry.AccessRule;
import org.eclipse.tycho.core.utils.ExecutionEnvironment;

public interface BundleProject extends TychoProject {
    public List<ClasspathEntry> getClasspath(MavenProject project);

    public List<AccessRule> getBootClasspathExtraAccessRules(MavenProject project);

    /**
     * Returns the value of the specified attribute key in the project's MANIFEST, or null if the
     * attribute was not found.
     * 
     * @param key
     *            manifest attribute key
     * @param project
     *            associated maven project
     * @return the String value of the specified attribute key, or null if not found.
     */
    public String getManifestValue(String key, MavenProject project);

    public ExecutionEnvironment getManifestMinimalEE(MavenProject project);

}
