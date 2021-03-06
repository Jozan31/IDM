/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.generator;

import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import tP1_EM.State;
import tP1_EM.StateMachine;
import tP1_EM.Transition;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile("State.java", this.generateAbstractState());
    fsa.generateFile("Transition.java", this.generateAbstractTransition());
    fsa.generateFile("StateMachine.java", this.generateStateMachine());
    EObject _get = resource.getContents().get(0);
    StateMachine myfsm = ((StateMachine) _get);
    final Consumer<State> _function = (State s) -> {
      String _name = s.getName();
      String _plus = (_name + ".java");
      fsa.generateFile(_plus, this.print(s));
    };
    myfsm.getState().forEach(_function);
    final Consumer<Transition> _function_1 = (Transition t) -> {
      String _name = t.getName();
      String _plus = (_name + ".java");
      fsa.generateFile(_plus, this.print(t));
    };
    myfsm.getTransition().forEach(_function_1);
  }
  
  public String generateAbstractState() {
    return "public abstract class State {\r\n\tString name;\r\n\tTransition incoming;\r\n\tTransition outgoing;\r\n\t\r\n\tpublic State(){\r\n\t\tthis.name = \"\";\r\n\t\tthis.incoming = null;\r\n\t\tthis.outgoing = null;\r\n\t}\r\n\tpublic State(String _name, Transition _incoming, Transition _outgoing){\r\n\t\tthis.name = _name;\r\n\t\tthis.incoming = _incoming;\r\n\t\tthis.outgoing = _outgoing;\r\n\t}\r\n\tpublic State(State state){\r\n\t\tthis.name = state.getName();\r\n\t\tthis.incoming = state.getIncoming();\r\n\t\tthis.outgoing = state.getOutgoing();\r\n\t}\r\n\tpublic abstract void setName(String _name);\r\n\tpublic abstract String getName();\r\n\tpublic abstract void setIncoming(Transition _incoming);\r\n\tpublic abstract Transition getIncoming();\r\n\tpublic abstract void setOutgoing(Transition _outgoing);\r\n\tpublic abstract Transition getOutgoing();\r\n}";
  }
  
  public String print(final State s) {
    String _name = s.getName();
    String _plus = ("public class " + _name);
    return (_plus + " extends State {\r\n\t@Override\r\n\tpublic void setName(String _name){\r\n\t\tname = _name;\r\n\t}\r\n\t@Override\r\n\tpublic String getName(){\r\n\t\treturn name;\r\n\t}\r\n\t@Override\r\n\tpublic void setIncoming(Transition _incoming){\r\n\t\tincoming = _incoming;\r\n\t}\r\n\t@Override\r\n\tpublic Transition getIncoming(){\r\n\t\treturn incoming;\r\n\t}\r\n\t@Override\r\n\tpublic void setOutgoing(Transition _outgoing){\r\n\t\toutgoing = _outgoing;\r\n\t}\r\n\t@Override\r\n\tpublic getOutgoing(){\r\n\t\treturn outgoing;\r\n\t}\r\n}");
  }
  
  public String generateAbstractTransition() {
    return "public class Transition {\r\n\tString name;\r\n\tState from;\r\n\tState to;\r\n\r\n\tpublic Transition(){\r\n\t\tthis.name = \"\";\r\n\t\tthis.from = null;\r\n\t\tthis.to = null;\r\n\t}\r\n\tpublic Transition(String _name, State _from, State _to){\r\n\t\tthis.name = _name;\r\n\t\tthis.from = _from;\r\n\t\tthis.to = _to;\r\n\t}\r\n\tpublic Transition(Transition transition){\r\n\t\tthis.name = transition.getName();\r\n\t\tthis.from = transition.getFrom();\r\n\t\tthis.to = transition.getTo();\r\n\t}\r\n\tpublic abstract String getName();\r\n\tpublic abstract void setName(String name);\r\n\tpublic abstract State getFrom();\r\n\tpublic abstract void setFrom(State state);\r\n\tpublic abstract State getTo();\r\n\tpublic abstract void setTo(State state);\t\r\n}";
  }
  
  public String print(final Transition t) {
    String _name = t.getName();
    String _plus = ("public class " + _name);
    return (_plus + " extends Transition {\r\n\t@Override\r\n\tpublic String getName(){\r\n\t\treturn this.name;\r\n\t}\r\n\t@Override\r\n\tpublic void setName(String name){\r\n\t\tthis.name = name;\r\n\t}\r\n\t@Override\r\n\tpublic State getFrom(){\r\n\t\treturn this.from;\r\n\t}\r\n\t@Override\r\n\tpublic void setFrom(State state){\r\n\t\tthis.from = state;\r\n\t}\r\n\t@Override\r\n\tpublic State getTo(){\r\n\t\treturn this.to;\r\n\t}\r\n\t@Override\r\n\tpublic void setTo(State state){\r\n\t\tthis.to = state;\r\n\t}\r\n}");
  }
  
  public String generateStateMachine() {
    return "import java.util.ArrayList;\r\n\r\npublic class StateMachine {\r\n\tprivate String name;\r\n\tprivate ArrayList<State> states;\r\n\tprivate ArrayList<Transition> transitions;\r\n\r\n\tpublic StateMachine(){\r\n\t\tthis.name = \"\";\r\n\t\tthis.states = new ArrayList<State>();\r\n\t\tthis.transitions = new ArrayList<Transition>();\r\n\t}\r\n\r\n\tpublic StateMachine(String _name, ArrayList<State> _states, ArrayList<Transition> _transitions){\r\n\t\tthis.name = _name;\r\n\t\tthis.states = _states;\r\n\t\tthis.transitions = _transitions;\r\n\t}\r\n\r\n\tpublic void addState(State state){\r\n\t\tthis.states.add(state);\r\n\t}\r\n\t\r\n\tpublic void deleteState(int index){\r\n\t\tthis.states.remove(index);\r\n\t}\r\n\r\n\tpublic void addTransition(Transition transition){\r\n\t\tthis.transitions.add(transition);\r\n\t}\r\n\r\n\tpublic void deleteTransition(int index){\r\n\t\tthis.transitions.remove(index);\r\n\t}\r\n\r\n\tpublic String getName(){\r\n\t\treturn this.name;\r\n\t}\r\n\r\n\tpublic void setName(String name){\r\n\t\tthis.name = _name;\r\n\t}\r\n\r\n\tpublic ArrayList<State> getStates(){\r\n\t\treturn this.states;\r\n\t}\r\n\r\n\tpublic void setStates(ArrayList<State> states){\r\n\t\tthis.states = states;\r\n\t}\r\n\r\n\tpublic ArrayList<Transition> getTransitions(ArrayList<Transitions> transitions){\r\n\t\treturn this.transitions;\r\n\t}\r\n\r\n\tpublic void setTransitions(ArrayList<Transitions> transitions){\r\n\t\tthis.transitions = transitions;\r\n\t}\r\n}";
  }
}
