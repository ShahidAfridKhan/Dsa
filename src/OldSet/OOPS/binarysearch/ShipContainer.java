package OldSet.OOPS.binarysearch;

public class ShipContainer {
    public static int daysreturn(int weights[],int cap){
        int load=0,days=1;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                days++;
                load=weights[i];
            }else{
                load+=weights[i];
            }
        }
        return days;
    }
    public static int capacityrequired(int weights[],int days){
        int low=weights[0];
        int high=0;
        for(int i=0;i<weights.length;i++) {
            if (weights[i] > weights[0]) low = weights[i];
            high+=weights[i];
        }

        while(low<=high){
            int mid=(low+high)/2;
            int daysrequired=daysreturn(weights,mid);

            if(daysrequired<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
       int weights[]={3,2,2,4,1,4};

        int days=3;

        System.out.println(capacityrequired(weights,days));
    }
}
