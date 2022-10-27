import java.util.*;

public class od2_we_are_team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        List<Set<String>> list = new ArrayList<>();
        //n个人和m条信息
        String[] peopleAndNumber = one.split(" ");
        Integer peopleNumber = Integer.valueOf(peopleAndNumber[0]);
        Integer messageNumber = Integer.valueOf(peopleAndNumber[1]);
        if (peopleNumber > 10000 || peopleNumber < 1 || messageNumber > 10000 || messageNumber < 1) {
            System.out.println("NULL");
        } else {
            int currHang = 0;
            while (sc.hasNext()) {
                String next = sc.nextLine();
                currHang += 1;
                //指令
                String[] item = next.split(" ");
                if (item[2].equals("0")) {
                    addItem(item[0], item[1], list);
                } else if (item[2].equals("1")) {
                    if (isSamTeam(item[0], item[1], list)) System.out.println("we are a team");
                    else System.out.println("we are not a team");
                } else if (Integer.parseInt(item[0]) < 1 || Integer.parseInt(item[0]) > peopleNumber || Integer.parseInt(item[1]) < currHang || Integer.parseInt(item[0]) < 1) {
                    System.out.println("da pian zi");
                } else if (!item[2].equals("0") && !item[2].equals("1")){
                    System.out.println("da pian zi");
                }

            }
        }

    }

    static boolean isSamTeam(String itemOne, String itemTwo, List<Set<String>> list) {
        boolean result = false;
        for (Set<String> strings : list) {
            if (strings.contains(itemOne) && strings.contains(itemTwo)) result = true;
        }
        return result;
    }

    //加入元素
    static void addItem(String itemOne, String itemTwo, List<Set<String>> list) {
        //是否需要新建set,默认需要
        boolean newListFlag = true;
        for (Set<String> strings : list) {
            if (strings.contains(itemOne)) {
                newListFlag = false;
                strings.add(itemTwo);
            }
        }
        if (newListFlag) {
            Set<String> set = new HashSet<>();
            set.add(itemOne);
            set.add(itemTwo);
            list.add(set);
        }
    }
}
