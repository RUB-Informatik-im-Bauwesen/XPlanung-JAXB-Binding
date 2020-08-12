//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 02:29:48 PM CEST 
//


package net.opengis.gml._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import de.xplanung.xplangml._5._0.BPAbgrabungsFlaecheType;
import de.xplanung.xplangml._5._0.BPAbstandsFlaecheType;
import de.xplanung.xplangml._5._0.BPAbstandsMassType;
import de.xplanung.xplangml._5._0.BPAnpflanzungBindungErhaltungType;
import de.xplanung.xplangml._5._0.BPAufschuettungsFlaecheType;
import de.xplanung.xplangml._5._0.BPAusgleichsFlaecheType;
import de.xplanung.xplangml._5._0.BPAusgleichsMassnahmeType;
import de.xplanung.xplangml._5._0.BPBauGrenzeType;
import de.xplanung.xplangml._5._0.BPBauLinieType;
import de.xplanung.xplangml._5._0.BPBaugebietsTeilFlaecheType;
import de.xplanung.xplangml._5._0.BPBereichOhneEinAusfahrtLinieType;
import de.xplanung.xplangml._5._0.BPBereichType;
import de.xplanung.xplangml._5._0.BPBesondererNutzungszweckFlaecheType;
import de.xplanung.xplangml._5._0.BPBodenschaetzeFlaecheType;
import de.xplanung.xplangml._5._0.BPEinfahrtPunktType;
import de.xplanung.xplangml._5._0.BPEinfahrtsbereichLinieType;
import de.xplanung.xplangml._5._0.BPEingriffsBereichType;
import de.xplanung.xplangml._5._0.BPErhaltungsBereichFlaecheType;
import de.xplanung.xplangml._5._0.BPFestsetzungNachLandesrechtType;
import de.xplanung.xplangml._5._0.BPFirstRichtungsLinieType;
import de.xplanung.xplangml._5._0.BPFlaechenobjektType;
import de.xplanung.xplangml._5._0.BPFlaechenschlussobjektType;
import de.xplanung.xplangml._5._0.BPFoerderungsFlaecheType;
import de.xplanung.xplangml._5._0.BPFreiFlaecheType;
import de.xplanung.xplangml._5._0.BPGebaeudeFlaecheType;
import de.xplanung.xplangml._5._0.BPGemeinbedarfsFlaecheType;
import de.xplanung.xplangml._5._0.BPGemeinschaftsanlagenFlaecheType;
import de.xplanung.xplangml._5._0.BPGemeinschaftsanlagenZuordnungType;
import de.xplanung.xplangml._5._0.BPGenerischesObjektType;
import de.xplanung.xplangml._5._0.BPGeometrieobjektType;
import de.xplanung.xplangml._5._0.BPGewaesserFlaecheType;
import de.xplanung.xplangml._5._0.BPGruenFlaecheType;
import de.xplanung.xplangml._5._0.BPHoehenMassType;
import de.xplanung.xplangml._5._0.BPImmissionsschutzType;
import de.xplanung.xplangml._5._0.BPKennzeichnungsFlaecheType;
import de.xplanung.xplangml._5._0.BPKleintierhaltungFlaecheType;
import de.xplanung.xplangml._5._0.BPLandwirtschaftType;
import de.xplanung.xplangml._5._0.BPLinienobjektType;
import de.xplanung.xplangml._5._0.BPNebenanlagenAusschlussFlaecheType;
import de.xplanung.xplangml._5._0.BPNebenanlagenFlaecheType;
import de.xplanung.xplangml._5._0.BPNutzungsartenGrenzeType;
import de.xplanung.xplangml._5._0.BPObjektType;
import de.xplanung.xplangml._5._0.BPPersGruppenBestimmteFlaecheType;
import de.xplanung.xplangml._5._0.BPPlanType;
import de.xplanung.xplangml._5._0.BPPunktobjektType;
import de.xplanung.xplangml._5._0.BPRegelungVergnuegungsstaettenType;
import de.xplanung.xplangml._5._0.BPRekultivierungsFlaecheType;
import de.xplanung.xplangml._5._0.BPSchutzPflegeEntwicklungsFlaecheType;
import de.xplanung.xplangml._5._0.BPSchutzPflegeEntwicklungsMassnahmeType;
import de.xplanung.xplangml._5._0.BPSpezielleBauweiseType;
import de.xplanung.xplangml._5._0.BPSpielSportanlagenFlaecheType;
import de.xplanung.xplangml._5._0.BPStrassenVerkehrsFlaecheType;
import de.xplanung.xplangml._5._0.BPStrassenbegrenzungsLinieType;
import de.xplanung.xplangml._5._0.BPStrassenkoerperType;
import de.xplanung.xplangml._5._0.BPTechnischeMassnahmenFlaecheType;
import de.xplanung.xplangml._5._0.BPTextAbschnittType;
import de.xplanung.xplangml._5._0.BPTextlicheFestsetzungsFlaecheType;
import de.xplanung.xplangml._5._0.BPUeberbaubareGrundstuecksFlaecheType;
import de.xplanung.xplangml._5._0.BPUeberlagerungsobjektType;
import de.xplanung.xplangml._5._0.BPUnverbindlicheVormerkungType;
import de.xplanung.xplangml._5._0.BPVerEntsorgungType;
import de.xplanung.xplangml._5._0.BPVeraenderungssperreType;
import de.xplanung.xplangml._5._0.BPVerkehrsflaecheBesondererZweckbestimmungType;
import de.xplanung.xplangml._5._0.BPWaldFlaecheType;
import de.xplanung.xplangml._5._0.BPWasserwirtschaftsFlaecheType;
import de.xplanung.xplangml._5._0.BPWegerechtType;
import de.xplanung.xplangml._5._0.FPAbgrabungType;
import de.xplanung.xplangml._5._0.FPAnpassungKlimawandelType;
import de.xplanung.xplangml._5._0.FPAufschuettungType;
import de.xplanung.xplangml._5._0.FPAusgleichsFlaecheType;
import de.xplanung.xplangml._5._0.FPBebauungsFlaecheType;
import de.xplanung.xplangml._5._0.FPBereichType;
import de.xplanung.xplangml._5._0.FPBodenschaetzeType;
import de.xplanung.xplangml._5._0.FPFlaechenobjektType;
import de.xplanung.xplangml._5._0.FPFlaechenschlussobjektType;
import de.xplanung.xplangml._5._0.FPGemeinbedarfType;
import de.xplanung.xplangml._5._0.FPGenerischesObjektType;
import de.xplanung.xplangml._5._0.FPGeometrieobjektType;
import de.xplanung.xplangml._5._0.FPGewaesserType;
import de.xplanung.xplangml._5._0.FPGruenType;
import de.xplanung.xplangml._5._0.FPKeineZentrAbwasserBeseitigungFlaecheType;
import de.xplanung.xplangml._5._0.FPKennzeichnungType;
import de.xplanung.xplangml._5._0.FPLandwirtschaftsFlaecheType;
import de.xplanung.xplangml._5._0.FPLinienobjektType;
import de.xplanung.xplangml._5._0.FPNutzungsbeschraenkungsFlaecheType;
import de.xplanung.xplangml._5._0.FPObjektType;
import de.xplanung.xplangml._5._0.FPPlanType;
import de.xplanung.xplangml._5._0.FPPrivilegiertesVorhabenType;
import de.xplanung.xplangml._5._0.FPPunktobjektType;
import de.xplanung.xplangml._5._0.FPSchutzPflegeEntwicklungType;
import de.xplanung.xplangml._5._0.FPSpielSportanlageType;
import de.xplanung.xplangml._5._0.FPStrassenverkehrType;
import de.xplanung.xplangml._5._0.FPTextAbschnittType;
import de.xplanung.xplangml._5._0.FPTextlicheDarstellungsFlaecheType;
import de.xplanung.xplangml._5._0.FPUeberlagerungsobjektType;
import de.xplanung.xplangml._5._0.FPUnverbindlicheVormerkungType;
import de.xplanung.xplangml._5._0.FPVerEntsorgungType;
import de.xplanung.xplangml._5._0.FPVorbehalteFlaecheType;
import de.xplanung.xplangml._5._0.FPWaldFlaecheType;
import de.xplanung.xplangml._5._0.FPWasserwirtschaftType;
import de.xplanung.xplangml._5._0.FPZentralerVersorgungsbereichType;
import de.xplanung.xplangml._5._0.LPAbgrenzungType;
import de.xplanung.xplangml._5._0.LPAllgGruenflaecheType;
import de.xplanung.xplangml._5._0.LPAnpflanzungBindungErhaltungType;
import de.xplanung.xplangml._5._0.LPAusgleichType;
import de.xplanung.xplangml._5._0.LPBereichType;
import de.xplanung.xplangml._5._0.LPBiotopverbundflaecheType;
import de.xplanung.xplangml._5._0.LPBodenschutzrechtType;
import de.xplanung.xplangml._5._0.LPErholungFreizeitType;
import de.xplanung.xplangml._5._0.LPFlaechenobjektType;
import de.xplanung.xplangml._5._0.LPForstrechtType;
import de.xplanung.xplangml._5._0.LPGenerischesObjektType;
import de.xplanung.xplangml._5._0.LPGeometrieobjektType;
import de.xplanung.xplangml._5._0.LPLandschaftsbildType;
import de.xplanung.xplangml._5._0.LPLinienobjektType;
import de.xplanung.xplangml._5._0.LPNutzungsAusschlussType;
import de.xplanung.xplangml._5._0.LPNutzungserfordernisRegelungType;
import de.xplanung.xplangml._5._0.LPObjektType;
import de.xplanung.xplangml._5._0.LPPlanType;
import de.xplanung.xplangml._5._0.LPPlanerischeVertiefungType;
import de.xplanung.xplangml._5._0.LPPunktobjektType;
import de.xplanung.xplangml._5._0.LPSchutzPflegeEntwicklungType;
import de.xplanung.xplangml._5._0.LPSchutzobjektInternatRechtType;
import de.xplanung.xplangml._5._0.LPSchutzobjektLandesrechtType;
import de.xplanung.xplangml._5._0.LPSonstigesRechtType;
import de.xplanung.xplangml._5._0.LPTextAbschnittType;
import de.xplanung.xplangml._5._0.LPTextlicheFestsetzungsFlaecheType;
import de.xplanung.xplangml._5._0.LPWasserrechtGemeingebrEinschraenkungNaturschutzType;
import de.xplanung.xplangml._5._0.LPWasserrechtSchutzgebietType;
import de.xplanung.xplangml._5._0.LPWasserrechtSonstigeType;
import de.xplanung.xplangml._5._0.LPWasserrechtWirtschaftAbflussHochwSchutzType;
import de.xplanung.xplangml._5._0.LPZuBegruenendeGrundstueckflaecheType;
import de.xplanung.xplangml._5._0.LPZwischennutzungType;
import de.xplanung.xplangml._5._0.RPAchseType;
import de.xplanung.xplangml._5._0.RPBereichType;
import de.xplanung.xplangml._5._0.RPBodenschutzType;
import de.xplanung.xplangml._5._0.RPEinzelhandelType;
import de.xplanung.xplangml._5._0.RPEnergieversorgungType;
import de.xplanung.xplangml._5._0.RPEntsorgungType;
import de.xplanung.xplangml._5._0.RPErholungType;
import de.xplanung.xplangml._5._0.RPErneuerbareEnergieType;
import de.xplanung.xplangml._5._0.RPForstwirtschaftType;
import de.xplanung.xplangml._5._0.RPFreiraumType;
import de.xplanung.xplangml._5._0.RPFunktionszuweisungType;
import de.xplanung.xplangml._5._0.RPGenerischesObjektType;
import de.xplanung.xplangml._5._0.RPGeometrieobjektType;
import de.xplanung.xplangml._5._0.RPGewaesserType;
import de.xplanung.xplangml._5._0.RPGrenzeType;
import de.xplanung.xplangml._5._0.RPGruenzugGruenzaesurType;
import de.xplanung.xplangml._5._0.RPHochwasserschutzType;
import de.xplanung.xplangml._5._0.RPIndustrieGewerbeType;
import de.xplanung.xplangml._5._0.RPKlimaschutzType;
import de.xplanung.xplangml._5._0.RPKommunikationType;
import de.xplanung.xplangml._5._0.RPKulturlandschaftType;
import de.xplanung.xplangml._5._0.RPLaermschutzBauschutzType;
import de.xplanung.xplangml._5._0.RPLandwirtschaftType;
import de.xplanung.xplangml._5._0.RPLegendenobjektType;
import de.xplanung.xplangml._5._0.RPLuftverkehrType;
import de.xplanung.xplangml._5._0.RPNaturLandschaftType;
import de.xplanung.xplangml._5._0.RPNaturschutzrechtlichesSchutzgebietType;
import de.xplanung.xplangml._5._0.RPObjektType;
import de.xplanung.xplangml._5._0.RPPlanType;
import de.xplanung.xplangml._5._0.RPPlanungsraumType;
import de.xplanung.xplangml._5._0.RPRadwegWanderwegType;
import de.xplanung.xplangml._5._0.RPRaumkategorieType;
import de.xplanung.xplangml._5._0.RPRohstoffType;
import de.xplanung.xplangml._5._0.RPSchienenverkehrType;
import de.xplanung.xplangml._5._0.RPSiedlungType;
import de.xplanung.xplangml._5._0.RPSonstVerkehrType;
import de.xplanung.xplangml._5._0.RPSonstigeInfrastrukturType;
import de.xplanung.xplangml._5._0.RPSonstigerFreiraumschutzType;
import de.xplanung.xplangml._5._0.RPSonstigerSiedlungsbereichType;
import de.xplanung.xplangml._5._0.RPSozialeInfrastrukturType;
import de.xplanung.xplangml._5._0.RPSperrgebietType;
import de.xplanung.xplangml._5._0.RPSportanlageType;
import de.xplanung.xplangml._5._0.RPStrassenverkehrType;
import de.xplanung.xplangml._5._0.RPTextAbschnittType;
import de.xplanung.xplangml._5._0.RPVerkehrType;
import de.xplanung.xplangml._5._0.RPWasserschutzType;
import de.xplanung.xplangml._5._0.RPWasserverkehrType;
import de.xplanung.xplangml._5._0.RPWasserwirtschaftType;
import de.xplanung.xplangml._5._0.RPWohnenSiedlungType;
import de.xplanung.xplangml._5._0.RPZentralerOrtType;
import de.xplanung.xplangml._5._0.SOBereichType;
import de.xplanung.xplangml._5._0.SOBodenschutzrechtType;
import de.xplanung.xplangml._5._0.SODenkmalschutzrechtType;
import de.xplanung.xplangml._5._0.SOFlaechenobjektType;
import de.xplanung.xplangml._5._0.SOForstrechtType;
import de.xplanung.xplangml._5._0.SOGebietType;
import de.xplanung.xplangml._5._0.SOGeometrieobjektType;
import de.xplanung.xplangml._5._0.SOGrenzeType;
import de.xplanung.xplangml._5._0.SOLinienobjektType;
import de.xplanung.xplangml._5._0.SOLuftverkehrsrechtType;
import de.xplanung.xplangml._5._0.SOObjektType;
import de.xplanung.xplangml._5._0.SOPlanType;
import de.xplanung.xplangml._5._0.SOPunktobjektType;
import de.xplanung.xplangml._5._0.SOSchienenverkehrsrechtType;
import de.xplanung.xplangml._5._0.SOSchutzgebietNaturschutzrechtType;
import de.xplanung.xplangml._5._0.SOSchutzgebietSonstigesRechtType;
import de.xplanung.xplangml._5._0.SOSchutzgebietWasserrechtType;
import de.xplanung.xplangml._5._0.SOSonstigesRechtType;
import de.xplanung.xplangml._5._0.SOStrassenverkehrsrechtType;
import de.xplanung.xplangml._5._0.SOTextAbschnittType;
import de.xplanung.xplangml._5._0.SOWasserrechtType;
import de.xplanung.xplangml._5._0.XPAbstraktesPraesentationsobjektType;
import de.xplanung.xplangml._5._0.XPBegruendungAbschnittType;
import de.xplanung.xplangml._5._0.XPBereichType;
import de.xplanung.xplangml._5._0.XPFPOType;
import de.xplanung.xplangml._5._0.XPLPOType;
import de.xplanung.xplangml._5._0.XPLTOType;
import de.xplanung.xplangml._5._0.XPNutzungsschabloneType;
import de.xplanung.xplangml._5._0.XPObjektType;
import de.xplanung.xplangml._5._0.XPPPOType;
import de.xplanung.xplangml._5._0.XPPTOType;
import de.xplanung.xplangml._5._0.XPPlanType;
import de.xplanung.xplangml._5._0.XPPraesentationsobjektType;
import de.xplanung.xplangml._5._0.XPRasterdarstellungType;
import de.xplanung.xplangml._5._0.XPTPOType;
import de.xplanung.xplangml._5._0.XPTextAbschnittType;
import de.xplanung.xplangml._5._0.XPlanAuszugType;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;


