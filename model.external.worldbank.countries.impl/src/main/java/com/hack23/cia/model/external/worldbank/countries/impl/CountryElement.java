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
// Generated on: 2019.02.24 at 11:26:40 PM CET 
//


package com.hack23.cia.model.external.worldbank.countries.impl;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
 * The Class CountryElement.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "iso2Code",
    "countryName",
    "region",
    "adminregion",
    "incomeLevel",
    "lendingType",
    "capitalCity",
    "longitude",
    "latitude"
})
@XmlRootElement(name = "country")
@Entity(name = "CountryElement")
@Table(name = "COUNTRY_ELEMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class CountryElement
    implements ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The iso 2 code. */
    @XmlElement(required = true)
    protected String iso2Code;
    
    /** The country name. */
    @XmlElement(name = "name", required = true)
    protected String countryName;
    
    /** The region. */
    @XmlElement(required = true)
    protected Region region;
    
    /** The adminregion. */
    @XmlElement(required = true)
    protected Adminregion adminregion;
    
    /** The income level. */
    @XmlElement(required = true)
    protected IncomeLevel incomeLevel;
    
    /** The lending type. */
    @XmlElement(required = true)
    protected LendingType lendingType;
    
    /** The capital city. */
    @XmlElement(required = true)
    protected String capitalCity;
    
    /** The longitude. */
    @XmlElement(required = true)
    protected String longitude;
    
    /** The latitude. */
    @XmlElement(required = true)
    protected String latitude;
    
    /** The id. */
    @XmlAttribute(name = "id")
    protected String id;
    
    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the iso 2 code.
	 *
	 * @return the iso 2 code
	 */
    @Basic
    @Column(name = "ISO_2CODE")
    public String getIso2Code() {
        return iso2Code;
    }

    /**
	 * Sets the iso 2 code.
	 *
	 * @param value the new iso 2 code
	 */
    public void setIso2Code(final String value) {
        this.iso2Code = value;
    }

    /**
	 * Gets the country name.
	 *
	 * @return the country name
	 */
    @Basic
    @Column(name = "COUNTRY_NAME")
    public String getCountryName() {
        return countryName;
    }

    /**
	 * Sets the country name.
	 *
	 * @param value the new country name
	 */
    public void setCountryName(final String value) {
        this.countryName = value;
    }

    /**
	 * Gets the region.
	 *
	 * @return the region
	 */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "REGION_VALUE")),
        @AttributeOverride(name = "id", column = @Column(name = "REGION_ID"))
    })
    public Region getRegion() {
        return region;
    }

    /**
	 * Sets the region.
	 *
	 * @param value the new region
	 */
    public void setRegion(final Region value) {
        this.region = value;
    }

    /**
	 * Gets the adminregion.
	 *
	 * @return the adminregion
	 */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "ADMINREGION_VALUE")),
        @AttributeOverride(name = "id", column = @Column(name = "ADMINREGION_ID"))
    })
    public Adminregion getAdminregion() {
        return adminregion;
    }

    /**
	 * Sets the adminregion.
	 *
	 * @param value the new adminregion
	 */
    public void setAdminregion(final Adminregion value) {
        this.adminregion = value;
    }

    /**
	 * Gets the income level.
	 *
	 * @return the income level
	 */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "INCOME_LEVEL_VALUE")),
        @AttributeOverride(name = "id", column = @Column(name = "INCOME_LEVEL_ID"))
    })
    public IncomeLevel getIncomeLevel() {
        return incomeLevel;
    }

    /**
	 * Sets the income level.
	 *
	 * @param value the new income level
	 */
    public void setIncomeLevel(final IncomeLevel value) {
        this.incomeLevel = value;
    }

    /**
	 * Gets the lending type.
	 *
	 * @return the lending type
	 */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "LENDING_TYPE_VALUE")),
        @AttributeOverride(name = "id", column = @Column(name = "LENDING_TYPE_ID"))
    })
    public LendingType getLendingType() {
        return lendingType;
    }

    /**
	 * Sets the lending type.
	 *
	 * @param value the new lending type
	 */
    public void setLendingType(final LendingType value) {
        this.lendingType = value;
    }

    /**
	 * Gets the capital city.
	 *
	 * @return the capital city
	 */
    @Basic
    @Column(name = "CAPITAL_CITY")
    public String getCapitalCity() {
        return capitalCity;
    }

    /**
	 * Sets the capital city.
	 *
	 * @param value the new capital city
	 */
    public void setCapitalCity(final String value) {
        this.capitalCity = value;
    }

    /**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
    @Basic
    @Column(name = "LONGITUDE")
    public String getLongitude() {
        return longitude;
    }

    /**
	 * Sets the longitude.
	 *
	 * @param value the new longitude
	 */
    public void setLongitude(final String value) {
        this.longitude = value;
    }

    /**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
    @Basic
    @Column(name = "LATITUDE")
    public String getLatitude() {
        return latitude;
    }

    /**
	 * Sets the latitude.
	 *
	 * @param value the new latitude
	 */
    public void setLatitude(final String value) {
        this.latitude = value;
    }

    /**
	 * Gets the id.
	 *
	 * @return the id
	 */
    @Basic
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    /**
	 * Sets the id.
	 *
	 * @param value the new id
	 */
    public void setId(final String value) {
        this.id = value;
    }

    /**
	 * With iso 2 code.
	 *
	 * @param value the value
	 * @return the country element
	 */
    public CountryElement withIso2Code(final String value) {
        setIso2Code(value);
        return this;
    }

    /**
	 * With country name.
	 *
	 * @param value the value
	 * @return the country element
	 */
    public CountryElement withCountryName(final String value) {
        setCountryName(value);
        return this;
    }

    /**
	 * With region.
	 *
	 * @param value the value
	 * @return the country element
	 */
    public CountryElement withRegion(final Region value) {
        setRegion(value);
        return this;
    }

    /**
	 * With adminregion.
	 *
	 * @param value the value
	 * @return the country element
	 */
    public CountryElement withAdminregion(final Adminregion value) {
        setAdminregion(value);
        return this;
    }

    /**
	 * With income level.
	 *
	 * @param value the value
	 * @return the country element
	 */
    public CountryElement withIncomeLevel(final IncomeLevel value) {
        setIncomeLevel(value);
        return this;
    }

    /**
	 * With lending type.
	 *
	 * @param value the value
	 * @return the country element
	 */
    public CountryElement withLendingType(final LendingType value) {
        setLendingType(value);
        return this;
    }

    /**
	 * With capital city.
	 *
	 * @param value the value
	 * @return the country element
	 */
    public CountryElement withCapitalCity(final String value) {
        setCapitalCity(value);
        return this;
    }

    /**
	 * With longitude.
	 *
	 * @param value the value
	 * @return the country element
	 */
    public CountryElement withLongitude(final String value) {
        setLongitude(value);
        return this;
    }

    /**
	 * With latitude.
	 *
	 * @param value the value
	 * @return the country element
	 */
    public CountryElement withLatitude(final String value) {
        setLatitude(value);
        return this;
    }

    /**
	 * With id.
	 *
	 * @param value the value
	 * @return the country element
	 */
    public CountryElement withId(final String value) {
        setId(value);
        return this;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
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
        final CountryElement that = ((CountryElement) object);
        {
            String lhsIso2Code;
            lhsIso2Code = this.getIso2Code();
            String rhsIso2Code;
            rhsIso2Code = that.getIso2Code();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "iso2Code", lhsIso2Code), LocatorUtils.property(thatLocator, "iso2Code", rhsIso2Code), lhsIso2Code, rhsIso2Code)) {
                return false;
            }
        }
        {
            String lhsCountryName;
            lhsCountryName = this.getCountryName();
            String rhsCountryName;
            rhsCountryName = that.getCountryName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryName", lhsCountryName), LocatorUtils.property(thatLocator, "countryName", rhsCountryName), lhsCountryName, rhsCountryName)) {
                return false;
            }
        }
        {
            Region lhsRegion;
            lhsRegion = this.getRegion();
            Region rhsRegion;
            rhsRegion = that.getRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "region", lhsRegion), LocatorUtils.property(thatLocator, "region", rhsRegion), lhsRegion, rhsRegion)) {
                return false;
            }
        }
        {
            Adminregion lhsAdminregion;
            lhsAdminregion = this.getAdminregion();
            Adminregion rhsAdminregion;
            rhsAdminregion = that.getAdminregion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adminregion", lhsAdminregion), LocatorUtils.property(thatLocator, "adminregion", rhsAdminregion), lhsAdminregion, rhsAdminregion)) {
                return false;
            }
        }
        {
            IncomeLevel lhsIncomeLevel;
            lhsIncomeLevel = this.getIncomeLevel();
            IncomeLevel rhsIncomeLevel;
            rhsIncomeLevel = that.getIncomeLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "incomeLevel", lhsIncomeLevel), LocatorUtils.property(thatLocator, "incomeLevel", rhsIncomeLevel), lhsIncomeLevel, rhsIncomeLevel)) {
                return false;
            }
        }
        {
            LendingType lhsLendingType;
            lhsLendingType = this.getLendingType();
            LendingType rhsLendingType;
            rhsLendingType = that.getLendingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lendingType", lhsLendingType), LocatorUtils.property(thatLocator, "lendingType", rhsLendingType), lhsLendingType, rhsLendingType)) {
                return false;
            }
        }
        {
            String lhsCapitalCity;
            lhsCapitalCity = this.getCapitalCity();
            String rhsCapitalCity;
            rhsCapitalCity = that.getCapitalCity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "capitalCity", lhsCapitalCity), LocatorUtils.property(thatLocator, "capitalCity", rhsCapitalCity), lhsCapitalCity, rhsCapitalCity)) {
                return false;
            }
        }
        {
            String lhsLongitude;
            lhsLongitude = this.getLongitude();
            String rhsLongitude;
            rhsLongitude = that.getLongitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "longitude", lhsLongitude), LocatorUtils.property(thatLocator, "longitude", rhsLongitude), lhsLongitude, rhsLongitude)) {
                return false;
            }
        }
        {
            String lhsLatitude;
            lhsLatitude = this.getLatitude();
            String rhsLatitude;
            rhsLatitude = that.getLatitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latitude", lhsLatitude), LocatorUtils.property(thatLocator, "latitude", rhsLatitude), lhsLatitude, rhsLatitude)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
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


}
