import org.apache.commons.text.*;

class DeduplicationManager{
    private static String s1;
    private static String s2;

    public static void main(String[] args) {
        String str1 = "Anand";
        String Str2 = "Anand";
        System.out.println(lDistance("A","AA"));
    }

    public static int lDistance(String s1, String s2)
    {
        DeduplicationManager.s1 = s1;
        DeduplicationManager.s2 = s2;
        LevenshteinDistance myDistance = new LevenshteinDistance();
        myDistance.getDefaultInstance();
        return myDistance.apply(s1,s2);

    }
}