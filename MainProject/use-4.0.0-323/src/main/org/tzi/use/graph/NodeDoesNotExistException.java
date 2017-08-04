/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2004 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

// $Id: NodeDoesNotExistException.java 5094 2014-07-18 07:53:30Z lhamann $

package org.tzi.use.graph;

import org.tzi.use.util.StringUtil;

/**
 * A Node was referenced that is not part of the Graph.
 *
 * @version     $ProjectVersion: 0.393 $
 * @author      Mark Richters 
 */
public class NodeDoesNotExistException extends RuntimeException {
	/**
	 * To get rid of the warning...
	 */
	private static final long serialVersionUID = 1L;
	
    public NodeDoesNotExistException() {
        super();
    }

    public NodeDoesNotExistException(Object node) {
        super("Node " + StringUtil.inQuotes(node.toString()) + "does not exist");
    }
}