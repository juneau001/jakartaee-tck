/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.ts.lib.deliverable.jaxrpc;

import com.sun.ts.lib.deliverable.*;
import com.sun.ts.lib.util.*;
import com.sun.ts.lib.porting.DeploymentInfo;
import com.sun.javatest.*;
import java.util.*;
import java.io.*;

/**
 * This class serves as a place for JAXR Deliverable specific info.
 *
 * @author Kyle Grucci
 */
public class JAXRPCDeliverable extends AbstractDeliverable {

  public PropertyManagerInterface createPropertyManager(TestEnvironment te)
      throws Exception {
    return JAXRPCPropertyManager.getJAXRPCPropertyManager(te);
  }

  public PropertyManagerInterface createPropertyManager(Properties p)
      throws Exception {
    return JAXRPCPropertyManager.getJAXRPCPropertyManager(p);
  }

  public PropertyManagerInterface getPropertyManager() throws Exception {
    return JAXRPCPropertyManager.getJAXRPCPropertyManager();
  }

  public Map getValidVehicles() {
    super.getValidVehicles();
    // add default values
    htTSValidVehicles.put("tests.service_eetest.vehicles",
        new String[] { "standalone" });
    return htTSValidVehicles;
  }

  public boolean supportsAutoDeployment() {
    return false;
  }
}
