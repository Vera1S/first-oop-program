package Homework14_from_02_10_23;

public class MainGraph {
    public static void main(String[] args) {

        GraphCities graphCitiesA = new GraphCities("A");
        GraphCities graphCitiesB = new GraphCities("B");
        GraphCities graphCitiesV = new GraphCities("V");
        GraphCities graphCitiesG = new GraphCities("G");
        GraphCities graphCitiesD = new GraphCities("D");
        GraphCities graphCitiesE = new GraphCities("E");
        GraphCities graphCitiesJ = new GraphCities("J");
        GraphCities graphCitiesZ = new GraphCities("Z");
        GraphCities graphCitiesI = new GraphCities("I");
        GraphCities graphCitiesK = new GraphCities("K");

        graphCitiesA.add("B");
        graphCitiesA.add("V");
        graphCitiesA.add("G");
        graphCitiesA.add("D");

        graphCitiesB.add("E");
        graphCitiesB.add("V");

        graphCitiesV.add("J");

        graphCitiesG.add("V");
        graphCitiesG.add("Z");

        graphCitiesD.add("G");
        graphCitiesD.add("I");

        graphCitiesE.add("K");

        graphCitiesJ.add("K");
        graphCitiesJ.add("Z");

        graphCitiesZ.add("K");

        graphCitiesI.add("K");

        String resultA = graphCitiesA.get("B");
        System.out.println("Из города А в город: " + resultA);

        String resultB = graphCitiesA.get("V");
        System.out.println("Из города А в город: " + resultB);

        String resultV = graphCitiesA.get("G");
        System.out.println("Из города А в город: " + resultV);

        //и т.д.

    }
}
