package com.github.aignatev.intellijxdtsyntax.xdt

/**
 * This file is generated from the official documentation of the KBV.
 * https://update.kbv.de/ita-update/Service-Informationen/Feldkatalog/KBV_ITA_SIEX_Feld_und_Regelkatalog.pdf
 * On date 2025-05-03
 */
val kvdtFieldDefinitions =
    listOf(
        KvdtField("0001", "Version XDT", 0, 12, "A", "", ""),
        KvdtField("0080", "ID der Fallakte oder Studie", 0, 60, "A", "", ""),
        KvdtField("0081", "Bezeichnung der Fallakte oder Studie", 0, 60, "A", "", ""),
        KvdtField("0101", "KBV-Prüfnummer", 16, 16, "A", "", ""),
        KvdtField(
            "0102",
            "Softwareverantwortlicher (SV)",
            0,
            60,
            "A",
            "",
            """Softwareverantwortlicher ist die juristische oder natürliche Person, die für die Einhaltung der Zulassungskriterien im rechtlichen Sinne gegenüber der KBV verantwortlich zeichnet."""),
        KvdtField(
            "0103",
            "Software",
            0,
            60,
            "A",
            "",
            """Name der zugelassenen Software oder Softwarevariante. Bei Einsatz einer Softwarevariante ist deren Name zu hinterlegen."""),
        KvdtField("0104", "Grouper-Software", 0, 60, "A", "", ""),
        KvdtField(
            "0105",
            "KBV-Prüfnummer",
            15,
            17,
            "A",
            "",
            """Die Komponenten der Prüfnummer werden durch „/“ geternnt und werden als Zeichen mitgezählt"""),
        KvdtField("0111", "Email-Adresse des SV", 0, 60, "A", "", ""),
        KvdtField("0121", "Straße des SV", 0, 60, "A", "", ""),
        KvdtField("0122", "PLZ des SV", 0, 7, "A", "", ""),
        KvdtField("0123", "Ort des SV", 0, 60, "A", "", ""),
        KvdtField("0124", "Telefonnummer des SV", 0, 60, "A", "", ""),
        KvdtField("0125", "Telefaxnummer des SV", 0, 60, "A", "", ""),
        KvdtField(
            "0126",
            "Regionaler Systembetreuer (SB)",
            0,
            60,
            "A",
            "",
            """Regionaler Systembetreuer ist die juristische oder natürliche Person, die im Auftrag des Softwareverantwortlichen Dienstleistungen bzgl. der zugelassenen Software vornimmt. """),
        KvdtField("0127", "Straße des SB", 0, 60, "A", "", ""),
        KvdtField("0128", "PLZ des SB", 0, 7, "A", "", ""),
        KvdtField("0129", "Ort des SB", 0, 60, "A", "", ""),
        KvdtField("0130", "Telefonnummer des SB", 0, 60, "A", "", ""),
        KvdtField("0131", "Telefaxnummer des SB", 0, 60, "A", "", ""),
        KvdtField(
            "0132",
            "Release-Stand der Software",
            0,
            60,
            "A",
            "",
            """Dieses Feld dient grundsätzlich zur Übertragung des Release-Stands der Software. Das Feld kann darüber hinaus im Rahmen von KV-spezifischen Verträ- gen zur Übermittlung sonstiger Informationen verwendet werden. Das Feld muss entsprechend folgende Informationen enthalten können: Zeichen 1-23: Versionsnummer 24: fixes Trennzeichen „|“ 1 25-60: sonstige Informationen"""),
        KvdtField("0150", "Postleitzahl", 5, 5, "N", """00000-99999""", """Beispiel: 50171"""),
        KvdtField(
            "0200",
            "Betriebsstätten-ID",
            0,
            60,
            "A",
            "",
            """Einrichtungen zu denen der Arzt gehört (beliebiger Identifier, falls (N)BSNR nicht existiert, eindeutige alphanumerische Kennung z.B. bei Privatpraxen)"""),
        KvdtField("0200", "NBSNR", 9, 9, "N", "", """10123401"""),
        KvdtField(
            "0201",
            "Betriebs- (BSNR) oder Nebenbetriebsstättennummer (NBSNR)",
            9,
            9,
            "N",
            """35nnnnnnn (Krankenhaus)
kknnnnnnn""",
            """Die Werte von „kk“ enthalten Zulässige UKV/OKV-Kennungen in den Arztnummern und Knapp-schaftskennung
kk=(01-03, 06-21, 24, 25, 27, 28, 31, 37-73, 78-81, 83, 85-88, 93-96, 98, 99)"""),
        KvdtField("0203", "(N)BSNR-/Krankenhaus-Bezeichnung", 0, 60, "A", "", ""),
        KvdtField(
            "0204",
            "Status der Betriebsstätte",
            1,
            1,
            "N",
            """[1, 2, 3, 4, 5, 6]""",
            """1 = Arztpraxis
2 = Laborarztpraxis
3 = Laborgemeinschaft
4 = sonstige medizinische Einrichtung 5 = Hauptbetriebsstätte
6 = Nebenbetriebsstätte"""),
        KvdtField("0205", "Straße der (N)BSNR-/Krankenhaus-Adresse", 0, 60, "A", "", ""),
        KvdtField("0208", "Telefonnummer", 0, 60, "A", "", ""),
        KvdtField("0209", "Telefaxnummer", 0, 60, "A", "", ""),
        KvdtField("0211", "Arztname/Erläuterung", 0, 60, "A", "", ""),
        KvdtField(
            "0212",
            "Lebenslange Arztnummer (LANR)",
            9,
            9,
            "N",
            """nnnnnnmff""",
            """n = Ziffer [0-9]
m = Prüfziffer *
ff = erlaubter Inhalt gemäß Anlage 35 des BAR-Schlüsselverzeichnisses, tolerierter Ersatzwert für die Ziffern 8 - 9: 00
Ärzte ohne LANR: 999999900"""),
        KvdtField(
            "0213",
            "Institutionskennzeichen (IK) der Betriebsstätte KVDT: Krankenhaus-IK (im Rahmen der ASV-Abrechnung)",
            9,
            9,
            "N",
            "",
            """Gemäß § 293 SGB V wird bei der Datenübermittlung zwischen den gesetzlichen Kranken-kassen und den Leistungserbringern ein IK als eindeutige Identifizierung verwendet. Kann im Rahmen der ASV-Abrechnung eines Krankenhauses verwendet werden."""),
        KvdtField(
            "0214",
            "KV-Bereich",
            2,
            2,
            "N",
            "",
            """01 = Schleswig-Holstein
02 = Hamburg
03 = Bremen
17 = Niedersachsen
18 = Dortmund
19 = Münster
20 = Dortmund
21 = Aachen
24 = Düsseldorf
25 = Duisburg
27 = Köln
28 = Linker Niederrhein
31 = Ruhr
37 = Bergisch-Land
39 = Darmstadt
40 = Frankfurt/Main
41 = Gießen
42 = Kassel
43 = Limburg
44 = Marburg
45 = Wiesbaden
47 = Koblenz
48 = Rheinhessen
49 = Pfalz
50 = Trier
51 = Rheinland-Pfalz
55 = Karlsruhe
60 = Freiburg
61 = Stuttgart
62 = Reutlingen
63 = München Stadt u. Land
64 = Oberbayern
65 = Oberfranken
66 = Mittelfranken
67 = Unterfranken
68 = Oberpfalz
69 = Niederbayern
70 = Schwaben
72 = Berlin
73 = Saarland
78 = Mecklenburg-Vorpommern
79 = Potsdam
80 = Cottbus
81 = Frankfurt/Oder
83 = Brandenburg
85 = Magdeburg
86 = Halle
87 = Dessau
93 = Thüringen
94 = Chemnitz
95 = Dresden
96 = Leipzig
99 = Knappschaft"""),
        KvdtField("0215", "PLZ der (N)BSNR-/Krankenhaus-Adresse", 0, 7, "A", "", ""),
        KvdtField("0216", "Ort der (N)BSNR-/Krankenhaus-Adresse", 0, 60, "A", "", ""),
        KvdtField("0218", "E-Mail der Betriebsstätte/Praxis/Krankenhaus", 0, 60, "A", "", ""),
        KvdtField("0219", "Titel des Arztes", 0, 100, "A", "", ""),
        KvdtField("0220", "Arztvorname", 0, 45, "A", "", ""),
        KvdtField("0221", "Namenszusatz des Arztes", 0, 20, "A", "", ""),
        KvdtField(
            "0222",
            "ASV-Teamnummer",
            9,
            9,
            "N",
            """00nnnnnnP""",
            """n = Ziffer [0-9]
P=Prüfziffer"""),
        KvdtField(
            "0223",
            "Pseudo-LANR für Krankenhausärzte im Rahmen der ASV-Abrechnung",
            9,
            9,
            "N",
            """555555nff""",
            """n = Ordnungsnummer (zulässige Werte 0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
ff = Fachgruppencode gemäß der jeweils gültigen Anlage 2 der Richtlinie"""),
        KvdtField("0224", "Produkttypversion des Konnektors", 0, 20, "A", "", ""),
        KvdtField(
            "0225",
            "TI-Fachanwendung",
            1,
            1,
            "N",
            """[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]""",
            """0 = ePA Stufe 1
1 = eRezept
2 = ePA Stufe 2
3 = NFDM
4 = eMP
5 = KIM
6 = eAU
7 = eArztbrief
8 = Kartenterminal
9 = SMC-B
10 = eHBA
11 = ePA Stufe 3"""),
        KvdtField(
            "0226",
            "Systemunterstützung / Ausstattung der Praxis",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = nein
1 = ja"""),
        KvdtField("0227", "Ablaufdatum des KonnektorZertifikats", 8, 8, "D", "", ""),
        KvdtField("0228", "Produktname des Konnektors", 0, 60, "A", "", ""),
        KvdtField(
            "0300", "Abrechnung von (zertifikatspflichtigen) Laborleistungen", 1, 1, "N", "", ""),
        KvdtField("0301", "pnSD/uu-Analysen", 1, 1, "N", "", ""),
        KvdtField("0302", "Gerätetyp", 0, 60, "A", "", ""),
        KvdtField("0303", "Hersteller", 0, 60, "A", "", ""),
        KvdtField("0304", "Analyt-ID", 3, 3, "N", "", ""),
        KvdtField("0305", "RV-Zertifikat", 1, 1, "N", "", ""),
        KvdtField(
            "0306",
            "Vertrags-ID des behandelnden Arztes",
            0,
            60,
            "A",
            "",
            """Nur bei Selektivverträgen zu verwenden."""),
        KvdtField(
            "0307",
            "Arzt-ID eines Arztes",
            0,
            60,
            "A",
            "",
            """Eindeutige ID, über welche der Einsender in seiner Eigenschaft als Arzt zusätzlich zu einer LANR verfügt"""),
        KvdtField(
            "0308",
            "Typ der Arzt-ID",
            1,
            1,
            "N",
            """[2, 3, 4, 5, 6, 7, 9]""",
            """2 = IK des Arztes
3 = Telematik-ID
4 = ID für GEVK-Verträge
5 = ID für HÄVG-Verträge
6 = ID für MEDI-Verträge
7 = Selektivvertrag
9 = Sonstige"""),
        KvdtField(
            "0600",
            "Name der Einrichtung des Auftraggebers",
            0,
            60,
            "A",
            "",
            """Freitext, z.B. Gesundheitsamt Musterstadt"""),
        KvdtField(
            "1202",
            "Adresstyp",
            1,
            1,
            "N",
            """[1, 2]""",
            """1 = Physischer Ort
2 = Postanschrift"""),
        KvdtField(
            "1250",
            "Organisation/Firma",
            0,
            60,
            "A",
            "",
            """Organisation zu der die Person gehört oder Organisationsadresse ohne Personenzuordnung"""),
        KvdtField(
            "1251", "Rechtsform der Organisation", 0, 60, "A", "", """Beispiel: „e.V.“, „GmbH“"""),
        KvdtField(
            "1252",
            "Funktionsbezeichnung oder Titel der Person innerhalb der Organisation",
            0,
            60,
            "A",
            "",
            """Beispiel: „Geschäftsführer“"""),
        KvdtField("2002", "Kassenname", 0, 28, "A", "", ""),
        KvdtField(
            "2018",
            "Kostenträgergruppe",
            2,
            2,
            "N",
            """[01, 02, 03, 04, 05, 11, 35, 59, 71, 73, 75, 76, 77, 81, 82, 86, 88]""",
            """01 = Allgemeine Ortskrankenkasse (AOK)
02 = Landwirtschaftliche Krankenkasse (LKK)
03 = Innungskrankenkasse (IKK)
04 = Betriebskrankenkasse (BKK)
05 = Knappschaft Bahn See
11 = Verband der Ersatzkassen (VdEK)
35 = Ausländische Kostenträger (AUS)
59 = Sozialhilfeträger (SHT) / Asylstelle (AS)
71 = Bundesgrenzschutz (BGS)
73 = Polizei (POL)/ Feuerwehr (FW) / Justizvollzugsanstalt (JVA)
75 = Bundeswehr (BW)
76 = Gesundheitsämter(GSA)
77 = Medizinischer Dienst der Krankenkassen (MDK)
81 = Postbeamtenkrankenkasse, Mitglieder A (PBA)
82 = Postbeamtenkrankenkasse, Dienstunfall (PBD)
86 = Jugendarbeitsschutzuntersuchung (JAS)
88 = Träger der gesetzlichen Unfallversicherer (UV)"""),
        KvdtField(
            "3000",
            "Patientennummer",
            0,
            20,
            "A",
            "",
            """Dieses Feld dient zur Übertragung der praxisinternen Patientennummer. Diese Angabe kann im Rahmen der Fehlerprotokoll-Schnittstelle des ADTPrüfmoduls verwendet werden, vgl. ADT-Prüfmodul-Handbuch."""),
        KvdtField("3003", "Schein-ID", 0, 60, "A", "", ""),
        KvdtField("3005", "Kennziffer SA", 0, 27, "A", "", ""),
        KvdtField(
            "3006",
            "CDM Version",
            5,
            11,
            "A",
            "",
            """eGK-Versichertenstammdaten-Schema-Version

Auf der eGK wird in der Datei EF.StatusVD (Element /Version) die Schemaversion der auf dieser Karte gespeicherten Versichertenstammdaten hinterlegt.

Die eigentlichen Versichertendaten werden auf der eGK in mehreren Dateien, beispielsweise u.a. in Datei EF.VD abgelegt. Diese Dateien enthalten ebenfalls jeweils in der „ersten“ Zeile die Angabe zur CDM-Version, Beispiel: <tns:UC_AllgemeineVersicherungsdatenXML xmlns:tns=“http://ws.gematik.de/fa/vsds/UC_AllgemeineVersicherungsdatenXML/v5.1“ CDM_VERSION=“n.n.n“>.

Laut Auskunft der gematik sind die Schemaversionen dieser Dateien untereinander immer konsistent!

Das Feld muss übertragen werden, wenn eine eGK eingelesen wurde. Dies gilt auch, wenn die Daten von einem mobilen Kartenterminal in ein PVS übernommen werden.

Eine manuelle Erfassung durch den
Anwender ist nicht gefordert!"""),
        KvdtField(
            "3010",
            "Datum und Uhrzeit der Onlineprüfung und -aktualisierung (Timestamp)",
            14,
            14,
            "N",
            """JJJJMMTThhmmss
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)
hh = Stunde (00-23)
mm = Minute (00-59)
ss = Sekunde (00-59)""",
            """Auf der eGK wird der „Prüfungsnachweis“ in der Datei EF.PN abgelegt.

Im Prüfungsnachweis können die folgenden Inhalte abgebildet werden:
- Timestamp (TS)
- Ergebnis der Onlineprüfung und –aktualiserung (E)
- Error-Code (Rückgabewert) (EC)
- Prüfziffer des Fachdienstes (PZ)

Diese Inhalte müssen entsprechend in den Feldern FK 3010 – 3013 unver- ändert übertragen werden.

Da als Zeitzone für den Timestamp im Element /PN/TS UTC verwendet werden muss, gilt diese Festlegung auch für FK 3010.

Weitere Informationen sind dem aktuellen „Implementierungsleitfaden Primärsysteme – Telematikinfrastruktur (TI)“ und dem aktuellen Dokument „Systemspezifisches Konzept Versichertenstammdatenmanagement (VSDM)“ der gematik zu entnehmen.

Inhalt von Element /PN/TS"""),
        KvdtField(
            "3011",
            "Ergebnis der Onlineprüfung und –aktualisierung",
            1,
            1,
            "N",
            "",
            """Inhalt von Element /PN/E"""),
        KvdtField("3012", "Error-Code", 0, 5, "N", "", """Inhalt von Element /PN/EC"""),
        KvdtField(
            "3013",
            "Prüfziffer des Fachdienstes",
            0,
            128,
            "A",
            "",
            """Inhalt von Element /PN/PZ"""),
        KvdtField(
            "3100",
            "Namenszusatz",
            0,
            20,
            "A",
            "",
            """Codierung gemäß DEÜV, Anlage 07 (Tabelle der gültigen Namenszusätze) unter http://www.gkv-datenaustausch.de/arbeitgeber/deuev/gemeinsame_rundschreiben/gemeinsame_rundschreiben.jsp"""),
        KvdtField("3101", "Name", 0, 45, "A", "", ""),
        KvdtField("3102", "Vorname", 0, 45, "A", "", ""),
        KvdtField(
            "3103",
            "Geburtsdatum",
            8,
            8,
            "N",
            """JJJJMMTT
T = Tag (00-31)
M = Monat (00-12)
J = Jahr (0000-9999)""",
            """Transformationsempfehlung bei Erfassung eines Geburtsdatums im Ersatzverfahren ohne Arzt-Patienten-Kontakt:

Das in Druckzeile 3, Position 23 – 30 ausgedruckte Geburtsdatum im Format „TT.MM.JJ“ muss in die Form „JJJJMMTT“ transformiert werden.

Wenn JJ <= 3.-4.Stelle der aktuellen vierstelligen Jahreszahl und Datumsangabe < Systemdatum, dann JJJJ = Verkettung (‘20‘,JJ), sonst JJJJ = Verkettung (‘19‘,JJ).

Geburtsdaten in der Form JJJJMM00, JJJJ0000 und 00000000 sind gültige Datumsformate. Anlass ist die Ausgabe von Versichertenkarten mit unvollständigen Geburtsdaten, z. B. ohne Angabe eines Geburtsmonats und/oder eines Geburtstages.

Ersatzwert: 00000000"""),
        KvdtField("3104", "Titel", 0, 20, "A", "", ""),
        KvdtField(
            "3105",
            "Versichertennummer",
            6,
            12,
            "N",
            "",
            """Dieses Feld dient zur Übertragung der KVK-Versichertennummer."""),
        KvdtField(
            "3107",
            "Straße",
            0,
            46,
            "A",
            "",
            """Auf der eGK sind unterschiedliche Strukturen für die Aufnahme einer Straßenadresse und/oder einer Postfachadresse definiert. Falls beide Adresstyen auf einer eGK vorhanden sind, können sowohl die Straßenadresse (FK 3107, 3109, 3112, 3113, 3114, 3115) als auch die Postfachadresse (FK 3121 – 3124) in einem Datensatz 010x vorhanden sein. Die Straßenadresse hat im Rahmen der Bedruckung eines Personalienfeldes Priorität, vgl. „Mappingtabelle_KVK“ [KBV_ITA_VGEX_Datensatzbeschreibung_LDT]

Gemäß der Dokumentation zum eGK-Schema VSD 5.2.0 gilt zum Element ///Strasse folgendes: Gibt den Namen der Strasse an. Wenn die Hausnummer nicht separat abgelegt werden kann, ist es zulässig, die Hausnummer in das Feld Straße zu übernehmen. Anlage 9.4 (...)

Sofern auf einer eGK der Straßenname und die Hausnummer in einem Element ///Strasse abgelegt sind, sind diese unverändert in das Feld „Straße“ (FK 3107) zu übernehmen."""),
        KvdtField("3108", "Versichertenart", 1, 1, "N", """[1, 3, 5]""", ""),
        KvdtField("3109", "Hausnummer", 0, 9, "A", "", ""),
        KvdtField(
            "3110",
            "Geschlecht",
            1,
            1,
            "A",
            """M, W, U, X, D""",
            """M = männlich
W = weiblich
X = unbestimmt
U = unbekannt
D = divers"""),
        KvdtField("3111", "Aufnahmegewicht", 0, 5, "N", "", """3200"""),
        KvdtField("3112", "PLZ", 0, 10, "A", "", ""),
        KvdtField("3113", "Ort", 0, 40, "A", "", ""),
        KvdtField(
            "3114",
            "Wohnsitzlaendercode",
            0,
            3,
            "A",
            "",
            """Codierung gemäß DEÜV, Anlage 08 (Staatsangehörigkeit und Länderkennzeichen für Auslandsanschriften) unter http://www.gkv-datenaustausch.de/arbeitgeber/deuev/gemeinsame_rundschreiben/gemeinsame_rundschreiben.jsp"""),
        KvdtField("3115", "Anschriftenzusatz", 0, 40, "A", "", ""),
        KvdtField(
            "3116",
            "WOP/KV-Bereich",
            2,
            2,
            "N",
            """00-99""",
            """01 = Schleswig-Holstein
02 = Hamburg
03 = Bremen
17 = Niedersachsen
20 = Westfalen-Lippe
38 = Nordrhein
46 = Hessen
51 = Rheinland-Pfalz
52 = Baden-Württemberg
71 = Bayern
72 = Berlin
73 = Saarland
74 = KBV
78 = Mecklenburg-Vorpommern
83 = Brandenburg
88 = Sachsen-Anhalt
93 = Thüringen
98 = Sachsen"""),
        KvdtField(
            "3119",
            "Versicherten_ID",
            10,
            10,
            "A",
            """≠ T555558879""",
            """10-stellige unveränderliche Teil (Versicherten-ID) der eGK-Krankenversichertennummer

Die Berechnung der Prüfziffer

der Versicherten-ID erfolgt nach dem Schema der Anlage 1 der Richtlinie „Organisatorische und technische Richtlinien zur Nutzung der Versicherungsnummer nach §147 SGB VI bei Einführung einer neuen Krankenversichertennummer nach § 290 SGB V, Version 1.5“.

Die Prüfziffer wird mit einem Modulo10-Verfahren ermittelt. Der Buchstabe wird dabei durch zwei Ziffern ersetzt, das A mit 0 und 1, das B mit 0 und 2, ..., und das Z mit 2 und 6. Die Ziffern werden von links nach rechts abwechselnd mit 1 und 2 multipliziert. Es erfolgt eine Quersummenbildung der einzelnen Produkte, mit anschließender Summenbildung der Quersummen.

Die Prüfziffer ergibt sich aus dem Rest der ganzzahligen Division dieser Summe durch 10. Beim Ersatzverfahren oder beim Scannen von gedruckten Patientenstammdaten (z. B. Überweisungsschein im Labor) kann eine Überprüfung zur Vermeidung von Tippbzw. Lesefehlern (OCR) erfolgen."""),
        KvdtField(
            "3120",
            "Vorsatzwort",
            0,
            20,
            "A",
            "",
            """Codierung gemäß DEÜV, Anlage 06 (Tabelle der gültigen Vorsatzworte) unter http://www.gkv-datenaustausch.de/arbeitgeber/deuev/gemeinsame_rundschreiben/gemeinsame_rundschreiben.jsp"""),
        KvdtField("3121", "PostfachPLZ", 0, 10, "A", "", ""),
        KvdtField("3122", "PostfachOrt", 0, 40, "A", "", ""),
        KvdtField(
            "3123",
            "Postfach",
            0,
            8,
            "A",
            "",
            """Dieses Feld dient zur Übertragung der Postfachnummer ohne beschreibendes Schlüsselwort.
Beispiel:
Übertragung der Postfachnummer "12345"
Falsch: 0173123Postf 12
Falsch: 0173123Postfach
Korrekt: 014312312345"""),
        KvdtField(
            "3124",
            "PostfachWohnsitzlaendercode",
            0,
            3,
            "A",
            "",
            """Codierung gemäß DEÜV, Anlage 08 (Staatsangehörigkeit und Länderkennzeichen für Auslandsanschriften) unter http://www.gkvatenaustausch.de/arbeitgeber/deuev/gemeinsame_rundschreiben/gemeinsame_rundschreiben.jsp"""),
        KvdtField(
            "3130",
            "Einschreibestatus Selektivverträge",
            1,
            1,
            "N",
            """[0, 1, 2]""",
            """0= Nicht eingeschrieben
1= Eingeschrieben
2= Einschreibung beantragt"""),
        KvdtField("3131", "Teilnahme von", 8, 8, "D", "", ""),
        KvdtField("3132", "Teilnahme bis", 8, 8, "D", "", ""),
        KvdtField("3133", "Datum der Antragsstellung", 8, 8, "D", "", ""),
        KvdtField(
            "3134",
            "Bezeichnung des Selektivvertrages",
            0,
            60,
            "A",
            "",
            """Die Möglichkeit zum Abschluss von Selektivverträgen besteht im Wesentlichen in der hausarztzentrierten Versorgung (§ 73 b SGB V), in der besonderen ambulanten ärztlichen Versorgung (§ 73 c SGB V), bei strukturierten Behandlungsprogrammen für chronische Erkrankungen (Disease-Management-Programme) (§ 137 f SGB V) und in der Integrierten Versorgung (§§ 140ff SGB V)."""),
        KvdtField(
            "3313",
            "HPV-Impfung",
            1,
            1,
            "N",
            """[1, 2, 3, 4]""",
            """1 = vollständig
2 = unvollständig
3 = keine
4 = unklar"""),
        KvdtField(
            "3314",
            "HPV-HR-Test",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField(
            "3316",
            "HPV-HR-Testergebnis",
            1,
            1,
            "N",
            """[1, 2, 3]""",
            """1 = positiv
2 = negativ
3 = nicht verwertbar"""),
        KvdtField("3317", "HPV-Typ 16/18", 1, 1, "N", """1 = ja""", ""),
        KvdtField(
            "3318",
            "HPV-Test",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField(
            "3319",
            "Ko-Test",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField("3320", "Zeitraum sofort", 1, 1, "N", """1 = ja""", ""),
        KvdtField("3321", "Zeitraum in Monaten", 1, 5, "A", "", ""),
        KvdtField(
            "3322",
            "Alterskategorie",
            1,
            1,
            "N",
            """[1, 2, 3]""",
            """1 = 20-29 Jahre
2 = 30-34 Jahre
3 = ab 35 Jahre"""),
        KvdtField(
            "3412",
            "Blutgruppe-Eurocode",
            6,
            6,
            "A",
            """!Rnnnn (n= [0-9])""",
            """Regeln unter Punkt 4.5 in Technische Spezifikation Eurocode unter http://www.eurocode.org/guides/structures/EurocodeTechnicalSpecification-2-0-0.pdf"""),
        KvdtField(
            "3413",
            "Antikörpersuchtest (gegen Erythrozytenantigene)",
            1,
            1,
            "N",
            """[1, 2, 3, 4, 5]""",
            """1 = positiv
2 = negativ
3 = unspezifisch
4 = in Abklärung
5 = Abklärung empfohlen"""),
        KvdtField("3414", "Spezifität weitere Erythrozytenantigene", 0, 60, "A", "", ""),
        KvdtField("3415", "Spezifität Erythrozytenantikörper", 0, 60, "A", "", ""),
        KvdtField("3416", "Spezifität HLA-, HPA, HNA-Antigene", 0, 60, "A", "", ""),
        KvdtField("3417", "Spezifität HLA-, HPA, HNA-Antikörper", 0, 60, "A", "", ""),
        KvdtField(
            "3418",
            "Direkter Coombstest (DCT)",
            1,
            1,
            "N",
            """[0, 1, 2, 3, 4]""",
            """0 = negativ
1 = 1-fach positiv
2 = 2-fach positiv
3 = 3-fach positiv
4 = 4-fach positiv"""),
        KvdtField(
            "3419",
            "Ergebnis Kreuzprobe",
            0,
            60,
            "A",
            "",
            """Präparatenummer in Eurocode-Format 0-20 Stellen alphanumerisch sowie Freitext Resultat"""),
        KvdtField(
            "3420",
            "Anforderung NHP",
            1,
            1,
            "N",
            """[0, 1]""",
            """NHP = Nothilfepass
0 = Nothilfepass nur bei Nachweis
Erythrozytenantikörper ausfüllen
1 = Nothilfepass ausstellen"""),
        KvdtField(
            "3424",
            "Therapiebeginn",
            8,
            8,
            "D",
            """TTMMJJJJ
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "3425",
            "Therapieende",
            8,
            8,
            "D",
            """TTMMJJJJ
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "3471",
            "Entbindungstermin (errechnet)",
            8,
            8,
            "D",
            """TTMMJJJJ
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "3473",
            "Untersuchungsergebnis durch Auftragslaboratorium erstellt",
            1,
            1,
            "N",
            """1 = ja""",
            ""),
        KvdtField(
            "3564",
            "Text",
            0,
            990,
            "A",
            """Feld kann ohne Inhalt übertragen werden""",
            """Damit wird die Formatierung von zu übertragenden Texten mit Leerzeilen ermöglicht"""),
        KvdtField("3622", "Größe des Patienten", 0, 0, "F", "", ""),
        KvdtField("3623", "Gewicht des Patienten", 0, 0, "F", "", ""),
        KvdtField(
            "3628",
            "Muttersprache",
            0,
            60,
            "A",
            "",
            """Muttersprache ist die in der frühen Kindheit ohne formalen Unterricht erlernte Sprache."""),
        KvdtField("3664", "Anzahl Geburten", 2, 2, "N", "", """Inklusive Fehlgeburten"""),
        KvdtField("3666", "Anzahl Kinder", 2, 2, "N", "", """Selbst geborene Kinder"""),
        KvdtField("3668", "Anzahl Schwangerschaften", 2, 2, "N", "", ""),
        KvdtField("3673", "Dauerdiagnose (ICD-Code)", 3, 6, "A", "", "Länge: 3, 5 ,6"),
        KvdtField("3674", "Diagnosensicherheit Dauerdiagnose", 1, 1, "A", "", ""),
        KvdtField("3675", "Seitenlokalisation Dauerdiagnose", 1, 1, "A", "", ""),
        KvdtField("3676", "Diagnosenerläuterung Dauerdiagnose", 0, 60, "A", "", ""),
        KvdtField("3677", "Diagnosenausnahmetatbestand Dauerdiagnosen", 0, 60, "A", "", ""),
        KvdtField(
            "3689",
            "Status der Medikation",
            1,
            1,
            "N",
            """[1, 2, 3, 4]""",
            """1 = Akutmedikation
2 = Bedarfsmedikation
3 = Dauermedikation
4 = Selbstmedikation"""),
        KvdtField("4101", "Quartal", 5, 5, "N", "", ""),
        KvdtField(
            "4102",
            "Ausstellungsdatum",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "4103",
            "Vermittlungs-/Kontaktart",
            1,
            1,
            "N",
            """1 = TSS-Terminfall
2 = TSS-Akutfall
3 = HA-Vermittlungsfall
4 = Offene Sprechstunde
6 = TSS-Routine-Termin""",
            ""),
        KvdtField("4104", "Abrechnungs-VKNR", 5, 5, "N", "", ""),
        KvdtField(
            "4105", "Ergänzende Informationen zur Vermittlungs-/Kontaktart", 0, 60, "A", "", ""),
        KvdtField(
            "4106",
            "Kostenträger-Abrechnungsbereich (KTAB)",
            2,
            2,
            "N",
            """[00, 01, 02, 03, 04, 05, 06, 07, 08, 09]""",
            """00 = Primärabrechnung
01 = Sozialversicherungsabkommen (SVA)
02 = Bundesversorgungsgesetz (BVG)
03 = Bundesentschädigungsgesetz (BEG)
04 = Grenzgänger (GG)
05 = Rheinschiffer (RHS)
06 = Sozialhilfeträger, ohne Asylstellen (SHT)
07 = Bundesvertriebenengesetz (BVFG)
08 = Asylstellen (AS)
09 = Schwangerschaftsabbrüche"""),
        KvdtField(
            "4107",
            "Abrechnungsart",
            1,
            1,
            "N",
            """[1, 2, 3]""",
            """1 = PKA (Primärkassen)
2 = EKK (Ersatzkassen)
3 = SKT (Sonstige Kostenträger)"""),
        KvdtField("4108", "Zulassungsnummer (mobiles Lesegerät)", 0, 40, "A", "", ""),
        KvdtField(
            "4109",
            "letzter Einlesetag der Versichertenkarte im Quartal",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "4110",
            "VersicherungsschutzEnde",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            """Transformation des KVK-Feldes „Bisdatum der Gültigkeit“ im Format „MMJJ“ in die Form „JJJJMMTT“ notwendig, wobei TT = letzter möglicher Tag dieses Monats und JJJJ = Verkettung (’20‘,JJ), vgl. Mappingtabelle_KVK [KBV_ITA_VGEX_Datensatzbeschreibung_LDT]"""),
        KvdtField("4111", "Kostentraegerkennung", 9, 9, "N", "", ""),
        KvdtField("4112", "eEB vorhanden", 1, 1, "N", """1 = ja""", ""),
        KvdtField("4114", "Vermittlungscode", 12, 12, "A", "", ""),
        KvdtField(
            "4115",
            "Tag der Terminvermittlung",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            """Bei Hausarztvermittlungsfällen ist der Tag der durch den Hausarzt festgestellten Behandlungsnotwendigkeit zu übermitteln."""),
        KvdtField(
            "4121",
            "Gebührenordnung",
            1,
            1,
            "N",
            """[1, 2, 3]""",
            """1 = BMÄ
2 = E-GO
3 = GOÄ"""),
        KvdtField(
            "4122",
            "Abrechnungsgebiet",
            2,
            2,
            "N",
            """[00, 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 14, 15]""",
            """00 = Kein besonderes Abrechnungsgebiet (Defaultwert)
01 = Dialyse-Arztkosten
02 = Dialyse-Sachkosten
03 = Methadon-Substitutionsbehandlung
04 = persönlich erbrachte Notfallleistungen durch ermächtigte rankenhausärzte
05 = Sonstige Notfallleistungen durch ermächtigte Krankenhausärzte
06 = Fremde Zytologie
07 = Diabetes
08 = Umweltmedizin
09 = Rheuma
10 = Hirnleistungsstörungen
14 = Ambulantes Operieren
15 = AOP nach §115b"""),
        KvdtField("4123", "Personenkreis / Untersuchungskategorie", 2, 2, "N", "", ""),
        KvdtField("4124", "SKT-Zusatzangaben", 5, 60, "A", "", ""),
        KvdtField(
            "4125",
            "Gültigkeitszeitraum von ... bis ...",
            16,
            16,
            "N",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField("4126", "SKT-Bemerkungen", 0, 60, "A", "", ""),
        KvdtField(
            "4131",
            "BesonderePersonengruppe",
            2,
            2,
            "A",
            """[00, 04, 06, 07, 08, 09]""",
            """00 = keine Besondere Personengruppe (Defaultwert)
04 = BSHG (Bundessozialhilfegesetz) § 264 SGB V
06 = BVG (Gesetz über die Versorgung der Opfer des Krieges)
07 = SVA-Kennzeichnung für zwischenstaatliches Krankenversicherungsrecht: - Personen mit Wohnsitz im Inland, Abrechnung nach Aufwand
08 = SVA-Kennzeichnung, pauschal
09 = Empfänger von Gesundheitsleistungen nach den §§ 4 und 6 des Asylbewerberleistungsgesetzes (AsylbLG)"""),
        KvdtField(
            "4132",
            "DMP-Kennzeichnung",
            2,
            2,
            "A",
            """[00,01,02,03,04,05,06,0 7,08,09,10,11,12,30,31, 32,33,34,35,36,37,38,39 ,40,41,42,43,44,45,46,4 7,48,49,50,51,52,53,54, 55,56,57,58]""",
            """00 = kein DMP-Kennzeichnen (Defaultwert)
01 = Diabetes mellitus Typ 2
02 = Brustkrebs
03 = Koronare Herzkrankheit
04 = Diabetes mellitus Typ 1
05 = Asthma bronchiale
06 = COPD (chronic obstructive pulmonary disease)
07 = Chronische Herzinsuffizienz
08 = Depression
09 = Rückenschmerz
10 = Rheuma
11 = Osteoporose
12 = Adipositas
30 = Diabetes Typ 2 und KHK
31 = Asthma und Diabetes Typ 2
32 = COPD und Diabetes Typ 2
33 = COPD und KHK
34 = COPD, Diabetes Typ 2 und KHK
35 = Asthma und KHK
36 = Asthma, Diabetes Typ 2 und KHK
37 = Brustkrebs und Diabetes Typ 2
38 = Diabetes Typ 1 und KHK
39 = Asthma und Diabetes Typ 1
40 = Asthma und Brustkrebs
41 = Brustkrebs und KHK
42 = Brustkrebs und COPD
43 = COPD und Diabetes Typ 1
44 = Brustkrebs, Diabetes Typ 2 und KHK
45 = Asthma, Brustkrebs und Diabetes Typ 2
46 = Brustkrebs und Diabetes Typ 1
47 = COPD, Diabetes Typ 1 und KHK
48 = Brustkrebs, COPD und Diabetes Typ 2
49 = Asthma, Diabetes Typ 1 und KHK
50 = Asthma, Brustkrebs und KHK
51 = Brustkrebs, COPD und KHK
52 = Brustkrebs, COPD, Diabetes Typ 2 und KHK
53 = Asthma, Brustkrebs, Diabetes Typ 2 und KHK
54 = Brustkrebs, Diabetes Typ 1 und KHK
55 = Asthma, Brustkrebs und Diabetes Typ 1
56 = Asthma, Brustkrebs, Diabetes Typ 1 und KHK
57 = Brustkrebs, COPD und Diabetes Typ 1
58 = Brustkrebs, COPD, Diabetes Typ 1 und KHK"""),
        KvdtField(
            "4133",
            "VersicherungsschutzBeginn",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "4134",
            "Kostentraegername",
            0,
            45,
            "A",
            "",
            """KVK: Objekttag 80, „KrankenKassenName“
eGK:
1. Priorität: Inhalt von Element UC_AllgemeineVersicherungsdatenXML/Versicherter/ Versicherungsschutz/Kostentraeger/AbrechnenderKostentraeger/Name
2. Priorität: Inhalt von Element UC_AllgemeineVersicherungsdatenXML/Versicherter/ Versicherungsschutz /Kostentraeger/Name

Das Feld muss übertragen werden, wenn eine Versichertenkarte eingelesen wurde. Dies gilt auch, wenn die Daten von einem mobilen Kartenterminal in ein PVS übernommen werden.

Eine manuelle Erfassung durch den Anwender im Ersatzverfahren ist nicht gefordert, da faktisch nicht möglich.

Auch der aus der KT-Stammdatei abgeleitete "Kassenname zur Bedruckung" darf nicht übertragen werden."""),
        KvdtField("4202", "Unfall, Unfallfolgen", 1, 1, "N", "", ""),
        KvdtField(
            "4204",
            "eingeschränkter Leistungsanspruch gemäß §16 Abs. 3a SGB V",
            1,
            1,
            "N",
            "",
            """Dieses Feld dient zur Kennzeichnung von Fällen mit „eingeschränktem Leistungsanspruch gemäß § 16 Absatz 3a SGB V“. Das zum 01.04.2011 neu eingeführte Muster 85 (Nachweis der Anspruchsberechtigung bei Ruhen des Anspruchs gemäß § 16 Absatz 3a SGB V) wird von den Krankenkassen ausgestellt und dient dem Vertragsarzt als Information über den Behandlungsanspruch.

Muster 85 ersetzt in diesen Fällen die Versichertenkarte und der „Versicherte“ muss manuell im Ersatzverfahren aufgenommen werden.

Des Weiteren wurde zum 01.04.2010 Muster 6 (Überweisungsschein) um ein entsprechendes Ankreuzfeld (eingeschränkter Leistungsanspruch gemäß § 16 Absatz 3a SGB V) erweitert. Der überweisende Vertragsarzt muss dieses Feld ankreuzen, um den Arzt, der auf Überweisung tätig wird, über den eingeschränkten Leistungsanspruch zu informieren.

Der abrechnende Arzt muss diese Information im Rahmen seiner Abrechnung unter Angabe des Feldes 4204 entsprechend übertragen."""),
        KvdtField("4205", "Auftrag", 0, 60, "A", "", ""),
        KvdtField(
            "4206",
            "Mutm. Tag der Entbindung",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField("4207", "Diagnose/Verdachtsdiagnose", 0, 60, "A", "", ""),
        KvdtField("4208", "Befund/Medikation", 0, 60, "A", "", ""),
        KvdtField("4209", "Zusätzliche Angaben zu Untersuchungen", 0, 60, "A", "", ""),
        KvdtField("4210", "SER", 1, 1, "N", "", ""),
        KvdtField("4214", "Behandlungstag bei IVD-Leistungen", 8, 8, "D", "", ""),
        KvdtField(
            "4217",
            "(N)BSNR des Erstveranlassers",
            9,
            9,
            "N",
            """35nnnnnnn (Krankenhaus)
kknnnnnnn""",
            """Die Werte von „kk“ enthalten Zulässige UKV/OKV-Kennungen in den Arztnummern und Knapp-schaftskennung
kk=(01-03, 06-21, 24, 25, 27, 28, 31, 37-73, 78-81, 83, 85-88, 93-96, 98, 99)"""),
        KvdtField(
            "4218",
            "(N)BSNR des Überweisers",
            9,
            9,
            "N",
            """35nnnnnnn (Krankenhaus)
kknnnnnnn""",
            """Die Werte von „kk“ enthalten Zulässige UKV/OKV-Kennungen in den Arztnummern und Knapp-schaftskennung
kk=(01-03, 06-21, 24, 25, 27, 28, 31, 37-73, 78-81, 83, 85-88, 93-96, 98, 99)"""),
        KvdtField("4219", "Überweisung von anderen Ärzten", 0, 60, "A", "", ""),
        KvdtField("4220", "Überweisung an", 0, 60, "A", "", """Ersatzwert: kA"""),
        KvdtField(
            "4221",
            "Kurativ / Präventiv / ESS / bei belegärztlicher Behandlung",
            1,
            1,
            "N",
            "",
            ""),
        KvdtField(
            "4225",
            "ASV-Teamnummer des Erstveranlassers",
            9,
            9,
            "N",
            """00nnnnnnP""",
            """n = Ziffer [0-9] P=Prüfziffer"""),
        KvdtField(
            "4226",
            "ASV-Teamnummer des Überweisers",
            9,
            9,
            "N",
            """00nnnnnnP""",
            """n = Ziffer [0-9] P=Prüfziffer"""),
        KvdtField(
            "4229",
            "Knappschaftskennziffer",
            5,
            5,
            "N",
            "",
            """Technische Kennziffer zur Kennzeichnung von Knappschaftsfällen"""),
        KvdtField(
            "4231",
            "Kontrolluntersuchung einer bekannten Infektion",
            1,
            1,
            "N",
            """1 = ja""",
            """Werden direkte oder indirekte Nachweise von Krankheitserregern im Rahmen einer Kontrolluntersuchung bei einer bereits bekannten Infektion beauftragt, ist das Feld „Kontrolluntersuchung einer bekannten Infektion“ zu nutzen.

Im Feld 4208 „Befund/Medikation“ ist zudem der Sachverhalt zu erläutern.

Erkrankungen mit Meldepflicht sind § 7 Infektionsschutzgesetz zu entnehmen."""),
        KvdtField(
            "4233",
            "Stationäre Behandlung von ... bis ...",
            16,
            16,
            "N",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField("4234", "anerkannte Psychotherapie", 1, 1, "N", "", """Ankreuzfeld"""),
        KvdtField(
            "4235",
            "Datum des Anerkennungsbescheides",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            """Datum des Anerkennungsbescheides des Kostenträgers"""),
        KvdtField(
            "4236",
            "Abklärung somatischer Ursachen vor Aufnahme einer Psychotherapie",
            1,
            1,
            "N",
            "",
            """Ankreuzfeld"""),
        KvdtField(
            "4239",
            "Scheinuntergruppe",
            2,
            2,
            "N",
            """[00, 20, 21, 23, 24, 26, 27, 28, 30, 31, 32, 41, 42, 43, 44, 45, 46]""",
            """00 = Ambulante Behandlung

20 = Selbstausstellung
21 = Auftragsleistungen
23 = Konsiliaruntersuchung
24 = Mit-/Weiterbehandlung
26 = Stationäre Mitbehandlung, Vergütung nach ambulanten Grundsätzen
27 = Überweisungs-/Abrechnungsschein für Laboratoriumsuntersuchungen als Auftragsleistung (Muster 10 und 10C)
28 = Anforderungsschein für Laboratoriumsuntersuchungen bei Laborgemeinschaften (Muster 10A)
30 = Belegärztliche Behandlung
31 = Belegärztliche Mitbehandlung
32 = Urlaubs-/bzw. Krankheitsvertretung bei belegärztlicher Behandlung
41 = Ärztlicher Notfalldienst
42 = Urlaubs-/bzw. Krankheitsvertretung
43 = Notfall
44 = Notfalldienst mit Taxi
45 = Notarzt-/Rettungswagen (Rettungsdienst)
46 = Zentraler Notfalldienst"""),
        KvdtField(
            "4241",
            "Lebenslange Arztnummer (LANR) des Erstveranlassers",
            9,
            9,
            "N",
            """nnnnnnmff""",
            """n = Ziffer [0-9]
m = Prüfziffer *
ff = erlaubter Inhalt gemäß Anlage 35
des BAR-Schlüsselverzeichnisses, tolerierter Ersatzwert für die
Ziffern 8 - 9: 00
Ärzte ohne LANR: 999999900"""),
        KvdtField(
            "4242",
            "Lebenslange Arztnummer des Überweisers",
            9,
            9,
            "N",
            """nnnnnnmff""",
            """n = Ziffer [0-9]
m = Prüfziffer *
ff = erlaubter Inhalt gemäß Anlage 35
des BAR-Schlüsselverzeichnisses, tolerierter Ersatzwert für die
Ziffern 8 - 9: 00
Ärzte ohne LANR: 999999900"""),
        KvdtField("4243", "Weiterbehandelnder Arzt", 0, 60, "A", "", """Ersatzwert: unbekannt"""),
        KvdtField("4244", "Bewilligte Leistung", 5, 6, "A", "", """GOP bewilligte Leistung"""),
        KvdtField(
            "4245",
            "Anzahl bewilligter Leistungen",
            0,
            3,
            "N",
            "",
            """Anzahl der bewilligten Leistungen insgesamt nach GOP aus Feld FK 4244"""),
        KvdtField(
            "4246",
            "Anzahl abgerechneter Leistungen",
            0,
            3,
            "N",
            "",
            """Anzahl der insgesamt abgerechneten Leistungen aus den ggf. Vorquartal(en) inkl. der Behandlung(en) aus dem aktuellen Abrechnungsquartal (= Gesamtzahl der abgerechneten Leistungen seit dem Bewilligungsbescheid)."""),
        KvdtField(
            "4247",
            "Antragsdatum (des Anerkennungsbescheides )",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "4248",
            "Pseudo-LANR (für Krankenhausärzte im Rahmen der ASV-Abrechnung) des Erstveranlassers ",
            9,
            9,
            "N",
            """555555nff""",
            """n = Ordnungsnummer (zulässige Werte 0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
ff = Fachgruppencode gemäß der jeweils gültigen Anlage 2 der Richtlinie"""),
        KvdtField(
            "4249",
            "Pseudo-LANR (für Krankenhausärzte im Rahmen der ASV-Abrechnung) des Überweisers",
            9,
            9,
            "N",
            """555555nff""",
            """n = Ordnungsnummer (zulässige Werte 0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
ff = Fachgruppencode gemäß der jeweils gültigen Anlage 2 der Richtlinie"""),
        KvdtField(
            "4250", "Kombinationsbehandlung aus Einzelund Gruppentherapie", 1, 1, "N", "", ""),
        KvdtField("4251", "Durchführungsart der Kombinationsbehandlung", 1, 1, "N", "", ""),
        KvdtField(
            "4252",
            "Gesamtanzahl bewilligter Therapieeinheiten für den Versicherten",
            0,
            3,
            "N",
            "",
            ""),
        KvdtField("4253", "Bewilligte GOP für den Versicherten", 5, 6, "A", "", ""),
        KvdtField("4254", "Anzahl der abgerechneten GOPen für den Versicherten", 0, 3, "N", "", ""),
        KvdtField(
            "4255",
            "Gesamtanzahl bewilligter Therapieeinheiten für die Bezugsperson",
            0,
            3,
            "N",
            "",
            ""),
        KvdtField("4256", "Bewilligte GOP für die Bezugsperson", 5, 6, "A", "", ""),
        KvdtField("4257", "Anzahl der abgerechneten GOPen für die Bezugsperson", 0, 3, "N", "", ""),
        KvdtField("4261", "Kurart", 1, 1, "N", "", ""),
        KvdtField("4262", "Durchführung als Kompaktkur", 1, 1, "N", "", ""),
        KvdtField("4263", "genehmigte Kurdauer in Wochen", 0, 2, "N", "", ""),
        KvdtField(
            "4264",
            "Anreisetag",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "4265",
            "Abreisetag",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "4266",
            "Kurabbruch am",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField("4267", "Bewilligte Kurverlängerung in Wochen", 0, 2, "N", "", ""),
        KvdtField(
            "4268",
            "Bewilligungsdatum Kurverlängerung",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField("4269", "Verhaltenspräventive Maßnahmen angeregt", 1, 1, "N", "", ""),
        KvdtField("4270", "Verhaltenspräventive Maßnahmen durchgeführt", 1, 1, "N", "", ""),
        KvdtField("4271", "Kompaktkur nicht möglich", 1, 1, "N", "", ""),
        KvdtField("4272", "Durchführung als Kompaktkur mit Refresher", 1, 1, "N", "", ""),
        KvdtField("4275", "Kontakt zur Vorbereitung des Kuraufenthaltes", 1, 1, "N", "", ""),
        KvdtField("4276", "Anreisetag als Teil 2 bei Refresher", 8, 8, "D", "", ""),
        KvdtField("4277", "Abreisetag als Teil 2 bei Refresher", 8, 8, "D", "", ""),
        KvdtField("4278", "Kurabbruch am als Teil 2 bei Refresher", 8, 8, "D", "", ""),
        KvdtField(
            "4299",
            "Lebenslange Arztnummer (LANR) des Vertragspsychotherapeuten",
            9,
            9,
            "N",
            "",
            ""),
        KvdtField(
            "5000",
            "Leistungstag",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField("5001", "Gebührennummer (GNR)", 0, 9, "A", "", ""),
        KvdtField("5002", "Art der Untersuchung", 0, 60, "A", "", ""),
        KvdtField("5003", "(N)BSNR des vermittelten Facharztes", 9, 9, "N", "", ""),
        KvdtField(
            "5005",
            "Multiplikator",
            3,
            3,
            "N",
            "",
            """Dieses Feld dient dazu, ein mehrfaches Ansetzen der in FK 5001 erfassten Leistung zu kennzeichnen.

Darüber hinaus kann das Feld zusätzlich ein mehrfaches Ansetzen der in FK 5012 erfassten Sachund Materialkosten kennzeichnen, falls dies von der zuständigen Kassenärztlichen Vereinigung individuell je Gebührenordnungsposition festgelegt wird."""),
        KvdtField("5006", "Um-Uhrzeit", 4, 4, "N", "", ""),
        KvdtField("5008", "DKM", 0, 3, "N", "", ""),
        KvdtField("5009", "freier Begründungstext", 0, 60, "A", "", ""),
        KvdtField("5010", "Chargennummer", 0, 60, "A", "", ""),
        KvdtField("5011", "Sachkosten-Bezeichnung", 0, 60, "A", "", ""),
        KvdtField("5012", "Sachkosten/Materialkosten in Cent", 0, 10, "N", "", ""),
        KvdtField("5013", "Prozent der Leistung", 3, 3, "N", "", ""),
        KvdtField("5015", "Organ", 0, 60, "A", "", ""),
        KvdtField(
            "5016",
            "Name des Arztes",
            0,
            60,
            "A",
            "",
            """Dieses Feld dient zur Übertragung von Arztnamen, die nach den Bestimmungen des EBM als Begründung zu einer Gebührennummer anzugeben sind. Mögliche Inhalte des Feldes sind Empfänger des Briefes, Name des Konsiliarpartners, Name des Anästhesisten."""),
        KvdtField("5017", "Besuchsort bei Hausbesuchen", 0, 60, "A", "", ""),
        KvdtField("5018", "Zone bei Besuchen", 2, 2, "A", "", ""),
        KvdtField("5019", "Erbringungsort/Standort des Gerätes", 0, 60, "A", "", ""),
        KvdtField("5020", "Wiederholungsuntersuchung", 1, 1, "N", "", ""),
        KvdtField(
            "5021",
            "Jahr der letzten Krebsfrüherkennungsuntersuchung",
            4,
            4,
            "N",
            """JJJJ (0001-9999)""",
            ""),
        KvdtField("5023", "GO-Nummern-Zusatz", 1, 1, "A", "", ""),
        KvdtField(
            "5024", "GNR-Zusatzkennzeichen poststationär erbrachte Leistungen", 1, 1, "A", "", ""),
        KvdtField(
            "5025",
            "Aufnahmedatum",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "5026",
            "Entlassungsdatum",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField("5027", "Hybrid-DRG Leistung", 4, 4, "A", "", """G24M"""),
        KvdtField("5028", "Datum Beginn der Leistung", 8, 8, "D", "", """20240502"""),
        KvdtField("5029", "Datum Ende der Leistung", 8, 8, "D", "", """20240503"""),
        KvdtField("5030", "Beatmungsstunden", 0, 4, "N", "", """3"""),
        KvdtField(
            "5034",
            "OP-Datum",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField("5035", "OP-Schlüssel", 0, 8, "A", "", ""),
        KvdtField("5036", "GNR als Begründung", 5, 6, "A", "", ""),
        KvdtField("5037", "Gesamt-Schnitt-Naht-Zeit (Minuten)", 0, 3, "N", """mmm (001-999)""", ""),
        KvdtField("5038", "Komplikation", 0, 60, "A", "", ""),
        KvdtField(
            "5040", "Patientennummer der eDokumentation Hautkrebs-Screening", 0, 8, "A", "", ""),
        KvdtField("5041", "Seitenlokalisation OPS", 1, 1, "A", "", ""),
        KvdtField("5042", "Mengenangabe KM /AM", 0, 5, "N", "", ""),
        KvdtField("5043", "Maßeinheit KM /AM", 1, 1, "N", "", ""),
        KvdtField("5050", "Melde-ID Implantateregister", 10, 10, "A", "", ""),
        KvdtField("5051", "Hash-String Implantate-register", 0, 512, "A", "", ""),
        KvdtField("5052", "Hash-Wert Implantateregister", 64, 64, "A", "", ""),
        KvdtField(
            "5070", "OMIM-G-Kode des untersuchten Gens", 6, 6, "N", "", """Ersatzwert: 999999"""),
        KvdtField(
            "5071", "OMIM-P-Kode (Art der Erkrankung)", 6, 6, "N", "", """Ersatzwert: 999999"""),
        KvdtField("5072", "Gen-Name", 0, 60, "A", "", ""),
        KvdtField("5073", "Art der Erkrankung", 0, 60, "A", "", ""),
        KvdtField(
            "5074",
            "Name Hersteller/ Lieferant",
            0,
            60,
            "A",
            "",
            """Übertragung entsprechend P21-015 in KVDT-Anforderungskatalog"""),
        KvdtField(
            "5075",
            "Artikel-/ Modellnummer",
            0,
            60,
            "A",
            "",
            """Übertragung entsprechend P21-015 in KVDT-Anforderungskatalog"""),
        KvdtField("5076", "Rechnungsnummer", 0, 20, "A", "", ""),
        KvdtField(
            "5098",
            "(N)BSNR des Ortes der Leistungserbringung",
            9,
            9,
            "N",
            """35nnnnnnn (Krankenhaus)
kknnnnnnn""",
            """Die Werte von „kk“ enthalten Zulässige UKV/OKV-Kennungen in den Arztnummern und Knapp-schaftskennung

kk=(01-03, 06-21, 24, 25, 27, 28, 31, 37-73, 78-81, 83, 85-88, 93-96, 98, 99)"""),
        KvdtField(
            "5099",
            "Lebenslange Arztnummer (LANR) des Vertragsarztes/Vertragspsychotherapeuten",
            9,
            9,
            "N",
            """nnnnnnmff""",
            """n = Ziffer [0-9]
m = Prüfziffer *
ff = erlaubter Inhalt gemäß Anlage 35 des BAR-Schlüsselverzeichnisses, tolerierter Ersatzwert für die Ziffern 8 - 9: 00
Ärzte ohne LANR: 999999900"""),
        KvdtField(
            "5100",
            "ASV-Teamnummer des Vertragsarztes",
            9,
            9,
            "N",
            """00nnnnnnP""",
            """n = Ziffer [0-9] P=Prüfziffer"""),
        KvdtField(
            "5101",
            "Pseudo-LANR (für Krankenhausärzte im Rahmen der ASV-Abrechnung) des LE",
            9,
            9,
            "N",
            """555555nff""",
            """n = Ordnungsnummer (zulässige Werte 0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
ff = Fachgruppencode gemäß der jeweils gültigen Anlage 2 der Richtlinie"""),
        KvdtField("5102", "Krankenhaus-IK (im Rahmen der ASV-Abrechnung)", 9, 9, "N", "", ""),
        KvdtField("5402", "Kapitel", 0, 7, "A", "", ""),
        KvdtField("6001", "ICD-Code", 3, 6, "A", "", "Länge: 3, 5, 6"),
        KvdtField("6003", "Diagnosensicherheit", 1, 1, "A", "", ""),
        KvdtField("6004", "Seitenlokalisation", 1, 1, "A", "", ""),
        KvdtField("6006", "Diagnosenerläuterung", 0, 60, "A", "", ""),
        KvdtField("6008", "Diagnosenausnahmetat-bestand", 0, 60, "A", "", ""),
        KvdtField("6009", "Hauptdiagnose (ICD-10-GMKode)", 3, 6, "A", "", """J09.6"""),
        KvdtField(
            "6010",
            "Seitenlokalisation Hauptdiagnose",
            1,
            1,
            "A",
            """R = rechts
L = links
B = beidseitig""",
            ""),
        KvdtField("6011", "Nebendiagnose (ICD-10-GMKode)", 3, 6, "A", "", ""),
        KvdtField(
            "6012",
            "Seitenlokalisation Nebendiagnose",
            1,
            1,
            "A",
            """R = rechts
L = links
B = beidseitig""",
            ""),
        KvdtField("6206", "Pharmazentralnummer (PZN)", 8, 8, "N", "", ""),
        KvdtField("6207", "Rezeptur", 0, 990, "A", "", """Beschreibung der Rezeptur"""),
        KvdtField("6208", "Handelsname des Arzneimittels", 0, 60, "A", "", ""),
        KvdtField("6212", "Arzneimittelwirkstoff/Wirkstoff", 0, 60, "A", "", ""),
        KvdtField(
            "6214",
            "Wirkstoff-Klassifikation (Code-System)",
            0,
            60,
            "A",
            "",
            """Der in Wirkstoff-Code hinterlegte, einen Wirkstoff bezeichnende Code, wird vollständig quali-fiziert, indem der Code dem hier angegeben Code-System zugeordnet wird. Als mögliche Code-Systeme sind derzeit „WG14“, „atcgm2013“, „atcgm2014“, „atcgm2015“ und „ASK“ gestattet."""),
        KvdtField("6221", "Kennzeichnung Fremdbefund", 1, 1, "N", "", ""),
        KvdtField("6224", "Wirkstoff-Code", 0, 60, "A", "", ""),
        KvdtField(
            "6303",
            "Dateiformat",
            0,
            60,
            "A",
            "",
            """Externes Dateiformat aus Sicht des Betriebssystems (z.B. „PDF“)"""),
        KvdtField(
            "6305",
            "Verweis auf die Datei",
            0,
            60,
            "A",
            "",
            """Uniform Resource Locator, z.B. WWW-Adresse, UNC-Pfad. Beispiel: \\FS1\TEST\BILD1.PDF. Dateiname, wie er an die Datenstelle kommuniziert wurde/wird"""),
        KvdtField(
            "6327",
            "Bildinhalt/Dokumenteninhalt",
            0,
            60,
            "A",
            "",
            """Beschreibung des Bild/Dokumenteninhalts in Freitext"""),
        KvdtField("6328", "Dateicodierung", 0, 60, "A", "", """Beispiel: „ISO 10646“"""),
        KvdtField(
            "6329",
            "Inhalt der Datei als base64-kodierte Anlage",
            0,
            60,
            "A",
            "",
            """Inhalt des Dokuments (der Anlage) in Form von Base64-kodierten Zeilen"""),
        KvdtField(
            "7251",
            "Bezeichnung des verwendeten katalogs",
            0,
            60,
            "A",
            "",
            """Beispiel: LVZ MVZ Musterstadt"""),
        KvdtField(
            "7253",
            "Kostenübernahmeerklärung des Auftraggebers liegt vor",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = nein
1 = ja"""),
        KvdtField(
            "7258",
            "ID Katalog durchgeführte Leistungen",
            0,
            60,
            "A",
            "",
            """Wird vom Labor vergeben"""),
        KvdtField(
            "7259",
            "ID Katalog abrechenbare Listungen",
            0,
            60,
            "A",
            "",
            """Wird vom Labor vergeben"""),
        KvdtField(
            "7260",
            "ID katalog anforderbare Leistungen",
            1,
            1,
            "N",
            """[1, 2, 3, 4]""",
            """1 = LOINC
2 = LDT ELV
3 = LVZ sonstige
4 = sonstige mit URL """),
        KvdtField(
            "7261",
            "Sonstige Versicherungsnummer",
            0,
            60,
            "A",
            "",
            """Beispiel: Versicherungsnummer Haustier"""),
        KvdtField(
            "7263",
            "Test-ID",
            0,
            60,
            "A",
            "",
            """Eindeutige ID des Test-Idents. Für eine Verlaufsdarstellung von Laborwerten aus unter-schiedlichen Laboren muss jedes Test-Ident mit einer OID eindeutig zugeordnet werden können."""),
        KvdtField(
            "7264",
            "Test-Gerät-UID",
            0,
            60,
            "A",
            "",
            """Eindeutige Untersuchungs-ID (UID), dient zur Rückführung auf Untersucher (Hersteller), das Gerät und den Zeitpunkt (wird vom Gerät erzeugt)."""),
        KvdtField(
            "7265",
            "Absender des Datensatzes",
            1,
            1,
            "N",
            """[1, 2, 3]""",
            """1 = Primärsystem
2 = Order Entry
3 = Scansystem"""),
        KvdtField(
            "7266",
            "Laborart",
            1,
            1,
            "N",
            """[1, 2, 3, 4]""",
            """1 = Laborgemeinschaft
2 = Facharztlabor
3 = Leistungserbringergemeinschaft
4= Eigenlabor"""),
        KvdtField(
            "7267",
            "ID des Auftraggebers",
            0,
            60,
            "A",
            "",
            """ID, die Auftraggeber vom Auftragnehmer erhalten hat"""),
        KvdtField("7268", "Fachrichtung oder Stationskennung", 0, 60, "A", "", ""),
        KvdtField(
            "7272",
            "Freitext zum Timestamp",
            0,
            990,
            "A",
            "",
            """Erläuterungstext zum Timestamp"""),
        KvdtField(
            "7273",
            "Zeitzone",
            3,
            9,
            "A",
            "",
            """Um die Zeitangabe im Timestamp auf die jeweilige Zeitzone zu referenzieren, muss diese angegeben werden. Laut Empfehlung der ISO 8601 wird nach einer zusammenhängenden Datumsund Zeitangabe die Differenz zur Koordinierten Weltzeit (UTC) angegeben. Das Format ist „±hh:mm“ oder „±hh“ und berücksichtigt damit sowohl die Zeitzone als auch die Sommerzeit. Um aus einer lokalen Zeitangabe die Zeit in UTC zu bestimmen, muss der Wert nach einem „+“ subtrahiert, der nach einem „−“ addiert werden."""),
        KvdtField(
            "7275",
            "ID verwendeter Terminologie",
            0,
            60,
            "A",
            "",
            """Referenz auf eine allgemein übliche Terminologie oder einen allgemein üblichen Standard"""),
        KvdtField(
            "7276",
            "ID verwendeter Nummernpool",
            0,
            60,
            "A",
            "",
            """Nummernkreise, auf die referenziert werden kann"""),
        KvdtField(
            "7278",
            "Datum des Timestamp",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "7279",
            "Uhrzeit des Timestamp",
            6,
            9,
            "N",
            """hhmmss(ms)
hh = Stunden (00 – 23)
mm = Minuten (00 – 59)
ss = Sekunden (00 – 59)
ms = Millisekunden (000 – 999) """,
            ""),
        KvdtField(
            "7280",
            "Grund der Benachrichtigung",
            1,
            1,
            "N",
            """[1, 2, 3, 4, 5]""",
            """1 = Pathologisch auffälliger Befund
2 = Lebensbedrohlicher Zustand
3 = Wiedervorstellung empfohlen
4 = Probenmaterial nicht verwendbar
5 = Probenmaterial unvollständig"""),
        KvdtField(
            "7281",
            "Nachweisverfahren",
            1,
            1,
            "N",
            """[0, 1, 2, 3, 4, 5, 6, 7]""",
            """0 = sonstige, wenn Erreger + Resistenz angefordert
1 = Antigen-Nachweis
2 = PCR
3 = Mikroskopie
4 = Aglutination
5 = Kultur
6 = Biochemische Identifikation (z.B. Vitek)
7 = Maldi-Tof"""),
        KvdtField("7285", "Keim-Nummer", 0, 60, "A", "", ""),
        KvdtField(
            "7286",
            "Resistenzmethode",
            1,
            1,
            "N",
            """[0, 1, 2, 3, 4]""",
            """0 = kein Antibiogramm erstellt
1 = Agardiffusion
2 = Agardilution
3 = PCR + Hybridisierung
4 = sonstige"""),
        KvdtField("7287", "Wirkstoff-Ident", 0, 60, "A", "", ""),
        KvdtField("7288", "Wirkstoff-Generic-Nummer", 0, 60, "A", "", ""),
        KvdtField("7289", "MHK/Breakpoint-Wert", 0, 60, "A", "", ""),
        KvdtField(
            "7290",
            "Resistenz-Interpretation",
            1,
            1,
            "N",
            """[0, 1, 2, 3 , 4]""",
            """0 = nicht getestet
1 = sensibel/wirksam
2 = mäßig sensibel/schwach wirksam
3 = resistent/unwirksam
4 = wirksam in hohen Konzentrationen"""),
        KvdtField("7292", "Lokalisation Probenmaterial", 0, 60, "A", "", ""),
        KvdtField(
            "7293",
            "Einheit der Mengenangabe",
            0,
            60,
            "A",
            "",
            """Tabellarische Auflistung:
Abh. vom Material z.B.:
Interpretation der Mengenangaben bei Sproßpilzen:
massenhaft > 100000 /g Stuhl
reichlich 1000 - 100000 /g Stuhl
mäßig 100 - 1000 /g Stuhl
spärlich < 100 /g Stuhl"""),
        KvdtField(
            "7296",
            "Wiederholunsuntersuchung",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField(
            "7297",
            "Datum der letzten Untersuchung",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "7301",
            "Ergebnis",
            1,
            1,
            "N",
            """[0, 1, 2]""",
            """0 = nicht nachweisbar
1 = zweifelhaft/unspezifisch
2 = nachweisbar"""),
        KvdtField(
            "7302",
            "Testmethode",
            0,
            60,
            "A",
            "",
            """Angabe der Testmethode Beispiel:
ELISA/Hersteller, Standard-Kultur/Hersteller, Multiplex-PCR/Hersteller/Nachweis-grenze, Gen-Sonde, Auramin-Färbung"""),
        KvdtField(
            "7303",
            "Abrechnungsinfo zur Untersuchung",
            1,
            2,
            "N",
            """[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 99]""",
            """1 = GKV Laborfacharzt
2 = GKV LG
3 = PKV Laborfacharzt
4 = PKV LG
5 = Selektivvertrag
6 = IGeL
7 = Sonstige Kostenübernahme
8 = ASV
9 = GKV Laborfacharzt präventiv
10 = GKV LG präventiv
11 = keine Zuordnung (nur zulässig im Obj_0027)
12 = PräOP (Präoperative Laborleistungen**)
13 = GKV Krankenhaus
14 = PKV Krankenhaus
15 = GKV Muster 6
99 = storniert (in Satzart 8215 nur zulässig in Nachforderung) *

* der Workflow einer Stornierung muss zwischen Einsender und Labor definiert werden

** Laborleistungen, die dazu dienen, den Patienten auf eine ambulante oder belegärztliche Operation vorzubereiten, werden dem einsendendenrzt in Rechnung gestellt und können nicht über die Kassenärztliche Vereinigung abgerechnet werden (vgl. Abschnitt 31.1 des EBM)"""),
        KvdtField(
            "7304",
            "Ergebnis-ID",
            0,
            60,
            "A",
            "",
            """Eindeutige ID des jeweiligen Untersuchungsergebnisses (wird durch Labor generiert)"""),
        KvdtField(
            "7305",
            "Befund-ID",
            0,
            60,
            "A",
            "",
            """Eindeutige ID des Befundes zu einem Laborauftrag (wird durch Labor generiert). ID muss über den gesamten Workflow der Abarbeitung des Auftrages gleich bleiben. Anhand der ID und des Timestamp der Erstellung des Datensatzes (FK 8218) bekommt das empfangende System die Möglichkeit, immer den aktuellen Befund seinem Nutzer zu präsentieren"""),
        KvdtField(
            "7306",
            "Darstellung Ergebniswerte",
            2,
            2,
            "N",
            """[01, 02, 03, 04, 05, 06, 07, 99]""",
            """01 = numerisch (exponentielle Darstellung möglich)
02 = numerisch mit Messwertuntergrenze
03 = numerisch mit Messwertobergrenze
04 = alpha-numerisch
05 = Titer
06 = Titer mit Untergrenze
07 = Titer mit Obergrenze
99 = Sonstige

Beispiele:
01: 47.85, 5.00E+07, 1x10^6
02: <100, <1.00E+04
03: >2000, >5.00E+04
04: positiv, negativ, A positiv *
05: 1:2
06: <1:2
07: >1:2

* für die Übertragung von Blutgruppen ist vorzugswei"""),
        KvdtField("7308", "Anzahl Laborergebnisberichte", 1, 2, "N", "", ""),
        KvdtField(
            "7310",
            "Art des Materials",
            1,
            1,
            "N",
            """[1, 2]""",
            """1 = organisch
2 = anorganisch"""),
        KvdtField(
            "7311",
            "Organisches Material",
            1,
            1,
            "N",
            """[1, 2, 3]""",
            """1 = tierisch
2 = pflanzlich
3 = nicht bestimmbar"""),
        KvdtField(
            "7312",
            "Anorganisches Material",
            1,
            1,
            "N",
            """[1, 2, 3, 4]""",
            """1 = Wasser
2 = Luft
3 = nicht bestimmbar
4 = sonstiges"""),
        KvdtField("7313", "Art/Rasse/Material", 0, 60, "A", "", ""),
        KvdtField("7314", "Name/Kennung", 0, 60, "A", "", ""),
        KvdtField("7315", "Alter", 0, 10, "N", "", ""),
        KvdtField(
            "7316",
            "Normalwert Listenbezeichnung",
            0,
            60,
            "A",
            "",
            """Die Feldkennungen 7316 und 7317 sollen für eine semistrukturierte Darstellung von Normalwerten verwendet werden.

Die Feldkennung 7316 dient als Überschrift einer Auflistung von Normalwerten."""),
        KvdtField(
            "7317",
            "Normalwert Listenzeile",
            0,
            60,
            "A",
            "",
            """Beispiel:
prämenopausal
1.-2. ZT 15 - 70 ng/l
3.-5. ZT 45 - 120 ng/l
späte Follikelphase 30 - 90 ng/l
Ovulation 80 - 200 ng/l
Lutealphase < 50 ng/l
postmenopausal < 10 ng/l """),
        KvdtField(
            "7318",
            "Nahrungsaufnahme zum Zeitpunkt der materialentnahme",
            0,
            60,
            "A",
            "",
            """Bei der Beauftragung von Funktionstests wird diese Information benötigt."""),
        KvdtField(
            "7319",
            "Identifikationsnummer der Quelle",
            0,
            60,
            "A",
            "",
            """Identifikationsnummer in Verwaltungssoftware (z.B. einer Veterinärpraxis)"""),
        KvdtField("7320", "Recall empfohlen", 1, 1, "N", """1 = ja""", ""),
        KvdtField(
            "7321",
            "Status Einsender",
            2,
            2,
            "N",
            """[01, 02, 03, 04, 05, 06, 07, 08, 11, 12, 14, 15, 16, 17]""",
            """01 = Erstveranlasser
02 = Einsender Arzt
03 = Einsender sonstige
04 = Versicherter
05 = Rechnungsempfänger
06 = Bevollmächtigter
07 = Laborarzt/Befundersteller
08 = Leistungserbringer
11 = Halter (eines Tieres)
12 = Patient
14 = Überweiser
15 = staatliche Einrichtung
16 = sonstige juristische Person
17 = sonstige medizinische Einrichtung"""),
        KvdtField(
            "7326",
            "Alter in",
            1,
            1,
            "N",
            """[1, 2, 3, 4]""",
            """1 = Sekunden
2 = Minuten
3 = Tage
4 = Jahre"""),
        KvdtField("7328", "Zusätzliche Namenszeile", 0, 10, "A", "", ""),
        KvdtField(
            "7329",
            "Normalbereichsrelevantes geschlecht",
            1,
            1,
            "N",
            """[M, W, X]""",
            """M = männlich
W = weiblich
X = unbestimmt"""),
        KvdtField("7330", "Telefonnummer", 0, 60, "A", "", """LK_Vorwahl_Rufnummer """),
        KvdtField("7331", "Mobiltelefonnummer", 0, 60, "A", "", """LK_Vorwahl_Rufnummer """),
        KvdtField(
            "7332",
            "Alternative elektronische Postadresse",
            0,
            60,
            "A",
            "",
            """Beispiel:Twitter-Acount"""),
        KvdtField("7333", "Faxnummer", 0, 60, "A", "", """LK_Vorwahl_Rufnummer """),
        KvdtField("7334", "Webadresse", 0, 60, "A", "", """Beispiel: www.musterarzt.de"""),
        KvdtField("7335", "E-Mail-Adresse", 0, 60, "A", "", ""),
        KvdtField(
            "7336",
            "Gyn. OP, Strahlen oder Chemotherapie des Genitals",
            1,
            1,
            "N",
            """1 = ja""",
            ""),
        KvdtField(
            "7337",
            "Gyn. OP, Strahlen oder Chemotherapie des Genitales – Welche?",
            0,
            60,
            "A",
            "",
            ""),
        KvdtField(
            "7338",
            "Gyn. OP, Strahlen oder Chemotherapie des Genitales - Wann?",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField("7339", "Gravidität", 1, 1, "N", """1 = ja""", ""),
        KvdtField(
            "7340",
            "Spezifizierung der alternativen elektronischen Postadresse",
            0,
            60,
            "A",
            "",
            ""),
        KvdtField(
            "7351",
            "Geburtsdatum",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            """Datum der Geburt des Tieres"""),
        KvdtField("7352", "URL Katalog", 0, 60, "A", "", """Beispiel: www.ihreaerzte.de/lvz"""),
        KvdtField(
            "7354",
            "Keim/Pilz-Identifizierung",
            0,
            60,
            "A",
            "",
            """Isolierte Keim-Referenzierung im Antibiogramm "01", "02", ....(wird vom Labor vergeben)"""),
        KvdtField(
            "7355",
            "Keim/Pilz-Name",
            0,
            120,
            "A",
            "",
            """Beispiel: Beta-hämolysierende Streptokokken, Gruppe B (Streptococcus agalactiae)"""),
        KvdtField("7356", "Keim-OID", 0, 60, "A", "", """Referenzkatalog"""),
        KvdtField(
            "7357",
            "Wachstum",
            1,
            1,
            "N",
            """[0, 1, 2, 3, 4]""",
            """0 = nicht nachweisbar / kein Wachstum
1 = spärlich
2 = mäßig/vereinzelt
3 = reichlich
4 = massenhaft"""),
        KvdtField("7358", "Name im Klartext", 0, 60, "A", "", """Beispiel: Katrin Mustermann"""),
        KvdtField("7359", "Wirkstoff-OID", 0, 60, "A", "", """Beispiel: ATC-Code"""),
        KvdtField("7361", "Keim-ID im Katalog", 0, 60, "A", "", ""),
        KvdtField(
            "7362",
            "Abrechnungsart PKV",
            1,
            1,
            "N",
            """[1, 2]""",
            """1 = Abrechnung Laborfacharzt
2 = Abrechnung Privat-LG"""),
        KvdtField(
            "7363",
            "Alarmwert untere Grenze",
            0,
            60,
            "F",
            "",
            """Unterer Alarmwert des aktuellen Normalbereiches"""),
        KvdtField(
            "7364",
            "Probengefäß-Ident",
            0,
            60,
            "A",
            "",
            """Es wird eine eineindeutige Identifikation des Probengefäßes empfohlen (siehe auch Rili-BÄK vom September 2014 Abschnitt: 6.1.5 (2 f)).

Hierfür kann sowohl eine maschinenlesbare Nummerierung (z.B. Barcode), wie auch eine manuell aufgetragene Nummer verwendet werden."""),
        KvdtField(
            "7365",
            "Analysen-ID",
            0,
            20,
            "A",
            "",
            """Hier wird die ID für die Leistung entsprechend des verwendeten Kataloges eingetragen. Beispiel: Na, Test12Z, B84123, etc."""),
        KvdtField(
            "7366",
            "Langbezeichnung der angeforderten Leistung",
            0,
            60,
            "A",
            "",
            """Hier wird die Langbezeichnung der Leistung eingetragen. Beispiel: Natrium, Kalium, Calcium, etc."""),
        KvdtField(
            "7367",
            "Sensitivität",
            1,
            1,
            "A",
            """[S, I, R, N]""",
            """S = Sensibel bei Standardexposition
I = Sensibel bei erhöhter Exposition
R = Resistent
N = IE (keine Interpretation"""),
        KvdtField(
            "7368",
            "Zellmaterial nicht verwertbar",
            1,
            1,
            "N",
            """[1]""",
            """1 = Zellmaterial nicht verwertbar"""),
        KvdtField("7369", "MHK-Einheit", 0, 60, "A", "", ""),
        KvdtField("7370", "Wirkstoffoder Handelsname", 0, 60, "A", "", ""),
        KvdtField("7371", "Alarmwert obere Grenze", 0, 60, "F", "", ""),
        KvdtField("7372", "Tumorklassifikation", 0, 60, "A", "", ""),
        KvdtField("7373", "Grading", 0, 5, "A", "", """Beispiel: G1, G2, G3"""),
        KvdtField("7374", "Stadium", 0, 5, "A", "", """Beispiel: I, II, IIa"""),
        KvdtField("7375", "Jahr der Tumordiagnose", 4, 4, "N", """JJJJ J= Jahr""", ""),
        KvdtField("7376", "Lokalisation Tumor", 0, 60, "A", "", ""),
        KvdtField("7377", "Maße", 0, 60, "A", "", ""),
        KvdtField("7378", "Farbe", 0, 60, "A", "", ""),
        KvdtField("7379", "Infiltrationstiefe", 0, 60, "A", "", ""),
        KvdtField(
            "7380",
            "Ausfluss / pathologische Blutung",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField(
            "7382",
            "IUP",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField(
            "7383",
            "Einnahme von Ovulationshemmer / sonstige Hormon-Anwendung",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField(
            "7384",
            "Klinischer Befund",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField("7398", "RR (Blutdruck)", 7, 7, "A", "", ""),
        KvdtField("7400", "HPV-Befund", 1, 1, "N", """1 = ja""", ""),
        KvdtField(
            "7401",
            "High-Risk",
            1,
            1,
            "N",
            """[1, 2, 3]""",
            """1 = positiv
2 = negativ
3 = nicht verwertbar"""),
        KvdtField(
            "7402",
            "High Risk Typ",
            0,
            120,
            "A",
            "",
            """Beispiele: Einzelwert = 18, Wertegruppe = G1:31/33/52/58"""),
        KvdtField(
            "7403",
            "Low-Risk",
            1,
            1,
            "N",
            """[1, 2, 3]""",
            """1 = positiv
2 = negativ
3 = nicht verwertbar"""),
        KvdtField("7404", "Low Risk Typ", 0, 120, "A", "", """Beispiel: Einzelwert = 42"""),
        KvdtField(
            "7405",
            "Endozervikale Zellen",
            1,
            1,
            "N",
            """[1, 2]""",
            """1 = vorhanden
2 = nicht vorhanden """),
        KvdtField("7406", "Proliferationsgrad", 0, 10, "A", "", ""),
        KvdtField(
            "7407",
            "Döderleinflora",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField(
            "7408",
            "Mischflora",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField(
            "7409",
            "Kokkenflora",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField(
            "7410",
            "Trichomonaden",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField(
            "7411",
            "Candida",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField(
            "7412",
            "Gardenerella",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField(
            "7413",
            "Codierung der Gruppe",
            0,
            4,
            "A",
            """s. Tabelle am Ende der Regeltabelle""",
            ""),
        KvdtField("7414", "Gruppe", 0, 5, "A", """s. Tabelle am Ende der Regeltabelle""", ""),
        KvdtField(
            "7415",
            "Zytologische Kontrolle",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField(
            "7416",
            "Grund der Nachkontrolle",
            1,
            1,
            "N",
            """[1, 2]""",
            """1 = nach Entzündungsbehandlung
2 = nach Oestrogenbehandlung"""),
        KvdtField(
            "7417",
            "Abklärungskolposkopie",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Nein
1 = Ja"""),
        KvdtField(
            "7418",
            "P16/Ki67",
            1,
            1,
            "N",
            """[1, 2, 3]""",
            """1 = positiv 2 = negativ 3 = invalid"""),
        KvdtField(
            "7419", "L1", 1, 1, "N", """[1, 2, 3]""", """1 = positiv 2 = negativ 3 = invalid"""),
        KvdtField(
            "7420",
            "Status Person",
            2,
            2,
            "N",
            """[02, 03, 04, 05, 06, 11, 12, 15, 16, 17]""",
            """02 = Einsender Arzt
03 = Einsender sonstige
04 = Versicherter
05 = Rechnungsempfänger
06 = Bevollmächtigter
11 = Halter (eines Tieres)
12 = Patient
15 = staatliche Einrichtung
16 = sonstige juristische Person
17 = sonstige medizinische Einrichtung """),
        KvdtField(
            "7421",
            "Status Rechnungsempfänger",
            2,
            2,
            "N",
            """[02, 03, 04, 05, 06, 11, 12, 15, 16, 17]""",
            """02 = Einsender Arzt
03 = Einsender sonstige
04 = Versicherter
05 = Rechnungsempfänger
05 = Rechnungsempfänger
06 = Bevollmächtigter
11 = Halter (eines Tieres)
12 = Patient
15 = staatliche Einrichtung
16 = sonstige juristische Person
17 = sonstige medizinische Einrichtung """),
        KvdtField(
            "7422",
            "Chlamydien",
            1,
            1,
            "N",
            """[1, 2, 3]""",
            """1 = positiv
2 = negativ
3 = invalid"""),
        KvdtField("7423", "Erläuterungen", 0, 990, "A", "", ""),
        KvdtField(
            "7424",
            "Resistenz erstellt nach",
            1,
            1,
            "N",
            """[1, 2, 3]""",
            """1 = CLSI
2 = EUCAST
3 = CA-FMS"""),
        KvdtField(
            "7425",
            "Extragynäkologische Zytologie",
            1,
            1,
            "N",
            """[1, 2, 3, 4]""",
            """1 = positiv
2 = negativ
3 = nicht auswertbar
4 = suspekt"""),
        KvdtField(
            "7426",
            "Neisseria Gonorrhoeae",
            1,
            1,
            "N",
            """[1, 2, 3]""",
            """1 = positiv
2 = negativ
3 = invalid"""),
        KvdtField("7427", "Art", 1, 1, "N", "", ""),
        KvdtField("7428", "Geschlecht des Tieres", 1, 1, "N", "", ""),
        KvdtField(
            "7429",
            "DRG_Hinweis",
            0,
            990,
            "A",
            "",
            """Hier können Hinweise zu DRG ́s übermittelt werden."""),
        KvdtField(
            "7430",
            "Patienten-ID im Selektiv-vertrag",
            0,
            60,
            "A",
            "",
            """Hier wird die Patienten-ID übermittelt, die der Patient im Selektivvertrag hat, in den er einge-schrieben ist."""),
        KvdtField(
            "7431",
            "Fachgebiet",
            1,
            1,
            "N",
            "",
            """Hier wird das Fachgebiet angegeben, für welches das Obj_Sonstige_Untersuchungsergebnisse genutzt wird."""),
        KvdtField(
            "7432",
            "kastriert/sterilisiert",
            1,
            1,
            "N",
            "",
            """Zusatzangaben im Obj_Tiere/Sonstiges"""),
        KvdtField(
            "7922",
            "Sterbedatum des Patienten",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField("8000", "Satzart", 4, 4, "A", "", ""),
        KvdtField("8001", "Satzende", 4, 4, "N", """[8220, 8221, 8230, 8231, 8205, 8215]""", ""),
        KvdtField("8002", "Objektident", 8, 8, "A", "", ""),
        KvdtField("8003", "Objektende", 8, 8, "A", "", ""),
        KvdtField("8100", "Satzlänge", 5, 5, "N", "", ""),
        KvdtField(
            "8101",
            "Abrechnungsinformation",
            22,
            22,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0001 (Abrechnungsinformation)."""),
        KvdtField(
            "8102",
            "Abrechnung_GKV",
            14,
            14,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0002 (Abrechnung GKV)."""),
        KvdtField(
            "8103",
            "Abrechnung_PKV",
            14,
            14,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0003 (Abrechnung PKV)."""),
        KvdtField(
            "8104",
            "Abrechnung_IGEL",
            15,
            15,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0004 (Abrechnung IGe-Leistungen)."""),
        KvdtField(
            "8105",
            "Abrechnung_sonstige_Kostenuebernahme",
            36,
            36,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0005 (Abrechnung Sonstige Kosten-übernahme)."""),
        KvdtField(
            "8106",
            "Abrechnung_Selektivvertrag",
            26,
            26,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0006 (Abrechnung Selektivvertrag)."""),
        KvdtField(
            "8107",
            "Anschrift",
            9,
            9,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0007 (Anschrift)."""),
        KvdtField(
            "8108",
            "Adressat",
            8,
            8,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0008 (Adressat)."""),
        KvdtField(
            "8109",
            "Abrechnung_OEGD",
            16,
            16,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0009 (Abrechnung OEGD)."""),
        KvdtField(
            "8110",
            "Anhang",
            6,
            6,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0010 (Anhang)."""),
        KvdtField(
            "8111",
            "Antibiogramm",
            12,
            12,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0011 (Antibiogramm)."""),
        KvdtField(
            "8113",
            "Auftragsinformation",
            19,
            19,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0013 (Auftragsinformation)."""),
        KvdtField(
            "8114",
            "Arztidentifikation",
            18,
            18,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0014 (Arztidentifikation)."""),
        KvdtField(
            "8117",
            "Befundinformation",
            19,
            19,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0017 (Befundinformationen)."""),
        KvdtField(
            "8118",
            "Abweichender_Befundweg",
            22,
            22,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0031 (Kommunikationsdaten)."""),
        KvdtField(
            "8119",
            "Betriebsstaette",
            15,
            15,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0019 (Betriebstätte)."""),
        KvdtField(
            "8122",
            "Einsenderidentifikation",
            23,
            23,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0022 (Einsenderidentifikation)."""),
        KvdtField(
            "8126",
            "Fehlermeldung_Aufmerksamkeit",
            28,
            28,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0026 (Fehlermeldung / Aufmerksam-keit)."""),
        KvdtField(
            "8127",
            "Veranlassungsgrund",
            18,
            18,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0027 (Veranlassungsgrund)."""),
        KvdtField(
            "8131",
            "Kommunikationsdaten",
            19,
            19,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0031 (Kommunikationsdaten)."""),
        KvdtField(
            "8132",
            "Kopfdaten",
            9,
            9,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0032 (Kopfdaten)."""),
        KvdtField(
            "8134",
            "Krebsfrueherkennung_ZervixKarzinom",
            35,
            35,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0034 (Krebsfrüherkennung Zervix-Karzinom Muster 39)."""),
        KvdtField(
            "8135",
            "Laborergebnisbericht",
            20,
            20,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0035 (Laborergebnisbericht)."""),
        KvdtField(
            "8136",
            "laborkennung",
            12,
            12,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0036 (Laborkennung)."""),
        KvdtField(
            "8137",
            "Material",
            8,
            8,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0037 (Material)."""),
        KvdtField(
            "8140",
            "Mutterschaft",
            12,
            12,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0040 (Mutterschaft)."""),
        KvdtField(
            "8141",
            "Namenskennung",
            13,
            13,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0041 (Namenskennung)."""),
        KvdtField(
            "8142",
            "Normalwert",
            10,
            10,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0042 (Normalwert)."""),
        KvdtField(
            "8143",
            "Organisation",
            12,
            12,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0043 (Organisation)."""),
        KvdtField(
            "8145",
            "Patient",
            7,
            7,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0045 (Patient)."""),
        KvdtField(
            "8147",
            "Person",
            6,
            6,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0047 (Person)."""),
        KvdtField(
            "8148",
            "RgEmpfänger",
            12,
            12,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0048 (RgEmpfänger)."""),
        KvdtField(
            "8150",
            "Schwangerschaft",
            15,
            15,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0050 (Schwangerschaft)."""),
        KvdtField(
            "8151",
            "Sendendes_System",
            16,
            16,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0051 (Sendendes System)."""),
        KvdtField(
            "8153",
            "Tier_Sonstiges",
            14,
            14,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0053 (Tier/Sonstiges)."""),
        KvdtField(
            "8154",
            "Timestamp",
            9,
            9,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8155",
            "Blutgruppenzugehoerigkeit",
            25,
            25,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0055 (Transfusionsmedi-zin/Mutterschaftsvorsorge)."""),
        KvdtField(
            "8156",
            "Tumor",
            5,
            5,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0056 (Tumor)."""),
        KvdtField(
            "8158",
            "Untersuchungsabrechnung",
            23,
            23,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0058 (Untersuchungsabrechnung)."""),
        KvdtField(
            "8159",
            "Untersuchungsanforderung",
            24,
            24,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0059 (Untersuchungsanforderung)."""),
        KvdtField(
            "8160",
            "UE_Klinische_Chemie",
            19,
            19,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0060 (Untersuchungsergebnis Klini-sche Chemie)."""),
        KvdtField(
            "8161",
            "UE_Mikrobiologie",
            16,
            16,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0061 (Untersuchungsergebnis Mik-robiologie)."""),
        KvdtField(
            "8162",
            "UE_Krebsfrueherkennung_Zervix-Karzinom",
            38,
            38,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0062 (Untersuchungsergebnis Krebsfrueherkennung Zervix-Karzinom)."""),
        KvdtField(
            "8163",
            "UE_Zytologie",
            12,
            12,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0063 (Untersuchungsergebnis Zyto-logie)."""),
        KvdtField(
            "8167",
            "Zusaetzliche_Informationen",
            26,
            26,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0068 (Fließtext). 8169"""),
        KvdtField(
            "8169",
            "Koerpergroessen",
            19,
            19,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0069 (Koerperkenngroessen)."""),
        KvdtField(
            "8170",
            "Medikament",
            10,
            10,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0070 (Medikament)."""),
        KvdtField(
            "8171",
            "Wirkstoff",
            9,
            9,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0071 (Wirkstoff)."""),
        KvdtField(
            "8200",
            "Akutdiagnose",
            12,
            12,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0100 (Diagnose). Die aus der Sicht des beauftragenden Arztes für die Fragestellung relevanten Diagnosen können im jeweils nachfolgenden Obj_0100 (Diagnose) übermittelt werden."""),
        KvdtField(
            "8212",
            "Softwareverantwortlicher",
            24,
            24,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0043 (Organisation)."""),
        KvdtField(
            "8213",
            "Timestamp_Erstellung_Untersuchungsanforderung",
            45,
            45,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8214",
            "Timestamp_Auftragserteilung",
            27,
            27,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8215",
            "Timestamp_Auftragseingang",
            25,
            25,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8216",
            "Timestamp_Befunderstellung",
            26,
            26,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8217",
            "Praezisierung_Veranlassungsgrund",
            32,
            32,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0068 (Fließtext)."""),
        KvdtField(
            "8218",
            "Timestamp_Erstellung_Datensatz",
            30,
            30,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8219",
            "Timestamp_Materialabnahme_entnahme",
            34,
            34,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8220",
            "Timestamp_Eingangserfassung_Material",
            36,
            36,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8221",
            "Timestamp_Erstellung_Laborergebnisbericht",
            41,
            41,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8222",
            "Timestamp_Beginn_Analytik",
            25,
            25,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8223",
            "Timestamp_Ergebniserstellung",
            28,
            28,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8224",
            "Timestamp_QM_Erfassung",
            22,
            22,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8225",
            "Timestamp_Messung",
            17,
            17,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8226",
            "Timestamp_Gueltig_ab",
            20,
            20,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8227",
            "Timestamp_Gueltig_bis",
            21,
            21,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8228",
            "Wohnanschrift",
            13,
            13,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0007 (Anschrift)."""),
        KvdtField(
            "8229",
            "Anschrift_Arbeitsstelle",
            23,
            23,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0007 (Anschrift)."""),
        KvdtField(
            "8230",
            "Rechnungsanschrift",
            18,
            18,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0007 (Anschrift)."""),
        KvdtField(
            "8231",
            "Temporaere_Anschrift",
            20,
            20,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0007 (Anschrift)."""),
        KvdtField(
            "8232",
            "Private_Kommunikationsdaten",
            27,
            27,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0031 (Kommunikationsdaten)."""),
        KvdtField(
            "8233",
            "Geschaeftliche_Kommunikationsdaten",
            34,
            34,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0031 (Kommunikationsdaten)."""),
        KvdtField(
            "8235",
            "Person_zum_Timestamp",
            20,
            20,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0047 (Person)."""),
        KvdtField(
            "8236",
            "Testbezogene_Hinweise",
            21,
            21,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0068 (Fließtext)."""),
        KvdtField(
            "8237",
            "Ergebnistext",
            12,
            12,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0068 (Fließtext)."""),
        KvdtField(
            "8238",
            "Auftragsbezogene_Hinweise",
            21,
            21,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0068 (Fließtext)."""),
        KvdtField(
            "8239",
            "Laborbezeichnung",
            16,
            16,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0043 (Organisation)."""),
        KvdtField(
            "8240",
            "Ueberweisung_von_anderen_Aerzten",
            32,
            32,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0014 (Arztidentifikation)."""),
        KvdtField(
            "8241",
            "Ueberwesiung_an",
            15,
            15,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0014 (Arztidentifikation)."""),
        KvdtField(
            "8242",
            "Base64-kodierte_Anlage",
            22,
            22,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0068 (Fließtext)."""),
        KvdtField(
            "8243",
            "Timestamp_Zeitpunkt_Medikamenteneinnahme",
            40,
            40,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0054 (Timestamp)."""),
        KvdtField(
            "8244",
            "BAK",
            3,
            3,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0072 (BAK)."""),
        KvdtField(
            "8245",
            "BAK-Ergebnis",
            12,
            12,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0068 (Fließtext)."""),
        KvdtField(
            "8246",
            "BAK-Ergebnisbezogene_Hinweise",
            29,
            29,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0068 (Fließtext)."""),
        KvdtField(
            "8247",
            "Diagnos-tische_Bewertung_Empfehlung",
            34,
            34,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0068 (Fließtext)."""),
        KvdtField(
            "8248",
            "UE_Sonstige_Untersuchungsergebnisse",
            35,
            35,
            "A",
            "",
            """Nach dem Vorkommen der Feldkennung folgt das Obj_0073 (Sonstige Untersuchungser-gebnisse)."""),
        KvdtField("8300", "Labor", 0, 60, "A", "", ""),
        KvdtField(
            "8301",
            "Eingangsdatum des Auftrags im labor",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "8302",
            "Berichtsdatum",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "8303",
            "Berichtszeit",
            4,
            4,
            "N",
            """hhmm
hh = Stunden
mm = Miinuten""",
            ""),
        KvdtField(
            "8310",
            "Auftragsnummer des Einsenders",
            0,
            60,
            "A",
            "",
            """Eindeutige Kennzeichnung eines Auftrages, welche durch das Primärsystem des Erstein-sendenden vergeben wird (kann auch eine OID sein)."""),
        KvdtField(
            "8311",
            "Auftragsnummer des Labors",
            0,
            60,
            "A",
            "",
            """Bezeichnet die eindeutige Nummer, unter der das Labor den Auftrag entgegen nimmt. Die Struktur und Form der Nummer wird vom Labor selbst frei festgelegt."""),
        KvdtField(
            "8312",
            "Kunden-(Arzt-)Nummer",
            0,
            20,
            "A",
            "",
            """Kennung des einsendenden Arztes, die durch das Labor vergeben wird."""),
        KvdtField(
            "8313",
            "ID Nachforderung",
            0,
            60,
            "A",
            "",
            """Identifiziert eine Nachforderung, die auf die Auftrags ID oder Teilauftrags ID referenziert."""),
        KvdtField("8315", "ID des Empfängers", 0, 60, "A", "", ""),
        KvdtField("8316", "ID des Senders", 0, 60, "A", "", ""),
        KvdtField("8320", "Laborname", 0, 60, "A", "", ""),
        KvdtField("8321", "Straße der Laboradresse", 0, 60, "A", "", ""),
        KvdtField("8322", "PLZ der Laboradresse", 0, 7, "A", "", ""),
        KvdtField("8323", "Ort der Laboradresse", 0, 60, "A", "", ""),
        KvdtField("8324", "Telefonnummer des Labors", 0, 60, "A", "", ""),
        KvdtField("8324", "ID des Laborstandortes", 0, 60, "A", "", ""),
        KvdtField("8325", "Telefaxnummer des Labors", 0, 60, "A", "", ""),
        KvdtField(
            "8401",
            "Status (Befund/Bericht)",
            1,
            1,
            "A",
            "",
            """Der Status des Befundes/Berichtes wird aus Sicht des gestellten Auftrages als „Auftrag nicht abgeschlossen“ oder „Auftrag abgeschlossen“ definiert."""),
        KvdtField("8403", "Gebührenordnung", 1, 1, "N", "", ""),
        KvdtField("8405", "Patienteninformation", 0, 60, "A", "", ""),
        KvdtField("8406", "Kosten in (€) Cent", 0, 60, "N", "", ""),
        KvdtField(
            "8410",
            "Test-Ident",
            0,
            20,
            "A",
            "",
            """Eindeutige Kurzbezeichnung eines Analyts (eineindeutige Zuordnung aller Eigenschaften dieses Analyts, wie z.B. Normbereich, Preis und Dimension zum aktuellen Zeitpunkt)"""),
        KvdtField("8411", "Testbezeichnung", 0, 60, "A", "", """Langbezeichnung des Analyts"""),
        KvdtField("8413", "QMS-Test-Ident", 0, 8, "A", "", ""),
        KvdtField("8414", "QMS-Testbezeichnung", 0, 60, "A", "", ""),
        KvdtField("8415", "nicht anforderbar", 1, 1, "N", "", ""),
        KvdtField(
            "8417",
            "Anlass der Untersuchung",
            2,
            2,
            "N",
            """[01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11]""",
            """01 = Vorsorge
02 = Verlaufskontrolle
03 = Zustand vor
04 = Zustand nach
05 = Ausschluss
06 = Bestätigung
07 = gezielte Suche
08 = ungezielte Suche
09 = Erfolgskontrolle
10 = Abschlusskontrolle
11 = Immunität/Impferfolg """),
        KvdtField(
            "8418",
            "Ergebnisstatus",
            1,
            1,
            "A",
            """[A, B, F, K, M, P, S, V]""",
            """A = Analytik abgeschlossen
B = bereits berichtet
F = Wert fehlt
K = korrigierter Wert
M = Material fehlt oder nicht verwendbar
P = weiterer Wert für Funktionsprofil folgt
S = Untersuchungsanforderung wurde storniert
V = Wert vorläufig"""),
        KvdtField(
            "8419",
            "Einheitensystem des Messwertes/Wertes in",
            1,
            1,
            "N",
            """[1, 2, 9]""",
            """SI-Einheit, konventionelle abweichende Einheit, dimensionslos"""),
        KvdtField("8420", "Ergebnis-Wert", 0, 60, "A", "", """Messergebnis"""),
        KvdtField("8421", "Maßeinheit des Messwertes/Wertes", 0, 60, "A", "", ""),
        KvdtField(
            "8422",
            "Grenzwertindikator des Laborwertes",
            0,
            2,
            "A",
            """Bei numerischen Werten:
[N, H, +, HH, ++, L, -,
LL, --, !H, !+, !L, !-]

Bei nicht numerischen
Werten:
[N, A, AA]""",
            """Bei numerischen Werten:
- „N“ = im Normalbereich
- “H” oder „+“ = schwach erhöht,
- “HH” oder „++“ = stark erhöht,
- “L” oder „-“ = schwach erniedrigt,
- “LL” oder „--“ = stark erniedrigt,
- „!H“ oder „!+“ = Wert extrem erhöht,
- „!L“ oder „!-„ = Wert extrem erniedrigt.
Bei nicht numerischen Werten:
- “N” = normal (anzuwenden bei nicht numerischen Werten),
- “A” = auffällig (anzuwenden bei nicht numerischen Werten),
- “AA” = sehr auffällig (anzuwenden bei nicht numerischen Werten)."""),
        KvdtField("8423", "Pathologisch bekannt", 1, 1, "N", """1 = ja""", ""),
        KvdtField(
            "8424",
            "Mutterschaft",
            1,
            1,
            "N",
            "",
            """Mittels des Feldes 8424 kann der Einsender der Laborgemeinschaft mitteilen, dass die Anforderung zur Patientin im Rahmen der Mutterschaftsvorsorge erfolgt, da dies Auswirkungen auf die Abrechnung hat"""),
        KvdtField("8425", "budgetfrei", 1, 1, "N", "", ""),
        KvdtField(
            "8427",
            "Spezifizierung des Veranlassungsgrundes",
            2,
            2,
            "N",
            """[10, 11, 12, 13, 20, 21, 22, 23, 24, 25, 26, 27, 28, 30]""",
            """10 = Methodenspezifische Standards nach WHO
11 = Methodenspezifische Standards nach IFCC (u.a. serologische Verfahren)
12 = Methodenspezifische Standards nach DGKL
13 = Sonstige Standards 1)
20 = Patientenspezifische Einflussgröße „Alter“ betreffend
21 = Patientenspezifische Einflussgröße „Geschlecht“ betreffend
22 = Patientenspezifische Einflussgröße „Alter + Geschlecht“ betreffend
23 = Patientenspezifische Einflussgröße „SSW“ betreffend
24 = Patientenspezifische Einflussgröße „Alter + SSW“ betreffend
25 = weitere patientenspezifische Einflussgrößen (z.B. Mediaktion)
26 = Information zu Patientenspezifischer Einflussgröße „Alter“ fehlte
27 = Information zu Patientenspezifischer Einflussgröße „Geschlecht“ fehlte
28 = Information zu Patientenspezifischer Einflussgröße „Alter“ und „Geschlecht“ fehlte
30 = Funktionsprofile 1)

1) Zur weiteren Sp"""),
        KvdtField(
            "8428",
            "Probenmaterial-Ident",
            0,
            60,
            "A",
            "",
            """Kurzbezeichnung zur Identifizierung eines Untersuchungsmaterials, z.B. SE"""),
        KvdtField(
            "8429",
            "Probenmaterial-Index",
            0,
            4,
            "N",
            """>0""",
            """Numerischer Wert zur Identifizierung eines Untersuchungsmaterials"""),
        KvdtField(
            "8430",
            "Probenmaterialbezeichnung",
            0,
            60,
            "A",
            "",
            """Langbezeichnung zur Identifizierung eines Untersuchungsmaterials, z.B. Serum"""),
        KvdtField(
            "8431",
            "Probenmaterialspezifikation",
            0,
            60,
            "A",
            "",
            """Detaillierung eines Untersuchungsmaterials, z.B. gefroren"""),
        KvdtField(
            "8434",
            "Anforderungen",
            0,
            60,
            "A",
            "",
            """Textanforderung, wenn im Leistungsverzeichnis kein Äquivalent gefunden wurde."""),
        KvdtField(
            "8460",
            "Normalwert-Text",
            0,
            990,
            "A",
            "",
            """Texterläuterung zum Analyten bei mikrobiologischen Berichten Hinweis: Kann für das Untersuchungsergebnis kein Normalbereich angegeben werden, so ist in FK8460 als Wert „k.A.“ zu übertragen."""),
        KvdtField("8461", "Normalwert untere Grenze", 0, 60, "F", "", ""),
        KvdtField("8462", "Normalwert obere Grenze", 0, 60, "F", "", ""),
        KvdtField("8470", "Testbezogene Hinweise", 0, 60, "", "", ""),
        KvdtField("8471", "Med.-relevante Information", 0, 60, "", "", ""),
        KvdtField("8472", "Zusätzliche Information", 0, 60, "", "", ""),
        KvdtField("8480", "Ergebnis-Text", 0, 60, "", "", ""),
        KvdtField("8490", "Auftragsbezogene Hinweise", 0, 60, "", "", ""),
        KvdtField(
            "8491", "Einwilligungserklärung des Patienten liegt vor", 1, 1, "N", """1 = ja""", ""),
        KvdtField(
            "8501",
            "Dringlichkeit",
            1,
            1,
            "N",
            """[1, 2]""",
            """1 = Notfall
2 = einig"""),
        KvdtField("8503", "infektiös", 1, 1, "", "", ""),
        KvdtField(
            "8504",
            "Medikamenteneinnahme zum Zeitpunkt der Probenentnahme",
            1,
            1,
            "N",
            """[0,1]""",
            """0 = nein
1 = Ja"""),
        KvdtField("8510", "Schwangerschaft", 1, 1, "N", "", ""),
        KvdtField("8511", "Schwangerschaftsdauer", 3, 3, "N", "", ""),
        KvdtField("8512", "letzte Periode", 8, 8, "N", "", ""),
        KvdtField(
            "8520",
            "Menge des Probenmaterials",
            0,
            60,
            "F",
            "",
            """Maßzahl für die Menge des Probenmaterials"""),
        KvdtField("8521", "Maßeinheit", 0, 60, "A", "", ""),
        KvdtField("8522", "Sammelzeit des Probenmaterials", 4, 4, "N", "", ""),
        KvdtField(
            "8523",
            "Wirkstoffmenge, Menge/Bezugsmenge, Wirkstärke",
            0,
            60,
            "F",
            "",
            """Maßzahl für die Menge des Wirkstoffes"""),
        KvdtField("8523", "benötigte Menge", 0, 10, "A", "", ""),
        KvdtField("8527", "Materialpriorität", 1, 1, "N", "", ""),
        KvdtField("8528", "beinhaltet folgende Test-Idents", 0, 8, "A", "", ""),
        KvdtField("8529", "Sortierindex", 0, 10, "N", "", ""),
        KvdtField("8530", "”Stufendiagnostik-Priorität”", 1, 1, "N", "", ""),
        KvdtField("8531", "”Freier” Suchbegriff", 0, 60, "A", "", ""),
        KvdtField("8532", "”Suchbegriff-Priorität”", 1, 1, "N", "", ""),
        KvdtField("8601", "Name des Rechnungsempfängers", 0, 28, "", "", ""),
        KvdtField(
            "8602", "Titel, Vorname des Rechnungsempfängers", 0, 28, "", "", """Ersatzwert: kA"""),
        KvdtField("8606", "Wohnort des Rechnungsempfängers", 0, 30, "", "", ""),
        KvdtField(
            "8608",
            "Kommentar/Aktenzeichen",
            0,
            60,
            "A",
            "",
            """Zusatzangaben zur Rechnung, wie Aktenzeichen, Rechnungsnummer, Kundennummer und sonstige Angaben zur Abrechnung (Faktor, Sammelrechnung etc.)"""),
        KvdtField("8609", "Abrechnungstyp", 1, 1, "A", "", ""),
        KvdtField(
            "8610",
            "Privattarif",
            1,
            1,
            "N",
            """[1, 2, 3]""",
            """1 = Privat
2 = Post B
3 = KVB"""),
        KvdtField(
            "8611",
            "Zusätzlicher Befundweg",
            1,
            1,
            "N",
            """[0, 1, 2, 3, 4, 5, 6]""",
            """0 = Papier
1 = Telefon
2 = Fax
3 = E-Mail
4 = DFÜ
5 = Tourpost
6 = KV-Connect"""),
        KvdtField("8612", "Rufnummer", 0, 60, "A", "", ""),
        KvdtField("8613", "zusätzlicher Empfänger", 0, 60, "A", "", ""),
        KvdtField("8614", "Abrechnung durch", 1, 1, "N", "", ""),
        KvdtField(
            "8614",
            "Bereits abgerechnet",
            1,
            1,
            "N",
            """[0,1]""",
            """0 = nein, wenn Abrechnung der GOP durch Befundempfänger erfolgt
1 = ja, wenn der GOP durch den Ersteller des Befundes abgerechnet wird"""),
        KvdtField("8615", "Auftraggeber", 0, 60, "A", "", ""),
        KvdtField("8616", "Testungen", 1, 1, "N", "", ""),
        KvdtField("8617", "Beauftragungsgrund", 1, 1, "N", "", ""),
        KvdtField("8618", "Betreut/untergebracht in", 1, 1, "N", "", ""),
        KvdtField("8619", "Tätigkeit in Einrichtung", 1, 1, "N", "", ""),
        KvdtField("8620", "Betroffene Einrichtung", 1, 1, "N", "", ""),
        KvdtField("8621", "Einverständnis", 1, 1, "N", "", ""),
        KvdtField("8622", "Corona-GUID", 43, 43, "A", "", ""),
        KvdtField("8623", "Identifikation/Aktenzeichen ÖGD", 0, 22, "A", "", ""),
        KvdtField("8624", "Covid-Beauftragung", 1, 1, "N", "", ""),
        KvdtField("8625", "PLZ ÖGD", 5, 5, "A", "", ""),
        KvdtField("8626", "Rechtsgrundlage der Testung", 1, 1, "N", "", ""),
        KvdtField("8627", "KV-Sonderziffer", 10, 5, "A", "", ""),
        KvdtField("8629", "Auftrag", 0, 6, "A", "", ""),
        KvdtField("8630", "Auftragsart", 1, 1, "A", "", ""),
        KvdtField(
            "8631",
            "Bestätigungsdiagnostik",
            1,
            1,
            "N",
            """[1]""",
            """1 = Bestätigungs-PCR nach § 4b Satz 1 TestV nach positivem Antigentest"""),
        KvdtField(
            "8632",
            "Virusvariantendiagnostik",
            1,
            1,
            "N",
            """[1]""",
            """1 = Varianten-PCR nach § 4b Satz 2 TestV nach positivem PCR-Test"""),
        KvdtField(
            "8990",
            "Namenskürzel/Namenszeichen",
            0,
            60,
            "A",
            "",
            """Namenskürzel der Person in deren Kontext die FK verwendet wird Beispiel: KMu"""),
        KvdtField(
            "9102",
            "Empfänger",
            2,
            2,
            "N",
            "",
            """01 = Schleswig-Holstein
02 = Hamburg
03 = Bremen
17 = Niedersachsen
18 = Dortmund
19 = Münster
20 = Dortmund
21 = Aachen
24 = Düsseldorf
25 = Duisburg
27 = Köln
28 = Linker Niederrhein
31 = Ruhr
37 = Bergisch-Land
39 = Darmstadt
40 = Frankfurt/Main
41 = Gießen
42 = Kassel
43 = Limburg
44 = Marburg
45 = Wiesbaden
47 = Koblenz
48 = Rheinhessen
49 = Pfalz
50 = Trier
51 = Rheinland-Pfalz
55 = Karlsruhe
60 = Freiburg
61 = Stuttgart
62 = Reutlingen
63 = München Stadt u. Land
64 = Oberbayern
65 = Oberfranken
66 = Mittelfranken
67 = Unterfranken
68 = Oberpfalz
69 = Niederbayern
70 = Schwaben
72 = Berlin
73 = Saarland
78 = Mecklenburg-Vorpommern
79 = Potsdam
80 = Cottbus
81 = Frankfurt/Oder
83 = Brandenburg
85 = Magdeburg
86 = Halle
87 = Dessau
93 = Thüringen
94 = Chemnitz
95 = Dresden
96 = Leipzig
99 = Knappschaft """),
        KvdtField(
            "9103",
            "Erstellungsdatum",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField("9104", "Referenzdatum", 8, 8, "D", "", ""),
        KvdtField("9105", "Ordnungsnummer des Datenträgers dieses Datenpaketes", 3, 3, "N", "", ""),
        KvdtField("9106", "verwendeter Zeichensatz", 1, 1, "N", "", """4 = ISO 8859-15"""),
        KvdtField("9111", "Gültigkeitsquartal", 5, 5, "N", """QJJJJ""", """Beispiel 22016"""),
        KvdtField(
            "9113",
            "KV-Geltungsbereich",
            2,
            2,
            "N",
            """[01, 02, 03, 17, 20, 38, 46, 51, 52, 71, 72, 73, 78, 83, 88, 93, 98, 99]""",
            """01 = Schleswig-Holstein
02 = Hamburg
03 = Bremen
17 = Niedersachsen
20 = Westfalen-Lippe
38 = Nordrhein
46 = Hessen
51 = Rheinland-Pfalz
52 = Baden-Württemberg
71 = Bayern
72 = Berlin
73 = Saarland
78 = Mecklenburg-Vorpommern
83 = Brandenburg
88 = Sachsen-Anhalt
93 = Thüringen
98 = Sachsen
99 = Bundesknappschaft """),
        KvdtField(
            "9115",
            "Erstellungsdatum ADT-Datenpaket",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "9116",
            "Erstellungsdatum KADT-Datenpaket",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField(
            "9122",
            "Erstellungsdatum SADT-Datenpaket",
            8,
            8,
            "D",
            """JJJJMMTT
T = Tag (01-31)
M = Monat (01-12)
J = Jahr (0001-9999)""",
            ""),
        KvdtField("9117", "Erstellungsdatum Hybrid-DRGDatenpaket", 8, 8, "D", "", """20240502"""),
        KvdtField(
            "9132",
            "enthaltene Datenpakete dieser Datei",
            1,
            1,
            "N",
            "",
            """Dieses Feld definiert die Datenpakete, die in einer KVDT-Datei enthalten sind. Jedes Datenpaket darf nur genau einmal je Datei vorhanden sein. Das Feld muss mindestens einmal vorhanden sein."""),
        KvdtField(
            "9135",
            "Kombinierte Datenpakete einer KVDT-Datei",
            1,
            1,
            "N",
            """[1, 3, 6]""",
            """1 = ADT-Datenpaket
3 = Kurärztliches Abrechnungs-Datenpaket
6 = SADT-Datenpaket"""),
        KvdtField(
            "9136",
            "Erstes zulässiges Abgabequartal",
            5,
            5,
            "N",
            """QJJJJ
Q= [1, 2, 3, 4]
J = 0001-9999""",
            """Beispiel: 12016"""),
        KvdtField(
            "9137",
            "Letztes zulässiges Abgabequartal",
            4,
            4,
            "",
            """QJJJJ
Q= [1, 2, 3, 4]
J = 0001-9999""",
            """Beispiel: 12016"""),
        KvdtField(
            "9138",
            "Separate Datenpakete einer KVDT-Datei",
            1,
            1,
            "N",
            """[1, 3, 6]""",
            """1 = ADT-Datenpaket
3 = Kurärztliches Abrechnungs-Datenpaket
6 = SADT-Datenpaket"""),
        KvdtField(
            "9139",
            "Abweichende empfangende KV",
            2,
            2,
            "N",
            """[20]""",
            """20 = KV Westfalen-Lippe"""),
        KvdtField("9202", "Gesamtlänge des Datenpaketes", 8, 8, "N", "", ""),
        KvdtField(
            "9204",
            "Abrechnungsquartal",
            5,
            5,
            "N",
            """QJJJJ
Q= [1, 2, 3, 4]
J = 0001-9999""",
            """Beispiel: 12016"""),
        KvdtField("9208", "Gesamtzahl der Betriebsstättendatensätze", 0, 0, "N", "", """1656"""),
        KvdtField("9212", "Version der Satzbeschreibung", 0, 11, "A", "", ""),
        KvdtField("9219", "Version SDKV-Pflegeprogramm", 0, 15, "A", "", ""),
        KvdtField("9222", "ADT-Referenzversion", 0, 11, "A", "", """ADT0199.01"""),
        KvdtField(
            "9250",
            "AVWG-Prüfnummer der AVS",
            15,
            17,
            "A",
            "",
            """Prüfnummer (s. FK0105) der eingesetzten Arzneimittelverordnungssoftware, falls vorhanden"""),
        KvdtField("9251", "HMV-Prüfnummer", 15, 17, "A", "", """siehe FK 0105"""),
        KvdtField("9260", "Anzahl Teilabrechnungen", 2, 2, "N", "", ""),
        KvdtField("9261", "Abrechnungsteil x von y", 2, 2, "N", "", ""),
        KvdtField("9300", "Prüfsumme", 40, 40, "A", "", ""),
        KvdtField(
            "9301",
            "Kryptoschlüssel",
            0,
            60,
            "A",
            "",
            """Mit der Anwendung des LDT ist der obligatorische Einsatz eines speziellen Verschlüsselungsprogramms (KBV-Kryptomodul) verbunden. Damit sollen alle personenbezogenen LDTFelder verschlüsselt werden. In einer ersten Version führt das Kryptomodul, das im wesentlichen auf dem IDEATM-Algorithmus aufbaut, den Schlüsselwert im Code des Programms mit. Spätere Versionen des Kryptomoduls sollen es erlauben, dass über eine externe Schlüsselvergabe via RSA/IDEA der Schlüssel im Datenpaket-Headersatz (SA 8220 und SA 8230) unter der Feldkennung 9301 mitgegeben wird. Das Feld Kryptoschlüssel wird ausschließlich über das KBV-Kryptomodul beschrieben und ausgewertet."""),
        KvdtField(
            "9400",
            "Handhabung „Tagtrennung“",
            1,
            1,
            "N",
            """[1, 2]""",
            """1 = Ein Eintrag einer Uhrzeit (FK 5006) zur ersten GNR des ersten Arzt-Patientenkontaktes an demselben Behandlungstag muss vorgenommen werden

2 = Ein Eintrag einer Uhrzeit (FK 5006) zur ersten GNR des ersten Arzt-Patientenkontaktes an demselben Behandlungstag muss nicht vorgenommen werden

Hinweis: Darüber hinaus gilt grundsätzlich, dass für weitere Arzt-Patientenkontakte an demselben Behandlungstag die Angabe einer Uhrzeit (FK 5006) zur jeweils ersten GNR erfolgen
muss """),
        KvdtField(
            "9401",
            "Handhabung “Übertragung Doppelkilometer bzw. Wegepauschale nach E-GO” bei Ersatzkassen",
            0,
            2,
            "N",
            """[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]""",
            """1 = Wegepauschale
2 = Wegepauschale bis 2 Kilometer, DKM ab 2 Kilometer
3 = DKM
4 = Angabe “Zone bei Besuchen” nur einmal je SA “010x”, Ausnahme: falls bei einzelnen Besuchen der Besuchsort und somit die Entfernung von dieser Zonenangabe abweicht, so ist die zutreffende Wegepauschale hinter dem entsprechenden Besuch zu erfassen
5 = Keine Angabe, sondern Vorlage einer “handschriftlichen” Wegegeldliste bei der KV
6 = DKM, Ausnahme: bei “Notfallpatienten” (SA 8000 = 0104), dann auch Wegepauschale zulässig
7 = Wegepauschale, Ausnahme: ärztlicher Notfalldienst, dann tatsächlich  efahrene DKM
8 = DKM (lt. Wegegeldliste der KV), Ausnahme: ärztlicher Notfalldienst, dann tatsächlich gefahrene DKM
9 = Wegepauschale, Ausnahme: im organisierten Notfalldienst ab einer Entfernung von 0,5 Kilometern Angabe von DKM. Anmerkung: der organisierte Notfalldienst kann bei den Satzarten 0101, 0102 und 0104 abgerechnet werden.
10 = KV-interne GNR unter FK 5001; Angabe der Doppelkilometer (DKM) als Multiplikator unter FK 5005. (Die Feldkennung 5008 wird im Zusammenhang mit DKM hier nicht verwendet!)"""),
        KvdtField(
            "9402",
            "zusätzlich erforderliche, zulässige Werte in Feld “4123” (Personenkreis/ Untersuchungskate-gorie)",
            2,
            2,
            "N",
            """[01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12]""",
            """01 = Beschädigter
02 = Schwerbeschädigter
03 = Angehöriger
04 = Hinterbliebener
05 = Pflegeperson
06 = Tauglichkeitsuntersuchung
07 = ärztl. Versorgung
08 = Bewerber
09 = Erstuntersuchung
10 = Nachuntersuchung
11 = Ergänzungsuntersuchung
12 = Verfolgte"""),
        KvdtField(
            "9403",
            "erforderliche Zusatzangabe in Feld “4124” (SKT-Zusatzangaben)",
            0,
            2,
            "N",
            """[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]""",
            """1 = Grundlistennummer Versorgungsamt
2 = Registriernummer
3 = Aktenzeichen der Entschädigungsbehörde
4 = Aktenzeichen der Kostenstelle
5 = Name des Auslands
6 = Personalnummer
7 = Personenkennnummer
8 = Dienststelle
9 = Schule/Universität/Kindergarten
10 = Personalnummer der Dienststelle"""),
        KvdtField(
            "9404",
            "zusätzlich erforderliche Abrechnungsinformation SKT",
            1,
            1,
            "N",
            """[1, 4]""",
            """1 = Gültigkeitszeitraum unter FK 4125 erforderlich
4 = Bemerkung der Entschädigungsbehörde unter FK 4126 erforderlich"""),
        KvdtField(
            "9405",
            "Handhabung \"Übertragung Pseudo-GNR\"",
            1,
            1,
            "N",
            """[1, 2]""",
            """1 = Enthält der Behandlungstag (FK 5000) eine GNR (FK 5001), muss dem Feld “Sachkosten/ Materialkosten in Cent” (FK 5012) eine Pseudo-GNR für Kosten vorangehen.

2 = Enthält der Behandlungstag (FK 5000) eine GNR (FK 5001), muss dem Feld “Sachkosten/ Materialkosten in Cent” (FK 5012) keine Pseudo-GNR für Kosten vorangehen.

Hinweis: Darüber hinaus gilt: Enthält der Behandlungstag (FK 5000) keine GNR (FK 5001), so muss dem Feld “Sachkosten/Materialkosten in Cent” (FK 5012) die Pseudo-GNR “88999” vorangehen, wenn nicht eine abweichende Regelung zur PseudoGNR unter den Feldkennungen 9410/9411 definiert ist. (vgl. auch P2-610 (2) a"""),
        KvdtField(
            "9406",
            "nicht zulässige Satzarten “010x”",
            4,
            4,
            "N",
            """[0101, 0102, 0103, 0104]""",
            """0101 = Ambulante Behandlung
0102 = Überweisung
0103 = Belegärztliche Behandlung
0104 = Notfalldienst / Vertretung / Notfall"""),
        KvdtField(
            "9407",
            "nicht zulässige Versichertenarten in Feld “3108”",
            1,
            1,
            "N",
            """[1, 3, 5]""",
            """1 = Mitglied
3 = Familienversicherter
5 = Rentner"""),
        KvdtField("9408", "Abgabe von Früherkennungsdokumenten", 1, 1, "N", "", ""),
        KvdtField(
            "9409",
            "Handhabung “Übertragung Doppelkilometer bzw. Wegepauschale nach BMÄ” bei Primärkassen",
            0,
            2,
            "N",
            """[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]""",
            """1 = Wegepauschale
2 = Wegepauschale bis 2 Kilometer, DKM ab 2 Kilometer
3 = DKM
4 = Angabe “Zone bei Besuchen” nur einmal je SA “010x”, Ausnahme: falls bei einzelnen Besuchen der Besuchsort und somit die Entfernung von dieser Zonenangabe abweicht, so ist die zutreffende Wegepauschale hinter dem entsprechenden Besuch zu erfassen
5 = Keine Angabe, sondern Vorlage einer “handschriftlichen” Wegegeldliste bei der KV
6 = DKM, Ausnahme: bei “Notfallpatienten” (SA 8000 = 0104), dann auch Wegepauschale zulässig
7 = Wegepauschale, Ausnahme: ärztlicher Notfalldienst, dann tatsächlich  efahrene DKM
8 = DKM (lt. Wegegeldliste der KV), Ausnahme: ärztlicher Notfalldienst,  ann tatsächlich gefahrene DKM
9 = Wegepauschale, Ausnahme: im organisierten Notfalldienst ab einer Entfernung von 0,5 Kilometern Angabe von DKM. Anmerkung: der organisierte Notfalldienst kann bei den Satzarten 0101, 0102 und 0104 abgerechnet werden.
10 = KV-interne GNR unter FK 5001; Angabe der Doppelkilometer (DKM) als Multiplikator unter FK 5005. (Die Feldkennung 5008 wird im Zusammenhang mit DKM hier nicht verwendet!)"""),
        KvdtField("9410", "Pseudo-GNR", 5, 6, "A", "", ""),
        KvdtField("9411", "Erläuterung zur Pseudo-GNR", 0, 60, "A", "", ""),
        KvdtField("9451", "Text für Scheinuntergruppe", 3, 3, "A", "", ""),
        KvdtField(
            "9452",
            "Festlegung der Sortierkriterien",
            1,
            1,
            "N",
            """[1, 2, 3, 4, 5, 6, 7, 8, 9]""",
            """1 = KTAB
2 = AbrA
3 = GebO
4 = AbrG
5 = VKNR
6 = Status
7 = Name
8 = Quartal
9 = Scheinuntergruppe"""),
        KvdtField("9453", "Wert der KTAB in Sortierung", 2, 2, "N", "", ""),
        KvdtField("9454", "Wert der Abrechnungsart im Rahmen der Sortierung", 1, 1, "N", "", ""),
        KvdtField("9455", "Wert der Gebührenordnung im Rahmen der Sortierung", 1, 1, "N", "", ""),
        KvdtField(
            "9456", "Wert des Abrechnungsgebietes im Rahmen der Sortierung", 2, 2, "N", "", ""),
        KvdtField(
            "9457",
            "Wert der Scheinuntergruppe im rahmen der Sortierung",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = Gehört zur führenden Scheingruppe
1 = Gehört zur nachgestellten Scheingruppe"""),
        KvdtField(
            "9458",
            "Festlegung der Quartalsreihenfolge",
            1,
            1,
            "N",
            """[1, 2, 3]""",
            """1 = LQ_VQAZ
2 = VQAZ_LQ
3 = LQ_VQZA= VQZA_LQ

wobei
LQ = Laufendes Quartal
VQ = Vorquartal
ZA = Abfallend
AZ = Aufsteigend"""),
        KvdtField("9459", "Fallzählung", 0, 2, "N", "", ""),
        KvdtField("9460", "Betriebsstättennummernkontingent von ...", 9, 9, "N", "", ""),
        KvdtField("9461", "Betriebsstättennummernkontingent bis ...", 9, 9, "N", "", ""),
        KvdtField(
            "9462",
            "Scheinabgabe",
            1,
            1,
            "N",
            """[1, 2]""",
            """1 = Abgabe
2 = Abgabe, wenn keine Versichertenkarte eingelesen wurde

Dies kann z.B. vorkommen
- bei defekter Versichertenkarte (Ersatzverfahren)
- bei manueller Übernahme der Daten von einem Überweisungsschein,
- bei Kostenträger, die keine Versichertenkarte ausgeben."""),
        KvdtField(
            "9463",
            "KV klammert",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = nein
1 = ja"""),
        KvdtField("9464", "Klammergruppe", 1, 1, "A", "", ""),
        KvdtField(
            "9465",
            "Reihenfolge innerhalb der Klammergruppe",
            1,
            1,
            "N",
            """0""",
            """0 = “Schwerpunktschein” ist führend

Alle anderen Werte bezeichnen die Reihenfolge in der Klammerung."""),
        KvdtField(
            "9467",
            "Status trennt",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = nein
1 = ja"""),
        KvdtField(
            "9468",
            "Status geklammerter Scheine",
            1,
            1,
            "N",
            """[0, 1, 2]""",
            """0 = Status des führenden Scheins
1 = Status des ersten Scheins im Quartal
2 = Status des letzten Scheins im Quartal"""),
        KvdtField(
            "9469",
            "Trenne Überweisungssätze",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = nein
1 = ja"""),
        KvdtField("9470", "VKNR-Seriennummer von ...", 3, 3, "N", "", ""),
        KvdtField("9471", "VKNR-Seriennummer bis ...", 3, 3, "N", "", ""),
        KvdtField("9472", "Freitext", 0, 60, "A", "", ""),
        KvdtField("9472", "allgemeine Informationen", 0, 60, "A", "", ""),
        KvdtField(
            "9473",
            "Listensteuerung 1: Liste aller Überweisungsscheine",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = nein
1 = ja"""),
        KvdtField(
            "9474",
            "Listensteuerung 2: Liste aller abzugegebenden Behandlungsscheine zzgl. aller Überweisungsscheine",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = nein
1 = ja"""),
        KvdtField(
            "9480",
            "Trenne Abrechnungsgebiet",
            1,
            1,
            "N",
            """[0, 1]""",
            """0 = nein
1 = ja"""),
        KvdtField("9901", "Jokerfeld", 0, 60, "A", "", ""),
        KvdtField(
            "9901",
            "Systeminterner Parameter",
            0,
            60,
            "A",
            "",
            """Dieses Feld unterscheidet sich von allen anderen Feldern dadurch, dass es von den Kassenärztlichen Vereinigungen überlesen wird. Damit ist es möglich, Daten abzuspeichern, die nur systemintern relevant sind. Dieses Feld kann in jeder Satzart an beliebiger Stelle in beliebiger Anzahl übertragen werden, aber nicht als allererstes Feld einer Datei."""),
        KvdtField("9908", "Originaldokument: Pfad/Speicherort", 0, 60, "A", "", ""),
        KvdtField("9909", "Langzeitarchivierung: Pfad/Speicherort", 0, 60, "A", "", ""),
        KvdtField(
            "9970",
            "Dokumententyp",
            3,
            3,
            "A",
            """[006, 010, 10A, 039, 090, 091, 092, 093, 094, 100, 101, 102, 103, 110, 120, 150, 160, 200, 250, 251, 252, 253, 254, 255, 256, 257, 258, 300, 301, 400, 500, 999]""",
            """006 = Muster 6
010 = Muster 10
10A = Muster 10A
039 = Muster 39
090 = Auftragsdokument PKV-FA
091 = Auftragsdokument PKV-LG
092 = Auftragsdokument IGeL
093 = Auftragsdokument Sonstige Kostenübernahme
094 = Auftragsdokument Selektivvertrag
100 = Laborbefund
101 = Mutterpass
102 = Impfpass
103 = Notfallausweis
110 = Patientenbefund
120 = Medikationsplan
150 = Verlaufsbericht
160 = Behandlungsbericht
200 = Einverständniserklärung lt. GenDG (Gen-Diagnostik-Gesetz)
250 = weitere laborspezifische Dokumente
251 = Allergie/RAST
252 = Molekulardiagnostik
253 = Endokrinologie
254 = Virologie
255 = Mikrobiologie
256 = Funktionsdiagnostik
257 = Infektionsserologie
258 = Kinderwunsch
300 = Meldung gemäß IfSG (Infektionsschutz-Gesetz)
301 = Meldung Krebsregister
400 = Normbereichsgrafik
500 = Rechnung
999 = sonstige

Hinweis: Werte 001 bis 089 reserviert für Muster der vertragsärztlichen Versorgung  """),
        KvdtField("9980", "Externe Dokumenten-ID zur Archivierung", 0, 0, "A", "", ""),
        KvdtField(
            "9981",
            "Dokumentenquelle",
            1,
            1,
            "N",
            """[1, 2] """,
            """1 = eigen
2 = fremd"""),
        KvdtField("9901", "Systeminterner Parameter", 0, 60, "A", "", """abcd/q<rs"""),
    )

val kvdtFieldMap = kvdtFieldDefinitions.associateBy { it.key }
