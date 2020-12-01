/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
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
package org.polarsys.capella.transition.system2subsystem.multiphases.rules;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.transition.system.rules.fa.FunctionInputPortRule;
import org.polarsys.capella.transition.system2subsystem.multiphases.MultiphasesActivator;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;



public class FunctionInputPortRules {

	public static class ToSA extends FunctionInputPortRule {
	}
	
	public static class ToLA extends FunctionInputPortRule {
	}
	
	public static class ToPA extends FunctionInputPortRule {
		@Override
		public IStatus transformRequired(EObject element_p, IContext context_p) {
			return new Status(IStatus.WARNING, MultiphasesActivator.PLUGIN_ID, "SKIPPING");
		}
	}
}
