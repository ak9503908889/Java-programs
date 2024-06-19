package LogicalPrograms;

public class program_to_print_two_to_ten_no_table {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("\t" + (i * j));
            }
            System.out.println();
        }
    }
}
