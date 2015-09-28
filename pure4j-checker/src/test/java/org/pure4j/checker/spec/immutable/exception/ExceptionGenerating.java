package org.pure4j.checker.spec.immutable.exception;

import org.pure4j.annotations.immutable.ImmutableValue;
import org.pure4j.checker.support.ShouldBePure;

@ImmutableValue
public class ExceptionGenerating {

	@ShouldBePure
	public ExceptionGenerating() {
		
	}
	
	
	@ShouldBePure
	@Override
	public int hashCode() {
		return 1;
	}


	@ShouldBePure
	@Override
	public String toString() {
		return null;
	}

	@ShouldBePure
	public void someHandler() throws Exception {
		throw new Exception();
	}
}
