**
 * バブルソート
 * チェックテスト-Java３章
 *
 */
public class Main{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */
        int data=31275;
        int[]data={3,1,2,7,5}
        System.out.println(data);

        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            for (int j = 4; j > i; j--) {
                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */
                if(data[4]> data [0]){
                  int box = data[3, 1, 2, 7, 5];
                  data[4] = data[4];
                  data[0, 1, 2, 3, 4] = box;
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}
