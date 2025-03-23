class TowerOfHanoi{
    public static void towerOfHanoi(int n,String src,String hlpr,String dest){
        if(n==1){
            System.out.println("disks transfer is"+" "+n+" from"+" "+src + " to" +" "+dest);
            return;
        }

        towerOfHanoi(n-1, src, dest, hlpr);
        System.out.println("disks transfer is"+" "+n+" "+" from"+" "+src + " to" +" "+dest);
        towerOfHanoi(n-1, hlpr,src,dest);

    }

    public static void main(String[]args){
    int n=2;
    towerOfHanoi(n, "S", "H", "D");
    }
}