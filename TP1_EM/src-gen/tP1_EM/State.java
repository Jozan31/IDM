/**
 */
package tP1_EM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tP1_EM.State#getName <em>Name</em>}</li>
 *   <li>{@link tP1_EM.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link tP1_EM.State#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see tP1_EM.TP1_EMPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tP1_EM.TP1_EMPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tP1_EM.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tP1_EM.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(Transition)
	 * @see tP1_EM.TP1_EMPackage#getState_Incoming()
	 * @see tP1_EM.Transition#getTo
	 * @model opposite="to"
	 * @generated
	 */
	Transition getIncoming();

	/**
	 * Sets the value of the '{@link tP1_EM.State#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(Transition value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tP1_EM.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(Transition)
	 * @see tP1_EM.TP1_EMPackage#getState_Outgoing()
	 * @see tP1_EM.Transition#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	Transition getOutgoing();

	/**
	 * Sets the value of the '{@link tP1_EM.State#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(Transition value);

} // State
