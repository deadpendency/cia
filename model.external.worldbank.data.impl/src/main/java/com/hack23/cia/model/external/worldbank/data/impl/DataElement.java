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
// Generated on: 2019.02.24 at 11:39:39 PM CET 
//


package com.hack23.cia.model.external.worldbank.data.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Basic;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * The Class DataElement.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "data"
})
@XmlRootElement(name = "data")
@Entity(name = "DataElement")
@Table(name = "DATA_ELEMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class DataElement
    implements ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The data. */
    @XmlElement(required = true)
    protected List<WorldBankData> data;
    
    /** The page. */
    @XmlAttribute(name = "page")
    protected BigInteger page;
    
    /** The pages. */
    @XmlAttribute(name = "pages")
    protected BigInteger pages;
    
    /** The per page. */
    @XmlAttribute(name = "per_page")
    protected BigInteger perPage;
    
    /** The total. */
    @XmlAttribute(name = "total")
    protected BigInteger total;
    
    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the data.
	 *
	 * @return the data
	 */
    @OneToMany(targetEntity = WorldBankData.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DATA__DATA_ELEMENT_HJID")
    public List<WorldBankData> getData() {
        if (data == null) {
            data = new ArrayList<WorldBankData>();
        }
        return this.data;
    }

    /**
	 * Sets the data.
	 *
	 * @param data the new data
	 */
    public void setData(final List<WorldBankData> data) {
        this.data = data;
    }

    /**
	 * Gets the page.
	 *
	 * @return the page
	 */
    @Basic
    @Column(name = "PAGE", precision = 20)
    public BigInteger getPage() {
        return page;
    }

    /**
	 * Sets the page.
	 *
	 * @param value the new page
	 */
    public void setPage(final BigInteger value) {
        this.page = value;
    }

    /**
	 * Gets the pages.
	 *
	 * @return the pages
	 */
    @Basic
    @Column(name = "PAGES", precision = 20)
    public BigInteger getPages() {
        return pages;
    }

    /**
	 * Sets the pages.
	 *
	 * @param value the new pages
	 */
    public void setPages(final BigInteger value) {
        this.pages = value;
    }

    /**
	 * Gets the per page.
	 *
	 * @return the per page
	 */
    @Basic
    @Column(name = "PER_PAGE", precision = 20)
    public BigInteger getPerPage() {
        return perPage;
    }

    /**
	 * Sets the per page.
	 *
	 * @param value the new per page
	 */
    public void setPerPage(final BigInteger value) {
        this.perPage = value;
    }

    /**
	 * Gets the total.
	 *
	 * @return the total
	 */
    @Basic
    @Column(name = "TOTAL", precision = 20)
    public BigInteger getTotal() {
        return total;
    }

    /**
	 * Sets the total.
	 *
	 * @param value the new total
	 */
    public void setTotal(final BigInteger value) {
        this.total = value;
    }

    /**
	 * With data.
	 *
	 * @param values the values
	 * @return the data element
	 */
    public DataElement withData(final WorldBankData... values) {
        if (values!= null) {
            for (final WorldBankData value: values) {
                getData().add(value);
            }
        }
        return this;
    }

    /**
	 * With data.
	 *
	 * @param values the values
	 * @return the data element
	 */
    public DataElement withData(final Collection<WorldBankData> values) {
        if (values!= null) {
            getData().addAll(values);
        }
        return this;
    }

    /**
	 * With data.
	 *
	 * @param data the data
	 * @return the data element
	 */
    public DataElement withData(final List<WorldBankData> data) {
        setData(data);
        return this;
    }

    /**
	 * With page.
	 *
	 * @param value the value
	 * @return the data element
	 */
    public DataElement withPage(final BigInteger value) {
        setPage(value);
        return this;
    }

    /**
	 * With pages.
	 *
	 * @param value the value
	 * @return the data element
	 */
    public DataElement withPages(final BigInteger value) {
        setPages(value);
        return this;
    }

    /**
	 * With per page.
	 *
	 * @param value the value
	 * @return the data element
	 */
    public DataElement withPerPage(final BigInteger value) {
        setPerPage(value);
        return this;
    }

    /**
	 * With total.
	 *
	 * @param value the value
	 * @return the data element
	 */
    public DataElement withTotal(final BigInteger value) {
        setTotal(value);
        return this;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
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

    /* (non-Javadoc)
     * @see org.jvnet.jaxb2_commons.lang.Equals#equals(org.jvnet.jaxb2_commons.locator.ObjectLocator, org.jvnet.jaxb2_commons.locator.ObjectLocator, java.lang.Object, org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy)
     */
    public boolean equals(final ObjectLocator thisLocator, final ObjectLocator thatLocator, final Object object, final EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DataElement that = ((DataElement) object);
        {
            List<WorldBankData> lhsData;
            lhsData = (((this.data!= null)&&(!this.data.isEmpty()))?this.getData():null);
            List<WorldBankData> rhsData;
            rhsData = (((that.data!= null)&&(!that.data.isEmpty()))?that.getData():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "data", lhsData), LocatorUtils.property(thatLocator, "data", rhsData), lhsData, rhsData)) {
                return false;
            }
        }
        {
            BigInteger lhsPage;
            lhsPage = this.getPage();
            BigInteger rhsPage;
            rhsPage = that.getPage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "page", lhsPage), LocatorUtils.property(thatLocator, "page", rhsPage), lhsPage, rhsPage)) {
                return false;
            }
        }
        {
            BigInteger lhsPages;
            lhsPages = this.getPages();
            BigInteger rhsPages;
            rhsPages = that.getPages();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pages", lhsPages), LocatorUtils.property(thatLocator, "pages", rhsPages), lhsPages, rhsPages)) {
                return false;
            }
        }
        {
            BigInteger lhsPerPage;
            lhsPerPage = this.getPerPage();
            BigInteger rhsPerPage;
            rhsPerPage = that.getPerPage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "perPage", lhsPerPage), LocatorUtils.property(thatLocator, "perPage", rhsPerPage), lhsPerPage, rhsPerPage)) {
                return false;
            }
        }
        {
            BigInteger lhsTotal;
            lhsTotal = this.getTotal();
            BigInteger rhsTotal;
            rhsTotal = that.getTotal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "total", lhsTotal), LocatorUtils.property(thatLocator, "total", rhsTotal), lhsTotal, rhsTotal)) {
                return false;
            }
        }
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(final Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
