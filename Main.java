import jdk.swing.interop.SwingInterOpUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
    String[] gamingConsoles = {"PS5", "XBOX", "SWITHCH"};
    int[][] sales = {{1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100, 1200}};
    int[] totals = new int[cities.length];

    System.out.println("-".repeat(60));
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("-".repeat(60));

    System.out.printf("%-20s%-10s%-10s%-10s%n", "" , gamingConsoles[0], gamingConsoles[1], gamingConsoles[2]);

    for (int i = 0; i < cities.length; i++){
        System.out.printf("%-20s" , cities[i]);
        for (int j = 0; j < gamingConsoles.length; j++){
            System.out.printf("%-10d", sales[i][j]);
        }
        System.out.println();
    }
    System.out.println("-".repeat(60));
    System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
    System.out.println("-".repeat(60));

    int highestIndex = 0;
    for (int i = 0; i < cities.length; i++){
        for (int j = 0; j < gamingConsoles.length; j++){
            totals[i] += sales[i][j];
        }
        if (totals[i] > totals[highestIndex]) {
            highestIndex = i;
        }
    }
    for (int i = 0; i < cities.length; i++) {
        System.out.printf("%-20s%-10d%n", cities[i], totals[i]);
    }
    System.out.println();
    System.out.println("CITY WITH THE MOST SALES: " + cities[highestIndex]);
    System.out.println("-".repeat(60));

}