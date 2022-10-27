public class 加油站_20220324 {

    public static void main(String[] args) {
        canCompleteCircuit(new int[]{2}, new int[]{2});
    }

    static int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas.length == 1) return gas[0] >= cost[0] ? 0 : -1;

        int res = -1;
        int lastIndex = gas.length - 1;
        for (int i = 0; i < gas.length; i++) {
            int nowGas;
            int curIndex = i + 1 > lastIndex ? 0 : i + 1;
            nowGas = gas[i] - cost[i];
            if (nowGas <= 0) continue;

            while (curIndex != i) {
                nowGas = nowGas + gas[curIndex] - cost[curIndex];
                curIndex = curIndex + 1 > lastIndex ? 0 : curIndex + 1;
                if (nowGas <= 0) break;
            }

            if (curIndex == i && nowGas >= 0) {
                res = i;
                break;
            }
        }
        return res;
    }
}
