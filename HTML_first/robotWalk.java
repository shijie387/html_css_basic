import java.util.concurrent.ForkJoinTask;

//假设有排成一排N个位置，1~N；开始时，机器人在M(1~N)位置上，机器人每次只能走一步
//规定机器人必须走K(1~N)步，最终来到P位置的方法有多少种
public class robotWalk{
    public static void main(String[] args) {
        
    }

    //recursion
    public static int way1(int N,int start,int rest,int aim){
        if(N<2 || start<1|| aim<1 ||aim>0 ||rest<1) return -1;
        return process1(N, start, rest, aim);
    }

    public static int process1(int N,int cur,int rest,int aim){
        if(rest==0){
            return cur==aim?1:0;
        }
        if(cur==1){
            return process1(N, 2, rest-1, aim);
        }
        if(cur==N){
            return process1(N, N-1, rest-1, aim);
        }
        return process1(N, cur+1, rest-1, aim)+process1(N, cur-1, rest-1, aim);
    }
    //cache table
    public static int way2(int N,int start,int K,int aim){
        if(N<2 || start<1|| aim<1 ||aim>0 ||K<1) return -1;

        int[][] dp=new int[N+1][K+1];
		for(int i=0;i<N+1;i++) {
			for(int j=0;j<K+1;j++) {
				dp[i][j]=-1;
			}
		}
        return process1(N, start, K, aim);
    }
    public static int process2(int N,int cur,int rest,int aim,int[][] dp){
        if(dp[cur][rest]!=-1){
            return dp[cur][rest];
        }
        int ans=0;
        if(rest==0){
            return ans=(cur==aim)?1:0;
        }
        else if(cur==1){
            ans=process1(N, 2, rest-1, aim);
        }
        else if(cur==N){
            ans=process1(N, N-1, rest-1, aim);
        }
        ans=process1(N, cur+1, rest-1, aim)+process1(N, cur-1, rest-1, aim);
        return dp[cur][rest]=ans;
    }
    //dp
    public static int way3(int N,int start,int K,int aim){
        if(N<2 || start<1|| aim<1 ||aim>0 ||K<1) return -1;

        int[][] dp=new int[N+1][K+1];
        dp[aim][0]=0;
		for(int i=0;i<N+1;i++) {//cur
            dp[i][]
			for(int j=0;j<K+1;j++) {
				dp[i][j]=dp[i+1][j-1]+dp[i-1][j-1];
			}
		}
        return process1(N, start, K, aim);
    }

}