/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.transition.system2subsystem.interphases.ui.commands;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.polarsys.capella.transition.system2subsystem.commands.SubSystemCommand;
import org.polarsys.capella.transition.system2subsystem.interphases.ui.launcher.InterPhasesLauncher;


public class InterPhasesCommand extends SubSystemCommand {

  /**
   * @param _rootElement_p
   * @param progressMonitor_p
   */
  public InterPhasesCommand(Collection<Object> selection_p, IProgressMonitor progressMonitor_p) {
    super(selection_p, progressMonitor_p);
  }

  @Override
  protected void performTransformation(Collection<Object> elements_p) {
    InterPhasesLauncher launcher = new InterPhasesLauncher();
    launcher.run(elements_p, true, getProgressMonitor());
  }

}