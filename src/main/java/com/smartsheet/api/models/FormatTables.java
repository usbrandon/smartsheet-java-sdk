package com.smartsheet.api.models;
/*
 * #[license]
 * Smartsheet SDK for Java
 * %%
 * Copyright (C) 2014 Smartsheet
 * %%
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
 * %[license]
 */
import java.util.List;

public class FormatTables {

    /**
     * Represents the format descriptor.
     */
    private String defaults;

    /**
     * Represents Font families with additional font information.
     */
    private List<FontFamily> fontFamily;

    /**
     * Represents Font sizes in points.
     */
    private List<String> fontSize;

    /**
     * Represents Possible bold values: none,on.
     */
    private List<String> bold;

    /**
     * Represents Possible italic values: none,on.
     */
    private List<String> italic;

    /**
     * Represents Possible underline values: none,on.
     */
    private List<String> underline;

    /**
     * Represents Possible strikethrough values: none,on.
     */
    private List<String> strikethrough;

    /**
     * Represents Possible horizontalAlign values: none,on.
     */
    private List<String> horizontalAlign;

    /**
     * Represents Possible verticalAlign values: top, middle, bottom.
     */
    private List<String> verticalAlign;

    /**
     * Represents Color hex values.
     */
    private List<String> color;

    /**
     * Represents Currency codes and symbols.
     */
    private List<Currency> currency;

    /**
     * Represents All allowed decimal count values.
     */
    private List<String> decimalCount;

    /**
     * Represents Possible thousandsSeparator values: none,on.
     */
    private List<String> thousandsSeparator;

    /**
     * Represents Possible numberFormat values: none
     NUMBER
     CURRENCY
     PERCENT.
     */
    private List<String> numberFormat;

    /**
     * Represents Possible textWrap values: none,on.
     */
    private List<String> textWrap;

    /**
     * Gets the format descriptor.
     *
     * @return the defaults
     */
    public String getDefaults() {
        return defaults;
    }

    /**
     * Sets the format descriptor.
     *
     * @param defaults the new defaults
     */
    public void setDefaults(String defaults) {
        this.defaults = defaults;
    }

    /**
     * Gets the Font families.
     *
     * @return the Font families
     */
    public List<FontFamily> getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the Font families.
     *
     * @param fontFamily the new Font families
     */
    public void setFontFamily(List<FontFamily> fontFamily) {
        this.fontFamily = fontFamily;
    }

    /**
     * Gets the Font sizes in points.
     *
     * @return the Font sizes in points
     */
    public List<String> getFontSize() {
        return fontSize;
    }

    /**
     * Sets the Font sizes in points.
     *
     * @param fontSize the new Font sizes in points
     */
    public void setFontSize(List<String> fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * Gets the Possible bold values.
     *
     * @return the Possible bold values
     */
    public List<String> getBold() {
        return bold;
    }

    /**
     * Sets the Possible bold values.
     *
     * @param bold the new Possible bold values
     */
    public void setBold(List<String> bold) {
        this.bold = bold;
    }

    /**
     * Gets the Possible italic values.
     *
     * @return the Possible italic values
     */
    public List<String> getItalic() {
        return italic;
    }

    /**
     * Sets the Possible italic values.
     *
     * @param italic the new Possible italic values
     */
    public void setItalic(List<String> italic) {
        this.italic = italic;
    }

    /**
     * Gets the Possible underline values.
     *
     * @return the Possible underline values
     */
    public List<String> getUnderline() {
        return underline;
    }

    /**
     * Sets the Possible underline values.
     *
     * @param underline the new Possible underline values
     */
    public void setUnderline(List<String> underline) {
        this.underline = underline;
    }

    /**
     * Gets the Possible strikethrough values.
     *
     * @return the Possible strikethrough values
     */
    public List<String> getStrikethrough() {
        return strikethrough;
    }

    /**
     * Sets the Possible strikethrough values.
     *
     * @param strikethrough the new Possible strikethrough values
     */
    public void setStrikethrough(List<String> strikethrough) {
        this.strikethrough = strikethrough;
    }

    /**
     * Gets the Possible horizontalAlign values.
     *
     * @return the Possible horizontalAlign values
     */
    public List<String> getHorizontalAlign() {
        return horizontalAlign;
    }

    /**
     * Sets the Possible horizontalAlign values.
     *
     * @param horizontalAlign the new Possible horizontalAlign values
     */
    public void setHorizontalAlign(List<String> horizontalAlign) {
        this.horizontalAlign = horizontalAlign;
    }

    /**
     * Gets the Possible verticalAlign values.
     *
     * @return the Possible verticalAlign values
     */
    public List<String> getVerticalAlign() {
        return verticalAlign;
    }

    /**
     * Sets the Possible verticalAlign values.
     *
     * @param verticalAlign the new Possible verticalAlign values
     */
    public void setVerticalAlign(List<String> verticalAlign) {
        this.verticalAlign = verticalAlign;
    }

    /**
     * Gets the Color hex values.
     *
     * @return the Color hex values
     */
    public List<String> getColor() {
        return color;
    }

    /**
     * Sets the Color hex values.
     *
     * @param color the new Color hex values
     */
    public void setColor(List<String> color) {
        this.color = color;
    }

    /**
     * Gets the Currency codes and symbols.
     *
     * @return the Currency codes and symbols
     */
    public List<Currency> getCurrency() {
        return currency;
    }

    /**
     * Sets the Currency codes and symbols.
     *
     * @param currency the new Currency codes and symbols
     */
    public void setCurrency(List<Currency> currency) {
        this.currency = currency;
    }

    /**
     * Gets the allowed decimal count values.
     *
     * @return the allowed decimal count values
     */
    public List<String> getDecimalCount() {
        return decimalCount;
    }

    /**
     * Sets the allowed decimal count values.
     *
     * @param decimalCount the new allowed decimal count values
     */
    public void setDecimalCount(List<String> decimalCount) {
        this.decimalCount = decimalCount;
    }

    /**
     * Gets the thousandsSeparator values.
     *
     * @return the thousandsSeparator values
     */
    public List<String> getThousandsSeparator() {
        return thousandsSeparator;
    }

    /**
     * Sets the thousandsSeparator values.
     *
     * @param thousandsSeparator the new thousandsSeparator values
     */
    public void setThousandsSeparator(List<String> thousandsSeparator) {
        this.thousandsSeparator = thousandsSeparator;
    }

    /**
     * Gets the numberFormat values.
     *
     * @return the numberFormat values
     */
    public List<String> getNumberFormat() {
        return numberFormat;
    }

    /**
     * Sets the numberFormat values.
     *
     * @param numberFormat the new numberFormat values
     */
    public void setNumberFormat(List<String> numberFormat) {
        this.numberFormat = numberFormat;
    }

    /**
     * Gets the textWrap values.
     *
     * @return the textWrap values
     */
    public List<String> getTextWrap() {
        return textWrap;
    }

    /**
     * Sets the textWrap values.
     *
     * @param textWrap the new textWrap values
     */
    public void setTextWrap(List<String> textWrap) {
        this.textWrap = textWrap;
    }
}
