/**
 * Copyright 2017 David Green
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.reconquest.gradle.android.eclipse;

import org.gradle.api.Action;
import org.gradle.plugins.ide.eclipse.model.Classpath;
import org.gradle.plugins.ide.eclipse.model.SourceFolder;

public class AddSourceFoldersAction implements Action<Classpath> {

  @Override
  public void execute(Classpath classpath) {
    Log.log().info("Adding Android source folders");
    classpath.getEntries().add(new SourceFolder("src/main/java", "bin"));
    classpath.getEntries().add(new SourceFolder("build/generated/source/r/debug", "bin"));
    classpath.getEntries().add(new SourceFolder("build/generated/source/buildConfig/debug", "bin"));
    classpath.getEntries().add(new SourceFolder("build/generated/source/aidl/debug", "bin"));
  }
}
