public class ShellSort {
    public ShellSort() {}
    double[] sort(double[] array){
        for (int l=2;l<array.length;l*=2){

        }
        return null;
    }
    int[] sort(int[] array){
        return toInt(sort(toDouble(array)));
    }
    float[] sort(float[] array){
        return toFloat(sort(toDouble(array)));
    }
    private double[] toDouble(int[] n){
        double[] temp=new double[n.length];
        for (int i=0;i<n.length;i++){
            temp[i]=(double)n[i];
        }
        return temp;
    }
    private int[] toInt(double[] n){
        int[] temp=new int[n.length];
        for (int i=0;i<n.length;i++){
            temp[i]=(int)n[i];
        }
        return temp;
    }
    private double[] toDouble(float[] n){
        double[] temp=new double[n.length];
        for (int i=0;i<n.length;i++){
            temp[i]=(double)n[i];
        }
        return temp;
    }
    private float[] toFloat(double[] n){
        float[] temp=new float[n.length];
        for (int i=0;i<n.length;i++){
            temp[i]=(float)n[i];
        }
        return temp;
    }
}