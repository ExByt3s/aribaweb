/*
    Copyright (c) 2013-2013 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id: //ariba/platform/util/core/ariba/util/i18n/I18NEncodingUtil.java#2 $

    Responsible: hprabhakara
*/
package ariba.util.i18n;

/**
 * This is generated by the addlanguage tool. Pls don't edit.
 *
 */

public abstract class I18NEncodingUtil
{

    public static final String EncodingUTF_8 = "UTF-8";
        // 
    public static final String EncodingASCII  =  "ASCII" ;
        // 8859_1
    public static final String EncodingISO8859_1  =  "8859_1"  ;
        // 
    public static final String EncodingISO8859_2  =  "ISO8859_2" ;
        // 
    public static final String EncodingISO8859_8  =  "ISO8859_8" ;
        // 
    public static final String EncodingISO2022CN  =  "ISO2022CN" ;
        // 
    public static final String EncodingISO2022JP  =  "ISO2022JP" ;
        // 
    public static final String EncodingISO2022KR  =  "ISO2022KR" ;
        //Chinese HTML Client 
    public static final String EncodingBig5  =  "Big5" ;
        //Chinese Html Client 
    public static final String EncodingGB2312  =  "GB2312" ;
        //Korean 
    public static final String EncodingKSC5601  =  "KSC5601" ;
        // 
    public static final String EncodingUTF8  =  "UTF8" ;
        //Japanse Html Client 
    public static final String EncodingShift_JIS  =  "Shift_JIS" ;
        // 
    public static final String EncodingEUC_KR  =  "EUC_KR" ;
        // 
    public static final String EncodingEUC_JP  =  "EUC_JP" ;
        //Japanese 
    public static final String EncodingMS932  =  "MS932" ;
        // 
    public static final String EncodingCp1252  =  "Cp1252" ;
        //Russian 
    public static final String EncodingCp1251  =  "Cp1251" ;
        //Turkish 
    public static final String EncodingCp1254  =  "Cp1254" ;
        //Polish 
    public static final String EncodingCp1250  =  "Cp1250" ;
        //Greek 
    public static final String EncodingCp1253  =  "Cp1253" ;
    


    protected static boolean isValidEncoding (String encoding)
    {
        if (encoding.equals(EncodingUTF_8)
                        || encoding.equals(EncodingISO8859_1)
                                                            || encoding.equals(EncodingBig5)
                    || encoding.equals(EncodingGB2312)
                    || encoding.equals(EncodingKSC5601)
                    || encoding.equals(EncodingUTF8)
                    || encoding.equals(EncodingShift_JIS)
                                            || encoding.equals(EncodingCp1252)
                    || encoding.equals(EncodingCp1251)
                    || encoding.equals(EncodingCp1254)
                    || encoding.equals(EncodingCp1250)
                    || encoding.equals(EncodingCp1253)
                ) {
            return true;
        }
        return false;
    }
}