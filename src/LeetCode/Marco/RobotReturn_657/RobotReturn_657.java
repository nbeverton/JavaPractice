package LeetCode.Marco.RobotReturn_657;

public class RobotReturn_657 {
    public boolean judgeCircle(String moves){

        int upCount = 0;
        int downCount = 0;
        int leftCount = 0;
        int rightCount = 0;

        for (int i = 0; i < moves.length(); i++) {

            String move = moves.substring(i, i + 1);

            if (move.matches("U")){
                upCount++;
            } else if (move.matches("D")) {
                downCount++;
            } else if (move.matches("L")){
                leftCount++;
            } else if (move.matches("R")){
                rightCount++;
            }
        }
        
        return upCount == downCount && leftCount == rightCount;
    }

    public static void main(String[] args) {
        RobotReturn_657 robotReturn657 = new RobotReturn_657();

        System.out.println(robotReturn657.judgeCircle("LL"));
    }
}
