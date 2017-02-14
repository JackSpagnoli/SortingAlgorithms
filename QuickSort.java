public class QuickSort {
    public QuickSort(){}
    public double[] sort(double[] array){
        double[] lp={},
                mp={};
        double pivot = array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]<pivot){
                lp=new arrayAppend().addOn(lp, array[i]);
            }else {
                mp=new arrayAppend().addOn(mp,array[i]);
            }
        }
        if (lp.length>1){
            lp=sort(lp);
        }
        if (mp.length>1){
            mp=sort(mp);
        }
        return new arrayAppend().addOn(new arrayAppend().addOn(lp, pivot),mp);
    }
    public int[] sort(int[] array){
        return toInt(sort(toDouble(array)));
    }
    public float[] sort(float[] array){
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