package org.pure4j.checker.spec.immutable.using_super;

import org.pure4j.annotations.immutable.ImmutableValue;
import org.pure4j.checker.support.CausesError;
import org.pure4j.checker.support.ShouldBePure;
import org.pure4j.exception.ClassExpectingPureMethod;
import org.pure4j.exception.PureMethodCallsImpureException;

@ImmutableValue
public final class UsingSuper {

	@Override
	@CausesError({ClassExpectingPureMethod.class, PureMethodCallsImpureException.class})
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	@ShouldBePure
	public boolean equals(Object obj) {
		return true;
	}

	@Override
	@ShouldBePure
	public String toString() {
		return "l";
	}

	
}
