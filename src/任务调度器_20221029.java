public class 任务调度器_20221029 {
    public int leastInterval(char[] tasks, int n) {
        int len = tasks.length;

        int[] counts = new int[26];
        //用一个数组保存每种count的数量
        for(char c : tasks){
            counts[c - 'A'] += 1;
        }

        int max = 0;
        //找到最多的任务
        for(int count : counts){
            max = Math.max(max, count);
        }

        //这一段比较抽象，要配合表格来看，大意是：如果有多个任务数量一样是【最多的】，那么由此可以确定表格有两列可以填满
        int maxCount = 0;
        for(int count : counts){

            if(count == max){
                maxCount++;
            }
        }
        return Math.max((n + 1) * (max - 1) + maxCount, len);
    }
}
