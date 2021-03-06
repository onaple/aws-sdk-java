/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for PurchaseOfferingResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/PurchaseOffering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseOfferingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Reservation reservation;

    /**
     * @param reservation
     */

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    /**
     * @return
     */

    public Reservation getReservation() {
        return this.reservation;
    }

    /**
     * @param reservation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseOfferingResult withReservation(Reservation reservation) {
        setReservation(reservation);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReservation() != null)
            sb.append("Reservation: ").append(getReservation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseOfferingResult == false)
            return false;
        PurchaseOfferingResult other = (PurchaseOfferingResult) obj;
        if (other.getReservation() == null ^ this.getReservation() == null)
            return false;
        if (other.getReservation() != null && other.getReservation().equals(this.getReservation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservation() == null) ? 0 : getReservation().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseOfferingResult clone() {
        try {
            return (PurchaseOfferingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
