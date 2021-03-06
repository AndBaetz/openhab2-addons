/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.toon.internal.api;

/**
 * The {@link ToonConnectionException} class indicates communication issues encountered by the api.
 *
 * @author Jorg de Jong - Initial contribution
 */
public class ToonConnectionException extends Exception {

    private static final long serialVersionUID = -6854850123941151190L;

    public ToonConnectionException(String message) {
        super(message);
    }

    public ToonConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
