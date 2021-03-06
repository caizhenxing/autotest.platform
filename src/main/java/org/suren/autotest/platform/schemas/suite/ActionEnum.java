//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.22 at 09:12:44 PM CST 
//


package org.suren.autotest.platform.schemas.suite;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="actionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fillValue"/>
 *     &lt;enumeration value="click"/>
 *     &lt;enumeration value="enter"/>
 *     &lt;enumeration value="upload"/>
 *     &lt;enumeration value="randomUpload"/>
 *     &lt;enumeration value="selectByValue"/>
 *     &lt;enumeration value="selectByIndex"/>
 *     &lt;enumeration value="selectByText"/>
 *     &lt;enumeration value="select"/>
 *     &lt;enumeration value="randomSelect"/>
 *     &lt;enumeration value="checkByValue"/>
 *     &lt;enumeration value="checkByText"/>
 *     &lt;enumeration value="hover"/>
 *     &lt;enumeration value="invoke"/>
 *     &lt;enumeration value="sequence"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "actionEnum")
@XmlEnum
public enum ActionEnum {


    /**
     * 
     * 						填入文本。
     * 					
     * 
     */
    @XmlEnumValue("fillValue")
    FILL_VALUE("fillValue"),

    /**
     * 
     * 						单击。
     * 					
     * 
     */
    @XmlEnumValue("click")
    CLICK("click"),

    /**
     * 
     * 						回车键。
     * 					
     * 
     */
    @XmlEnumValue("enter")
    ENTER("enter"),

    /**
     * 
     * 						上传文件。
     * 					
     * 
     */
    @XmlEnumValue("upload")
    UPLOAD("upload"),

    /**
     * 
     * 						上传随机生成的文件。
     * 					
     * 
     */
    @XmlEnumValue("randomUpload")
    RANDOM_UPLOAD("randomUpload"),

    /**
     * 
     * 						根据Option的value选择下拉列表。
     * 					
     * 
     */
    @XmlEnumValue("selectByValue")
    SELECT_BY_VALUE("selectByValue"),

    /**
     * 
     * 						根据序号选择，从0开始下拉列表。
     * 					
     * 
     */
    @XmlEnumValue("selectByIndex")
    SELECT_BY_INDEX("selectByIndex"),

    /**
     * 
     * 						根据文本选择下拉列表。
     * 					
     * 
     */
    @XmlEnumValue("selectByText")
    SELECT_BY_TEXT("selectByText"),

    /**
     * 
     * 						根据文本选择下拉列表，和selectByText相同。
     * 					
     * 
     */
    @XmlEnumValue("select")
    SELECT("select"),

    /**
     * 
     * 						从下拉列表中随机选择一个。
     * 					
     * 
     */
    @XmlEnumValue("randomSelect")
    RANDOM_SELECT("randomSelect"),

    /**
     * 
     * 						根据值选择单（多）选框。
     * 					
     * 
     */
    @XmlEnumValue("checkByValue")
    CHECK_BY_VALUE("checkByValue"),

    /**
     * 
     * 						根据文本选择单（多）选框，目前该选项和checkByValue一样。
     * 					
     * 
     */
    @XmlEnumValue("checkByText")
    CHECK_BY_TEXT("checkByText"),

    /**
     * 
     * 						鼠标悬停。
     * 					
     * 
     */
    @XmlEnumValue("hover")
    HOVER("hover"),

    /**
     * 
     * 						执行静态方法。
     * 					
     * 
     */
    @XmlEnumValue("invoke")
    INVOKE("invoke"),

    /**
     * 
     * 						执行静态方法。
     * 					
     * 
     */
    @XmlEnumValue("sequence")
    SEQUENCE("sequence");
    private final String value;

    ActionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionEnum fromValue(String v) {
        for (ActionEnum c: ActionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
