/**
 */
package tP1_EM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tP1_EM.State;
import tP1_EM.TP1_EMPackage;
import tP1_EM.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tP1_EM.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link tP1_EM.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link tP1_EM.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected Transition incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected Transition outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TP1_EMPackage.Literals.STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TP1_EMPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getIncoming() {
		if (incoming != null && incoming.eIsProxy()) {
			InternalEObject oldIncoming = (InternalEObject) incoming;
			incoming = (Transition) eResolveProxy(oldIncoming);
			if (incoming != oldIncoming) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TP1_EMPackage.STATE__INCOMING,
							oldIncoming, incoming));
			}
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetIncoming() {
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncoming(Transition newIncoming, NotificationChain msgs) {
		Transition oldIncoming = incoming;
		incoming = newIncoming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TP1_EMPackage.STATE__INCOMING, oldIncoming, newIncoming);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncoming(Transition newIncoming) {
		if (newIncoming != incoming) {
			NotificationChain msgs = null;
			if (incoming != null)
				msgs = ((InternalEObject) incoming).eInverseRemove(this, TP1_EMPackage.TRANSITION__TO, Transition.class,
						msgs);
			if (newIncoming != null)
				msgs = ((InternalEObject) newIncoming).eInverseAdd(this, TP1_EMPackage.TRANSITION__TO, Transition.class,
						msgs);
			msgs = basicSetIncoming(newIncoming, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP1_EMPackage.STATE__INCOMING, newIncoming,
					newIncoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getOutgoing() {
		if (outgoing != null && outgoing.eIsProxy()) {
			InternalEObject oldOutgoing = (InternalEObject) outgoing;
			outgoing = (Transition) eResolveProxy(oldOutgoing);
			if (outgoing != oldOutgoing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TP1_EMPackage.STATE__OUTGOING,
							oldOutgoing, outgoing));
			}
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetOutgoing() {
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoing(Transition newOutgoing, NotificationChain msgs) {
		Transition oldOutgoing = outgoing;
		outgoing = newOutgoing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TP1_EMPackage.STATE__OUTGOING, oldOutgoing, newOutgoing);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoing(Transition newOutgoing) {
		if (newOutgoing != outgoing) {
			NotificationChain msgs = null;
			if (outgoing != null)
				msgs = ((InternalEObject) outgoing).eInverseRemove(this, TP1_EMPackage.TRANSITION__FROM,
						Transition.class, msgs);
			if (newOutgoing != null)
				msgs = ((InternalEObject) newOutgoing).eInverseAdd(this, TP1_EMPackage.TRANSITION__FROM,
						Transition.class, msgs);
			msgs = basicSetOutgoing(newOutgoing, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TP1_EMPackage.STATE__OUTGOING, newOutgoing,
					newOutgoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TP1_EMPackage.STATE__INCOMING:
			if (incoming != null)
				msgs = ((InternalEObject) incoming).eInverseRemove(this, TP1_EMPackage.TRANSITION__TO, Transition.class,
						msgs);
			return basicSetIncoming((Transition) otherEnd, msgs);
		case TP1_EMPackage.STATE__OUTGOING:
			if (outgoing != null)
				msgs = ((InternalEObject) outgoing).eInverseRemove(this, TP1_EMPackage.TRANSITION__FROM,
						Transition.class, msgs);
			return basicSetOutgoing((Transition) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TP1_EMPackage.STATE__INCOMING:
			return basicSetIncoming(null, msgs);
		case TP1_EMPackage.STATE__OUTGOING:
			return basicSetOutgoing(null, msgs);
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
		case TP1_EMPackage.STATE__NAME:
			return getName();
		case TP1_EMPackage.STATE__INCOMING:
			if (resolve)
				return getIncoming();
			return basicGetIncoming();
		case TP1_EMPackage.STATE__OUTGOING:
			if (resolve)
				return getOutgoing();
			return basicGetOutgoing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TP1_EMPackage.STATE__NAME:
			setName((String) newValue);
			return;
		case TP1_EMPackage.STATE__INCOMING:
			setIncoming((Transition) newValue);
			return;
		case TP1_EMPackage.STATE__OUTGOING:
			setOutgoing((Transition) newValue);
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
		case TP1_EMPackage.STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TP1_EMPackage.STATE__INCOMING:
			setIncoming((Transition) null);
			return;
		case TP1_EMPackage.STATE__OUTGOING:
			setOutgoing((Transition) null);
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
		case TP1_EMPackage.STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TP1_EMPackage.STATE__INCOMING:
			return incoming != null;
		case TP1_EMPackage.STATE__OUTGOING:
			return outgoing != null;
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
		result.append(')');
		return result.toString();
	}

} //StateImpl
