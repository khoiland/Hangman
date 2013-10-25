/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author Kellie
 */
public class InvisibleWord {

    String hint, visible, secret;

    public InvisibleWord() {
        String[] wordList = {"animal", "artwork", "austrailia", "bagpipes", ""
            + "bookworm", "buffalo", "cat", "coyote", "cranberry", "dog", "diatomic", ""
            + "diligent", "elephant", "egypt", "engine", "fingernail", "fox", ""
            + "fungus", "galaxy", "giraff", "grizzly", "harmonica", "humming", ""
            + "hitler", "instrument", "internet", "illegal", "joker", "junkyard", ""
            + "jetplane", "kindergarten", "killers", "karate", "larynx", "lollipop", ""
            + "lion", "millineum", "microfiber", "matchbox", "nike", "nikel", ""
            + "neodymium", "orange", "optometrist", "oregon", "penny", "parka", ""
            + "pinocchio", "quarter", "quantum", "quilt", "radioactive", "running", ""
            + "rain", "superman", "stereotype", "stethoscope", "television", ""
            + "tyrannosaurus", "texting", "uranium", "universe", "ugly", "vector", ""
            + "venus", "viscious", "wonder", "wizard", "wallaby", "xylophone", ""
            + "xerox", "xenophobe", "yesterday", "yellowstone", "year", "zeus", ""
            + "zero", "zoology"};

        String[] hintList = {"not human", "painting", "continent", "musical instrument", ""
            + "bug that likes to read", "related to a cow", "meow", "howls at the moon", ""
            + "fruit", "woof", "two small", "very dedicated", "grey", "country", ""
            + "vroom", "women paint them", "red tail", "mushroom", "milky way", ""
            + "long neck", "bear", "music", "like singing", "WWII", "utensil", ""
            + "world wide web", "breaking the law", "batman", "where you send your "
            + "dead car", "fly away", "first year of school", "band", ""
            + "martial arts", "throat", "how many licks", "king of jungle", ""
            + "1000 years", "small weave", "toy car", "shoe", "money", "magnet", ""
            + "color", "eye doctor", "state", "cent", "coat", "disney character", ""
            + "1/4", "very small", "blanket", "dangerous chemicals", "legs "
            + "moving fast", "weather", "hero", "a thought adopted about "
            + "a group or individual", "listens to heart", "watch this", ""
            + "dinasoaur", "don't do this while driving", "metal", "emanse"
            + "of space", "not pretty", "magnitute and direction", "planet", ""
            + "very mean", "ahh", "harry potter", "like a kangaroo", "instrument", ""
            + "copy", "arcade game", "not today, not tomorrow", "national"
            + "park", "month, day, ...", "greek god", "first number", "study"
            + "of animals"};



        int rand;
        rand = (int) (Math.random() * 76);
        secret = wordList[rand];
        hint = hintList[rand];
        int wordLength = secret.length();

        visible = "";

        for (int i = 0; i < secret.length(); i++) {
            char c = secret.charAt(i);

            if (c ==  {
                
            }
            '')
            visible += c;
    
    
    else
    visible += '_' ;
}
}

public String getHint()
{
return hint;
}
public String toString(){
return visible;
    }
    public boolean ubdate (char c){
char[]secretArray = new char [secret.length()];
char[]visibleArray = new char[secret.length()];
String s = "";
boolean contains = false

for (int i = 0; i < secret.length(); i++){
secretArray[i]=secretcharAt(i);
visibleArray[i]=visiblecharAt(i);
}
if(secretArray[k] == c){
visibleArray[k] = c;
contains = true;
}
}
}
