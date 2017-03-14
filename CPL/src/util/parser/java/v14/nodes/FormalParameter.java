/*******************************************************************************
 * Copyright (c) 2014 Yann-Ga�l Gu�h�neuc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Yann-Ga�l Gu�h�neuc and others, see in file; API and its implementation
 ******************************************************************************/
//
// Generated by JTB 1.2.2
//

package util.parser.java.v14.nodes;

/**
 * Grammar production:
 * f0 -> [ "final" ]
 * f1 -> Type()
 * f2 -> VariableDeclaratorId()
 */
public class FormalParameter implements Node {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public NodeOptional f0;
   public Type f1;
   public VariableDeclaratorId f2;

   public FormalParameter(NodeOptional n0, Type n1, VariableDeclaratorId n2) {
      this.f0 = n0;
      this.f1 = n1;
      this.f2 = n2;
   }

   public void accept(util.parser.java.v14.visitors.Visitor v) {
      v.visit(this);
   }
   public Object accept(util.parser.java.v14.visitors.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

