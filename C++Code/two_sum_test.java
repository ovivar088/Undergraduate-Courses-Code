  import java.util.Hashmap;


  public class Q2 
  {
    public static int[] index(int[] data, int target) {

        //Make the hashmap
        HashMap<Integer, Integer> table = new HashMap<Integer, Integer> ();

        for (int i= 0; i < data.length; i++)
        {
            map.put(data[i],i);
        }
        for (int i =0; i<data.legnth; i++)
        {
            int complement = target - data[i];
            if(map.containsKey(complement))
            {
                return new int[] {i, map.get(complement)};
            }

        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args)
    {
        int array[] = {24,25,36,70,0,9,11,20} ;
        int result[] = index(array,24);
        System.out.println(result[0] + ", ");
        System.out.println(result[1]);
    }
  }