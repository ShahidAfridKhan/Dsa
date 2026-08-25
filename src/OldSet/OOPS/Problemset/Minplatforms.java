package OldSet.OOPS.Problemset;

public class Minplatforms {

    public static int plat(int arr[], int dep[]) {

        int a = 0;
        int b = 0;

        int maxtime = 0, currenttime = 0;
        int count = 0;

        while (a < arr.length && b < dep.length) {

            int time = arr[a] - dep[b];

            currenttime = Math.abs(time);

            if (currenttime > maxtime) {
                count++;
                maxtime = currenttime;
            }

            a++;
            b++;
        }

        return count;
    }
    public static void main(String[] args) {
        int arr[]={500, 510, 520, 530, 540};
        int dep[]={550, 560, 570, 580, 590};

        System.out.println(plat(arr,dep));
    }
}
