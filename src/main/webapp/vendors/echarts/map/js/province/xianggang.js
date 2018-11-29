(function (root, factory) {
    if (typeof define === 'function' && define.amd) {
        // AMD. Register as an anonymous module.
        define(['exports', 'echarts'], factory);
    } else if (typeof exports === 'object' && typeof exports.nodeName !== 'string') {
        // CommonJS
        factory(exports, require('echarts'));
    } else {
        // Browser globals
        factory({}, root.echarts);
    }
}(this, function (exports, echarts) {
    var log = function (msg) {
        if (typeof console !== 'undefined') {
            console && console.error && console.error(msg);
        }
    }
    if (!echarts) {
        log('ECharts is not Loaded');
        return;
    }
    if (!echarts.registerMap) {
        log('ECharts Map is not loaded')
        return;
    }
    echarts.registerMap('香港', {
        "type": "FeatureCollection",
        "features": [{
            "id": "810001",
            "geometry": {
                "type": "MultiPolygon",
                "coordinates": [["@@D@bKBoCWKACBGCI@CJSVGFIBKCM@ABAF@LFHPFJJPFNB", "@@ABD@@AAA", "@@AAG@@BBDD@DA"]],
                "encodeOffsets": [[[116895, 22829], [116861, 22818], [116860, 22817]]]
            },
            "properties": {"cp": [114.1543731, 22.28198083], "name": "中西區", "childNum": 3}
        }, {
            "id": "810002",
            "geometry": {
                "type": "Polygon",
                "coordinates": ["@@BMHBBGD@BAHBD@HKDEF@FHDEDECCGCIAAQWCUBSBDXApRE"],
                "encodeOffsets": [[116927, 22822]]
            },
            "properties": {"cp": [114.1829153, 22.27638889], "name": "灣仔區", "childNum": 1}
        }, {
            "id": "810003",
            "geometry": {
                "type": "Polygon",
                "coordinates": ["@@rWAGBEJKRO@ACCBEAIAEGEACKPA@MDICIDOBKDGAIBIABRJBHDDDCFCFEGE@CFGLC@GAABC@AHGAAN|T"],
                "encodeOffsets": [[116967, 22827]]
            },
            "properties": {"cp": [114.2260031, 22.27969306], "name": "東區", "childNum": 1}
        }, {
            "id": "810004",
            "geometry": {
                "type": "MultiPolygon",
                "coordinates": [["@@JBJAHBLCPAJCJDPCLOJM@IBAFBBA@CE@AAE@AAFIBQBADAFECCBEA@GFCAYBABIRC@QEGEACBEHMACECQACFE`A@GCK@AFFHADMJBBF@BB@FBHCFI@KLEBCAGWAAQDGCGJQHOPOHS`KLN@LDJAHETUDIJ@HDxCXD", "@@ACCBDB", "@@D@@ACCCB@CC@CFBDHA", "@@BA@AGB@BD@", "@@DABAGCCH@BD@", "@@BAEBD@"]],
                "encodeOffsets": [[[116946, 22787], [116886, 22776], [116934, 22767], [117006, 22758], [116932, 22748], [116970, 22738]]]
            },
            "properties": {"cp": [114.1600117, 22.24589667], "name": "南區", "childNum": 6}
        }, {
            "id": "810005",
            "geometry": {
                "type": "Polygon",
                "coordinates": ["@@AIBINQNIHU]IsRC@AvFBHFDCLDV@"],
                "encodeOffsets": [[116920, 22860]]
            },
            "properties": {"cp": [114.1733317, 22.31170389], "name": "油尖旺區", "childNum": 1}
        }, {
            "id": "810006",
            "geometry": {
                "type": "Polygon",
                "coordinates": ["@@H[@EEGU@KCCDGEEABQi@AHCF@B^P@BABOFCFBFF@FDNADADHJDhB"],
                "encodeOffsets": [[116919, 22881]]
            },
            "properties": {"cp": [114.1632417, 22.33385417], "name": "深水埗區", "childNum": 1}
        }, {
            "id": "810007",
            "geometry": {
                "type": "Polygon",
                "coordinates": ["@@DEBEFC@CJKD@DCHDLDBMEG@CFCLICETSDQSJeMGVKHGJIR@HFJBFG^FDD@"],
                "encodeOffsets": [[116925, 22883]]
            },
            "properties": {"cp": [114.1928467, 22.31251], "name": "九龍城區", "childNum": 1}
        }, {
            "id": "810008",
            "geometry": {
                "type": "Polygon",
                "coordinates": ["@@AC@IH_BAYCEDIAGDICGCCDC@IL@DEDAFCFNDVD@BADBBHCFDJAZD"],
                "encodeOffsets": [[116970, 22892]]
            },
            "properties": {"cp": [114.2038856, 22.33632056], "name": "黃大仙區", "childNum": 1}
        }, {
            "id": "810009",
            "geometry": {
                "type": "Polygon",
                "coordinates": ["@@F@HWF@DABD@IHBB@GOAENMBE@AEAGOBCFE@CqXCRSTDFKJED@DFHANFCJBFCXD"],
                "encodeOffsets": [[116974, 22868]]
            },
            "properties": {"cp": [114.2140542, 22.32083778], "name": "觀塘區", "childNum": 1}
        }, {
            "id": "810010",
            "geometry": {
                "type": "Polygon",
                "coordinates": ["@@AEDQ@WQACIKIGCQCABAHC@]I@ADC@ECICCKEGA@NuASIHyO@IEQW@CÙF~bNJFL@D@FLBBNPJJFIDAHEDBDHBDDBBTCB@AHDB^@@JHHF@DDLFJFDBHCD@PPD@L@RLLBDHVBNAHBBABGbB"],
                "encodeOffsets": [[116914, 22950]]
            },
            "properties": {"cp": [114.1210792, 22.36830667], "name": "荃灣區", "childNum": 1}
        }, {
            "id": "810011",
            "geometry": {
                "type": "MultiPolygon",
                "coordinates": [["@@AC@G]@CABGA@SDAACCGAACFCBGJCIEOIAMKAEHGFgFgPS@E@MEGEEGCAO@E@SLUNCH@DDH@H@JEHAJCHQFAB\\`FBTFTCBCDGBAJLJP\\@FC^CND@AEINGXA@OL@@U@@HN@BEE@@KTA", "@@BAFADAAC@AACDACGEBBHAFGFBDB@", "@@B@BA@AAB", "@@BAB@CCC@BD", "@@D@CGABAF", "@@@ACICABJDD", "@@DA@ACCC@ADBFBB@C", "@@@A@@ABB@"]],
                "encodeOffsets": [[[116810, 22924], [116618, 22917], [116612, 22891], [116626, 22888], [116629, 22880], [116725, 22874], [116708, 22866], [116720, 22861]]]
            },
            "properties": {"cp": [113.9765742, 22.39384417], "name": "屯門區", "childNum": 8}
        }, {
            "id": "810012",
            "geometry": {
                "type": "Polygon",
                "coordinates": ["@@BMDIEK@CDCAMHG@C@MCG@YBAZHZDLIJA[gAGBEHMTO@EAIKAQKK@C@OOC@GDCAIEKECCE@EE@HSB@LF@AFM@@G@@VK@@PWBMHFJ@BMC]DEDY@AAEIEIGEABELSDVHNRJPHJLHXHFBP^ZVBRB@\\CJIDEH@DDAJHDFF@DGL@FFB^CRED@JFDPJHPBHED@HFFF"],
                "encodeOffsets": [[116828, 23059]]
            },
            "properties": {"cp": [114.0324381, 22.44142833], "name": "元朗區", "childNum": 1}
        }, {
            "id": "810013",
            "geometry": {
                "type": "MultiPolygon",
                "coordinates": [["@@A@@HIEK@EA@BDH@BBBD@BBBAB@MN@DH@@BEFFFFA@C@@VABBDAJ@B@D@FAKEGB@ACACCA@IFCBAAAEFABEHGD@D@AIGB", "@@DC@CEDAFB@", "@@@AAB", "@@@AC@BB", "@@AABB", "@@BAAAEABDDB", "@@@A@CEDDB", "@@@AAB@@", "@@DA@CIE@JDB", "@@@@@@", "@@DCD@BNDBDIAE@I@EE@ABABOHAJBBDBDA", "@@@A@B", "@@B@B@ECAFB@BA", "@@AABB", "@@@@A@@B", "@@A@B@", "@@@A@B", "@@BCAB@B", "@@@A@B", "@@@FBCDBDABBBBBABCB@ABDBBDB@DH@JABBDNEBE@CD@FCKKG@AEC@EBA@ACIEA@EDBB@DB@ABAB", "@@A@BB", "@@D@BCG@ADD@", "@@@@@B", "@@BAA@", "@@A@B@", "@@@@AA@B", "@@QCKMECAKH@FDD@FFDABAFBBHJBPZBDJ@BCD@BBHA@DF@HAAAEEDA@EF@DGF@BC@CGE@GFBLABBADBBDAH@D@@AEIBAFF@ADBDAGGAEA@EIBCLBBA@CDBBCHBBABCTKLFZHRJH@DASMQGGIOEGAGBaNM@eEK@EDKLGBCFEBAAAGGGEEEIIGAEIDU@GBK@IDUAIAEEEGCIEBEAAHM@AABC@EKCWOMEIBKJYCYGAB@ZDH@N@DGHBNCFFNEN@JBFMJBDNDFHFBHEDALDFAFD@KFAFDBFH@FHDBF@DFHAHDLABAFBBDFF@BAAA@@D@DD@@HH@LLDCJFFCJ@BABEFABBJAB@DADDH@BBB@FBDCPBFEJBFC@AFADC@E@E"]],
                "encodeOffsets": [[[117049, 23071], [117017, 23092], [117013, 23092], [117010, 23091], [117004, 23090], [117009, 23086], [117081, 23081], [117014, 23081], [117057, 23081], [117015, 23077], [117062, 23071], [117020, 23075], [117024, 23072], [117021, 23072], [117029, 23071], [117037, 23071], [116974, 23071], [116957, 23067], [117036, 23065], [117043, 23049], [117033, 23064], [117035, 23059], [117043, 23052], [117049, 23053], [117040, 23048], [117054, 23039], [116975, 23082]]]
            },
            "properties": {"cp": [114.1473639, 22.49610389], "name": "北區", "childNum": 27}
        }, {
            "id": "810014",
            "geometry": {
                "type": "MultiPolygon",
                "coordinates": [["@@HGNA@ACGC@G@OFADCL@FDDJDBA@G", "@@@EACUMIMGGGCE@@CACIEMCMISGG@CESIGKGEQGG@CBABALQTCDABC@GCK@EBCACAAKBAHABAB@HA@AE@@ENADBDLFBFABACGEEICG@ICQB@B@J@@GBAAEEAODERKMIGMAAUAAAUA@ACAAA[ASAAHABGAMBUAAA@D@FSPIRBJ\\hNFXPLD@FADPBBGFBFAHPDFHDNBN@JCL@HAR@NCBFJHFJFFHHBHBBFADEHALKFCL@fFN@bMHAHBPFHJTJ", "@@CIEAEJBBBDDDHADBBAAA", "@@@CFABAAGCC@ECCEACB@HAJAB@FEDJJDBHABEAA", "@@BAEB@BB@", "@@^DLCFBBBBJFJNLH@DHN@NXJFFHPHDABABKDAFDDABGAEBCDBFFALDDBFDBDADIBIFOCCICAAAI@CDG@KJ@HEBBDJCBALDBFBBBDB@HBHHALEDE@IEG@EGA@EDIBYEGAIEEICADMFOLA@KEE@OHKHYDAC@KCECAS@CCAEBGGOK@CACIYCEAGEBLCH@JGJ@FBXCHDLBH", "@@AEA@ABB@@FB@", "@@@CAB@B", "@@BAAA@D", "@@BACB@BB@", "@@@A@B", "@@@DHBAEC@", "@@@@", "@@AA@B", "@@BB@CAA@B"]],
                "encodeOffsets": [[[117183, 23086], [117087, 23049], [117113, 23039], [117114, 23018], [117122, 23021], [116998, 22974], [117082, 23017], [117084, 23018], [117081, 23013], [117180, 23003], [117039, 23001], [116966, 22997], [117036, 22996], [117006, 22983], [116968, 22976]]]
            },
            "properties": {"cp": [114.1717431, 22.44565306], "name": "大埔區", "childNum": 15}
        }, {
            "id": "810015",
            "geometry": {
                "type": "MultiPolygon",
                "coordinates": [["@@B@@@C@@BB@", "@@FIJBFCF@JDF@DDBEDBDEHACGDK@EFEFK@EGAI@CDILEBEAIG@C@EECCKBCJEFGFAJGAGDKEGDG@GCCC@CBCFC@AIGAACFEEACC@CEAGB@EC@@AID@KBC@CACCGE@ABALGLBFA@GGEAE@GJAFBFIFCJHN@JOFGFG@@DBHABCFKAAEDCACI@GBGAAFI@GJEBE@ECAEBICCCU@KJI@IGKIBAAHcDEFENAFADE@CDGDET@BCBEJGDKAIKEEEGAACBCF@DA@MHI@CACCAE@AGE@OLEHGBAA@CECCGEAEBITGDANHRGLCDG@QSEG@DEDADHPFB@BEJIJBFHPA@GA@JACCBEBGVE@ABG`@JBDB@ADBFPBPJLLBJRDAJHFFBZDFLN@HPAHBFDDT@DBDF@LBDZCLGPGF@LFB@PKNEBCJDFFBJFHAZCJ@F", "@@A@@@B@", "@@@A@B", "@@@AAB", "@@BAC@@BBB", "@@BAAAABBB", "@@@AAB@@", "@@@AABB@", "@@@@", "@@B@BACEC@@DDD", "@@A@B@", "@@@AABBB", "@@DC@CA@ADA@ADB@", "@@DBFADBLC@MDEBIA@@GJAHGCCBEAA@CCA@CAEKBEBGACBEDEJAFHHAB@LABBDA@@AA@CBBB@DD@@DCDCB@JBBFA", "@@@AAAADB@", "@@@A@B", "@@HE@C@ICAA@AHAHCEEFBFDB", "@@BACA@CC@@DFB", "@@@AA@@@@B", "@@BCFE@ACCDQCACB@FCBCLGHFFBHFDB@DE@AEBBC", "@@@ACAAFD@", "@@BA@@CB@B@@", "@@B@AAABBB", "@@@AA@BB", "@@@ACDBBBA", "@@ACA@BD", "@@BAAB", "@@@@@@", "@@BAAAABBB", "@@A@BB", "@@FADIFEAICAACC@ABG@CD@FCD@BCHFFHB", "@@CEBEBACA@AA@KD@JBHH@BBDA", "@@@@AA@B", "@@@CE@BFD@", "@@AB@FDC@A", "@@DHFEDAFGACBCMBEJ@B", "@@BADABAB@BCKBCDBD", "@@D@C@", "@@A@@BB@", "@@D@C@", "@@BAAB", "@@@@", "@@AA@B", "@@BAAB@@", "@@@AABBB", "@@@@", "@@@@", "@@@@", "@@@@@@", "@@@A@B", "@@@@", "@@AA@D@A", "@@@A@B", "@@@@", "@@@AAB@B", "@@BAEBDB", "@@@@", "@@@@", "@@A@B@", "@@BC@AAAEDDD", "@@B@@AAB", "@@BACKAAC@@JHH", "@@AA@BB@", "@@BCA@AB", "@@@@@A", "@@@@", "@@@A@B", "@@@EAABAE@AAA@@JF@@FBBBAAA", "@@@CCB@BB@", "@@AA@GAAEAAE@@E@AJFLDDFADFB@D@@CAC", "@@AFDBJBAADCDEACFEGA@EEB@FEDAF", "@@JDB@ACDC@AA@ACB@@ADA@EC@@EAEC@E@AECAABBFIBED@B@D@HFDDDFABB"]],
                "encodeOffsets": [[[117146, 22985], [117119, 22980], [117154, 22972], [117153, 22970], [117139, 22942], [117137, 22939], [117137, 22938], [117033, 22925], [117063, 22925], [117065, 22924], [117066, 22923], [117031, 22921], [117064, 22919], [117029, 22917], [117054, 22915], [117038, 22915], [117048, 22915], [117075, 22911], [117036, 22912], [117039, 22911], [117043, 22905], [117051, 22909], [117044, 22906], [117050, 22906], [117074, 22902], [117143, 22898], [117036, 22899], [117076, 22898], [117116, 22882], [117120, 22880], [117102, 22876], [117073, 22876], [117119, 22871], [117126, 22873], [117085, 22870], [117121, 22865], [117041, 22863], [117123, 22866], [117118, 22860], [117118, 22859], [117118, 22859], [117069, 22860], [117079, 22857], [117077, 22857], [117116, 22856], [117068, 22845], [117059, 22843], [117058, 22841], [117059, 22841], [117059, 22840], [117059, 22838], [117058, 22838], [117061, 22837], [117066, 22837], [117066, 22837], [117061, 22835], [117070, 22834], [117061, 22834], [117068, 22834], [117068, 22833], [117064, 22810], [117100, 22804], [117100, 22803], [117118, 22799], [117120, 22799], [117028, 22798], [117118, 22797], [117095, 22795], [117103, 22791], [117097, 22787], [117105, 22856], [117111, 22850], [117039, 22789]]]
            },
            "properties": {"cp": [114.264645, 22.31421306], "name": "西貢區", "childNum": 73}
        }, {
            "id": "810016",
            "geometry": {
                "type": "Polygon",
                "coordinates": ["@@PGJAVDFD@HDBJBPA@OCKDGAYHM@IDGAKBIQCAIKKOIMACEBC_CIBECGDAABC@AUCKCG@ICeAICAAGHAL@FFJCP@FDHADLBFDLJDJRB@XCRBFHBBBDB@BVBBBXBFNHH"],
                "encodeOffsets": [[116956, 22970]]
            },
            "properties": {"cp": [114.1953653, 22.37953167], "name": "沙田區", "childNum": 1}
        }, {
            "id": "810017",
            "geometry": {
                "type": "Polygon",
                "coordinates": ["@@AECBMBECGA@CDEPEBA]QDGBGj@@cUADF@F@DCFIFSJQTQBaASPEBGzTJvB@MHBLFDDDJ@FCD@@ZJHBBIJBBCCI@GDKEI@EBKHE"],
                "encodeOffsets": [[116892, 22877]]
            },
            "properties": {"cp": [114.1393194, 22.36387667], "name": "葵青區", "childNum": 1}
        }, {
            "id": "810018",
            "geometry": {
                "type": "MultiPolygon",
                "coordinates": [["@@AIIGQCQ@GE@G@ICCGAAABCBA@GBGCA@ADOAGO@KBMLC@ACAEFARSDEACSGCEACLIL@DEPCBACEAECCE@AACEIECCKCMGI@KJGJEJ@FDLIBSGUAOOSEAABE@ECG_CSBUPAHGBICEOUMGCKBC@GCGGOC@DDPGDAF@HBFEHAP@JJJH@BNRFDDBHEBICAH@DPHF@DAFFFNLBRFBHNNBD@HEJJVED@DBDZD@DERDFCBAI[@CFGF@~d", "@@DC@AKE@ABADDF@BCFCAAIEG@CBAB@DABAFGDBBPD", "@@BAEAADDB", "@@BCAAIBA@BDBDJB@C", "@@BCCGGCGBABBHFDJ@", "@@J@FC@AAKFGCIC@EDADAD@B@BCBAAEHIBCDDB@DHABB", "@@CEMI@ABEHHFBHBHAFDFBF@BCLBDC@AGIK@OMDKJM@CAAC@YP@AHKAGAACBGHEGC@GBMDCD@HBDFDDDBXCFBNAHEBA@@IEAGCK@CNBDLHHD@BEBDFEBADDDRHBDB@BCF@BA@CCGACLI@EBCFCDFF@DE", "@@@CEA@DFD", "@@FEFBD@DEC@@CCAACGF@AE@CCBAC@CCCCCBBBG@AHH@DHH@DFADABE@CD@BD@DF@BABBDDBH@DBDB@E@AEAFABAKCAA@E", "@@D@ACAACF@BB@", "@@BAC@BB", "@@@@", "@@B@BBBA@EACGAEFA@GDBHJJFA@CB@BCAA@C", "@@D@BCBEAECCGC@BIB@CAAABBDA@@JADDBF@", "@@DE@KG@C@AJBBD@@DDD", "@@BB@AAA@B", "@@BHBB@CCE", "@@BADBDABAD@BAAABAAAABABAA@CA@ADAAAB@DABCACCC@BRDAFC", "@@@A@ACA@DBB", "@@DAAC@@CD@BB@", "@@AB@@", "@@@@", "@@BAA@@B", "@@AAA@@BD@", "@@A@", "@@BBBAAAABCAA@FB", "@@@BD@DDCDBDDBDAB@FCAAE@@EBABEE@CAI@AACAGF@DFDF@BA", "@@@A@A@D", "@@BACA@BBB", "@@B@@ACA@B", "@@DFPFBFF@BCFCFICCDEBIQA@DA@EC@ECCEAE@FJIBABD@@DCAAB@FDH"]],
                "encodeOffsets": [[[116799, 22849], [116787, 22826], [116803, 22822], [116823, 22817], [116799, 22797], [116780, 22791], [116882, 22747], [116881, 22757], [116774, 22741], [116575, 22748], [116686, 22746], [116794, 22736], [116733, 22725], [117001, 22721], [117036, 22720], [117038, 22719], [117053, 22714], [116651, 22714], [117053, 22714], [116664, 22710], [116665, 22706], [116665, 22706], [116984, 22706], [116645, 22704], [116647, 22703], [116640, 22702], [116646, 22692], [116656, 22693], [116663, 22685], [116998, 22691], [117001, 22702]]]
            },
            "properties": {"cp": [113.94612, 22.28640778], "name": "離島區", "childNum": 31}
        }],
        "UTF8Encoding": true
    });
}));
