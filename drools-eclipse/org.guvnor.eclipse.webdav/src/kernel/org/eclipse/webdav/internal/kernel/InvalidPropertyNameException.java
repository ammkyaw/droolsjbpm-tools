/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.eclipse.webdav.internal.kernel;

/** 
 * When thrown, this class signals that the property name
 * string provided was not legal based on the definition
 * provided in the documentation of the PropertyName(String)
 * constructor.
 */
public class InvalidPropertyNameException extends Exception {
    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 510l;

    /**
     * Construct an InvalidPropertyNameException object.
     */
    public InvalidPropertyNameException() {
        super("InvalidPropertyName"); //$NON-NLS-1$
    }

    /**
     * InvalidPropertyNameException constructor comment.
     * @param statusMessage a message describing the exception of status code
     */
    public InvalidPropertyNameException(String statusMessage) {
        super(statusMessage);
    }
}
