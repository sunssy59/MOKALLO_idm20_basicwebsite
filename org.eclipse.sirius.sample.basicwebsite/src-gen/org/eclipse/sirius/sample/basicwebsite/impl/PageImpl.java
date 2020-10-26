/**
 */
package org.eclipse.sirius.sample.basicwebsite.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage;
import org.eclipse.sirius.sample.basicwebsite.Page;
import org.eclipse.sirius.sample.basicwebsite.PageContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.impl.PageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.impl.PageImpl#getPagecontents <em>Pagecontents</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.impl.PageImpl#getLinkaddress <em>Linkaddress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPagecontents() <em>Pagecontents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagecontents()
	 * @generated
	 * @ordered
	 */
	protected EList<PageContent> pagecontents;

	/**
	 * The default value of the '{@link #getLinkaddress() <em>Linkaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkaddress()
	 * @generated
	 * @ordered
	 */
	protected static final String LINKADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkaddress() <em>Linkaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkaddress()
	 * @generated
	 * @ordered
	 */
	protected String linkaddress = LINKADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicwebsitePackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicwebsitePackage.PAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageContent> getPagecontents() {
		if (pagecontents == null) {
			pagecontents = new EObjectContainmentEList<PageContent>(PageContent.class, this,
					BasicwebsitePackage.PAGE__PAGECONTENTS);
		}
		return pagecontents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkaddress() {
		return linkaddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkaddress(String newLinkaddress) {
		String oldLinkaddress = linkaddress;
		linkaddress = newLinkaddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicwebsitePackage.PAGE__LINKADDRESS, oldLinkaddress,
					linkaddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicwebsitePackage.PAGE__PAGECONTENTS:
			return ((InternalEList<?>) getPagecontents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasicwebsitePackage.PAGE__NAME:
			return getName();
		case BasicwebsitePackage.PAGE__PAGECONTENTS:
			return getPagecontents();
		case BasicwebsitePackage.PAGE__LINKADDRESS:
			return getLinkaddress();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BasicwebsitePackage.PAGE__NAME:
			setName((String) newValue);
			return;
		case BasicwebsitePackage.PAGE__PAGECONTENTS:
			getPagecontents().clear();
			getPagecontents().addAll((Collection<? extends PageContent>) newValue);
			return;
		case BasicwebsitePackage.PAGE__LINKADDRESS:
			setLinkaddress((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BasicwebsitePackage.PAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BasicwebsitePackage.PAGE__PAGECONTENTS:
			getPagecontents().clear();
			return;
		case BasicwebsitePackage.PAGE__LINKADDRESS:
			setLinkaddress(LINKADDRESS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BasicwebsitePackage.PAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BasicwebsitePackage.PAGE__PAGECONTENTS:
			return pagecontents != null && !pagecontents.isEmpty();
		case BasicwebsitePackage.PAGE__LINKADDRESS:
			return LINKADDRESS_EDEFAULT == null ? linkaddress != null : !LINKADDRESS_EDEFAULT.equals(linkaddress);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", linkaddress: ");
		result.append(linkaddress);
		result.append(')');
		return result.toString();
	}

} //PageImpl