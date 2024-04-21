public class KokoEatingBananas {

    int execute(int[] piles, int h){
        int left = 1;
        int right = piles[0];
        for (int pile : piles) {
            if (pile > right) {
                right = pile;
            }
        }
        int res = -1;
        while(left<right){
            int middle = (left+right)/2;
            if(canKokoEat(piles, middle, h)){
                res = middle;
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }
        return res;
    }

    boolean canKokoEat(int[] piles, int k, int hours){
        int localHours = 0;
        for(int pile:piles){
            int bananaInPile = pile;
            while (bananaInPile<=0){
                bananaInPile = bananaInPile - k;
                localHours++;
            }
        }
        return localHours<=hours;
    }
}
