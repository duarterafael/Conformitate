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

// $Id: CollectionType.java 4985 2014-05-22 13:51:56Z lhamann $

package org.tzi.use.uml.ocl.type;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.tzi.use.uml.ocl.value.CollectionValue;
import org.tzi.use.uml.ocl.value.Value;
import org.tzi.use.util.StringUtil;

/**
 * Collection is the abstract base class for set, sequence, and bag.
 *
 * @version     $ProjectVersion: 0.393 $
 * @author  Mark Richters
 * @see     SetType
 * @see     SequenceType
 * @see     BagType
 */
public class CollectionType extends Type {

    private final Type fElemType;

    protected CollectionType(Type elemType) {
        fElemType = elemType;
    }

    public Type elemType() {
        return fElemType;
    }

    @Override
    public boolean isCollection(boolean excludeVoid) {
    	return true;
    }
    
    @Override
    public boolean isTrueCollection() {
    	return true;
    }
    
    /** 
     * Returns true if this type is a subtype of <code>t</code>. 
     */
    @Override
    public boolean isSubtypeOf(Type t) {
        if (! t.isTrueCollection() )
            return false;

        CollectionType t2 = (CollectionType) t;
        if (fElemType.isSubtypeOf(t2.elemType()) )
            return true;
        return false;
    }

    /** 
     * Returns the set of all supertypes (including this type).  If
     * this collection has type Collection(T) the result is the set of
     * all types Collection(T') where T' <= T.
     */
    @Override
    public Set<Type> allSupertypes() {
        Set<Type> res = new HashSet<Type>();
        Set<Type> elemSuper = fElemType.allSupertypes();
        Iterator<Type> typeIter = elemSuper.iterator();
        
        while (typeIter.hasNext() ) {
            Type t = typeIter.next();
            res.add(TypeFactory.mkCollection(t));
        }
        
        return res;
    }

    @Override
    public Type getLeastCommonSupertype(Type type)
    {
    	if (!type.isCollection(false))
    		return null;
    	
    	if (type.isVoidType())
    		return this;
    	
    	CollectionType cType = (CollectionType)type;
    	Type commonElementType = this.fElemType.getLeastCommonSupertype(cType.fElemType);

    	if (commonElementType == null)
    		return null;
    	else
    		return TypeFactory.mkCollection(commonElementType);
    }
        
    @Override
    public StringBuilder toString(StringBuilder sb) {
        sb.append("Collection(");
        elemType().toString(sb);
        return sb.append(")");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() == getClass() )
            return ((CollectionType) obj).elemType().equals(elemType());
        return false;
    }

    @Override
    public int hashCode() {
        return fElemType.hashCode();
    }
    
    @Override
    public boolean isVoidOrElementTypeIsVoid() {
		return elemType().isVoidOrElementTypeIsVoid();
	}

	/**
	 * Creates a collection type with the same
	 * kind of collection and the given element type.
	 * <code>
	 * Collection(OclAny).createCollectionType(String) => Collection(String)
	 * Set(OclAny).createCollectionType(String) => Set(String)
	 * </code>
	 * 
	 * @param t The new type of the elements
	 * @return
	 */
	public Type createCollectionType(Type t) {
		return TypeFactory.mkCollection(t);
	}

	/**
	 * Creates a new collection value of this type, if possible.
	 * Note: The type <code>Collection</code> cannot be instantiated. 
	 * @param values The values of the elements of the collection. 
	 * @return
	 * @throws UnsupportedOperationException If called on CollectionType.
	 */
	public CollectionValue createCollectionValue(List<Value> values) {
		throw new UnsupportedOperationException("The abstract type " + StringUtil.inQuotes("Collection") + " cannot be instantiated.");
	}
}
