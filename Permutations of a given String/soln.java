//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        
        char [] ch = S.toCharArray();
        Arrays.sort(ch);
        S = new String(ch);
        ArrayList<String> a = new ArrayList<>();
        String ans ="";
        Per(S,ans,a);
        return a;
    }
        static void Per(String str,String ans,ArrayList<String> a){
        if(str.length()==0)
        {
            if(!a.contains(ans)) 
            a.add(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            Per(newstr,ans+curr,a);
        }
    }
    
}
