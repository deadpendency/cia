//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.impl;



import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * <p>Java class for ViewWorldbankIndicatorDataCountrySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewWorldbankIndicatorDataCountrySummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="embeddedId" type="{http://data.application.internal.model.cia.hack23.com/impl}WorldbankIndicatorDataCountrySummaryEmbeddedId"/&gt;
 *         &lt;element name="indicator_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="source_note" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="source_value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="source_organization" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="start_year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="end_year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="data_point" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="topics" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewWorldbankIndicatorDataCountrySummary", propOrder = {
    "embeddedId",
    "indicatorName",
    "sourceNote",
    "sourceValue",
    "sourceOrganization",
    "startYear",
    "endYear",
    "dataPoint",
    "topics"
})
@Entity(name = "ViewWorldbankIndicatorDataCountrySummary")
@Table(name = "view_worldbank_indicator_data_country_summary")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewWorldbankIndicatorDataCountrySummary
    implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(required = true)
    protected WorldbankIndicatorDataCountrySummaryEmbeddedId embeddedId;
    @XmlElement(name = "indicator_name", required = true)
    protected String indicatorName;
    @XmlElement(name = "source_note", required = true)
    protected String sourceNote;
    @XmlElement(name = "source_value", required = true)
    protected String sourceValue;
    @XmlElement(name = "source_organization", required = true)
    protected String sourceOrganization;
    @XmlElement(name = "start_year", required = true, type = Integer.class, nillable = true)
    protected Integer startYear;
    @XmlElement(name = "end_year", required = true, type = Integer.class, nillable = true)
    protected Integer endYear;
    @XmlElement(name = "data_point")
    protected long dataPoint;
    @XmlElement(required = true)
    protected String topics;

    /**
     * Gets the value of the embeddedId property.
     * 
     * @return
     *     possible object is
     *     {@link WorldbankIndicatorDataCountrySummaryEmbeddedId }
     *     
     */
    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "indicatorId", column = @Column(name = "EMBEDDED_ID_INDICATOR_ID")),
        @AttributeOverride(name = "countryId", column = @Column(name = "EMBEDDED_ID_COUNTRY_ID"))
    })
    public WorldbankIndicatorDataCountrySummaryEmbeddedId getEmbeddedId() {
        return embeddedId;
    }

    /**
     * Sets the value of the embeddedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorldbankIndicatorDataCountrySummaryEmbeddedId }
     *     
     */
    public void setEmbeddedId(final WorldbankIndicatorDataCountrySummaryEmbeddedId value) {
        this.embeddedId = value;
    }

    /**
     * Gets the value of the indicatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "INDICATOR_NAME")
    public String getIndicatorName() {
        return indicatorName;
    }

    /**
     * Sets the value of the indicatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatorName(final String value) {
        this.indicatorName = value;
    }

    /**
     * Gets the value of the sourceNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SOURCE_NOTE")
    public String getSourceNote() {
        return sourceNote;
    }

    /**
     * Sets the value of the sourceNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceNote(final String value) {
        this.sourceNote = value;
    }

    /**
     * Gets the value of the sourceValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SOURCE_VALUE")
    public String getSourceValue() {
        return sourceValue;
    }

    /**
     * Sets the value of the sourceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceValue(final String value) {
        this.sourceValue = value;
    }

    /**
     * Gets the value of the sourceOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SOURCE_ORGANIZATION")
    public String getSourceOrganization() {
        return sourceOrganization;
    }

    /**
     * Sets the value of the sourceOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOrganization(final String value) {
        this.sourceOrganization = value;
    }

    /**
     * Gets the value of the startYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "START_YEAR", precision = 10, scale = 0)
    public Integer getStartYear() {
        return startYear;
    }

    /**
     * Sets the value of the startYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartYear(final Integer value) {
        this.startYear = value;
    }

    /**
     * Gets the value of the endYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "END_YEAR", precision = 10, scale = 0)
    public Integer getEndYear() {
        return endYear;
    }

    /**
     * Sets the value of the endYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndYear(final Integer value) {
        this.endYear = value;
    }

    /**
     * Gets the value of the dataPoint property.
     * 
     */
    @Basic
    @Column(name = "DATA_POINT", precision = 20)
    public long getDataPoint() {
        return dataPoint;
    }

    /**
     * Sets the value of the dataPoint property.
     * 
     */
    public void setDataPoint(final long value) {
        this.dataPoint = value;
    }

    /**
     * Gets the value of the topics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TOPICS")
    public String getTopics() {
        return topics;
    }

    /**
     * Sets the value of the topics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopics(final String value) {
        this.topics = value;
    }

    public ViewWorldbankIndicatorDataCountrySummary withEmbeddedId(final WorldbankIndicatorDataCountrySummaryEmbeddedId value) {
        setEmbeddedId(value);
        return this;
    }

    public ViewWorldbankIndicatorDataCountrySummary withIndicatorName(final String value) {
        setIndicatorName(value);
        return this;
    }

    public ViewWorldbankIndicatorDataCountrySummary withSourceNote(final String value) {
        setSourceNote(value);
        return this;
    }

    public ViewWorldbankIndicatorDataCountrySummary withSourceValue(final String value) {
        setSourceValue(value);
        return this;
    }

    public ViewWorldbankIndicatorDataCountrySummary withSourceOrganization(final String value) {
        setSourceOrganization(value);
        return this;
    }

    public ViewWorldbankIndicatorDataCountrySummary withStartYear(final Integer value) {
        setStartYear(value);
        return this;
    }

    public ViewWorldbankIndicatorDataCountrySummary withEndYear(final Integer value) {
        setEndYear(value);
        return this;
    }

    public ViewWorldbankIndicatorDataCountrySummary withDataPoint(final long value) {
        setDataPoint(value);
        return this;
    }

    public ViewWorldbankIndicatorDataCountrySummary withTopics(final String value) {
        setTopics(value);
        return this;
    }

	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	@Override
	public final boolean equals(final Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