/**
 * <p>Java-Klasse für FeaturePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FeaturePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractFeature"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeaturePropertyType", propOrder = {
    "abstractFeature"
})
public class FeaturePropertyType {

    @XmlElementRef(name = "AbstractFeature", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractFeatureType> abstractFeature;
    @XmlAttribute(name = "owns")
    protected Boolean owns;
    @XmlAttribute(name = "nilReason")
    protected List<String> nilReason;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * Ruft den Wert der abstractFeature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BPGenerischesObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPLaermschutzBauschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPEntsorgungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPGewaesserType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOSchutzgebietNaturschutzrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPAchseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSonstigeInfrastrukturType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPBodenschaetzeFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPKeineZentrAbwasserBeseitigungFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPNaturschutzrechtlichesSchutzgebietType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPWaldFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPAufschuettungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPFlaechenschlussobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPWasserverkehrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPPrivilegiertesVorhabenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPVeraenderungssperreType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPEinfahrtPunktType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPAusgleichsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPGruenzugGruenzaesurType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPGruenFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPUeberlagerungsobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPLandwirtschaftsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPLinienobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPLandschaftsbildType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPPPOType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPZuBegruenendeGrundstueckflaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPBebauungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPAbgrabungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPGeometrieobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPAllgGruenflaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPLandwirtschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SODenkmalschutzrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPAbstraktesPraesentationsobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPBauLinieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPPunktobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPSchutzPflegeEntwicklungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPLuftverkehrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOGebietType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPWasserwirtschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPErneuerbareEnergieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPFlaechenschlussobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPNutzungsAusschlussType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPHochwasserschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPBereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPStrassenVerkehrsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPWasserrechtSchutzgebietType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPWasserschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPLTOType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPStrassenverkehrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPGrenzeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPVerkehrsflaecheBesondererZweckbestimmungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPBereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPGewaesserType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPAnpflanzungBindungErhaltungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPNebenanlagenAusschlussFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPBodenschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPBereichOhneEinAusfahrtLinieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPLinienobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPZentralerOrtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPStrassenverkehrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPSonstigesRechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPPTOType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPSchutzPflegeEntwicklungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSonstigerSiedlungsbereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPTextAbschnittType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPRegelungVergnuegungsstaettenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPTextAbschnittType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPAufschuettungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPVerEntsorgungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPFreiFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPNutzungserfordernisRegelungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPFlaechenobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSperrgebietType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPKommunikationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPRohstoffType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPTechnischeMassnahmenFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPErhaltungsBereichFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPStrassenbegrenzungsLinieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPTextAbschnittType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPVorbehalteFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPKennzeichnungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPKennzeichnungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPZentralerVersorgungsbereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPWasserrechtSonstigeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPGruenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPFPOType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPSchutzPflegeEntwicklungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPBodenschutzrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPWasserwirtschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPNutzungsschabloneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPHoehenMassType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPWasserrechtGemeingebrEinschraenkungNaturschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPLandwirtschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOGeometrieobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPNutzungsartenGrenzeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPAusgleichsMassnahmeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOSchutzgebietSonstigesRechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPGeometrieobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOSchienenverkehrsrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPRasterdarstellungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSonstigerFreiraumschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPBiotopverbundflaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOLinienobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOPunktobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPWasserrechtWirtschaftAbflussHochwSchutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPVerkehrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPTextlicheFestsetzungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPSpielSportanlageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOLuftverkehrsrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPForstrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPPlanungsraumType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPVerEntsorgungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPBodenschaetzeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPGenerischesObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPUeberlagerungsobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPAusgleichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPTextlicheFestsetzungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPZwischennutzungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPTextAbschnittType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPSchutzobjektLandesrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPImmissionsschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOBodenschutzrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOGrenzeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPRaumkategorieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPGemeinbedarfsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPBereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSozialeInfrastrukturType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPRadwegWanderwegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPLinienobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPErholungFreizeitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPPunktobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPFlaechenobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPKlimaschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPSpielSportanlagenFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPBauGrenzeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPGenerischesObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOFlaechenobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPRekultivierungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOWasserrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPNaturLandschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPEnergieversorgungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPWohnenSiedlungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPWasserwirtschaftsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPGemeinbedarfType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPWegerechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPAbstandsMassType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPNebenanlagenFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPFunktionszuweisungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPLPOType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPWaldFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPGemeinschaftsanlagenZuordnungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPEingriffsBereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPStrassenkoerperType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPSchutzPflegeEntwicklungsMassnahmeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPAusgleichsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPEinzelhandelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPFestsetzungNachLandesrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPBereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSonstVerkehrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSchienenverkehrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOForstrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPAnpassungKlimawandelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOSonstigesRechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPBesondererNutzungszweckFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPUeberbaubareGrundstuecksFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPTextlicheDarstellungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPIndustrieGewerbeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPGewaesserFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOSchutzgebietWasserrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPErholungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPKleintierhaltungFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPTPOType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPEinfahrtsbereichLinieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPFoerderungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPAbgrabungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPForstwirtschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPSchutzobjektInternatRechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPGeometrieobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPGenerischesObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPBaugebietsTeilFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPlanAuszugType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPFlaechenobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPGemeinschaftsanlagenFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPBereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPKulturlandschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSiedlungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPSpezielleBauweiseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPGeometrieobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPUnverbindlicheVormerkungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPPersGruppenBestimmteFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPAbstandsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPFreiraumType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPFirstRichtungsLinieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPNutzungsbeschraenkungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPPunktobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPPlanerischeVertiefungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPAbgrenzungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPBegruendungAbschnittType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPPraesentationsobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOStrassenverkehrsrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSportanlageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPTextAbschnittType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPAnpflanzungBindungErhaltungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOBereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPGebaeudeFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPUnverbindlicheVormerkungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPLegendenobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOTextAbschnittType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractFeatureType> getAbstractFeature() {
        return abstractFeature;
    }

    /**
     * Legt den Wert der abstractFeature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BPGenerischesObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPLaermschutzBauschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPEntsorgungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPGewaesserType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOSchutzgebietNaturschutzrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPAchseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSonstigeInfrastrukturType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPBodenschaetzeFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPKeineZentrAbwasserBeseitigungFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPNaturschutzrechtlichesSchutzgebietType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPWaldFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPAufschuettungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPFlaechenschlussobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPWasserverkehrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPPrivilegiertesVorhabenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPVeraenderungssperreType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPEinfahrtPunktType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPAusgleichsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPGruenzugGruenzaesurType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPGruenFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPUeberlagerungsobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPLandwirtschaftsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPLinienobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPLandschaftsbildType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPPPOType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPZuBegruenendeGrundstueckflaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPBebauungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPAbgrabungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPGeometrieobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPAllgGruenflaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPLandwirtschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SODenkmalschutzrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPAbstraktesPraesentationsobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPBauLinieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPPunktobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPSchutzPflegeEntwicklungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPLuftverkehrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOGebietType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPWasserwirtschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPErneuerbareEnergieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPFlaechenschlussobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPNutzungsAusschlussType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPHochwasserschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPBereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPStrassenVerkehrsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPWasserrechtSchutzgebietType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPWasserschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPLTOType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPStrassenverkehrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPGrenzeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPVerkehrsflaecheBesondererZweckbestimmungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPBereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPGewaesserType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPAnpflanzungBindungErhaltungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPNebenanlagenAusschlussFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPBodenschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPBereichOhneEinAusfahrtLinieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPLinienobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPZentralerOrtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPStrassenverkehrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPSonstigesRechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPPTOType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPSchutzPflegeEntwicklungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSonstigerSiedlungsbereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPTextAbschnittType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPRegelungVergnuegungsstaettenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPTextAbschnittType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPAufschuettungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPVerEntsorgungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPFreiFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPNutzungserfordernisRegelungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPFlaechenobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSperrgebietType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPKommunikationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPRohstoffType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPTechnischeMassnahmenFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPErhaltungsBereichFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPStrassenbegrenzungsLinieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPTextAbschnittType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPVorbehalteFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPKennzeichnungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPKennzeichnungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPZentralerVersorgungsbereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPWasserrechtSonstigeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPGruenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPFPOType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPSchutzPflegeEntwicklungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPBodenschutzrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPWasserwirtschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPNutzungsschabloneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPHoehenMassType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPWasserrechtGemeingebrEinschraenkungNaturschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPLandwirtschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOGeometrieobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPNutzungsartenGrenzeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPAusgleichsMassnahmeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOSchutzgebietSonstigesRechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPGeometrieobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOSchienenverkehrsrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPRasterdarstellungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSonstigerFreiraumschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPBiotopverbundflaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOLinienobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOPunktobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPWasserrechtWirtschaftAbflussHochwSchutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPVerkehrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPTextlicheFestsetzungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPSpielSportanlageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOLuftverkehrsrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPForstrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPPlanungsraumType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPVerEntsorgungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPBodenschaetzeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPGenerischesObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPUeberlagerungsobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPAusgleichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPTextlicheFestsetzungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPZwischennutzungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPTextAbschnittType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPSchutzobjektLandesrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPImmissionsschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOBodenschutzrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOGrenzeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPRaumkategorieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPGemeinbedarfsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPBereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSozialeInfrastrukturType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPRadwegWanderwegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPLinienobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPErholungFreizeitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPPunktobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPFlaechenobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPKlimaschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPSpielSportanlagenFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPBauGrenzeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPGenerischesObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOFlaechenobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPRekultivierungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOWasserrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPNaturLandschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPEnergieversorgungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPWohnenSiedlungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPWasserwirtschaftsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPGemeinbedarfType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPWegerechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPAbstandsMassType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPNebenanlagenFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPFunktionszuweisungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPLPOType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPWaldFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPGemeinschaftsanlagenZuordnungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPEingriffsBereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPStrassenkoerperType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPSchutzPflegeEntwicklungsMassnahmeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPAusgleichsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPEinzelhandelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPFestsetzungNachLandesrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPBereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSonstVerkehrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSchienenverkehrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOForstrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPAnpassungKlimawandelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOSonstigesRechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPBesondererNutzungszweckFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPUeberbaubareGrundstuecksFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPTextlicheDarstellungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPIndustrieGewerbeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPGewaesserFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOSchutzgebietWasserrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPErholungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPKleintierhaltungFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPTPOType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPEinfahrtsbereichLinieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPFoerderungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPAbgrabungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPForstwirtschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPSchutzobjektInternatRechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPGeometrieobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPGenerischesObjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPBaugebietsTeilFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPlanAuszugType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPFlaechenobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPGemeinschaftsanlagenFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPBereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPKulturlandschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSiedlungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPSpezielleBauweiseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPGeometrieobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPUnverbindlicheVormerkungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPPersGruppenBestimmteFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPAbstandsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPFreiraumType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPFirstRichtungsLinieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPNutzungsbeschraenkungsFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPPunktobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPPlanerischeVertiefungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPAbgrenzungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPBegruendungAbschnittType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPPraesentationsobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOStrassenverkehrsrechtType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSportanlageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPTextAbschnittType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LPAnpflanzungBindungErhaltungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOBereichType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BPGebaeudeFlaecheType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FPUnverbindlicheVormerkungType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPLegendenobjektType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SOTextAbschnittType }{@code >}
     *     
     */
    public void setAbstractFeature(JAXBElement<? extends AbstractFeatureType> value) {
        this.abstractFeature = value;
    }

    /**
     * Ruft den Wert der owns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Legt den Wert der owns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(Boolean value) {
        this.owns = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.SIMPLE;
        } else {
            return type;
        }
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der href-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Legt den Wert der href-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Ruft den Wert der role-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Legt den Wert der role-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Ruft den Wert der arcrole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Legt den Wert der arcrole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der show-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Legt den Wert der show-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    /**
     * Ruft den Wert der actuate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Legt den Wert der actuate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

}
