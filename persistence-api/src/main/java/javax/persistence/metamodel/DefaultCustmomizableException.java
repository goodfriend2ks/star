/*
 * Copyright 2013 Otávio Gonçalves de Santana (otaviojava)
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package javax.persistence.metamodel;

/**
 * Exception to serialize and deseralize the object in.
 * DefaultCustmomizable
 * @author osantana
 */
public class DefaultCustmomizableException extends RuntimeException {

    private static final long serialVersionUID = 2129093870754309945L;

    /**
     * the constructor.
     * @param message information to log
     */
    public DefaultCustmomizableException(String message) {
        super(message);
    }
}
