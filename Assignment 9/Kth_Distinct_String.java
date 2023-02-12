public class Kth_Distinct_String {
        public String kthDistinct(String[] arr, int k) {
            ArrayList<String>a=new ArrayList<>();
            for(int i=0;i<arr.length;i++)
            if(a.contains(arr[i])!=true) a.add(arr[i]);
            for(int i=0;i<a.size();i++){
                int count=0;
                for(int j=0;j<arr.length;j++)
                    if(a.get(i).equals(arr[j]))    count++;
                     if(count>1){
                    a.remove(a.get(i));
                         i=i-1;
                     }
            }
            if(k<=a.size())
            return a.get(k-1);
            else
            return "";
}
}
