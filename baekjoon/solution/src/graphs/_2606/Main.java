package graphs._2606;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 컴퓨터 생성
        Computer[] computers = new Computer[n + 1];
        for (int i = 1; i <= n; i++) {
            computers[i] = new Computer(i);
        }

        // 컴퓨터 연결
        int graphCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < graphCount; i++) {
            String[] networkInfo = scanner.nextLine().split(" ");
            int from = Math.min(Integer.parseInt(networkInfo[0]), Integer.parseInt(networkInfo[1]));;
            int to = Math.max(Integer.parseInt(networkInfo[0]), Integer.parseInt(networkInfo[1]));;

            computers[from].setComputers(computers[to]);
        }


        // 바이러스
        int virusCount = 0;

        computers[1].setWormVirus();
        for (int i = 2; i <= n; i++) {
            if (computers[i].isWormed()) {
                virusCount++;
            }
        }

        System.out.println(virusCount);
    }

    public static class Computer {
        private final int id;
        private boolean wormed;

        public Computer(int id) {
            this.id = id;
        }

        private final Set<Computer> linkedComputers = new LinkedHashSet<>();

        public void setComputers(Computer computer) {
            linkedComputers.add(computer);
            computer.linkedComputers.add(this);
        }

        public boolean isWormed() {
            return wormed;
        }

        public void setWormVirus() {
            wormed = true;
            for (Computer linkedComputer : linkedComputers) {
                if (!linkedComputer.isWormed())
                    linkedComputer.setWormVirus();
            }
        }
    }
}

