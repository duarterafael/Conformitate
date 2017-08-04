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

// $Id: MClass.java 5224 2014-09-03 07:41:26Z lhamann $

package org.tzi.use.uml.mm;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.tzi.use.uml.mm.statemachines.MProtocolStateMachine;
import org.tzi.use.uml.ocl.type.ObjectType;
import org.tzi.use.uml.sys.MOperationCall;

/**
 * Instances of the type MClass represent classes in a model.
 *
 * @version     $ProjectVersion: 0.393 $
 * @author <a href="mailto:hanna@tzi.de">Hanna Bauerdick</a>
 * @author <a href="mailto:gutsche@tzi.de">Fabian Gutsche</a>
 */

public interface MClass extends MClassifier, UseFileLocatable {

    /**
     * Returns true if the class is marked abstract.
     */
    public boolean isAbstract();

    /**
     * Returns the name of this class with lowercase first letter.
     */
    public String nameAsRolename();

    
    /**
     * returns the corresponding type
     * @return the corresponding type
     */
    public ObjectType type();
    
    
    /**
     * Returns the model owning this class.
     */
    public MModel model();

    /**
     * Sets the model owning this class. This method must be called by
     * {@link MModel#addClass(MClass)}.
     *
     * @see MModel#addClass(MClass)
     */
    public void setModel( MModel model );

    
    /**
     * Returns the set of all direct parent classes (without this class).
     * 
     * Sets the return type to Set&lt;MClass&gt;
     * @return Set&lt;MClass&gt;
     */
    @Override
    public Set<? extends MClass> parents();
    
    
    /**
     * Returns the set of all parent classes (without this class). 
     * This is the transitive closure of the generalization relation.
     * 
     * Sets the return type to Set&lt;MClass&gt;
     * @return Set&lt;MClass&gt;
     */
    @Override
    public Set<? extends MClass> allParents();
    
    /**
     * Returns the set of all child classes (without this class). This
     * is the transitive closure of the generalization relation.
     *
     * @return Set(MClass)
     */
    @Override
    public Set<? extends MClass> allChildren();

    /**
     * Returns the set of all direct child classes (without this
     * class).
     *
     * @return Set(MClass) 
     */
    @Override
    public Set<? extends MClass> children();
        
    @Override
    public Iterable<? extends MClass> generalizationHierachie(boolean includeThis);
    
    @Override
    public Iterable<? extends MClass> specializationHierachie(boolean includeThis);
    
    /**
     * Adds an attribute. The attribute must have a unique name within
     * the class and must not conflict with any attribute with the
     * same name defined in a superclass or subclass or with a
     * rolename of an association this class participates in.
     *
     * @exception MInvalidModelException the class already contains an
     *            attribute with the same name or a name clash
     *            occured.
     */
    public void addAttribute( MAttribute attr ) throws MInvalidModelException;

    /**
     * Returns the set of attributes defined for this class. Inherited
     * attributes are not included.
     *
     * @return List(MAttribute)
     */
    public List<MAttribute> attributes();

    /**
     * Returns the set of all attributes (including inherited ones)
     * defined for this class.
     *
     * @return List(MAttribute)
     */
    public List<MAttribute> allAttributes();

    /**
     * Returns the specified attribute. Attributes are also looked up
     * in superclasses if <code>searchInherited</code> is true.
     *
     * @return null if attribute does not exist.
     */
    public MAttribute attribute( String name, boolean searchInherited );

    /**
     * Adds an operation. The operation name must be unique among all
     * operations of this class. Operations in superclasses may be
     * redefined if the signature matches.
     *
     * @exception MInvalidModelException the operation is not unique
     *            or is not a valid redefinition.
     */
    public void addOperation( MOperation op ) throws MInvalidModelException;

    /**
     * Returns all operations defined for this class. Inherited
     * operations are not included.
     */
    public List<MOperation> operations();


    /**
     * Returns the set of all operations (including inherited ones)
     * defined for this class.
     *
     * @return List(MOperation)
     */
    public List<MOperation> allOperations();

    /**
     * Gets an operation by name. Operations are also looked up in
     * superclasses if <code>searchInherited</code> is true. This
     * method walks up the generalization hierarchy and selects the
     * first matching operation. Thus, if an operation is redefined,
     * this method returns the most specific one.
     *
     * @return null if operation does not exist.
     */
    public MOperation operation( String name, boolean searchInherited );


    /**
     * Returns the association end that can be reached by the
     * OCL expression <code>self.rolename</code>.
     *
     * @return null if no such association end exists.
     */
    public MNavigableElement navigableEnd( String rolename );

    /**
     * Returns a map of all association ends that can be reached from
     * this class by navigation.
     *
     * @return Map(String, MAssociationEnd)
     */
    Map<String, MNavigableElement> navigableEnds();

    public void deleteNavigableElements ();
    

    /**
     * Registers all association ends as navigable from this
     * class. This should be called by a MModel implementation when an
     * association is added to the model.
     *
     * @param associationEnds List(MAssociationEnd)
     * @see MModel#addAssociation
     */
    void registerNavigableEnds( List<MNavigableElement> associationEnds );

    /**
     * Returns the set of associations this class directly
     * participates in.
     *
     * @return Set(MAssociation).
     */
    public Set<MAssociation> associations();

    /**
     * Returns the set of associations this class and all of its
     * parents participate in.
     *
     * @return Set(MAssociation).
     */
    public Set<MAssociation> allAssociations();

    /**
     * Returns true if this class is a child of
     * <code>otherClass</code> or equal to it.
     */
    public boolean isSubClassOf( MClass otherClass );

    /**
     * Returns true if this class is a child of
     * <code>otherClass</code>.
     * If <code>excludeThis</code> is <code>true</code>,
     * it is not checked if <code>otherClass</code> equals this class, i.e.,
     * it is checked, if it is a "real" sub class.
     */
    public boolean isSubClassOf( MClass otherClass, boolean excludeThis );
    
    /**
     * Sets the position in the defined USE-Model.
     */
    public void setPositionInModel(int position);
    
    /**
     * Process this element with visitor.
     */
    public void processWithVisitor( MMVisitor v );

    /**
     * Searches for the association ends connected to this class or 
     * its parents with the given name.
     * @param name The name of association ends to look for.
     * @return A list of association ends in the order from the most specific class to the more general classes.
     */
	public List<MAssociationEnd> getAssociationEnd(String name);
	
	/**
	 * Adds a new PSM to the class
	 * @param psm
	 */
	public void addOwnedProtocolStateMachine(MProtocolStateMachine psm);
	
	/**
	 * Returns all owned PSM or an empty list if no PSM is defined.
	 * @return
	 */
	public Set<MProtocolStateMachine> getOwnedProtocolStateMachines();

	/**
	 * @param operationCall
	 * @return
	 */
	public boolean hasStateMachineWhichHandles(MOperationCall operationCall);

	/**
	 * @return
	 */
	public Set<MProtocolStateMachine> getAllOwnedProtocolStateMachines();
}