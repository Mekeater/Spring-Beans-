package com.DependencyInjection;

public class TextEditor {
	/***Spring基于构造函数的依赖注入(DI--Dependency Injection)***/
	/*private SpellChecker spellChecker;
	//类的构造函数
	public TextEditor(SpellChecker spellChecker) {
	      System.out.println("Inside TextEditor constructor." );
	      this.spellChecker = spellChecker;
	   }
	public void spellCheck() {
		spellChecker.checkSpelling();
	   }*/
	
	/***Spring基于设值函数的依赖注入***/
	 /* private SpellChecker spellChecker;
	  // a setter method to inject the dependency.
	  public void setSpellChecker(SpellChecker spellChecker) {
	      System.out.println("Inside setSpellChecker." );
	      this.spellChecker = spellChecker;
	   }
	// a getter method to return spellChecker
	  public SpellChecker getSpellChecker() {
	      return spellChecker;
	   }
	  public void spellCheck() {
	      spellChecker.checkSpelling();
	   }*/
	
}
