public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println(wordsCount("As you walk on the way, the way appears"));

        System.out.println(reverser("Hello"));

        System.out.println(palindromic("radar"));
    }

    // méthode wordscount qui prend en paramètre une phrase et retourne le nombre de
    // mots dans la phrase
    public static int wordsCount(String phrase) {
        String[] mots = phrase.split(" ");

        return mots.length;
    }

    // méthode qui prend en paramètre un mot et retourne le mot inversé
    public static String reverser(String mot) {
        StringBuilder sb = new StringBuilder(mot);

        sb.reverse();

        return sb.toString();
    }

    // méthode qui vérifie si un mot est un palindrome
    public static boolean palindromic(String mot) {
        String motInverse = reverser(mot);

        return mot.equals(motInverse);
    }

}
