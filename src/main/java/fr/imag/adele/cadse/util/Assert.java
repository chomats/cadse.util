/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * Copyright (C) 2006-2010 Adele Team/LIG/Grenoble University, France
 */
package fr.imag.adele.cadse.util;



/**
 * <code>Assert</code> is useful for for embedding runtime sanity checks in
 * code. The predicate methods all test a condition and throw some type of
 * unchecked exception if the condition does not hold.
 * <p>
 * Assertion failure exceptions, like most runtime exceptions, are thrown when
 * something is misbehaving. Assertion failures are invariably unspecified
 * behavior; consequently, clients should never rely on these being thrown (and
 * certainly should not being catching them specifically).
 * </p>
 * <p>
 * This class can be used without OSGi running.
 * </p>
 * <p>
 * This class is not intended to be instantiated or sub-classed by clients.
 * </p>
 * 
 * 
 */
public final class Assert {
	/* This class is not intended to be instantiated. */
	private Assert() {
		// not allowed
	}

	/**
	 * Asserts that an argument is legal. If the given boolean is not
	 * <code>true</code>, an <code>IllegalArgumentException</code> is
	 * thrown.
	 * 
	 * @param expression
	 *            the outcode of the check
	 * @return <code>true</code> if the check passes (does not return if the
	 *         check fails)
	 * @exception IllegalArgumentException
	 *                if the legality test failed
	 */
	public static boolean isLegal(boolean expression) {
		return isLegal(expression, ""); //$NON-NLS-1$
	}

	/**
	 * Asserts that an argument is legal. If the given boolean is not
	 * <code>true</code>, an <code>IllegalArgumentException</code> is
	 * thrown. The given message is included in that exception, to aid
	 * debugging.
	 * 
	 * @param expression
	 *            the outcode of the check
	 * @param message
	 *            the message to include in the exception
	 * @return <code>true</code> if the check passes (does not return if the
	 *         check fails)
	 * @exception IllegalArgumentException
	 *                if the legality test failed
	 */
	public static boolean isLegal(boolean expression, String message) {
		if (!expression) {
			throw new IllegalArgumentException(message);
		}
		return expression;
	}

	/**
	 * Asserts that the given object is not <code>null</code>. If this is not
	 * the case, some kind of unchecked exception is thrown.
	 * 
	 * @param object
	 *            the value to test
	 */
	public static void isNotNull(Object object) {
		isNotNull(object, ""); //$NON-NLS-1$
	}

	/**
	 * Asserts that the given object is not <code>null</code>. If this is not
	 * the case, some kind of unchecked exception is thrown. The given message
	 * is included in that exception, to aid debugging.
	 * 
	 * @param object
	 *            the value to test
	 * @param message
	 *            the message to include in the exception
	 */
	public static void isNotNull(Object object, String message) {
		if (object == null) {
			throw new AssertionError("null argument:" + message); //$NON-NLS-1$
		}
	}


	/**
	 * Asserts that the given boolean is <code>true</code>. If this is not
	 * the case, some kind of unchecked exception is thrown.
	 * 
	 * @param expression
	 *            the outcode of the check
	 * @return <code>true</code> if the check passes (does not return if the
	 *         check fails)
	 */
	public static boolean isTrue(boolean expression) {
		return isTrue(expression, ""); //$NON-NLS-1$
	}

	/**
	 * Asserts that the given boolean is <code>true</code>. If this is not
	 * the case, some kind of unchecked exception is thrown. The given message
	 * is included in that exception, to aid debugging.
	 * 
	 * @param expression
	 *            the outcode of the check
	 * @param message
	 *            the message to include in the exception
	 * @return <code>true</code> if the check passes (does not return if the
	 *         check fails)
	 */
	public static boolean isTrue(boolean expression, String message) {
		if (!expression) {
			throw new AssertionError("assertion failed: " + message); //$NON-NLS-1$
		}
		return expression;
	}
}
