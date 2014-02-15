/*
 * Java Genetic Algorithm Library (@__identifier__@).
 * Copyright (c) @__year__@ Franz Wilhelmstötter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author:
 *    Franz Wilhelmstötter (franz.wilhelmstoetter@gmx.at)
 */
package org.jenetics;

import java.io.Serializable;

import javolution.lang.ValueType;

import org.jenetics.util.Factory;
import org.jenetics.util.Verifiable;

/**
 * Genes are the atoms of the <em>Jenetics</em> library. They contain the actual
 * information (alleles) of the encoded solution.
 *
 * @param <A> the <a href="http://en.wikipedia.org/wiki/Allele">Allele</a> type
 *         of this gene.
 *
 * @author <a href="mailto:franz.wilhelmstoetter@gmx.at">Franz Wilhelmstötter</a>
 * @since 1.0
 * @version 1.6 &mdash; <em>$Date$</em>
 */
public interface Gene<A, G extends Gene<A, G>>
	extends
		Factory<G>,
		Serializable,
		ValueType,
		Verifiable
{

	/**
	 * Return the allele of this gene.
	 *
	 * @return the allele of this gene.
	 */
	public A getAllele();

	/**
	 * Return a new, random gene of the same type than this gene. For all genes
	 * returned by this method holds {@code gene.getClass() ==
	 * gene.newInstance().getClass()}.
	 */
	@Override
	public G newInstance();

	/**
	 * @deprecated This method is introduced by the {@link javolution.lang.ValueType}
	 *             of the <i>Javolution</i> library, which will be removed in
	 *             the next major version.
	 */
	@Deprecated
	@Override
	public Object copy();

}
