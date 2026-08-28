package STRING;

public class BuilderBufferPerformance {
    public static void main(String[] args){
        StringBuffer sbf=new StringBuffer("SNPSU");
        long starttime=System.currentTimeMillis();
       for(int i=0;i<100000000;i++) {
           sbf.append("Institution");

       }
        System.out.println("time taken by SBF:"+(System.currentTimeMillis()-starttime)+ "ms");
starttime=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<100000000;i++) {
            sb.append("Institution");

        }
        System.out.println("time taken by SB:"+(System.currentTimeMillis()-starttime)+ "ms");
    }
}
