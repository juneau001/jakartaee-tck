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

/*
 * $Id$
 */

package com.sun.ts.tests.common.ejb.calleebeans;

import java.util.Properties;
import java.util.Collection;
import java.rmi.RemoteException;
import javax.ejb.EJBHome;
import javax.ejb.CreateException;
import javax.ejb.FinderException;

public interface CMP20CalleeHome extends EJBHome {

  public CMP20Callee create(Properties p, int keyId, String brandName,
      float price) throws RemoteException, CreateException;

  public CMP20Callee create(Properties p, int keyId, String brandName,
      float price, SimpleArgument arg) throws RemoteException, CreateException;

  public CMP20Callee findByPrimaryKey(Integer key)
      throws RemoteException, FinderException;

}
