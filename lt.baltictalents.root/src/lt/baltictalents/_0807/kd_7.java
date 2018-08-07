package lt.baltictalents._0807;

/*[1, 3, ...]
[..., 1, 3]
[x, 1, 3 .]*/

public class kd_7 {
    public static void main(String[] args){
        int[] arr1 = new int[] {1, 3, 4, 5};

        System.out.println(unlucky(arr1));
        System.out.println(unlucky(new int[] {2, 1, 3, 4, 5}));
        System.out.println(unlucky(new int[] {1, 1, 1}));
        System.out.println(unlucky(new int[] {1, 2, 5, 1, 3}));
        System.out.println(unlucky(new int[] {}));
        System.out.println(unlucky(new int[] {1}));
        System.out.println(unlucky(new int[] {1, 3}));
        System.out.println(unlucky(null));
    }

    static boolean unlucky(int... arr){
        if(arr == null || arr.length < 2){
            return false;
        }
        if (arr[0] == 1 && arr[1] == 3 ||
                arr[1] == 1 && arr[2] == 3 ||
                arr[arr.length - 2] == 1 && arr[arr.length - 1] == 3){
            return true;
        }
        return false;
    }
}
