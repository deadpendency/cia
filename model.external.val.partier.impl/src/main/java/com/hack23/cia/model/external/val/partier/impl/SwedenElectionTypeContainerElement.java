/*
 * Copyright 2010 James Pether Sörling
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:39:47 PM CET 
//


package com.hack23.cia.model.external.val.partier.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * The Class SwedenElectionTypeContainerElement.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwedenElectionTypeContainerElement", propOrder = {
    "electionTypes"
})
@Entity(name = "SwedenElectionTypeContainerElement")
@Table(name = "SWEDEN_ELECTION_TYPE_CONTAIN_0")
@Inheritance(strategy = InheritanceType.JOINED)
public class SwedenElectionTypeContainerElement
    implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The election types. */
    @XmlElement(name = "valtyp", required = true)
    protected List<SwedenElectionType> electionTypes;
    
    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the election types.
	 *
	 * @return the election types
	 */
    @OneToMany(targetEntity = SwedenElectionType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ELECTION_TYPES_SWEDEN_ELECTI_0")
    public List<SwedenElectionType> getElectionTypes() {
        if (electionTypes == null) {
            electionTypes = new ArrayList<>();
        }
        return this.electionTypes;
    }

    /**
	 * Sets the election types.
	 *
	 * @param electionTypes the new election types
	 */
    public void setElectionTypes(final List<SwedenElectionType> electionTypes) {
        this.electionTypes = electionTypes;
    }

    /**
	 * Gets the hjid.
	 *
	 * @return the hjid
	 */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
	 * Sets the hjid.
	 *
	 * @param value the new hjid
	 */
    public void setHjid(final Long value) {
        this.hjid = value;
    }

	public boolean equals(final Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		return new EqualsBuilder().append(getElectionTypes().toArray(), ((SwedenElectionTypeContainerElement) obj).getElectionTypes().toArray()).isEquals();
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
