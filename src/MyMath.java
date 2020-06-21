public class MyMath {
    public int arrSumRechnen (int[] integersToSumUp){
        int sum = 0;
        for (int i = 0;i<integersToSumUp.length;i++){
            sum += integersToSumUp [i];
        }
        return(sum);
    }
    public int arrPositivInteger (int [] intgerArr){
        int positivSum = 0;
        for (int i = 0;i<intgerArr.length;i++){
            if(intgerArr[i]>0) {positivSum++;}
        }
        return(positivSum);
    }
    public int arrNegativInteger (int [] intgerArr){
        int negativSum = 0;
        for (int i = 0;i<intgerArr.length;i++){
            if(intgerArr[i]<0) {negativSum++;}
        }
        return(negativSum);
    }
    public int arrUngeradeInteger (int [] intgerArr) {
        int ungeradeSum = 0;
        for (int i = 0; i < intgerArr.length; i++) {
            if (intgerArr[i] % 2 != 0) {
                ungeradeSum++;
            }
        }
        return (ungeradeSum);
    }
    public int arrGeradeInteger (int [] intgerArr) {
        int geradeSum = 0;
        for (int i = 0; i < intgerArr.length; i++) {
            if (intgerArr[i] % 2 == 0) {
                geradeSum++;
            }
        }
        return (geradeSum);
    }
}
