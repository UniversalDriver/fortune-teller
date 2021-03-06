/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

/**
 *
 * @author administrator
 */
public class Translator {
    
    private String[] adjektiv = {
        "stor",
        "liten",
        "stark",
        "svag",
        "mjuk",
        "hård",
        "snabb",
        "vacker",
        "ljus",
        "mörk"
    };
    
    private String[] substantiv = {
        "en lönehöjning",
        "en lönesänkning",
        "en fotboja",
        "en katt",
        "en hund",
        "ett hus",
        "ett barn",
        "ett elstängsel",
        "ljen datorus",
        "ett golv"
    };

    private String[] verb = {
        "springa",
        "ljuga",
        "flyga",
        "se",
        "vara",
        "äta",
        "mäta",
        "gå",
        "röra",
        "resa"
    };
    
    /**
     * @param index
     * @return An "Adjektiv" from word-list corresponding to index parameter.
     * Default modifier will suffice 
     */
    String getAdjektiv(int index){
        return adjektiv[index];
    }

    /**
     * @param index
     * @return A "Substantiv" from word-list corresponding to index parameter.
     * Default modifier will suffice 
     */    
    String getSubstantiv(int index){
        return substantiv[index];
    }
    
        /**
     * @param index
     * @return A "Verb" from word-list corresponding to index parameter.
     * Default modifier will suffice 
     */
    String getVerb(int index){
        return verb[index];
    }  
}
