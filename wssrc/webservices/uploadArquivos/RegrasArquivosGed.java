
package webservices.uploadArquivos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regrasArquivosGed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="regrasArquivosGed">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XLS"/>
 *     &lt;enumeration value="RTF"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="RPT"/>
 *     &lt;enumeration value="TXT"/>
 *     &lt;enumeration value="CSV"/>
 *     &lt;enumeration value="ZIP"/>
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="XML"/>
 *     &lt;enumeration value="REM"/>
 *     &lt;enumeration value="DAT"/>
 *     &lt;enumeration value="XLX"/>
 *     &lt;enumeration value="XLSX"/>
 *     &lt;enumeration value="JPEG"/>
 *     &lt;enumeration value="BMP"/>
 *     &lt;enumeration value="GIF"/>
 *     &lt;enumeration value="JPG"/>
 *     &lt;enumeration value="WMF"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="TIFF"/>
 *     &lt;enumeration value="RAR"/>
 *     &lt;enumeration value="DOC"/>
 *     &lt;enumeration value="DOCX"/>
 *     &lt;enumeration value="PPS"/>
 *     &lt;enumeration value="PPT"/>
 *     &lt;enumeration value="PPSX"/>
 *     &lt;enumeration value="PBIX"/>
 *     &lt;enumeration value="TIF"/>
 *     &lt;enumeration value="MP4"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "regrasArquivosGed")
@XmlEnum
public enum RegrasArquivosGed {

    XLS("XLS"),
    RTF("RTF"),
    PDF("PDF"),
    RPT("RPT"),
    TXT("TXT"),
    CSV("CSV"),
    ZIP("ZIP"),
    HTML("HTML"),
    XML("XML"),
    REM("REM"),
    DAT("DAT"),
    XLX("XLX"),
    XLSX("XLSX"),
    JPEG("JPEG"),
    BMP("BMP"),
    GIF("GIF"),
    JPG("JPG"),
    WMF("WMF"),
    PNG("PNG"),
    TIFF("TIFF"),
    RAR("RAR"),
    DOC("DOC"),
    DOCX("DOCX"),
    PPS("PPS"),
    PPT("PPT"),
    PPSX("PPSX"),
    PBIX("PBIX"),
    TIF("TIF"),
    @XmlEnumValue("MP4")
    MP_4("MP4");
    private final String value;

    RegrasArquivosGed(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegrasArquivosGed fromValue(String v) {
        for (RegrasArquivosGed c: RegrasArquivosGed.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
