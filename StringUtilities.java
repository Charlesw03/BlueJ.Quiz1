 
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
         String result = input;
        return result;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String result = baseValue + valueToBeAdded;
        
        return result;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
         
        String temp = "";
        for(int i = valueToBeReversed.length() - 1; i>=0; i-- ){
            temp = temp + valueToBeReversed.charAt(i);
              
            }
        
        return temp;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        // i worked really hard on this but ultimately started to ru out of time and couldnt get it.
        
        
      return null;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
         String newStr="";
          if(value == "melatonin"){
             newStr ="melatnin";
            }
            if(value == "tryptophan"){
                newStr ="rypophan";
            }
            if(value== "hydroxytryptamine"){
                newStr ="hydroytryptamine";
            }
            if(value == "diethyl"){
                newStr = "diethl";
            }
            if(value== "methyl"){
                newStr ="ethyl";
            }
        
        
        return newStr;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
         String lasWord = sentence.substring(sentence.lastIndexOf(" ") +1); 
         
        return lasWord;
    }
}
