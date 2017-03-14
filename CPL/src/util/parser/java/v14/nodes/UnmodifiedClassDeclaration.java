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
 * f0 -> "class"
 * f1 -> <IDENTIFIER>
 * f2 -> [ "extends" Name() ]
 * f3 -> [ "implements" NameList() ]
 * f4 -> ClassBody()
 */
public class UnmodifiedClassDeclaration implements Node {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public NodeToken f0;
   public NodeToken f1;
   public NodeOptional f2;
   public NodeOptional f3;
   public ClassBody f4;

   public UnmodifiedClassDeclaration(NodeToken n0, NodeToken n1, NodeOptional n2, NodeOptional n3, ClassBody n4) {
      this.f0 = n0;
      this.f1 = n1;
      this.f2 = n2;
      this.f3 = n3;
      this.f4 = n4;
   }

   public UnmodifiedClassDeclaration(NodeToken n0, NodeOptional n1, NodeOptional n2, ClassBody n3) {
      this.f0 = new NodeToken("class");
      this.f1 = n0;
      this.f2 = n1;
      this.f3 = n2;
      this.f4 = n3;
   }

   public void accept(util.parser.java.v14.visitors.Visitor v) {
      v.visit(this);
   }
   public Object accept(util.parser.java.v14.visitors.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}
