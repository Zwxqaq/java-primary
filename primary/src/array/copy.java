package array;

public class copy {
    public static void main(String[] args) {
        int i = (int) (Math.random() * 10);
        int j = (int) (Math.random() * 10);
        int[] a = new int[i];
        int[] b = new int[j];
        int ij = i + j;
        int[] new_ = new int[ij];
        for (int k = 0; k < a.length; k++) {
            a[k] = randomNum();
            System.out.print(a[k] + " ");
        }
        System.out.println();
        System.out.println("---------------");
        for (int kk = 0; kk < b.length; kk++) {
            b[kk] = randomNum();
            System.out.print(b[kk] + " ");
        }
        System.out.println();
        System.out.println("---------------");
        System.arraycopy(a,0,new_,0,a.length);
        System.arraycopy(b,0,new_,a.length,b.length);
        for (int kkk = 0; kkk < new_.length; kkk++) {
            System.out.print(new_[kkk] + " ");
        }
    }

    public static int randomNum() {
        return (int) (Math.random()*100);
    }
}
