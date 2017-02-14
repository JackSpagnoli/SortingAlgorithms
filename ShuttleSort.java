class ShuttleSort {
    ShuttleSort() {}
    double[] sort(double[] array){
        for(int i=1;i<array.length;i++){
            for (int j=i;j>0 && array[j]<array[j-1];j--){
                if (array[j]<array[j-1]){
                    double temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
        return array;
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