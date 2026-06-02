class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minFinish = Integer.MAX_VALUE;

        for (int i =0; i < landStartTime.length; i++){
            int landFinish = landStartTime[i]+landDuration[i];
            for (int j = 0; j< waterStartTime.length; j++){
                int waterFinish = waterStartTime[j]+waterDuration[j];

                int startWaterAfterLand = Math.max(landFinish, waterStartTime[j]);
                int finishOrder1 = startWaterAfterLand+waterDuration[j];

                int startLandAfterWater = Math.max(waterFinish, landStartTime[i]);
                int finishOrder2 = startLandAfterWater+ landDuration[i];

                minFinish = Math.min(minFinish, Math.min(finishOrder1, finishOrder2));
            }
        }
        return minFinish;
    }
}
