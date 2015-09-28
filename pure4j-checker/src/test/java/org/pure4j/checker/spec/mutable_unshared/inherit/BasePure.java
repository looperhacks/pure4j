package org.pure4j.checker.spec.mutable_unshared.inherit;

import org.pure4j.annotations.mutable.MutableUnshared;
import org.pure4j.checker.support.ShouldBePure;

@MutableUnshared
public class BasePure {

	@ShouldBePure
	public int onBasePure() {
		return 4;
	}
}