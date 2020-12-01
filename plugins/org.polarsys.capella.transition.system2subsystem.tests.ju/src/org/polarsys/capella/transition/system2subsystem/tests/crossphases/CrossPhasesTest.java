/*******************************************************************************
 * Copyright (c) 2016 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.transition.system2subsystem.tests.crossphases;

import org.polarsys.capella.transition.system2subsystem.tests.System2SubsystemTest;

public abstract class CrossPhasesTest extends System2SubsystemTest {

  public CrossPhasesTest() {
    setKind(Kind.CROSS_PHASES);
  }

}
