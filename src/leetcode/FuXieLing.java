package leetcode;

public class FuXieLing {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int i = 0, j = 0;
        while (j < n) {
            if (arr[i] == 0) {
                ++j;
            }
            ++i;
            ++j;
        }
        --i;    // i 回到最后一次合法的位置
        --j;    // j 同理，但 j 仍可能等于 n（例如输入 [0]）
        while (i >= 0) {
            if (j < n) {
                arr[j] = arr[i];
            }
            if (arr[i] == 0) {
                arr[--j] = arr[i];
            }
            --i;
            --j;
        }
    }

    public static void main(String[] args) {
        int [] question = {1,0,2,3,0,4,5,0};
        FuXieLing fuXieLing = new FuXieLing();
        fuXieLing.duplicateZeros(question);
    }
}