/**
 * Driver class to test GeneralTree class.
 */
public class Main {
    public static void main(String[] args) {
        GeneralTree<String> root = new GeneralTree<>("Root");
        GeneralTree<String> folder101 = new GeneralTree<>("CSE101");
        GeneralTree<String> folder102 = new GeneralTree<>("CSE102");
        GeneralTree<String> folder107 = new GeneralTree<>("CSE107");
        GeneralTree<String> folder108 = new GeneralTree<>("CSE108");
        GeneralTree<String> folder222 = new GeneralTree<>("CSE222");

        root.add(folder101);
        root.add(folder102);
        root.add(folder107);
        root.add(folder108);
        root.add(folder222);

        GeneralTree<String> hw1_101 = new GeneralTree<>("CSE101_HW1");
        GeneralTree<String> hw2_101 = new GeneralTree<>("CSE101_HW2");
        GeneralTree<String> hw3_101 = new GeneralTree<>("CSE101_HW3");
        GeneralTree<String> hw4_101 = new GeneralTree<>("CSE101_HW4");

        folder101.add(hw1_101);
        folder101.add(hw2_101);
        folder101.add(hw3_101);
        folder101.add(hw4_101);

        GeneralTree<String> hw1_102 = new GeneralTree<>("CSE102_HW1");
        GeneralTree<String> hw2_102 = new GeneralTree<>("CSE102_HW2");

        folder102.add(hw1_102);
        folder102.add(hw2_102);

        GeneralTree<String> hw1_222 = new GeneralTree<>("CSE222_HW1");
        GeneralTree<String> hw2_222 = new GeneralTree<>("CSE222_HW2");

        folder222.add(hw1_222);
        folder222.add(hw2_222);


        root.print();

    }
}